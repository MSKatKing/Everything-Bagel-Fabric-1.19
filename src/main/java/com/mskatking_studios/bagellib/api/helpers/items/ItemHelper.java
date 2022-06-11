package com.mskatking_studios.bagellib.api.helpers.items;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ItemHelper {
    public static Item createDefaultItem(String modID, String name, Item.Properties settings) {
        return Registry.register(Registry.ITEM, new ResourceLocation(modID, name), new Item(settings));
    }

    public static Item createBlockItem(String modID, String blockName, Block block, Item.Properties settings) {
        return Registry.register(Registry.ITEM, new ResourceLocation(modID, blockName), new BlockItem(block, settings));
    }
}
