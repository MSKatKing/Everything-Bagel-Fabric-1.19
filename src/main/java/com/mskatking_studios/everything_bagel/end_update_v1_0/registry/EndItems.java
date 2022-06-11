package com.mskatking_studios.everything_bagel.end_update_v1_0.registry;

import com.mskatking_studios.bagellib.api.helpers.items.ItemHelper;
import com.mskatking_studios.everything_bagel.CreativeTabs;
import com.mskatking_studios.everything_bagel.EverythingBagel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EndItems {

    public static final Item TEST_BLOCK = ItemHelper.createBlockItem(EverythingBagel.MODID, "test_block",EndBlocks.TEST_BLOCK, new Item.Properties().tab(CreativeTabs.TAB_END_UPDATE));


    public static void registerItems() {
        System.out.print("End Update: Items registered");
    }
}
