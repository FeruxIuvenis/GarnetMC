package com.coshgun.datagen;

import com.coshgun.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Adds both blocks to the pickaxe tag
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ORE_GARNET_BLOCK)
                .add(ModBlocks.ORE_GARNET_DEEPSLATE_BLOCK)
                .add(ModBlocks.RAW_GARNET_BLOCK);

        // Adds both blocks to the Iron tier requirement
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ORE_GARNET_BLOCK)
                .add(ModBlocks.ORE_GARNET_DEEPSLATE_BLOCK)
                .add(ModBlocks.RAW_GARNET_BLOCK);
    }
}