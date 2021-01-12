package fr.helios.witchery.proxy;

import fr.helios.witchery.item.WitcheryItems;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

public class ClientProxy extends CommonProxy
{
    @Override public void preInit(File configFile)
    {
        super.preInit(configFile);
        MinecraftForge.EVENT_BUS.register(new WitcheryItems());
    }

    @Override public void init()
    {
        super.init();
    }

    @Override public void postInit()
    {
        super.postInit();
    }
}
