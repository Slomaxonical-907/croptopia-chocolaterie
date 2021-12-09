package com.slomaxonical.croptopia.chocolaterie;

import com.slomaxonical.croptopia.chocolaterie.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class CroptopiaChocolaterie implements ModInitializer {

    public static String MOD_ID = "cacao";
    public static final ItemGroup COCOA_ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "croptopia"))
            .icon(() -> new ItemStack(ItemRegistry.MILK_CHOCOLATE))
            .build();
    public static Identifier createIdentifier(String name) {
        return new Identifier(MOD_ID, name);
    }
    public static Item.Settings createGroup() {
            return new FabricItemSettings().group(COCOA_ITEM_GROUP);
        }
    static final String CROPTOPIA_MOD_ID = "croptopia";

    @Override
    public void onInitialize() {
        FabricLoader.getInstance().getModContainer(CROPTOPIA_MOD_ID)
                .map(modContainer -> ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("cacao","croptop"),  modContainer, ResourcePackActivationType.DEFAULT_ENABLED))
                .filter(success -> !success);
        ItemRegistry.init();
    }
}
