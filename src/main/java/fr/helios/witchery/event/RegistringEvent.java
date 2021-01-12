package fr.helios.witchery.event;

import fr.helios.witchery.item.WitcheryItems;
import fr.helios.witchery.utils.References;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class RegistringEvent
{
    public static RegistringEvent instance() {
        return new RegistringEvent();
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(WitcheryItems.items.toArray(new Item[0]));
    }
}
