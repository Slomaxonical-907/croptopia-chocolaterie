package com.slomaxonical.croptopia.chocolaterie.registry;

import com.slomaxonical.croptopia.chocolaterie.CroptopiaChocolaterie;
import me.thonk.croptopia.items.CookingUtensil;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

import static me.thonk.croptopia.registry.FoodRegistry.*;

public class ItemRegistry {

    public static Item cacaoNibs = new Item(CroptopiaChocolaterie.createGroup());
    public static Item cacaoMassBucket = new Item(CroptopiaChocolaterie.createGroup().recipeRemainder(Items.BUCKET));
    public static Item cacaoMassBottle = new Item(CroptopiaChocolaterie.createGroup().recipeRemainder(Items.GLASS_BOTTLE));
    public static Item cacaoButterBottle = new Item(CroptopiaChocolaterie.createGroup());
//    public static Item pressedCocoaCone = new Item(CroptopiaChocolaterie.createGroup());
    public static Item cocoaPowder = new Item(CroptopiaChocolaterie.createGroup());

    public static Item darkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_5));
    public static Item caramelDarkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_5));
    public static Item strawberryCreamDarkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_5));
    public static Item almondDarkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_5));

    public static Item milkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_7));
    public static Item caramelMilkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_7));
    public static Item strawberryCreamMilkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_7));
    public static Item almondMilkChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_7));

    public static Item whiteChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_9));
    public static Item caramelWhiteChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_9));
    public static Item strawberryCreamWhiteChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_9));
    public static Item almondWhiteChocolate = new Item(CroptopiaChocolaterie.createGroup().food(EDIBLE_9));

//    public static Item filterCloth = new Item(CroptopiaChocolaterie.createGroup());
//    public static Item massFilledCloth = new Item(CroptopiaChocolaterie.createGroup().maxCount(1).recipeRemainder(pressedCocoaCone));
    public static Item siliconDust = new Item(CroptopiaChocolaterie.createGroup());

    public static CookingUtensil allPurposeFilter = new CookingUtensil(CroptopiaChocolaterie.createGroup().maxCount(1));
    public static CookingUtensil siliconMold = new CookingUtensil(CroptopiaChocolaterie.createGroup().maxCount(1));
    public static CookingUtensil manualFoodGrinder = new CookingUtensil(CroptopiaChocolaterie.createGroup().maxCount(1));

    private static Item registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, CroptopiaChocolaterie.createIdentifier(itemName), item);
        return item;
    }
    public static void init(){
        registerItem("cacao_nibs",cacaoNibs);
        registerItem("cacao_mass_bucket",cacaoMassBucket);
        registerItem("cacao_mass_bottle",cacaoMassBottle);
        registerItem("cacao_butter_bottle",cacaoButterBottle);
//        registerItem("pressed_cocoa_cone",pressedCocoaCone);
        registerItem("cocoa_powder",cocoaPowder); //no recipe for now dunno how to implement

        registerItem("dark_chocolate",darkChocolate);
        registerItem("caramel_dark_chocolate",caramelDarkChocolate);
        registerItem("strawberry_cream_dark_chocolate",strawberryCreamDarkChocolate);
        registerItem("almond_dark_chocolate",almondDarkChocolate);

        registerItem("milk_chocolate",milkChocolate);
        registerItem("caramel_milk_chocolate",caramelMilkChocolate);
        registerItem("strawberry_cream_milk_chocolate",strawberryCreamMilkChocolate);
        registerItem("almond_milk_chocolate",almondMilkChocolate);

        registerItem("white_chocolate",whiteChocolate);
        registerItem("caramel_white_chocolate",caramelWhiteChocolate);
        registerItem("strawberry_cream_white_chocolate",strawberryCreamWhiteChocolate);
        registerItem("almond_white_chocolate",almondWhiteChocolate);

//        registerItem("filter_cloth", filterCloth);
//        registerItem("mass_filled_cloth", massFilledCloth);
        registerItem("silicon_dust", siliconDust);
        registerItem("silicon_mold", siliconMold);
        registerItem("all_purpose_filter", allPurposeFilter);
        registerItem("manual_food_grinder", manualFoodGrinder);
    }
}
