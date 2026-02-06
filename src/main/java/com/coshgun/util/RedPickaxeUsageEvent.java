package com.coshgun.util;

import com.coshgun.item.custom.tool.special.RedGlowingMinerPickaxe;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

public class RedPickaxeUsageEvent implements PlayerBlockBreakEvents.Before {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity playerEntity, BlockPos blockPos, BlockState blockState, @Nullable BlockEntity blockEntity) {
        ItemStack mainHandItem = playerEntity.getMainHandStack();

        if(mainHandItem.getItem() instanceof RedGlowingMinerPickaxe pickaxe && playerEntity instanceof ServerPlayerEntity serverPlayerEntity) {
            if(HARVESTED_BLOCKS.contains(blockPos)) {
                return true;
            }

            for(BlockPos position : RedGlowingMinerPickaxe.getBlocksToBeDestroyed(1, blockPos, serverPlayerEntity)) {
                if (position.equals(blockPos)) {
                    continue;
                }

                HARVESTED_BLOCKS.add(position);
                serverPlayerEntity.interactionManager.tryBreakBlock(position);
                HARVESTED_BLOCKS.remove(position);
            }
        }
        return true;
    }
}