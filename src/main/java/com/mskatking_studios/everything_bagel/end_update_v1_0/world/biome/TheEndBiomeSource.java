package com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.QuartPos;
import net.minecraft.core.Registry;
import net.minecraft.core.SectionPos;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.levelgen.DensityFunction;

public class TheEndBiomeSource extends BiomeSource {
    private final Holder<Biome> end;
    private final Holder<Biome> highlands;
    private final Holder<Biome> midlands;
    private final Holder<Biome> islands;
    private final Holder<Biome> barrens;
    private final Holder<Biome> end_garden;
    private final Holder<Biome> end_wastes;
    private final Holder<Biome> bloody_end;
    private final Holder<Biome> end_overgrowth;

    public TheEndBiomeSource(Registry<Biome> registry) {
        this(registry.getOrCreateHolderOrThrow(net.minecraft.world.level.biome.Biomes.THE_END), registry.getOrCreateHolderOrThrow(net.minecraft.world.level.biome.Biomes.END_HIGHLANDS), registry.getOrCreateHolderOrThrow(net.minecraft.world.level.biome.Biomes.END_MIDLANDS), registry.getOrCreateHolderOrThrow(net.minecraft.world.level.biome.Biomes.SMALL_END_ISLANDS), registry.getOrCreateHolderOrThrow(Biomes.END_BARRENS), registry.getOrCreateHolderOrThrow(com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome.Biomes.END_GARDEN), registry.getOrCreateHolderOrThrow(com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome.Biomes.END_WASTES), registry.getOrCreateHolderOrThrow(com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome.Biomes.BLOODY_END), registry.getOrCreateHolderOrThrow(com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome.Biomes.END_OVERGROWTH));
    }

    private TheEndBiomeSource(Holder<Biome> holder, Holder<Biome> holder2, Holder<Biome> holder3, Holder<Biome> holder4, Holder<Biome> holder5, Holder<Biome> holder6, Holder<Biome> holder7, Holder<Biome> holder8, Holder<Biome> holder9) {
        super(ImmutableList.of(holder, holder2, holder3, holder4, holder5));
        this.end = holder;
        this.highlands = holder2;
        this.midlands = holder3;
        this.islands = holder4;
        this.barrens = holder5;
        this.end_garden = holder6;
        this.end_wastes = holder7;
        this.bloody_end = holder8;
        this.end_overgrowth = holder9;
    }

    @Override
    protected Codec<? extends BiomeSource> codec() {
        return net.minecraft.world.level.biome.TheEndBiomeSource.CODEC;
    }

    @Override
    public Holder<Biome> getNoiseBiome(int i, int j, int k, Climate.Sampler sampler) {
        int p;
        int l = QuartPos.toBlock(i);
        int m = QuartPos.toBlock(j);
        int n = QuartPos.toBlock(k);
        int o = SectionPos.blockToSectionCoord(l);
        if ((long)o * (long)o + (long)(p = SectionPos.blockToSectionCoord(n)) * (long)p <= 4096L) {
            return this.end;
        }
        int q = (SectionPos.blockToSectionCoord(l) * 2 + 1) * 8;
        int r = (SectionPos.blockToSectionCoord(n) * 2 + 1) * 8;
        double d = sampler.erosion().compute(new DensityFunction.SinglePointContext(q, m, r));
        if (d > 0.5) {
            return this.end_garden;
        }
        if (d > 0.25) {
            return this.highlands;
        }
        if (d > 0) {
            return this.end_wastes;
        }
        if (d == 0) {
            return this.midlands;
        }
        if (d > -0.25) {
            return this.islands;
        }
        if (d > -0.5) {
            return this.bloody_end;
        }
        if (d > -0.75) {
            return this.end_overgrowth;
        }
        return this.barrens;
    }
}
