package com.slomaxonical.croptopia.chocolaterie;

import com.slomaxonical.croptopia.chocolaterie.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
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
    static final String CROPTOPIA_MOD_ID = "croptopia";

    @Override
    public void onInitialize() {
        FabricLoader.getInstance().getModContainer(CROPTOPIA_MOD_ID)
                .map(modContainer -> ResourceManagerHelper.registerBuiltinResourcePack(new Identifier("cacao","croptop"),  modContainer, ResourcePackActivationType.DEFAULT_ENABLED))
                .filter(success -> !success);
        ItemRegistry.init();
    }
}
