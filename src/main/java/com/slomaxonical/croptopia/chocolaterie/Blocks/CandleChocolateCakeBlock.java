package com.slomaxonical.croptopia.chocolaterie.Blocks;

import com.google.common.collect.Maps;
import com.slomaxonical.croptopia.chocolaterie.registry.BlockRegistry;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Map;

public class CandleChocolateCakeBlock extends CandleCakeBlock {
    private static final Map<Block, CandleCakeBlock> CANDLES_TO_CANDLE_CHOCOLATE_CAKES = Maps.newHashMap();

    public CandleChocolateCakeBlock(Block candle, Settings settings) {
        super(candle, settings);
        CANDLES_TO_CANDLE_CHOCOLATE_CAKES.put(candle, this);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.isOf(Items.FLINT_AND_STEEL) || itemStack.isOf(Items.FIRE_CHARGE)) {
            return ActionResult.PASS;
        }
        if (!(isHittingCandle(hit) && player.getStackInHand(hand).isEmpty() && state.get(LIT))) {
            ActionResult actionResult = ChocolateCakeBlock.tryEat(world, pos, BlockRegistry.CHOCOLATE_CAKE.getDefaultState(), player);
            if (actionResult.isAccepted()) {
                CandleCakeBlock.dropStacks(state, world, pos);
            }
            return actionResult;
        }
        CandleCakeBlock.extinguish(player, state, world, pos);
        return ActionResult.success(world.isClient);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(BlockRegistry.CHOCOLATE_CAKE);
    }
    private static boolean isHittingCandle(BlockHitResult hitResult) {
        return hitResult.getPos().y - (double)hitResult.getBlockPos().getY() > 0.5;
    }
    public static BlockState getCandleCakeFromCandle(Block candle) {
        return (CANDLES_TO_CANDLE_CHOCOLATE_CAKES.get(candle)).getDefaultState();
    }
}
