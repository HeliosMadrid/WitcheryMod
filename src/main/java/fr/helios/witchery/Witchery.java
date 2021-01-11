package fr.helios.witchery;

import fr.helios.witchery.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static fr.helios.witchery.utils.References.*;

@Mod(modid = MODID, name = NAME, version = VERSION, acceptedMinecraftVersions = MINECRAFT_VERSION)
public class Witchery
{
    @Mod.Instance
    public static Witchery Instance;

    @SidedProxy(modId = MODID, clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static CommonProxy proxy = new CommonProxy();

    private Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event.getSuggestedConfigurationFile());
        this.logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
