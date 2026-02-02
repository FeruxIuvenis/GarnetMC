package com.coshgun.item;

import com.coshgun.Garnet;
import com.coshgun.item.custom.ingredient.ModIngredients;

public class ModItems {
    public static void registerModItems() {
        Garnet.LOGGER.info("Registering Mod Items");

        ModIngredients.registerIngredients();
    }
}
