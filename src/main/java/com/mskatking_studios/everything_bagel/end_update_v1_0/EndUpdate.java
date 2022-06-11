package com.mskatking_studios.everything_bagel.end_update_v1_0;

import com.mskatking_studios.everything_bagel.end_update_v1_0.registry.EndBlocks;
import com.mskatking_studios.everything_bagel.end_update_v1_0.registry.EndItems;

public class EndUpdate {
    public static final String MODID = "everything_bagel";

    public static void registerEndUpdateMain() {
        EndBlocks.registerBlocks();
        EndItems.registerItems();
    }
}
