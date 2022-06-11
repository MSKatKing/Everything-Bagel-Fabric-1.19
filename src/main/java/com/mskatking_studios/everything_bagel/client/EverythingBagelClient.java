package com.mskatking_studios.everything_bagel.client;

import com.mskatking_studios.everything_bagel.end_update_v1_0.EndUpdate;
import com.mskatking_studios.everything_bagel.end_update_v1_0.EndUpdateClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class EverythingBagelClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EndUpdateClient.registerEndUpdateClient();
    }
}
