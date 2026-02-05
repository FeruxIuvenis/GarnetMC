package com.coshgun.datagen;

import com.coshgun.item.custom.ingredient.ModIngredients;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import com.coshgun.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public void generate() {
        // This helper method handles Silk Touch vs Fortune automatically!
        addDrop(ModBlocks.ORE_GARNET_BLOCK, oreDrops(ModBlocks.ORE_GARNET_BLOCK, ModIngredients.RAW_GARNET));
        addDrop(ModBlocks.ORE_GARNET_DEEPSLATE_BLOCK, oreDrops(ModBlocks.ORE_GARNET_DEEPSLATE_BLOCK, ModIngredients.RAW_GARNET));

        addDrop(ModBlocks.RAW_GARNET_BLOCK);
    }
}