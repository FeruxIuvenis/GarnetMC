package com.coshgun.item.custom.ingredient;

import com.coshgun.Garnet;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModIngredients {

    public static final Item GARNET = registerItem("garnet", new Item(new Item.Settings()));
    public static final Item RAW_GARNET = registerItem("raw_garnet", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Garnet.MOD_ID, name), item);
    }

    public static void registerIngredients() {
        Garnet.LOGGER.info("Registering Ingredients for " + Garnet.MOD_ID);
    }
}