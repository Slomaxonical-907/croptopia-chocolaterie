package com.slomaxonical.croptopia.chocolaterie.mixin;

import com.slomaxonical.croptopia.chocolaterie.Blocks.CandleChocolateCakeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CandleCakeBlock;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Map;

@Mixin(CandleCakeBlock.class)
public class CandleCakeRedirect {
    @Final
    @Shadow
    private static Map<Block, CandleCakeBlock> CANDLES_TO_CANDLE_CAKES;

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"))
    private Object redirect(Map<Block,CandleCakeBlock> map, Object candle, Object candleCake){
        if (!(candleCake instanceof CandleChocolateCakeBlock)) {
            return CANDLES_TO_CANDLE_CAKES.put((Block) candle, (CandleCakeBlock) candleCake);
        }
        return null;
    }
}

