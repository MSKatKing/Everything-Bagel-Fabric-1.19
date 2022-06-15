package com.mskatking_studios.everything_bagel.end_update_v1_0.world.biome;

import com.mskatking_studios.everything_bagel.EverythingBagel;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.*;

public class Biomes {

    public static final ResourceKey<Biome> END_GARDEN = register("end_garden");
    public static final ResourceKey<Biome> END_WASTES = register("end_wastes");
    public static final ResourceKey<Biome> BLOODY_END = register("bloody_end");
    public static final ResourceKey<Biome> END_OVERGROWTH = register("end_overgrowth");


    private static ResourceKey<Biome> register(String string) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(EverythingBagel.MODID, string));
    }

    public static Biome createDefaultEndBiome(BiomeGenerationSettings.Builder builder) {
        MobSpawnSettings.Builder builder2 = new MobSpawnSettings.Builder();
        BiomeDefaultFeatures.endSpawns(builder2);
        return new Biome.BiomeBuilder()
                .precipitation(Biome.Precipitation.NONE)
                .temperature(0.5f)
                .downfall(0.5f)
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .fogColor(0xA080A0)
                        .skyColor(0)
                        .ambientMoodSound(AmbientMoodSettings.LEGACY_CAVE_SETTINGS)
                        .build())
                .mobSpawnSettings(builder2.build())
                .generationSettings(builder.build())
                .build();
    }
}
