package com.l.belowtheground.world.generation;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;

public class WorldFeature {

    public static void addOre(Biome biome, Block block, int size, int count, int maxHeight) {
        biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, block.getDefaultState(), size)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(count, 0, 0, maxHeight))));
    }
}
