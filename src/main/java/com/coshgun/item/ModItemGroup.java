package com.coshgun.item;

import com.coshgun.Garnet;
import com.coshgun.block.ModBlocks;
import com.coshgun.item.custom.armor.ModArmors;
import com.coshgun.item.custom.food.ModFoods;
import com.coshgun.item.custom.ingredient.ModIngredients;
import com.coshgun.item.custom.tool.ModPassiveTools;
import com.coshgun.item.custom.tool.ModWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup GARNET_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Garnet.MOD_ID, "garnet_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModIngredients.GARNET))
                    .displayName(Text.translatable("itemgroup.garnet.garnet_group"))
                    .entries(((displayContext, entries) -> {
                        // Ingredients
                        entries.add(ModIngredients.GARNET);
                        entries.add(ModIngredients.RAW_GARNET);

                        // Blocks
                        entries.add(ModBlocks.GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_GARNET_BLOCK);
                        entries.add(ModBlocks.ORE_GARNET_BLOCK);
                        entries.add(ModBlocks.ORE_GARNET_DEEPSLATE_BLOCK);

                        // Foods
                        entries.add(ModFoods.GARNET_APPLE_ITEM);

                        // Weapons
                        entries.add(ModWeapons.GARNET_SWORD);
                        entries.add(ModWeapons.GARNET_AXE);
                        entries.add(ModWeapons.GARNET_BOW);

                        // Passive Tools
                        entries.add(ModPassiveTools.GARNET_PICKAXE);

                        // Armor
                        entries.add(ModArmors.GARNET_HELMET);
                        entries.add(ModArmors.GARNET_CHESTPLATE);
                        entries.add(ModArmors.GARNET_LEGGINGS);
                        entries.add(ModArmors.GARNET_BOOTS);

                        // Special Items
                        entries.add(ModWeapons.GARNET_GODS_SWORD);
                        entries.add(ModPassiveTools.RED_GLOWING_MINER_PICKAXE_ITEM);
                    }))
                    .build()
    );


    public static void registerModItemGroups() {
        Garnet.LOGGER.info("Registering Mod Item Group for " + Garnet.MOD_ID);
    }
}
