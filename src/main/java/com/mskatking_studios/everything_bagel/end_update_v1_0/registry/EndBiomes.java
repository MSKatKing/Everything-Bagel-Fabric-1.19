package com.mskatking_studios.everything_bagel.end_update_v1_0.registry;

import com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome.Biomes;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;

public class EndBiomes {
    public static Holder<Biome> bootstrap(Registry<Biome> registry) {
        BuiltinRegistries.register(registry, Biomes.END_GARDEN, Biomes.createDefaultEndBiome(new BiomeGenerationSettings.Builder()));
        BuiltinRegistries.register(registry, Biomes.END_WASTES, Biomes.createDefaultEndBiome(new BiomeGenerationSettings.Builder()));
        BuiltinRegistries.register(registry, Biomes.BLOODY_END, Biomes.createDefaultEndBiome(new BiomeGenerationSettings.Builder()));
        return BuiltinRegistries.register(registry, Biomes.END_OVERGROWTH, Biomes.createDefaultEndBiome(new BiomeGenerationSettings.Builder()));
    }
}
