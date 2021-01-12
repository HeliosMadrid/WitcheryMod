package fr.helios.witchery.item;

import com.google.common.collect.Lists;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;

@Mod.EventBusSubscriber
public class WitcheryItems
{
    public static ItemBase test;

    public static List<ItemBase> items = Lists.newArrayList();

    public static WitcheryItems instance() {
        return new WitcheryItems();
    }

    public static void initItems() {

        test = new ItemBase("test");

    }
    @SubscribeEvent
    public static void registerItemsModels(ModelRegistryEvent event){

        registerItemModel(test);
    }

    public static void registerItemModel(Item item){

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));

    }
}
