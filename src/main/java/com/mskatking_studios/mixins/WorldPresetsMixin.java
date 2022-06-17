package com.mskatking_studios.mixins;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome.TheEndBiomeSource;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.presets.WorldPreset;
import net.minecraft.world.level.levelgen.presets.WorldPresets;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraft.world.level.levelgen.synth.NormalNoise;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(WorldPresets.Bootstrap.class)
public class WorldPresetsMixin {
    private final Registry<DimensionType> dimensionTypes = BuiltinRegistries.DIMENSION_TYPE;
    private final Registry<Biome> biomes = BuiltinRegistries.BIOME;
    private final Registry<StructureSet> structureSets = BuiltinRegistries.STRUCTURE_SETS;
    private final Registry<NoiseGeneratorSettings> noiseSettings = BuiltinRegistries.NOISE_GENERATOR_SETTINGS;
    private final Registry<NormalNoise.NoiseParameters> noises = BuiltinRegistries.NOISE;
    private final Holder<DimensionType> netherDimensionType = this.dimensionTypes.getOrCreateHolderOrThrow(BuiltinDimensionTypes.NETHER);
    private final Holder<NoiseGeneratorSettings> netherNoiseSettings = this.noiseSettings.getOrCreateHolderOrThrow(NoiseGeneratorSettings.NETHER);
    private final LevelStem netherStem = new LevelStem(this.netherDimensionType, new NoiseBasedChunkGenerator(this.structureSets, this.noises, (BiomeSource)MultiNoiseBiomeSource.Preset.NETHER.biomeSource(this.biomes), this.netherNoiseSettings));
    private final Holder<DimensionType> endDimensionType = this.dimensionTypes.getOrCreateHolderOrThrow(BuiltinDimensionTypes.END);
    private final Holder<NoiseGeneratorSettings> endNoiseSettings = this.noiseSettings.getOrCreateHolderOrThrow(NoiseGeneratorSettings.END);
    private final LevelStem endStem = new LevelStem(this.endDimensionType, new NoiseBasedChunkGenerator(this.structureSets, this.noises, (BiomeSource)new TheEndBiomeSource(this.biomes), this.endNoiseSettings));

    @Inject(method = "createPresetWithCustomOverworld", at = @At("RETURN"), cancellable = true)
    private void EverythingBagel$createPresetWithCustomOverworld(LevelStem levelStem, CallbackInfoReturnable<WorldPreset> cir) {
        cir.setReturnValue(new WorldPreset(Map.of(LevelStem.OVERWORLD, levelStem, LevelStem.NETHER, this.netherStem, LevelStem.END, this.endStem)));
    }

}
