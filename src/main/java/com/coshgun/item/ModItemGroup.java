package com.coshgun.item;

import com.coshgun.Garnet;
import com.coshgun.item.custom.ingredient.ModIngredients;
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
                        entries.add(ModIngredients.GARNET);
                        entries.add(ModIngredients.RAW_GARNET);
                    }))
                    .build()
    );


    public static void registerModItemGroups() {
        Garnet.LOGGER.info("Registering Mod Item Group for " + Garnet.MOD_ID);
    }
}
