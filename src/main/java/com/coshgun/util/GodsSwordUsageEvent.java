package com.coshgun.util;

import com.coshgun.item.ModItems;
import com.coshgun.item.custom.ingredient.ModIngredients;
import com.coshgun.item.custom.tool.ModWeapons;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class GodsSwordUsageEvent {
    public static void register() {
        ServerLivingEntityEvents.AFTER_DEATH.register((entity, damageSource) -> {
            if (damageSource.getAttacker() instanceof PlayerEntity player) {

                ItemStack mainHand = player.getMainHandStack();

                if (mainHand.isOf(ModWeapons.GARNET_GODS_SWORD)) {
                    ServerWorld world = (ServerWorld) entity.getWorld();

                    int extraXp = world.getRandom().nextBetween(5, 20);
                    ExperienceOrbEntity.spawn(world, entity.getPos(), extraXp);

                    BlockPos pos = entity.getBlockPos();
                    ItemEntity garnetDrop = new ItemEntity(world,
                            pos.getX(), pos.getY(), pos.getZ(),
                            new ItemStack(ModIngredients.GARNET));

                    world.spawnEntity(garnetDrop);
                }
            }
        });
    }
}