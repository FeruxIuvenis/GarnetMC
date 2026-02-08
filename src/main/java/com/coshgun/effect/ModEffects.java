package com.coshgun.effect;

import com.coshgun.Garnet;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static RegistryEntry<StatusEffect> BLESSED_BY_GARNET_GODS;

    public static void registerModEffects() {
        Garnet.LOGGER.info("Registering Mod Effects for " + Garnet.MOD_ID);

        BLESSED_BY_GARNET_GODS = Registry.registerReference(
                Registries.STATUS_EFFECT,
                Identifier.of(Garnet.MOD_ID, "blessed_by_garnet_gods"),
                new BlessedByGarnetGodsEffect()
        );
    }
}