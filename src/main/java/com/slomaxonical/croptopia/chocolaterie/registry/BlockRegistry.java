package com.slomaxonical.croptopia.chocolaterie.registry;

import com.slomaxonical.croptopia.chocolaterie.Blocks.ChocolateCakeBlock;
import com.slomaxonical.croptopia.chocolaterie.Blocks.CandleChocolateCakeBlock;
import com.slomaxonical.croptopia.chocolaterie.CroptopiaChocolaterie;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.registry.Registry;
import java.util.function.ToIntFunction;

public class BlockRegistry {
    public static final ChocolateCakeBlock CHOCOLATE_CAKE = new ChocolateCakeBlock(FabricBlockSettings.of(Material.CAKE).strength(0.5F).sounds(BlockSoundGroup.WOOL));
    public static final CandleChocolateCakeBlock CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.CANDLE, FabricBlockSettings.copy(CHOCOLATE_CAKE).luminance(createLightLevelFromLitBlockState(3)));

    public static final CandleChocolateCakeBlock BLACK_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.BLACK_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock GRAY_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.GRAY_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock LIGHT_GRAY_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.LIGHT_GRAY_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock WHITE_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.WHITE_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock LIGHT_BLUE_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.LIGHT_BLUE_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock BLUE_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.BLUE_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock CYAN_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.CYAN_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock GREEN_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.GREEN_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock LIME_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.LIME_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock YELLOW_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.YELLOW_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock ORANGE_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.ORANGE_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock RED_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.RED_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock PINK_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.PINK_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock PURPLE_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.PURPLE_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock MAGENTA_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.MAGENTA_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));
    public static final CandleChocolateCakeBlock BROWN_CANDLE_CHOCOLATE_CAKE = new CandleChocolateCakeBlock(Blocks.BROWN_CANDLE, FabricBlockSettings.copyOf(CANDLE_CHOCOLATE_CAKE));

    private static ToIntFunction<BlockState> createLightLevelFromLitBlockState(int litLevel) {
        return (state) -> (Boolean)state.get(Properties.LIT) ? litLevel : 0;
    }
    public static void init(){
        registerBlock("chocolate_cake", CHOCOLATE_CAKE,false);
        registerBlock("candle_chocolate_cake", CANDLE_CHOCOLATE_CAKE);
        registerBlock("black_candle_chocolate_cake", BLACK_CANDLE_CHOCOLATE_CAKE);
        registerBlock("gray_candle_chocolate_cake", GRAY_CANDLE_CHOCOLATE_CAKE);
        registerBlock("light_gray_candle_chocolate_cake", LIGHT_GRAY_CANDLE_CHOCOLATE_CAKE);
        registerBlock("white_candle_chocolate_cake", WHITE_CANDLE_CHOCOLATE_CAKE);
        registerBlock("light_blue_candle_chocolate_cake", LIGHT_BLUE_CANDLE_CHOCOLATE_CAKE);
        registerBlock("blue_candle_chocolate_cake", BLUE_CANDLE_CHOCOLATE_CAKE);
        registerBlock("cyan_candle_chocolate_cake", CYAN_CANDLE_CHOCOLATE_CAKE);
        registerBlock("green_candle_chocolate_cake", GREEN_CANDLE_CHOCOLATE_CAKE);
        registerBlock("lime_candle_chocolate_cake", LIME_CANDLE_CHOCOLATE_CAKE);
        registerBlock("yellow_candle_chocolate_cake", YELLOW_CANDLE_CHOCOLATE_CAKE);
        registerBlock("orange_candle_chocolate_cake", ORANGE_CANDLE_CHOCOLATE_CAKE);
        registerBlock("red_candle_chocolate_cake", RED_CANDLE_CHOCOLATE_CAKE);
        registerBlock("pink_candle_chocolate_cake", PINK_CANDLE_CHOCOLATE_CAKE);
        registerBlock("purple_candle_chocolate_cake", PURPLE_CANDLE_CHOCOLATE_CAKE);
        registerBlock("magenta_candle_chocolate_cake", MAGENTA_CANDLE_CHOCOLATE_CAKE);
        registerBlock("brown_candle_chocolate_cake", BROWN_CANDLE_CHOCOLATE_CAKE);
    }

    public static Block registerBlock(String blockName, Block block) {
        return registerBlock(blockName, block,true);

    }
    public static Block registerBlock(String blockName, Block block, boolean noItem){
       Block registeredBlock = Registry.register(Registry.BLOCK, CroptopiaChocolaterie.createIdentifier(blockName),block);
       if (!noItem) {
           BlockItem blockItem = new BlockItem(block, new FabricItemSettings().group(CroptopiaChocolaterie.CACAO_ITEM_GROUP));
           Registry.register(Registry.ITEM, CroptopiaChocolaterie.createIdentifier(blockName), blockItem);
       }
       return registeredBlock;
    }

}
