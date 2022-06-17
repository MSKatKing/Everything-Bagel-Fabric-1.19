package com.mskatking_studios.mixins;

import net.minecraft.core.HolderSet;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

@Mixin(BiomeGenerationSettings.class)
public interface BiomeGenerationSettingsAccessor {
    @Accessor("features")
    List<HolderSet<PlacedFeature>> bagellib$getFeatures();

    @Accessor("features")
    @Mutable
    void bagellib$setFeatures(List<HolderSet<PlacedFeature>> value);

    @Accessor("featureSet")
    void bagellib$setFeatureSet(Supplier<Set<PlacedFeature>> featureSet);

    @Accessor("flowerFeatures")
    void bagellib$setFlowerFeatures(Supplier<List<ConfiguredFeature<?, ?>>> flowerFeatures);

    @Accessor("carvers")
    Map<GenerationStep.Carving, HolderSet<ConfiguredWorldCarver<?>>> bagellib$getCarvers();

    @Accessor("carvers")
    void bagellib$setCarvers(Map<GenerationStep.Carving, HolderSet<ConfiguredWorldCarver<?>>> features);
}
