package com.coshgun.item.custom.tool;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;

public class ModPassiveTools extends ModTools {

    public static final Item GARNET_PICKAXE = registerItem("garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.INSTANCE,
                    new Item.Settings().attributeModifiers(
                            PickaxeItem.createAttributeModifiers(ModToolMaterial.INSTANCE, 1.0F, -2.8F)
                    )));

    public static final Item GARNET_HOE = registerItem("garnet_hoe",
            new HoeItem(ModToolMaterial.INSTANCE,
                    new Item.Settings().attributeModifiers(
                            HoeItem.createAttributeModifiers(ModToolMaterial.INSTANCE, -2.0F, -1.0F)
                    )));

    static void registerPassiveTools() {

    }
}