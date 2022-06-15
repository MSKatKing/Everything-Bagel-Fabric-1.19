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
    public static final Block END_GARDEN_GRASS_BLOCK = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "end_garden_grass_block");
    public static final Block END_WASTES_GRASS_BLOCK = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "end_wastes_grass_block");
    public static final Block BLOODY_END_GRASS_BLOCK = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "bloody_end_grass_block");
    public static final Block END_OVERGROWTH_GRASS_BLOCK = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "end_overgrowth_grass_block");
    public static final Block END_GARDEN_GRASS = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "end_garden_grass");
    public static final Block END_WASTES_GRASS = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "end_wastes_grass");
    public static final Block BLOODY_END_GRASS = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "bloody_end_grass");
    public static final Block END_OVERGROWTH_GRASS = BlockHelper.createDefaultBlock(Material.GRASS, SoundType.GRASS, EverythingBagel.MODID, "end_overgrowth_grass");
    public static final Block ENDERIUM_ORE = BlockHelper.createDefaultBlock(Material.STONE, SoundType.STONE, EverythingBagel.MODID, "enderium_ore");
    public static final Block ENDERIUM_BLOCK = BlockHelper.createDefaultBlock(Material.STONE, SoundType.STONE, EverythingBagel.MODID, "enderium_block");

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

    //End Wastes
    public static final Block END_MAPLE_BUTTON = BlockHelper.createWoodenButtonBlock(EverythingBagel.MODID, "end_maple_button", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_DOOR = BlockHelper.createDoorBlock(EverythingBagel.MODID, "end_maple_door", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_FENCE = BlockHelper.createFenceBlock(EverythingBagel.MODID, "end_maple_fence", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_FENCE_GATE = BlockHelper.createFenceGateBlock(EverythingBagel.MODID, "end_maple_fence_gate", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "end_maple_log", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_PLANKS = BlockHelper.createDefaultBlock(EndMaterials.END_MAPLE, SoundType.WOOD, EverythingBagel.MODID, "end_maple_planks");
    public static final Block END_MAPLE_PRESSURE_PLATE = BlockHelper.createPressurePlateBlock(EverythingBagel.MODID, "end_maple_pressure_plate", EndMaterials.END_MAPLE, PressurePlateBlock.Sensitivity.EVERYTHING, SoundType.WOOD);
    public static final Block END_MAPLE_SLAB = BlockHelper.createSlabBlock(EverythingBagel.MODID, "end_maple_slab", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_STAIRS = BlockHelper.createStairsBlock(EverythingBagel.MODID, "end_maple_stairs", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_TRAPDOOR = BlockHelper.createTrapdoorBlock(EverythingBagel.MODID, "end_maple_trapdoor", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block END_MAPLE_WOOD = BlockHelper.createDefaultBlock(EndMaterials.END_MAPLE, SoundType.WOOD, EverythingBagel.MODID, "end_maple_wood");
    public static final Block STRIPPED_END_MAPLE_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "stripped_end_maple_log", EndMaterials.END_MAPLE, SoundType.WOOD);
    public static final Block STRIPPED_END_MAPLE_WOOD = BlockHelper.createDefaultBlock(EndMaterials.END_MAPLE, SoundType.WOOD, EverythingBagel.MODID, "stripped_end_maple_wood");

    //Bloody Pearl
    public static final Block BLOODY_PEARL_BUTTON = BlockHelper.createWoodenButtonBlock(EverythingBagel.MODID, "bloody_pearl_button", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_DOOR = BlockHelper.createDoorBlock(EverythingBagel.MODID, "bloody_pearl_door", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_FENCE = BlockHelper.createFenceBlock(EverythingBagel.MODID, "bloody_pearl_fence", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_FENCE_GATE = BlockHelper.createFenceGateBlock(EverythingBagel.MODID, "bloody_pearl_fence_gate", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "bloody_pearl_log", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_PLANKS = BlockHelper.createDefaultBlock(EndMaterials.BLOODY_END, SoundType.WOOD, EverythingBagel.MODID, "bloody_pearl_planks");
    public static final Block BLOODY_PEARL_PRESSURE_PLATE = BlockHelper.createPressurePlateBlock(EverythingBagel.MODID, "bloody_pearl_pressure_plate", EndMaterials.BLOODY_END, PressurePlateBlock.Sensitivity.EVERYTHING, SoundType.WOOD);
    public static final Block BLOODY_PEARL_SLAB = BlockHelper.createSlabBlock(EverythingBagel.MODID, "bloody_pearl_slab", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_STAIRS = BlockHelper.createStairsBlock(EverythingBagel.MODID, "bloody_pearl_stairs", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_TRAPDOOR = BlockHelper.createTrapdoorBlock(EverythingBagel.MODID, "bloody_pearl_trapdoor", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block BLOODY_PEARL_WOOD = BlockHelper.createDefaultBlock(EndMaterials.BLOODY_END, SoundType.WOOD, EverythingBagel.MODID, "bloody_pearl_wood");
    public static final Block STRIPPED_BLOODY_PEARL_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "stripped_bloody_pearl_log", EndMaterials.BLOODY_END, SoundType.WOOD);
    public static final Block STRIPPED_BLOODY_PEARL_WOOD = BlockHelper.createDefaultBlock(EndMaterials.BLOODY_END, SoundType.WOOD, EverythingBagel.MODID, "stripped_bloody_pearl_wood");

    //End Overgrowth
    public static final Block OVERGROWN_BUTTON = BlockHelper.createWoodenButtonBlock(EverythingBagel.MODID, "overgrown_button", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_DOOR = BlockHelper.createDoorBlock(EverythingBagel.MODID, "overgrown_door", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_FENCE = BlockHelper.createFenceBlock(EverythingBagel.MODID, "overgrown_fence", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_FENCE_GATE = BlockHelper.createFenceGateBlock(EverythingBagel.MODID, "overgrown_fence_gate", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "overgrown_log", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_PLANKS = BlockHelper.createDefaultBlock(EndMaterials.OVERGROWN, SoundType.WOOD, EverythingBagel.MODID, "overgrown_planks");
    public static final Block OVERGROWN_PRESSURE_PLATE = BlockHelper.createPressurePlateBlock(EverythingBagel.MODID, "overgrown_pressure_plate", EndMaterials.OVERGROWN, PressurePlateBlock.Sensitivity.EVERYTHING, SoundType.WOOD);
    public static final Block OVERGROWN_SLAB = BlockHelper.createSlabBlock(EverythingBagel.MODID, "overgrown_slab", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_STAIRS = BlockHelper.createStairsBlock(EverythingBagel.MODID, "overgrown_stairs", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_TRAPDOOR = BlockHelper.createTrapdoorBlock(EverythingBagel.MODID, "overgrown_trapdoor", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block OVERGROWN_WOOD = BlockHelper.createDefaultBlock(EndMaterials.OVERGROWN, SoundType.WOOD, EverythingBagel.MODID, "overgrown_wood");
    public static final Block STRIPPED_OVERGROWN_LOG = BlockHelper.createLogBlock(EverythingBagel.MODID, "stripped_overgrown_log", EndMaterials.OVERGROWN, SoundType.WOOD);
    public static final Block STRIPPED_OVERGROWN_WOOD = BlockHelper.createDefaultBlock(EndMaterials.OVERGROWN, SoundType.WOOD, EverythingBagel.MODID, "stripped_overgrown_wood");

    public static void registerBlocks() {
        EverythingBagel.consoleInfo("End Update: Blocks loaded");
    }
}
