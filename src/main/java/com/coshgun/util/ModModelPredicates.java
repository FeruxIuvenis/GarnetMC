package com.coshgun.util;

import com.coshgun.item.custom.tool.ModWeapons;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModModelPredicates {

    public static void registerModModelPredicates() {
        registerCustomBow(ModWeapons.GARNET_BOW);
    }

    private static void registerCustomBow(Item item) {
        ModelPredicateProviderRegistry.register(item, Identifier.ofVanilla("pull"), (stack, world, entity, seed) -> {
            if(entity == null) {
                return 0.0f;
            } else {
                return entity.getActiveItem() != stack ? 0.0f
                        : (float)(stack.getMaxUseTime(entity) - entity.getItemUseTimeLeft());
            }
        });

        ModelPredicateProviderRegistry.register(item,
                Identifier.ofVanilla("pulling"),
                (stack, world, entity, seed) -> entity != null &&
                entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
}
