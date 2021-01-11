package fr.helios.witchery.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item
{
    private final String name = "test";

    public ItemTest()
    {
        setTranslationKey(this.name);
        setRegistryName(this.name);
        setCreativeTab(CreativeTabs.COMBAT);

        WitcheryItems.INSTANCE.getItems();
    }
}
