package com.coshgun.item.custom.armor;

import com.coshgun.Garnet;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModArmors {
    public static final Item GARNET_HELMET = registerItem("garnet_helmet",
            new ArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(35))));
    public static final Item GARNET_CHESTPLATE = registerItem("garnet_chestplate",
            new ArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(35))
                    ));
    public static final Item GARNET_LEGGINGS = registerItem("garnet_leggings",
            new ArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(35))));
    public static final Item GARNET_BOOTS = registerItem("garnet_boots",
            new ArmorItem(ModArmorMaterials.GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(35))));

    protected static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Garnet.MOD_ID, name), item);
    }

    public static void registerModArmors() {
        // HELLO
    }
}
