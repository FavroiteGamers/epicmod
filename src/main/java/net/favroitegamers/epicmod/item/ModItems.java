package net.favroitegamers.epicmod.item;

import net.favroitegamers.epicmod.EpicMod;
import net.favroitegamers.epicmod.block.ModBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB)));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB)));

    public static final RegistryObject<Item> CHERRY = ITEMS.register("cherry",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB)));

    public static final RegistryObject<Item> CHERRY_SEEDS = ITEMS.register("cherry_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CHERRY_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB)
                            .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
