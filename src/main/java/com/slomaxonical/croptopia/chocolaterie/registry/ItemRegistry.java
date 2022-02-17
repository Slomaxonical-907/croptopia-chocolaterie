package com.slomaxonical.croptopia.chocolaterie.registry;

import com.slomaxonical.croptopia.chocolaterie.CroptopiaChocolaterie;
import me.thonk.croptopia.items.CookingUtensil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;
import me.thonk.croptopia.registry.FoodRegistry;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {

    public static final Item CACAO_NIBS = new Item(createGroup());
    public static final Item CACAO_MASS_BUCKET = new Item(createGroup().recipeRemainder(Items.BUCKET));
    public static final Item CACAO_MASS_BOTTLE = new Item(createGroup());
    public static final Item CACAO_BUTTER_BOTTLE = new Item(createGroup());

    public static final Item SILICON_DUST = new Item(createGroup());
    public static final CookingUtensil SILICON_MOLD = new CookingUtensil(createGroup().maxCount(1));
    public static final CookingUtensil MANUAL_FOOD_GRINDER = new CookingUtensil(createGroup().maxCount(1));
    public static final Item FILTER_CLOTH = new Item(createGroup());
    public static final Item PRESSED_COCOA_CONE = new Item(createGroup());
    public static final Item CACAO_MASS_FILLED_CLOTH = new Item(createGroup().maxCount(1).recipeRemainder(PRESSED_COCOA_CONE));
    public static final Item COCOA_POWDER = new Item(createGroup());

    public static final Item DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_3));
    public static final Item CARAMEL_DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item PRALINE_DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_3));
    public static final Item STRAWBERRY_CREAM_DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_3));
    public static final Item COOKIE_CREAM_DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_3));
    public static final Item MIXED_NUTS_DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_3));
    public static final Item COCONUT_DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_3));
    public static final Item PEANUT_BUTTER_DARK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_3));

    public static final Item MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item CARAMEL_MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item PRALINE_MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item STRAWBERRY_CREAM_MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item COOKIE_CREAM_MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item MIXED_NUTS_MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item COCONUT_MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item PEANUT_BUTTER_MILK_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));

    public static final Item WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item CARAMEL_WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_9));
    public static final Item PRALINE_WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item STRAWBERRY_CREAM_WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item COOKIE_CREAM_WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item MIXED_NUTS_WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item COCONUT_WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item PEANUT_BUTTER_WHITE_CHOCOLATE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));

    public static final Item GOLDEN_CHOCOLATE = new Item(createGroup().food(new FoodComponent.Builder()
            .hunger(5).
            saturationModifier(0.75f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 0.65f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 120, 2), 0.8f)
            .alwaysEdible()
            .build()));
    public static final Item DARK_CHOCOLATE_COVERED_APPLE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item MILK_CHOCOLATE_COVERED_APPLE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item WHITE_CHOCOLATE_COVERED_APPLE = new Item(createGroup().food(FoodRegistry.EDIBLE_7));
    public static final Item WHITE_CHIPS_COOKIE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item WHITE_CHIPS_CHOCOLATE_COOKIE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item DARK_CHIPS_CHOCOLATE_COOKIE = new Item(createGroup().food(FoodRegistry.EDIBLE_5));
    public static final Item NUTELLA = new Item(createGroup().food(FoodRegistry.EDIBLE_9));

    public static Item.Settings createGroup() {
        return new FabricItemSettings().group(CroptopiaChocolaterie.CACAO_ITEM_GROUP);
    }
    public static void init(){
        registerItem("cacao_nibs", CACAO_NIBS);
        registerItem("cacao_mass_bucket", CACAO_MASS_BUCKET);
        registerItem("cacao_mass_bottle", CACAO_MASS_BOTTLE);
        registerItem("cacao_butter_bottle", CACAO_BUTTER_BOTTLE);
        registerItem("filter_cloth", FILTER_CLOTH);
        registerItem("cacao_mass_filled_cloth", CACAO_MASS_FILLED_CLOTH);
        registerItem("pressed_cocoa_cone",PRESSED_COCOA_CONE);
        registerItem("cocoa_powder", COCOA_POWDER);

        registerItem("silicon_dust", SILICON_DUST);
        registerItem("silicon_mold", SILICON_MOLD);
        registerItem("manual_food_grinder", MANUAL_FOOD_GRINDER);

        registerItem("dark_chocolate", DARK_CHOCOLATE);
        registerItem("caramel_dark_chocolate", CARAMEL_DARK_CHOCOLATE);
        registerItem("praline_dark_chocolate", PRALINE_DARK_CHOCOLATE);
        registerItem("strawberry_cream_dark_chocolate", STRAWBERRY_CREAM_DARK_CHOCOLATE);
        registerItem("cookie_cream_dark_chocolate", COOKIE_CREAM_DARK_CHOCOLATE);
        registerItem("mixed_nuts_dark_chocolate", MIXED_NUTS_DARK_CHOCOLATE);
        registerItem("coconut_dark_chocolate", COCONUT_DARK_CHOCOLATE);
        registerItem("peanut_butter_dark_chocolate", PEANUT_BUTTER_DARK_CHOCOLATE);

        registerItem("milk_chocolate", MILK_CHOCOLATE);
        registerItem("caramel_milk_chocolate", CARAMEL_MILK_CHOCOLATE);
        registerItem("praline_milk_chocolate", PRALINE_MILK_CHOCOLATE);
        registerItem("strawberry_cream_milk_chocolate", STRAWBERRY_CREAM_MILK_CHOCOLATE);
        registerItem("cookie_cream_milk_chocolate", COOKIE_CREAM_MILK_CHOCOLATE);
        registerItem("mixed_nuts_milk_chocolate", MIXED_NUTS_MILK_CHOCOLATE);
        registerItem("coconut_milk_chocolate", COCONUT_MILK_CHOCOLATE);
        registerItem("peanut_butter_milk_chocolate", PEANUT_BUTTER_MILK_CHOCOLATE);

        registerItem("white_chocolate", WHITE_CHOCOLATE);
        registerItem("caramel_white_chocolate", CARAMEL_WHITE_CHOCOLATE);
        registerItem("praline_white_chocolate", PRALINE_WHITE_CHOCOLATE);
        registerItem("strawberry_cream_white_chocolate", STRAWBERRY_CREAM_WHITE_CHOCOLATE);
        registerItem("cookie_cream_white_chocolate", COOKIE_CREAM_WHITE_CHOCOLATE);
        registerItem("mixed_nuts_white_chocolate", MIXED_NUTS_WHITE_CHOCOLATE);
        registerItem("coconut_white_chocolate", COCONUT_WHITE_CHOCOLATE);
        registerItem("peanut_butter_white_chocolate", PEANUT_BUTTER_WHITE_CHOCOLATE);

        registerItem("golden_chocolate", GOLDEN_CHOCOLATE);
        registerItem("dark_chocolate_covered_apple", DARK_CHOCOLATE_COVERED_APPLE);
        registerItem("milk_chocolate_covered_apple", MILK_CHOCOLATE_COVERED_APPLE);
        registerItem("white_chocolate_covered_apple", WHITE_CHOCOLATE_COVERED_APPLE);
        registerItem("white_chips_cookie",WHITE_CHIPS_COOKIE);
        registerItem("white_chips_chocolate_cookie",WHITE_CHIPS_CHOCOLATE_COOKIE);
        registerItem("dark_chips_chocolate_cookie",DARK_CHIPS_CHOCOLATE_COOKIE);
        registerItem("nutella", NUTELLA);
    }

    public static List<ItemStack> ITEM_LIST = new ArrayList<>();
    private static Item registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, CroptopiaChocolaterie.createIdentifier(itemName), item);
        ITEM_LIST.add(new ItemStack(item));
        return item;
    }
}
