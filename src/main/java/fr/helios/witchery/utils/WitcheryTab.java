package fr.helios.witchery.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WitcheryTab extends CreativeTabs
{
    public WitcheryTab(String label)
    {
        super(label);
    }

    @Override public ItemStack createIcon()
    {
        return new ItemStack(Items.APPLE);
    }
}
