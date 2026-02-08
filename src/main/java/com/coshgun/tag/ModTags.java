package com.coshgun.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> GARNET_TOOLS =
                TagKey.of(RegistryKeys.ITEM, Identifier.of("garnet", "garnet_tools"));
    }
}