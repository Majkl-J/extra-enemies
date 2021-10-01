package com.waterpig.extramobs.registry;

import com.waterpig.extramobs.ExtraEnemies;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block CRYSTALLINE_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 0)
            .requiresTool()
            .strength(5f,10f)
            .slipperiness(1.1f)
            .sounds(BlockSoundGroup.ANCIENT_DEBRIS)
    );

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(ExtraEnemies.MOD_ID, "crystalline_block"), CRYSTALLINE_BLOCK);
    }
}
