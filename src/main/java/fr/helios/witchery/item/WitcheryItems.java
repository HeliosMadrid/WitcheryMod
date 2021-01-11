package fr.helios.witchery.item;

import com.google.common.collect.Lists;
import fr.helios.witchery.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.List;

@Mod.EventBusSubscriber(modid = References.MODID, value = Side.CLIENT)
public class WitcheryItems
{
    public static final WitcheryItems INSTANCE = new WitcheryItems();

    private List<Item> items = Lists.newArrayList();

    public static final Item itemtest = new ItemTest();

    @SubscribeEvent
    public void registerItemsModels(ModelRegistryEvent event) {
        for(Item item : items) {
            registerItemModel(item);
        }
    }

    private void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public List<Item> getItems()
    {
        return items;
    }
}
