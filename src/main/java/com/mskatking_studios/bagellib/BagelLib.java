package com.mskatking_studios.bagellib;

import com.mskatking_studios.bagellib.util.Logger;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class BagelLib implements ModInitializer {
    public static final String MODID = "bagellib";
    public static Logger LOGGER = new Logger(MODID);

    @Override
    public void onInitialize() {

    }

    public static boolean isDevEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    public static boolean isClient() {
        return FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT;
    }

    public static ResourceLocation makeID(String path) {
        return new ResourceLocation(MODID, path);
    }
}
