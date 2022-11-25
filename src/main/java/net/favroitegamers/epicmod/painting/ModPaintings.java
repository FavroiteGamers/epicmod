package net.favroitegamers.epicmod.painting;

import net.favroitegamers.epicmod.EpicMod;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, EpicMod.MOD_ID);

    //Copy and paste code to add another painting
    public static final RegistryObject<PaintingVariant> COMPUTER = PAINTING_VARIANTS.register("computer",
            () -> new PaintingVariant(32,16));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
