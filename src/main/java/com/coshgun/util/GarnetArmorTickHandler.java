package com.coshgun.util;

import com.coshgun.effect.ModEffects;
import com.coshgun.item.custom.armor.ModArmors;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.server.MinecraftServer;

public class GarnetArmorTickHandler {
    public static void registerHandler() {
        ServerTickEvents.END_SERVER_TICK.register(GarnetArmorTickHandler::onServerTick);
    }
    private static void onServerTick(MinecraftServer server) {
        server.getPlayerManager().getPlayerList().forEach(player -> {
            boolean hasFullSet =
                    player.getEquippedStack(EquipmentSlot.HEAD).isOf(ModArmors.GARNET_HELMET) &&
                            player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModArmors.GARNET_CHESTPLATE) &&
                            player.getEquippedStack(EquipmentSlot.LEGS).isOf(ModArmors.GARNET_LEGGINGS) &&
                            player.getEquippedStack(EquipmentSlot.FEET).isOf(ModArmors.GARNET_BOOTS);

            if (hasFullSet) {
                player.addStatusEffect(new StatusEffectInstance(
                        ModEffects.BLESSED_BY_GARNET_GODS,
                        100,
                        0,
                        false,
                        false,
                        true
                ));
            }
        });
    }
}