package com.coshgun.item;

import com.coshgun.Garnet;
import com.coshgun.block.ModBlocks;
import com.coshgun.item.custom.food.ModFoods;
import com.coshgun.item.custom.ingredient.ModIngredients;
import com.coshgun.item.custom.tool.ModTools;

public class ModItems {
    public static void registerModItems() {
        Garnet.LOGGER.info("Registering Mod Items");

        ModIngredients.registerIngredients();
        ModBlocks.registerModBlocks();
        ModFoods.registerModFoods();
        ModTools.registerModTools();
    }
}
