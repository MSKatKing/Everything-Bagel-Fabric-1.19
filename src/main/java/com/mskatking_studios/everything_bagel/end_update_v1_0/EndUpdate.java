package com.mskatking_studios.everything_bagel.end_update_v1_0;

import com.mskatking_studios.everything_bagel.end_update_v1_0.registry.EndBiomes;
import com.mskatking_studios.everything_bagel.end_update_v1_0.registry.EndBlocks;
import com.mskatking_studios.everything_bagel.end_update_v1_0.registry.EndItems;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;

public class EndUpdate {
    public static final String MODID = "everything_bagel";

    public static void registerEndUpdateMain() {
        EndBlocks.registerBlocks();
        EndItems.registerItems();
        EndBiomes.bootstrap(BuiltinRegistries.BIOME);
    }
}
