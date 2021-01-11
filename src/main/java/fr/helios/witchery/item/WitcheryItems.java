package fr.helios.witchery.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class WitcheryItems
{
    public static final WitcheryItems INSTANCE = new WitcheryItems();

    public static Item itemtest;

    public static void initItems() {
        WitcheryItems.itemtest = new ItemTest("test");
    }

    @SubscribeEvent
    public void registerItemsModels(ModelRegistryEvent event) {
        registerItemModel(itemtest);
    }

    private void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(itemtest);
    }
}
