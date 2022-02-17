package com.slomaxonical.croptopia.chocolaterie;

import com.slomaxonical.croptopia.chocolaterie.registry.BlockRegistry;
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
    public static final ItemGroup CACAO_ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "item_group"))
            .icon(() -> new ItemStack(ItemRegistry.MILK_CHOCOLATE))
            .build();
    public static Identifier createIdentifier(String name) {
        return new Identifier(MOD_ID, name);
    }


//  cacao is my mod's ID
    @Override
    public void onInitialize() {
        if(FabricLoader.getInstance().isModLoaded("croptopia")) {
            ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("croptop"),FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),ResourcePackActivationType.ALWAYS_ENABLED);
        }
        ItemRegistry.init();
        BlockRegistry.init();
    }
}
