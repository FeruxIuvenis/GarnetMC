package com.coshgun.item.custom.tool;

import com.coshgun.item.ModItems;
import com.coshgun.item.custom.ingredient.ModIngredients;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.block.Block;

public class ModToolMaterial implements ToolMaterial {
    public static final ModToolMaterial INSTANCE = new ModToolMaterial();

    @Override
    public int getDurability() {
        return 750; // Between Iron (250) and Diamond (1561)
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F; // Between Iron (6.0F) and Diamond (8.0F)
    }

    @Override
    public float getAttackDamage() {
        return 2.5F; // Base attack damage bonus
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_IRON_TOOL;
    }

    @Override
    public int getEnchantability() {
        return 18; // Between Iron (14) and Gold (22)
    }

    @Override
    public Ingredient getRepairIngredient() {
        // Replace with your actual garnet item
        return Ingredient.ofItems(ModIngredients.GARNET);
    }
}
