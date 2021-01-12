package fr.helios.witchery.item;

import fr.helios.witchery.Witchery;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase(String name)
    {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(Witchery.Instance.getTab());

        WitcheryItems.items.add(this);
    }
}
