package com.coshgun.item.custom.food;

import com.coshgun.Garnet;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFoods {
    public static final FoodComponent GARNET_APPLE = new FoodComponent.Builder()
            .nutrition(5)
            .saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 360), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 360), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 360), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 360), 1f)
            .alwaysEdible()
            .build();

    public static final Item GARNET_APPLE_ITEM = registerItem("garnet_apple",
            new Item(new Item.Settings()
                    .food(GARNET_APPLE)
                    .maxCount(16)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Garnet.MOD_ID, name), item);
    }

    public static void registerModFoods() {
        Garnet.LOGGER.info("Registering Mod Foods for " + Garnet.MOD_ID);
    }
}