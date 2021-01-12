package fr.helios.witchery.proxy;

import fr.helios.witchery.event.RegistringEvent;
import net.minecraftforge.common.MinecraftForge;

import java.io.File;

public class CommonProxy
{
    public void preInit(File configFile) {
        MinecraftForge.EVENT_BUS.register(RegistringEvent.instance());
    }

    public void init() {

    }

    public void postInit() {

    }
}
