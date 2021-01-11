package fr.helios.witchery.proxy;

import fr.helios.witchery.item.WitcheryItems;

import java.io.File;

public class CommonProxy
{
    public void preInit(File configFile) {
        WitcheryItems.INSTANCE.initItems();
    }

    public void init() {

    }

    public void postInit() {

    }
}
