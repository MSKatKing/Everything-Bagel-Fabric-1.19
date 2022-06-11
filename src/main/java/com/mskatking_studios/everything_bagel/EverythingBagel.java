package com.mskatking_studios.everything_bagel;

import com.mskatking_studios.everything_bagel.end_update_v1_0.EndUpdate;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class EverythingBagel implements ModInitializer {

    //Registering things that will need to be used in almost every class

    //Mod ID string
    public static final String MODID = "everything_bagel";

    //Initialization code
    @Override
    public void onInitialize() {
        EndUpdate.registerEndUpdateMain();
        consoleInfo("The End Update section has been enabled!");

        //Test letting the user know that there hasn't been an error loading
        consoleInfo("The mod has seen successfully enabled!");
    }

    public static void consoleInfo(String string) {
        System.out.println(string);
    }

    public static ResourceLocation identificationCreator(String name) {
        return new ResourceLocation(MODID, name);
    }
}
