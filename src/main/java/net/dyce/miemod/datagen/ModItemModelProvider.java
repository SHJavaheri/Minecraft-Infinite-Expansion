package net.dyce.miemod.datagen;

import net.dyce.miemod.MinecraftInfiniteExpansion;
import net.dyce.miemod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MinecraftInfiniteExpansion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.ORE_DETECTOR);
        simpleItem(ModItems.PINE_CONE);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.SAPPHIRE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MinecraftInfiniteExpansion.MOD_ID, "item/" + item.getId().getPath()));
    }
}
