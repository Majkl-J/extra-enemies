package com.waterpig.extramobs.registry;

import com.waterpig.extramobs.ExtraEnemies;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item CRYSTALLINE_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Block Items
    public static final BlockItem CRYSTALLINE_BLOCK = new BlockItem(ModBlocks.CRYSTALLINE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(ExtraEnemies.MOD_ID, "crystalline_shard"), CRYSTALLINE_SHARD);
        Registry.register(Registry.ITEM, new Identifier(ExtraEnemies.MOD_ID, "crystalline_block"), CRYSTALLINE_BLOCK);
    }
}
