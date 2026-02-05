package com.coshgun.block;

import com.coshgun.Garnet;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block GARNET_BLOCK = registerBlock("garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4.0f, 4.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_GARNET_BLOCK = registerBlock("raw_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0f, 5.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)));

    public static final Block ORE_GARNET_BLOCK = registerBlock("ore_garnet_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create()
                    .strength(4.0f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block ORE_GARNET_DEEPSLATE_BLOCK = registerBlock("ore_garnet_deepslate_block",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create()
                    .strength(4.0f, 6.0f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.STONE)
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Garnet.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Garnet.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Garnet.LOGGER.info("Registering Mod Blocks for " + Garnet.MOD_ID);
    }
}
