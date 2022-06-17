package com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome.features.trees;

import com.mojang.math.Vector3f;
import com.mskatking_studios.bagellib.api.helpers.blocks.BlockHelper;
import com.mskatking_studios.bagellib.api.utilities.MHelper;
import com.mskatking_studios.bagellib.api.utilities.SplineHelper;
import com.mskatking_studios.bagellib.api.utilities.noise.OpenSimplexNoise;
import com.mskatking_studios.bagellib.api.utilities.world.features.DefaultFeature;
import com.mskatking_studios.bagellib.api.utilities.sdf.PosInfo;
import com.mskatking_studios.everything_bagel.end_update_v1_0.registry.EndBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class EndWillowTreeFeature extends DefaultFeature {
    private static final Function<BlockState, Boolean> REPLACE;
    private static final Function<BlockState, Boolean> IGNORE;
    private static final Function<PosInfo, BlockState> POST;
    private static final List<Vector3f> BRANCH;
    private static final List<Vector3f> SIDE1;
    private static final List<Vector3f> SIDE2;
    private static final List<Vector3f> ROOT;

    @Override boolean place(FeaturePlaceContext<NoneFeatureConfiguration> featurePlaceContext) {
        final Random random = (Random) featurePlaceContext.random();
        final BlockPos pos = featurePlaceContext.origin();
        final WorldGenLevel world = featurePlaceContext.level();
        if (!world.getBlockState(pos.below()).is(EndBlocks.END_GARDEN_GRASS_BLOCK)) return false;

        float size = MHelper.randRange(10, 25, random);
        List<Vector3f> spline = SplineHelper.makeSpline(0, 0, 0, 0, size, 0, 6);
        SplineHelper.offsetParts(spline, random, 1F, 0, 1F);

        if (!SplineHelper.canGenerate(spline, pos, world, REPLACE)) return false;
        BlockHelper.setWithoutUpdate(world, pos, AIR);

        Vector3f last = SplineHelper.getPos(spline, 3.5F);
        OpenSimplexNoise noise = new OpenSimplexNoise(random.nextLong());
        float radius = size * MHelper.randRange(0.5F, 0.7F, random);

        return true;
    }

    private void makeCap(WorldGenLevel world, BlockPos pos, float radius, Random random, OpenSimplexNoise noise) {
        int count = (int) radius;
        int offset = (int) (BRANCH.get(BRANCH.size() - 1).y() * radius);
        for (int i = 0; i < count; i++) {
            float angle = (float) i / (float) count * MHelper.PI2;
            float scale = radius * MHelper.randRange(0.85F, 1.15F, random);

            List<Vector3f> branch = SplineHelper.copySpline(BRANCH);
            SplineHelper.rotateSpline(branch, angle);
            SplineHelper.scale(branch, scale);
            SplineHelper.fillSpline(branch, world, EndBlocks.END_WILLOW_LOG.defaultBlockState(), pos, REPLACE);

            branch = SplineHelper.copySpline(SIDE1);
            SplineHelper.rotateSpline(branch, angle);
            SplineHelper.scale(branch, scale);
            SplineHelper.fillSpline(branch, world,  EndBlocks.END_WILLOW_LOG.defaultBlockState(), pos, REPLACE);

            branch = SplineHelper.copySpline(SIDE2);
            SplineHelper.rotateSpline(branch, angle);
            SplineHelper.scale(branch, scale);
            SplineHelper.fillSpline(branch, world, EndBlocks.END_WILLOW_LOG.defaultBlockState(), pos, REPLACE);
        }
        leavesBall(world, pos.above(offset), radius * 1.15F + 2, random, noise);
    }

    private void makeRoots(WorldGenLevel world, BlockPos pos, float radius, Random random) {
        int count = (int) (radius * 1.15F);
        for (int i = 0; i < count; i++) {
            float angle = (float) i / (float) count * MHelper.PI2;
            float scale = radius * MHelper.randRange(0.85F, 1.15F, random);

            List<Vector3f> branch = SplineHelper.copySpline(ROOT);
            SplineHelper.rotateSpline(branch, angle);
            SplineHelper.scale(branch, angle);
            Vector3f last = branch.get(branch.size() - 1);
            if (world.getBlockState(pos.offset(last.x(), last.y(), last.z())).is(CommonB))
        }
    }
}
