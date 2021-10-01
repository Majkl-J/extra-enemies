package com.waterpig.extramobs;

import com.waterpig.extramobs.registry.ModBlocks;
import com.waterpig.extramobs.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ExtraEnemies implements ModInitializer {

    public static final String MOD_ID = "exenem";

    @Override
    public void onInitialize() {

        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
