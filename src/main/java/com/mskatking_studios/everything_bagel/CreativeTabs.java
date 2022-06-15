package com.mskatking_studios.everything_bagel;

import com.mskatking_studios.everything_bagel.end_update_v1_0.registry.EndBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabs {

    public static final CreativeModeTab TAB_END_UPDATE = FabricItemGroupBuilder.create(
            new ResourceLocation(EverythingBagel.MODID, "end_update"))
            .icon(() -> new ItemStack(EndBlocks.END_GARDEN_GRASS_BLOCK))
            .build();
}
