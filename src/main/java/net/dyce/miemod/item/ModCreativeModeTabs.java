package net.dyce.miemod.item;

import net.dyce.miemod.MinecraftInfiniteExpansion;
import net.dyce.miemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftInfiniteExpansion.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NEW_ORES_TAB = CREATIVE_MODE_TABS.register("new_ores_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.new_ores_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());


                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> NEW_TOOLS_TAB = CREATIVE_MODE_TABS.register("new_tools_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METAL_DETECTOR.get()))
                    .title(Component.translatable("creativetab.new_tools_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.METAL_DETECTOR.get());


                    })
                    .build());


    public static final RegistryObject<CreativeModeTab> YUMMY_FOOD = CREATIVE_MODE_TABS.register("yummy_food",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STRAWBERRY.get()))
                    .title(Component.translatable("creativetab.yummy_food"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.STRAWBERRY.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
