package com.slomaxonical.croptopia.chocolaterie;

import com.slomaxonical.croptopia.chocolaterie.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static me.thonk.croptopia.Croptopia.CROPTOPIA_ITEM_GROUP;

public class CroptopiaChocolaterie implements ModInitializer {

    public static Identifier createIdentifier(String name) {
        return new Identifier("cacao", name);
    }
    public static Item.Settings createGroup() {
            return new FabricItemSettings().group(CROPTOPIA_ITEM_GROUP);
        }
    @Override
    public void onInitialize() {
        ItemRegistry.init();
    }
}
