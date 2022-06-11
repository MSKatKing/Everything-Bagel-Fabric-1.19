package com.mskatking_studios.bagellib.api.helpers.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BlockHelper {
    public static Block createDefaultBlock(Material block, SoundType sound, String modID, String name) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new Block(BlockBehaviour.Properties.of(block).sound(sound)));
    }

    public static Block createPlanksBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new Block(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createLogBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new RotatedPillarBlock(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createFenceBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new FenceBlock(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createFenceGateBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new FenceGateBlock(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createDoorBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new DoorBlock(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createTrapdoorBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new TrapDoorBlock(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createWoodenButtonBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new WoodButtonBlock(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createPressurePlateBlock(String modID, String name, Material block, PressurePlateBlock.Sensitivity sensitivity, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new PressurePlateBlock(sensitivity, FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createSlabBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new SlabBlock(FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }

    public static Block createStairsBlock(String modID, String name, Material block, SoundType sound) {
        return Registry.register(Registry.BLOCK, new ResourceLocation(modID, name), new StairBlock(Blocks.OAK_STAIRS.defaultBlockState(), FabricBlockSettings.of(block).sound(sound).color(block.getColor())));
    }
}
