package com.coshgun.item.custom.tool;

import com.coshgun.item.custom.tool.special.GarnetGodsSword;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class ModWeapons extends ModTools {

    public static final Item GARNET_SWORD = registerItem("garnet_sword",
            new SwordItem(ModToolMaterial.INSTANCE,
                    new Item.Settings().attributeModifiers(
                            SwordItem.createAttributeModifiers(ModToolMaterial.INSTANCE, 4, -2.4F)
                    )));

    public static final Item GARNET_AXE = registerItem("garnet_axe",
            new AxeItem(ModToolMaterial.INSTANCE,
                    new Item.Settings().attributeModifiers(
                            AxeItem.createAttributeModifiers(ModToolMaterial.INSTANCE, 6.0F, -3.1F)
                    )));

    public static final Item GARNET_GODS_SWORD = registerItem("garnet_gods_sword",
            new GarnetGodsSword(
                    ModToolMaterial.INSTANCE,
                    10,
                    -3.0f,
                    new Item.Settings().attributeModifiers(
                            GarnetGodsSword.createAttributeModifiers(ModToolMaterial.INSTANCE, 10, -3.0f)
                    )
            ));

    static void registerWeapons() {
        // Items are registered when the static fields are initialized
    }
}