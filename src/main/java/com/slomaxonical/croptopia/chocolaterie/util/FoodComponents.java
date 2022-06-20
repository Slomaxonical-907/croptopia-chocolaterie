package com.slomaxonical.croptopia.chocolaterie.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodComponents {
    public static final FoodComponent DARK_CHOCOLATE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent FILLED_DARK_CHOCOLATE = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build();

    public static final FoodComponent MILK_CHOCOLATE = new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).build();
    public static final FoodComponent FILLED_MILK_CHOCOLATE = new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).build();

    public static final FoodComponent WHITE_CHOCOLATE = new FoodComponent.Builder().hunger(7).saturationModifier(1.3f).build();
    public static final FoodComponent FILLED_WHITE_CHOCOLATE = new FoodComponent.Builder().hunger(8).saturationModifier(1.5f).build();

    public static final FoodComponent GOLDEN_CHOCOLATE = new FoodComponent.Builder()
            .hunger(5)
            .saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 140, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200), 0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 2), 0.3f)
            .alwaysEdible()
            .build();
    public static final FoodComponent NUTELLA = new FoodComponent.Builder().hunger(10).saturationModifier(1.6f).build();

}
