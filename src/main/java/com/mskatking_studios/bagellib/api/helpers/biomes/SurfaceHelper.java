package com.mskatking_studios.bagellib.api.helpers.biomes;

import net.minecraft.data.worldgen.SurfaceRuleData;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class SurfaceHelper {

    public static SurfaceRules.RuleSource createSurfaceRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
