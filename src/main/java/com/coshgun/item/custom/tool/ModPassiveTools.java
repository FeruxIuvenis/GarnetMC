package com.coshgun.item.custom.tool;

import com.coshgun.item.custom.tool.special.RedGlowingMinerPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class ModPassiveTools extends ModTools {

    public static final Item GARNET_PICKAXE = registerItem("garnet_pickaxe",
            new PickaxeItem(ModToolMaterial.INSTANCE,
                    new Item.Settings().attributeModifiers(
                            PickaxeItem.createAttributeModifiers(ModToolMaterial.INSTANCE, 1.0F, -2.8F)
                    )));

    public static final Item RED_GLOWING_MINER_PICKAXE_ITEM = registerItem("red_glowing_miner_pickaxe",
            new RedGlowingMinerPickaxe(ModToolMaterial.INSTANCE,
                    new Item.Settings().attributeModifiers(
                            PickaxeItem.createAttributeModifiers(ModToolMaterial.INSTANCE, 4.0f, -3.2f)
                    )));

    static void registerPassiveTools() {

    }
}