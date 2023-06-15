package net.raman.tutorialmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class DoNotPlayChess extends Block {
    public DoNotPlayChess(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if(entity instanceof LivingEntity living){
            living.kill();
        }

        super.stepOn(level, blockPos, blockState, entity);
    }
}
