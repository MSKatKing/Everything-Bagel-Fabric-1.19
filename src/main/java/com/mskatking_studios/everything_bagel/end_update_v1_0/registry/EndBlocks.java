package com.mskatking_studios.everything_bagel.end_update_v1_0.registry;

import com.mskatking_studios.bagellib.api.helpers.blocks.BlockHelper;
import com.mskatking_studios.everything_bagel.CreativeTabs;
import com.mskatking_studios.everything_bagel.EverythingBagel;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class EndBlocks {

    //MISC
    public static final Block TEST_BLOCK = BlockHelper.createDefaultBlock(Material.DIRT, SoundType.AMETHYST, EverythingBagel.MODID, "test_block");

    //End Gardens
    public static final Block END_WILLOW_BUTTON = BlockHelper.createWoodenButtonBlock(EverythingBagel.MODID, "end_willow_button", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_DOOR = BlockHelper.createDoorBlock(EverythingBagel.MODID, "end_willow_door", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_FENCE = BlockHelper.createFenceBlock(EverythingBagel.MODID, "end_willow_fence", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_FENCE_GATE = BlockHelper.createFenceGateBlock(EverythingBagel.MODID, "end_willow_fence_gate", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "end_willow_log", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_PLANKS = BlockHelper.createDefaultBlock(EndMaterials.END_WILLOW, SoundType.WOOD, EverythingBagel.MODID, "end_willow_planks");
    public static final Block END_WILLOW_PRESSURE_PLATE = BlockHelper.createPressurePlateBlock(EverythingBagel.MODID, "end_willow_pressure_plate", EndMaterials.END_WILLOW, PressurePlateBlock.Sensitivity.EVERYTHING, SoundType.WOOD);
    public static final Block END_WILLOW_SLAB = BlockHelper.createSlabBlock(EverythingBagel.MODID, "end_willow_slab", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_STAIRS = BlockHelper.createStairsBlock(EverythingBagel.MODID, "end_willow_stairs", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_TRAPDOOR = BlockHelper.createTrapdoorBlock(EverythingBagel.MODID, "end_willow_trapdoor", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block END_WILLOW_WOOD = BlockHelper.createDefaultBlock(EndMaterials.END_WILLOW, SoundType.WOOD, EverythingBagel.MODID, "end_willow_wood");
    public static final Block STRIPPED_END_WILLOW_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "stripped_end_willow_log", EndMaterials.END_WILLOW, SoundType.WOOD);
    public static final Block STRIPPED_END_WILLOW_WOOD = BlockHelper.createDefaultBlock(EndMaterials.END_WILLOW, SoundType.WOOD, EverythingBagel.MODID, "stripped_end_willow_wood");

    public static void registerBlocks() {
        EverythingBagel.consoleInfo("End Update: Blocks loaded");
    }
}
