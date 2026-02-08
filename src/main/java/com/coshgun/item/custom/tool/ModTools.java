package com.coshgun.item.custom.tool;

import com.coshgun.Garnet;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModTools {
    public static void registerModTools() {
        ModWeapons.registerWeapons();
        ModPassiveTools.registerPassiveTools();
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Garnet.MOD_ID, name), item);
    }
}
