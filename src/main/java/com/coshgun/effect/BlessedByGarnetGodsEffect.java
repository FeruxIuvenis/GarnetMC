package com.coshgun.effect;

import com.coshgun.item.custom.armor.ModArmors;
import com.coshgun.tag.ModTags;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BlessedByGarnetGodsEffect extends StatusEffect {

    private static final Identifier GARNET_BOOST_ID = Identifier.of("garnet", "blessed_by_garnet_gods");

    public BlessedByGarnetGodsEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xB91153);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        if(entity instanceof PlayerEntity player) {
            ItemStack mainHand = player.getMainHandStack();

            EntityAttributeInstance attackDamage = player.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
            if (attackDamage != null) {
                if (hasFullGarnetArmor(player) && mainHand.isIn(ModTags.Items.GARNET_TOOLS)) {
                    if (attackDamage.getModifier(GARNET_BOOST_ID) == null) {
                        attackDamage.addTemporaryModifier(new EntityAttributeModifier(
                                GARNET_BOOST_ID,
                                1.0,
                                EntityAttributeModifier.Operation.ADD_VALUE
                        ));
                    }
                }
                else {
                    // If they switch to a non-garnet item, remove the boost immediately
                    attackDamage.removeModifier(GARNET_BOOST_ID);
                }
            }
        }
        return true;
    }

    private boolean hasFullGarnetArmor(PlayerEntity player) {
        return player.getEquippedStack(EquipmentSlot.HEAD).isOf(ModArmors.GARNET_HELMET) &&
                player.getEquippedStack(EquipmentSlot.CHEST).isOf(ModArmors.GARNET_CHESTPLATE) &&
                player.getEquippedStack(EquipmentSlot.LEGS).isOf(ModArmors.GARNET_LEGGINGS) &&
                player.getEquippedStack(EquipmentSlot.FEET).isOf(ModArmors.GARNET_BOOTS);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void onEntityRemoval(LivingEntity entity, int amplifier, Entity.RemovalReason reason) {
        EntityAttributeInstance attackDamage = entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        if (attackDamage != null) {
            attackDamage.removeModifier(GARNET_BOOST_ID);
        }
    }
}