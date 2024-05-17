/*
 * Copyright (c) 2024 GeyserMC. http://geysermc.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 * @author GeyserMC
 * @link https://github.com/GeyserMC/Geyser
 */

package org.geysermc.geyser.level.block;

import org.geysermc.geyser.level.block.type.BannerBlock;
import org.geysermc.geyser.level.block.type.BedBlock;
import org.geysermc.geyser.level.block.type.Block;
import org.geysermc.geyser.level.physics.Axis;
import org.geysermc.geyser.level.physics.Direction;
import org.geysermc.geyser.registry.BlockRegistries;

import static org.geysermc.geyser.level.block.property.Properties.*;
import static org.geysermc.geyser.level.block.type.Block.builder;

@SuppressWarnings("unused")
public final class Blocks {
    public static final Block AIR = register(new Block("air", builder()));
    public static final Block STONE = register(new Block("stone", builder()));
    public static final Block GRANITE = register(new Block("granite", builder()));
    public static final Block POLISHED_GRANITE = register(new Block("polished_granite", builder()));
    public static final Block DIORITE = register(new Block("diorite", builder()));
    public static final Block POLISHED_DIORITE = register(new Block("polished_diorite", builder()));
    public static final Block ANDESITE = register(new Block("andesite", builder()));
    public static final Block POLISHED_ANDESITE = register(new Block("polished_andesite", builder()));
    public static final Block GRASS_BLOCK = register(new Block("grass_block", builder()
            .booleanState(SNOWY)));
    public static final Block DIRT = register(new Block("dirt", builder()));
    public static final Block COARSE_DIRT = register(new Block("coarse_dirt", builder()));
    public static final Block PODZOL = register(new Block("podzol", builder()
            .booleanState(SNOWY)));
    public static final Block COBBLESTONE = register(new Block("cobblestone", builder()));
    public static final Block OAK_PLANKS = register(new Block("oak_planks", builder()));
    public static final Block SPRUCE_PLANKS = register(new Block("spruce_planks", builder()));
    public static final Block BIRCH_PLANKS = register(new Block("birch_planks", builder()));
    public static final Block JUNGLE_PLANKS = register(new Block("jungle_planks", builder()));
    public static final Block ACACIA_PLANKS = register(new Block("acacia_planks", builder()));
    public static final Block CHERRY_PLANKS = register(new Block("cherry_planks", builder()));
    public static final Block DARK_OAK_PLANKS = register(new Block("dark_oak_planks", builder()));
    public static final Block MANGROVE_PLANKS = register(new Block("mangrove_planks", builder()));
    public static final Block BAMBOO_PLANKS = register(new Block("bamboo_planks", builder()));
    public static final Block BAMBOO_MOSAIC = register(new Block("bamboo_mosaic", builder()));
    public static final Block OAK_SAPLING = register(new Block("oak_sapling", builder()
            .intState(STAGE, 0, 1)));
    public static final Block SPRUCE_SAPLING = register(new Block("spruce_sapling", builder()
            .intState(STAGE, 0, 1)));
    public static final Block BIRCH_SAPLING = register(new Block("birch_sapling", builder()
            .intState(STAGE, 0, 1)));
    public static final Block JUNGLE_SAPLING = register(new Block("jungle_sapling", builder()
            .intState(STAGE, 0, 1)));
    public static final Block ACACIA_SAPLING = register(new Block("acacia_sapling", builder()
            .intState(STAGE, 0, 1)));
    public static final Block CHERRY_SAPLING = register(new Block("cherry_sapling", builder()
            .intState(STAGE, 0, 1)));
    public static final Block DARK_OAK_SAPLING = register(new Block("dark_oak_sapling", builder()
            .intState(STAGE, 0, 1)));
    public static final Block MANGROVE_PROPAGULE = register(new Block("mangrove_propagule", builder()
            .intState(AGE_4, 0, 4)
            .booleanState(HANGING)
            .intState(STAGE, 0, 1)
            .booleanState(WATERLOGGED)));
    public static final Block BEDROCK = register(new Block("bedrock", builder()));
    public static final Block WATER = register(new Block("water", builder()
            .intState(LEVEL, 0, 15)));
    public static final Block LAVA = register(new Block("lava", builder()
            .intState(LEVEL, 0, 15)));
    public static final Block SAND = register(new Block("sand", builder()));
    public static final Block SUSPICIOUS_SAND = register(new Block("suspicious_sand", builder()
            .intState(DUSTED, 0, 3)));
    public static final Block RED_SAND = register(new Block("red_sand", builder()));
    public static final Block GRAVEL = register(new Block("gravel", builder()));
    public static final Block SUSPICIOUS_GRAVEL = register(new Block("suspicious_gravel", builder()
            .intState(DUSTED, 0, 3)));
    public static final Block GOLD_ORE = register(new Block("gold_ore", builder()));
    public static final Block DEEPSLATE_GOLD_ORE = register(new Block("deepslate_gold_ore", builder()));
    public static final Block IRON_ORE = register(new Block("iron_ore", builder()));
    public static final Block DEEPSLATE_IRON_ORE = register(new Block("deepslate_iron_ore", builder()));
    public static final Block COAL_ORE = register(new Block("coal_ore", builder()));
    public static final Block DEEPSLATE_COAL_ORE = register(new Block("deepslate_coal_ore", builder()));
    public static final Block NETHER_GOLD_ORE = register(new Block("nether_gold_ore", builder()));
    public static final Block OAK_LOG = register(new Block("oak_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block SPRUCE_LOG = register(new Block("spruce_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block BIRCH_LOG = register(new Block("birch_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block JUNGLE_LOG = register(new Block("jungle_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block ACACIA_LOG = register(new Block("acacia_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block CHERRY_LOG = register(new Block("cherry_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block DARK_OAK_LOG = register(new Block("dark_oak_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block MANGROVE_LOG = register(new Block("mangrove_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block MANGROVE_ROOTS = register(new Block("mangrove_roots", builder()
            .booleanState(WATERLOGGED)));
    public static final Block MUDDY_MANGROVE_ROOTS = register(new Block("muddy_mangrove_roots", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block BAMBOO_BLOCK = register(new Block("bamboo_block", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_SPRUCE_LOG = register(new Block("stripped_spruce_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_BIRCH_LOG = register(new Block("stripped_birch_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_JUNGLE_LOG = register(new Block("stripped_jungle_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_ACACIA_LOG = register(new Block("stripped_acacia_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_CHERRY_LOG = register(new Block("stripped_cherry_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_DARK_OAK_LOG = register(new Block("stripped_dark_oak_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_OAK_LOG = register(new Block("stripped_oak_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_MANGROVE_LOG = register(new Block("stripped_mangrove_log", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_BAMBOO_BLOCK = register(new Block("stripped_bamboo_block", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block OAK_WOOD = register(new Block("oak_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block SPRUCE_WOOD = register(new Block("spruce_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block BIRCH_WOOD = register(new Block("birch_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block JUNGLE_WOOD = register(new Block("jungle_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block ACACIA_WOOD = register(new Block("acacia_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block CHERRY_WOOD = register(new Block("cherry_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block DARK_OAK_WOOD = register(new Block("dark_oak_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block MANGROVE_WOOD = register(new Block("mangrove_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_OAK_WOOD = register(new Block("stripped_oak_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_SPRUCE_WOOD = register(new Block("stripped_spruce_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_BIRCH_WOOD = register(new Block("stripped_birch_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_JUNGLE_WOOD = register(new Block("stripped_jungle_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_ACACIA_WOOD = register(new Block("stripped_acacia_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_CHERRY_WOOD = register(new Block("stripped_cherry_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_DARK_OAK_WOOD = register(new Block("stripped_dark_oak_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_MANGROVE_WOOD = register(new Block("stripped_mangrove_wood", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block OAK_LEAVES = register(new Block("oak_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block SPRUCE_LEAVES = register(new Block("spruce_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_LEAVES = register(new Block("birch_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_LEAVES = register(new Block("jungle_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block ACACIA_LEAVES = register(new Block("acacia_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_LEAVES = register(new Block("cherry_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_LEAVES = register(new Block("dark_oak_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_LEAVES = register(new Block("mangrove_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block AZALEA_LEAVES = register(new Block("azalea_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block FLOWERING_AZALEA_LEAVES = register(new Block("flowering_azalea_leaves", builder()
            .intState(DISTANCE, 1, 7)
            .booleanState(PERSISTENT)
            .booleanState(WATERLOGGED)));
    public static final Block SPONGE = register(new Block("sponge", builder()));
    public static final Block WET_SPONGE = register(new Block("wet_sponge", builder()));
    public static final Block GLASS = register(new Block("glass", builder()));
    public static final Block LAPIS_ORE = register(new Block("lapis_ore", builder()));
    public static final Block DEEPSLATE_LAPIS_ORE = register(new Block("deepslate_lapis_ore", builder()));
    public static final Block LAPIS_BLOCK = register(new Block("lapis_block", builder()));
    public static final Block DISPENSER = register(new Block("dispenser", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(TRIGGERED)));
    public static final Block SANDSTONE = register(new Block("sandstone", builder()));
    public static final Block CHISELED_SANDSTONE = register(new Block("chiseled_sandstone", builder()));
    public static final Block CUT_SANDSTONE = register(new Block("cut_sandstone", builder()));
    public static final Block NOTE_BLOCK = register(new Block("note_block", builder()
            .enumState(NOTEBLOCK_INSTRUMENT, "harp", "basedrum", "snare", "hat", "bass", "flute", "bell", "guitar", "chime", "xylophone", "iron_xylophone", "cow_bell", "didgeridoo", "bit", "banjo", "pling", "zombie", "skeleton", "creeper", "dragon", "wither_skeleton", "piglin", "custom_head")
            .intState(NOTE, 0, 24)
            .booleanState(POWERED)));
    public static final Block WHITE_BED = register(new BedBlock("white_bed", 0, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block ORANGE_BED = register(new BedBlock("orange_bed", 1, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block MAGENTA_BED = register(new BedBlock("magenta_bed", 2, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block LIGHT_BLUE_BED = register(new BedBlock("light_blue_bed", 3, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block YELLOW_BED = register(new BedBlock("yellow_bed", 4, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block LIME_BED = register(new BedBlock("lime_bed", 5, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block PINK_BED = register(new BedBlock("pink_bed", 6, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block GRAY_BED = register(new BedBlock("gray_bed", 7, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block LIGHT_GRAY_BED = register(new BedBlock("light_gray_bed", 8, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block CYAN_BED = register(new BedBlock("cyan_bed", 9, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block PURPLE_BED = register(new BedBlock("purple_bed", 10, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block BLUE_BED = register(new BedBlock("blue_bed", 11, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block BROWN_BED = register(new BedBlock("brown_bed", 12, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block GREEN_BED = register(new BedBlock("green_bed", 13, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block RED_BED = register(new BedBlock("red_bed", 14, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block BLACK_BED = register(new BedBlock("black_bed", 15, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OCCUPIED)
            .enumState(BED_PART, "head", "foot")));
    public static final Block POWERED_RAIL = register(new Block("powered_rail", builder()
            .booleanState(POWERED)
            .enumState(RAIL_SHAPE_STRAIGHT, "north_south", "east_west", "ascending_east", "ascending_west", "ascending_north", "ascending_south")
            .booleanState(WATERLOGGED)));
    public static final Block DETECTOR_RAIL = register(new Block("detector_rail", builder()
            .booleanState(POWERED)
            .enumState(RAIL_SHAPE_STRAIGHT, "north_south", "east_west", "ascending_east", "ascending_west", "ascending_north", "ascending_south")
            .booleanState(WATERLOGGED)));
    public static final Block STICKY_PISTON = register(new Block("sticky_piston", builder()
            .booleanState(EXTENDED)
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block COBWEB = register(new Block("cobweb", builder()));
    public static final Block SHORT_GRASS = register(new Block("short_grass", builder()));
    public static final Block FERN = register(new Block("fern", builder()));
    public static final Block DEAD_BUSH = register(new Block("dead_bush", builder()));
    public static final Block SEAGRASS = register(new Block("seagrass", builder()));
    public static final Block TALL_SEAGRASS = register(new Block("tall_seagrass", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block PISTON = register(new Block("piston", builder()
            .booleanState(EXTENDED)
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block PISTON_HEAD = register(new Block("piston_head", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(SHORT)
            .enumState(PISTON_TYPE, "normal", "sticky")));
    public static final Block WHITE_WOOL = register(new Block("white_wool", builder()));
    public static final Block ORANGE_WOOL = register(new Block("orange_wool", builder()));
    public static final Block MAGENTA_WOOL = register(new Block("magenta_wool", builder()));
    public static final Block LIGHT_BLUE_WOOL = register(new Block("light_blue_wool", builder()));
    public static final Block YELLOW_WOOL = register(new Block("yellow_wool", builder()));
    public static final Block LIME_WOOL = register(new Block("lime_wool", builder()));
    public static final Block PINK_WOOL = register(new Block("pink_wool", builder()));
    public static final Block GRAY_WOOL = register(new Block("gray_wool", builder()));
    public static final Block LIGHT_GRAY_WOOL = register(new Block("light_gray_wool", builder()));
    public static final Block CYAN_WOOL = register(new Block("cyan_wool", builder()));
    public static final Block PURPLE_WOOL = register(new Block("purple_wool", builder()));
    public static final Block BLUE_WOOL = register(new Block("blue_wool", builder()));
    public static final Block BROWN_WOOL = register(new Block("brown_wool", builder()));
    public static final Block GREEN_WOOL = register(new Block("green_wool", builder()));
    public static final Block RED_WOOL = register(new Block("red_wool", builder()));
    public static final Block BLACK_WOOL = register(new Block("black_wool", builder()));
    public static final Block MOVING_PISTON = register(new Block("moving_piston", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .enumState(PISTON_TYPE, "normal", "sticky")));
    public static final Block DANDELION = register(new Block("dandelion", builder()));
    public static final Block TORCHFLOWER = register(new Block("torchflower", builder()));
    public static final Block POPPY = register(new Block("poppy", builder()));
    public static final Block BLUE_ORCHID = register(new Block("blue_orchid", builder()));
    public static final Block ALLIUM = register(new Block("allium", builder()));
    public static final Block AZURE_BLUET = register(new Block("azure_bluet", builder()));
    public static final Block RED_TULIP = register(new Block("red_tulip", builder()));
    public static final Block ORANGE_TULIP = register(new Block("orange_tulip", builder()));
    public static final Block WHITE_TULIP = register(new Block("white_tulip", builder()));
    public static final Block PINK_TULIP = register(new Block("pink_tulip", builder()));
    public static final Block OXEYE_DAISY = register(new Block("oxeye_daisy", builder()));
    public static final Block CORNFLOWER = register(new Block("cornflower", builder()));
    public static final Block WITHER_ROSE = register(new Block("wither_rose", builder()));
    public static final Block LILY_OF_THE_VALLEY = register(new Block("lily_of_the_valley", builder()));
    public static final Block BROWN_MUSHROOM = register(new Block("brown_mushroom", builder()));
    public static final Block RED_MUSHROOM = register(new Block("red_mushroom", builder()));
    public static final Block GOLD_BLOCK = register(new Block("gold_block", builder()));
    public static final Block IRON_BLOCK = register(new Block("iron_block", builder()));
    public static final Block BRICKS = register(new Block("bricks", builder()));
    public static final Block TNT = register(new Block("tnt", builder()
            .booleanState(UNSTABLE)));
    public static final Block BOOKSHELF = register(new Block("bookshelf", builder()));
    public static final Block CHISELED_BOOKSHELF = register(new Block("chiseled_bookshelf", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(CHISELED_BOOKSHELF_SLOT_0_OCCUPIED)
            .booleanState(CHISELED_BOOKSHELF_SLOT_1_OCCUPIED)
            .booleanState(CHISELED_BOOKSHELF_SLOT_2_OCCUPIED)
            .booleanState(CHISELED_BOOKSHELF_SLOT_3_OCCUPIED)
            .booleanState(CHISELED_BOOKSHELF_SLOT_4_OCCUPIED)
            .booleanState(CHISELED_BOOKSHELF_SLOT_5_OCCUPIED)));
    public static final Block MOSSY_COBBLESTONE = register(new Block("mossy_cobblestone", builder()));
    public static final Block OBSIDIAN = register(new Block("obsidian", builder()));
    public static final Block TORCH = register(new Block("torch", builder()));
    public static final Block WALL_TORCH = register(new Block("wall_torch", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block FIRE = register(new Block("fire", builder()
            .intState(AGE_15, 0, 15)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WEST)));
    public static final Block SOUL_FIRE = register(new Block("soul_fire", builder()));
    public static final Block SPAWNER = register(new Block("spawner", builder()));
    public static final Block OAK_STAIRS = register(new Block("oak_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block CHEST = register(new Block("chest", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(CHEST_TYPE, "single", "left", "right")
            .booleanState(WATERLOGGED)));
    public static final Block REDSTONE_WIRE = register(new Block("redstone_wire", builder()
            .enumState(EAST_REDSTONE, "up", "side", "none")
            .enumState(NORTH_REDSTONE, "up", "side", "none")
            .intState(POWER, 0, 15)
            .enumState(SOUTH_REDSTONE, "up", "side", "none")
            .enumState(WEST_REDSTONE, "up", "side", "none")));
    public static final Block DIAMOND_ORE = register(new Block("diamond_ore", builder()));
    public static final Block DEEPSLATE_DIAMOND_ORE = register(new Block("deepslate_diamond_ore", builder()));
    public static final Block DIAMOND_BLOCK = register(new Block("diamond_block", builder()));
    public static final Block CRAFTING_TABLE = register(new Block("crafting_table", builder()));
    public static final Block WHEAT = register(new Block("wheat", builder()
            .intState(AGE_7, 0, 7)));
    public static final Block FARMLAND = register(new Block("farmland", builder()
            .intState(MOISTURE, 0, 7)));
    public static final Block FURNACE = register(new Block("furnace", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(LIT)));
    public static final Block OAK_SIGN = register(new Block("oak_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block SPRUCE_SIGN = register(new Block("spruce_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_SIGN = register(new Block("birch_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block ACACIA_SIGN = register(new Block("acacia_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_SIGN = register(new Block("cherry_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_SIGN = register(new Block("jungle_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_SIGN = register(new Block("dark_oak_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_SIGN = register(new Block("mangrove_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_SIGN = register(new Block("bamboo_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block OAK_DOOR = register(new Block("oak_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block LADDER = register(new Block("ladder", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block RAIL = register(new Block("rail", builder()
            .enumState(RAIL_SHAPE, "north_south", "east_west", "ascending_east", "ascending_west", "ascending_north", "ascending_south", "south_east", "south_west", "north_west", "north_east")
            .booleanState(WATERLOGGED)));
    public static final Block COBBLESTONE_STAIRS = register(new Block("cobblestone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block OAK_WALL_SIGN = register(new Block("oak_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block SPRUCE_WALL_SIGN = register(new Block("spruce_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_WALL_SIGN = register(new Block("birch_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block ACACIA_WALL_SIGN = register(new Block("acacia_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_WALL_SIGN = register(new Block("cherry_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_WALL_SIGN = register(new Block("jungle_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_WALL_SIGN = register(new Block("dark_oak_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_WALL_SIGN = register(new Block("mangrove_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_WALL_SIGN = register(new Block("bamboo_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block OAK_HANGING_SIGN = register(new Block("oak_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block SPRUCE_HANGING_SIGN = register(new Block("spruce_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_HANGING_SIGN = register(new Block("birch_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block ACACIA_HANGING_SIGN = register(new Block("acacia_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_HANGING_SIGN = register(new Block("cherry_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_HANGING_SIGN = register(new Block("jungle_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_HANGING_SIGN = register(new Block("dark_oak_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block CRIMSON_HANGING_SIGN = register(new Block("crimson_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block WARPED_HANGING_SIGN = register(new Block("warped_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_HANGING_SIGN = register(new Block("mangrove_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_HANGING_SIGN = register(new Block("bamboo_hanging_sign", builder()
            .booleanState(ATTACHED)
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block OAK_WALL_HANGING_SIGN = register(new Block("oak_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block SPRUCE_WALL_HANGING_SIGN = register(new Block("spruce_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_WALL_HANGING_SIGN = register(new Block("birch_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block ACACIA_WALL_HANGING_SIGN = register(new Block("acacia_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_WALL_HANGING_SIGN = register(new Block("cherry_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_WALL_HANGING_SIGN = register(new Block("jungle_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_WALL_HANGING_SIGN = register(new Block("dark_oak_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_WALL_HANGING_SIGN = register(new Block("mangrove_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block CRIMSON_WALL_HANGING_SIGN = register(new Block("crimson_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block WARPED_WALL_HANGING_SIGN = register(new Block("warped_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_WALL_HANGING_SIGN = register(new Block("bamboo_wall_hanging_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block LEVER = register(new Block("lever", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block STONE_PRESSURE_PLATE = register(new Block("stone_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block IRON_DOOR = register(new Block("iron_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block OAK_PRESSURE_PLATE = register(new Block("oak_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block SPRUCE_PRESSURE_PLATE = register(new Block("spruce_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block BIRCH_PRESSURE_PLATE = register(new Block("birch_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block JUNGLE_PRESSURE_PLATE = register(new Block("jungle_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block ACACIA_PRESSURE_PLATE = register(new Block("acacia_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block CHERRY_PRESSURE_PLATE = register(new Block("cherry_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block DARK_OAK_PRESSURE_PLATE = register(new Block("dark_oak_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block MANGROVE_PRESSURE_PLATE = register(new Block("mangrove_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block BAMBOO_PRESSURE_PLATE = register(new Block("bamboo_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block REDSTONE_ORE = register(new Block("redstone_ore", builder()
            .booleanState(LIT)));
    public static final Block DEEPSLATE_REDSTONE_ORE = register(new Block("deepslate_redstone_ore", builder()
            .booleanState(LIT)));
    public static final Block REDSTONE_TORCH = register(new Block("redstone_torch", builder()
            .booleanState(LIT)));
    public static final Block REDSTONE_WALL_TORCH = register(new Block("redstone_wall_torch", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(LIT)));
    public static final Block STONE_BUTTON = register(new Block("stone_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block SNOW = register(new Block("snow", builder()
            .intState(LAYERS, 1, 8)));
    public static final Block ICE = register(new Block("ice", builder()));
    public static final Block SNOW_BLOCK = register(new Block("snow_block", builder()));
    public static final Block CACTUS = register(new Block("cactus", builder()
            .intState(AGE_15, 0, 15)));
    public static final Block CLAY = register(new Block("clay", builder()));
    public static final Block SUGAR_CANE = register(new Block("sugar_cane", builder()
            .intState(AGE_15, 0, 15)));
    public static final Block JUKEBOX = register(new Block("jukebox", builder()
            .booleanState(HAS_RECORD)));
    public static final Block OAK_FENCE = register(new Block("oak_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block NETHERRACK = register(new Block("netherrack", builder()));
    public static final Block SOUL_SAND = register(new Block("soul_sand", builder()));
    public static final Block SOUL_SOIL = register(new Block("soul_soil", builder()));
    public static final Block BASALT = register(new Block("basalt", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block POLISHED_BASALT = register(new Block("polished_basalt", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block SOUL_TORCH = register(new Block("soul_torch", builder()));
    public static final Block SOUL_WALL_TORCH = register(new Block("soul_wall_torch", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block GLOWSTONE = register(new Block("glowstone", builder()));
    public static final Block NETHER_PORTAL = register(new Block("nether_portal", builder()
            .enumState(HORIZONTAL_AXIS, Axis.X, Axis.Z)));
    public static final Block CARVED_PUMPKIN = register(new Block("carved_pumpkin", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block JACK_O_LANTERN = register(new Block("jack_o_lantern", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block CAKE = register(new Block("cake", builder()
            .intState(BITES, 0, 6)));
    public static final Block REPEATER = register(new Block("repeater", builder()
            .intState(DELAY, 1, 4)
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(LOCKED)
            .booleanState(POWERED)));
    public static final Block WHITE_STAINED_GLASS = register(new Block("white_stained_glass", builder()));
    public static final Block ORANGE_STAINED_GLASS = register(new Block("orange_stained_glass", builder()));
    public static final Block MAGENTA_STAINED_GLASS = register(new Block("magenta_stained_glass", builder()));
    public static final Block LIGHT_BLUE_STAINED_GLASS = register(new Block("light_blue_stained_glass", builder()));
    public static final Block YELLOW_STAINED_GLASS = register(new Block("yellow_stained_glass", builder()));
    public static final Block LIME_STAINED_GLASS = register(new Block("lime_stained_glass", builder()));
    public static final Block PINK_STAINED_GLASS = register(new Block("pink_stained_glass", builder()));
    public static final Block GRAY_STAINED_GLASS = register(new Block("gray_stained_glass", builder()));
    public static final Block LIGHT_GRAY_STAINED_GLASS = register(new Block("light_gray_stained_glass", builder()));
    public static final Block CYAN_STAINED_GLASS = register(new Block("cyan_stained_glass", builder()));
    public static final Block PURPLE_STAINED_GLASS = register(new Block("purple_stained_glass", builder()));
    public static final Block BLUE_STAINED_GLASS = register(new Block("blue_stained_glass", builder()));
    public static final Block BROWN_STAINED_GLASS = register(new Block("brown_stained_glass", builder()));
    public static final Block GREEN_STAINED_GLASS = register(new Block("green_stained_glass", builder()));
    public static final Block RED_STAINED_GLASS = register(new Block("red_stained_glass", builder()));
    public static final Block BLACK_STAINED_GLASS = register(new Block("black_stained_glass", builder()));
    public static final Block OAK_TRAPDOOR = register(new Block("oak_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block SPRUCE_TRAPDOOR = register(new Block("spruce_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_TRAPDOOR = register(new Block("birch_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_TRAPDOOR = register(new Block("jungle_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block ACACIA_TRAPDOOR = register(new Block("acacia_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_TRAPDOOR = register(new Block("cherry_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_TRAPDOOR = register(new Block("dark_oak_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_TRAPDOOR = register(new Block("mangrove_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_TRAPDOOR = register(new Block("bamboo_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block STONE_BRICKS = register(new Block("stone_bricks", builder()));
    public static final Block MOSSY_STONE_BRICKS = register(new Block("mossy_stone_bricks", builder()));
    public static final Block CRACKED_STONE_BRICKS = register(new Block("cracked_stone_bricks", builder()));
    public static final Block CHISELED_STONE_BRICKS = register(new Block("chiseled_stone_bricks", builder()));
    public static final Block PACKED_MUD = register(new Block("packed_mud", builder()));
    public static final Block MUD_BRICKS = register(new Block("mud_bricks", builder()));
    public static final Block INFESTED_STONE = register(new Block("infested_stone", builder()));
    public static final Block INFESTED_COBBLESTONE = register(new Block("infested_cobblestone", builder()));
    public static final Block INFESTED_STONE_BRICKS = register(new Block("infested_stone_bricks", builder()));
    public static final Block INFESTED_MOSSY_STONE_BRICKS = register(new Block("infested_mossy_stone_bricks", builder()));
    public static final Block INFESTED_CRACKED_STONE_BRICKS = register(new Block("infested_cracked_stone_bricks", builder()));
    public static final Block INFESTED_CHISELED_STONE_BRICKS = register(new Block("infested_chiseled_stone_bricks", builder()));
    public static final Block BROWN_MUSHROOM_BLOCK = register(new Block("brown_mushroom_block", builder()
            .booleanState(DOWN)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WEST)));
    public static final Block RED_MUSHROOM_BLOCK = register(new Block("red_mushroom_block", builder()
            .booleanState(DOWN)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WEST)));
    public static final Block MUSHROOM_STEM = register(new Block("mushroom_stem", builder()
            .booleanState(DOWN)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WEST)));
    public static final Block IRON_BARS = register(new Block("iron_bars", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block CHAIN = register(new Block("chain", builder()
            .enumState(AXIS, Axis.VALUES)
            .booleanState(WATERLOGGED)));
    public static final Block GLASS_PANE = register(new Block("glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block PUMPKIN = register(new Block("pumpkin", builder()));
    public static final Block MELON = register(new Block("melon", builder()));
    public static final Block ATTACHED_PUMPKIN_STEM = register(new Block("attached_pumpkin_stem", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block ATTACHED_MELON_STEM = register(new Block("attached_melon_stem", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block PUMPKIN_STEM = register(new Block("pumpkin_stem", builder()
            .intState(AGE_7, 0, 7)));
    public static final Block MELON_STEM = register(new Block("melon_stem", builder()
            .intState(AGE_7, 0, 7)));
    public static final Block VINE = register(new Block("vine", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WEST)));
    public static final Block GLOW_LICHEN = register(new Block("glow_lichen", builder()
            .booleanState(DOWN)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block OAK_FENCE_GATE = register(new Block("oak_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block BRICK_STAIRS = register(new Block("brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block STONE_BRICK_STAIRS = register(new Block("stone_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block MUD_BRICK_STAIRS = register(new Block("mud_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block MYCELIUM = register(new Block("mycelium", builder()
            .booleanState(SNOWY)));
    public static final Block LILY_PAD = register(new Block("lily_pad", builder()));
    public static final Block NETHER_BRICKS = register(new Block("nether_bricks", builder()));
    public static final Block NETHER_BRICK_FENCE = register(new Block("nether_brick_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block NETHER_BRICK_STAIRS = register(new Block("nether_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block NETHER_WART = register(new Block("nether_wart", builder()
            .intState(AGE_3, 0, 3)));
    public static final Block ENCHANTING_TABLE = register(new Block("enchanting_table", builder()));
    public static final Block BREWING_STAND = register(new Block("brewing_stand", builder()
            .booleanState(HAS_BOTTLE_0)
            .booleanState(HAS_BOTTLE_1)
            .booleanState(HAS_BOTTLE_2)));
    public static final Block CAULDRON = register(new Block("cauldron", builder()));
    public static final Block WATER_CAULDRON = register(new Block("water_cauldron", builder()
            .intState(LEVEL_CAULDRON, 1, 3)));
    public static final Block LAVA_CAULDRON = register(new Block("lava_cauldron", builder()));
    public static final Block POWDER_SNOW_CAULDRON = register(new Block("powder_snow_cauldron", builder()
            .intState(LEVEL_CAULDRON, 1, 3)));
    public static final Block END_PORTAL = register(new Block("end_portal", builder()));
    public static final Block END_PORTAL_FRAME = register(new Block("end_portal_frame", builder()
            .booleanState(EYE)
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block END_STONE = register(new Block("end_stone", builder()));
    public static final Block DRAGON_EGG = register(new Block("dragon_egg", builder()));
    public static final Block REDSTONE_LAMP = register(new Block("redstone_lamp", builder()
            .booleanState(LIT)));
    public static final Block COCOA = register(new Block("cocoa", builder()
            .intState(AGE_2, 0, 2)
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block SANDSTONE_STAIRS = register(new Block("sandstone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block EMERALD_ORE = register(new Block("emerald_ore", builder()));
    public static final Block DEEPSLATE_EMERALD_ORE = register(new Block("deepslate_emerald_ore", builder()));
    public static final Block ENDER_CHEST = register(new Block("ender_chest", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block TRIPWIRE_HOOK = register(new Block("tripwire_hook", builder()
            .booleanState(ATTACHED)
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block TRIPWIRE = register(new Block("tripwire", builder()
            .booleanState(ATTACHED)
            .booleanState(DISARMED)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(POWERED)
            .booleanState(SOUTH)
            .booleanState(WEST)));
    public static final Block EMERALD_BLOCK = register(new Block("emerald_block", builder()));
    public static final Block SPRUCE_STAIRS = register(new Block("spruce_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_STAIRS = register(new Block("birch_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_STAIRS = register(new Block("jungle_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block COMMAND_BLOCK = register(new Block("command_block", builder()
            .booleanState(CONDITIONAL)
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block BEACON = register(new Block("beacon", builder()));
    public static final Block COBBLESTONE_WALL = register(new Block("cobblestone_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block MOSSY_COBBLESTONE_WALL = register(new Block("mossy_cobblestone_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block FLOWER_POT = register(new Block("flower_pot", builder()));
    public static final Block POTTED_TORCHFLOWER = register(new Block("potted_torchflower", builder()));
    public static final Block POTTED_OAK_SAPLING = register(new Block("potted_oak_sapling", builder()));
    public static final Block POTTED_SPRUCE_SAPLING = register(new Block("potted_spruce_sapling", builder()));
    public static final Block POTTED_BIRCH_SAPLING = register(new Block("potted_birch_sapling", builder()));
    public static final Block POTTED_JUNGLE_SAPLING = register(new Block("potted_jungle_sapling", builder()));
    public static final Block POTTED_ACACIA_SAPLING = register(new Block("potted_acacia_sapling", builder()));
    public static final Block POTTED_CHERRY_SAPLING = register(new Block("potted_cherry_sapling", builder()));
    public static final Block POTTED_DARK_OAK_SAPLING = register(new Block("potted_dark_oak_sapling", builder()));
    public static final Block POTTED_MANGROVE_PROPAGULE = register(new Block("potted_mangrove_propagule", builder()));
    public static final Block POTTED_FERN = register(new Block("potted_fern", builder()));
    public static final Block POTTED_DANDELION = register(new Block("potted_dandelion", builder()));
    public static final Block POTTED_POPPY = register(new Block("potted_poppy", builder()));
    public static final Block POTTED_BLUE_ORCHID = register(new Block("potted_blue_orchid", builder()));
    public static final Block POTTED_ALLIUM = register(new Block("potted_allium", builder()));
    public static final Block POTTED_AZURE_BLUET = register(new Block("potted_azure_bluet", builder()));
    public static final Block POTTED_RED_TULIP = register(new Block("potted_red_tulip", builder()));
    public static final Block POTTED_ORANGE_TULIP = register(new Block("potted_orange_tulip", builder()));
    public static final Block POTTED_WHITE_TULIP = register(new Block("potted_white_tulip", builder()));
    public static final Block POTTED_PINK_TULIP = register(new Block("potted_pink_tulip", builder()));
    public static final Block POTTED_OXEYE_DAISY = register(new Block("potted_oxeye_daisy", builder()));
    public static final Block POTTED_CORNFLOWER = register(new Block("potted_cornflower", builder()));
    public static final Block POTTED_LILY_OF_THE_VALLEY = register(new Block("potted_lily_of_the_valley", builder()));
    public static final Block POTTED_WITHER_ROSE = register(new Block("potted_wither_rose", builder()));
    public static final Block POTTED_RED_MUSHROOM = register(new Block("potted_red_mushroom", builder()));
    public static final Block POTTED_BROWN_MUSHROOM = register(new Block("potted_brown_mushroom", builder()));
    public static final Block POTTED_DEAD_BUSH = register(new Block("potted_dead_bush", builder()));
    public static final Block POTTED_CACTUS = register(new Block("potted_cactus", builder()));
    public static final Block CARROTS = register(new Block("carrots", builder()
            .intState(AGE_7, 0, 7)));
    public static final Block POTATOES = register(new Block("potatoes", builder()
            .intState(AGE_7, 0, 7)));
    public static final Block OAK_BUTTON = register(new Block("oak_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block SPRUCE_BUTTON = register(new Block("spruce_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block BIRCH_BUTTON = register(new Block("birch_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block JUNGLE_BUTTON = register(new Block("jungle_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block ACACIA_BUTTON = register(new Block("acacia_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block CHERRY_BUTTON = register(new Block("cherry_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block DARK_OAK_BUTTON = register(new Block("dark_oak_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block MANGROVE_BUTTON = register(new Block("mangrove_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block BAMBOO_BUTTON = register(new Block("bamboo_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block SKELETON_SKULL = register(new Block("skeleton_skull", builder()
            .booleanState(POWERED)
            .intState(ROTATION_16, 0, 15)));
    public static final Block SKELETON_WALL_SKULL = register(new Block("skeleton_wall_skull", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block WITHER_SKELETON_SKULL = register(new Block("wither_skeleton_skull", builder()
            .booleanState(POWERED)
            .intState(ROTATION_16, 0, 15)));
    public static final Block WITHER_SKELETON_WALL_SKULL = register(new Block("wither_skeleton_wall_skull", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block ZOMBIE_HEAD = register(new Block("zombie_head", builder()
            .booleanState(POWERED)
            .intState(ROTATION_16, 0, 15)));
    public static final Block ZOMBIE_WALL_HEAD = register(new Block("zombie_wall_head", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block PLAYER_HEAD = register(new Block("player_head", builder()
            .booleanState(POWERED)
            .intState(ROTATION_16, 0, 15)));
    public static final Block PLAYER_WALL_HEAD = register(new Block("player_wall_head", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block CREEPER_HEAD = register(new Block("creeper_head", builder()
            .booleanState(POWERED)
            .intState(ROTATION_16, 0, 15)));
    public static final Block CREEPER_WALL_HEAD = register(new Block("creeper_wall_head", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block DRAGON_HEAD = register(new Block("dragon_head", builder()
            .booleanState(POWERED)
            .intState(ROTATION_16, 0, 15)));
    public static final Block DRAGON_WALL_HEAD = register(new Block("dragon_wall_head", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block PIGLIN_HEAD = register(new Block("piglin_head", builder()
            .booleanState(POWERED)
            .intState(ROTATION_16, 0, 15)));
    public static final Block PIGLIN_WALL_HEAD = register(new Block("piglin_wall_head", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block ANVIL = register(new Block("anvil", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block CHIPPED_ANVIL = register(new Block("chipped_anvil", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block DAMAGED_ANVIL = register(new Block("damaged_anvil", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block TRAPPED_CHEST = register(new Block("trapped_chest", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(CHEST_TYPE, "single", "left", "right")
            .booleanState(WATERLOGGED)));
    public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE = register(new Block("light_weighted_pressure_plate", builder()
            .intState(POWER, 0, 15)));
    public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE = register(new Block("heavy_weighted_pressure_plate", builder()
            .intState(POWER, 0, 15)));
    public static final Block COMPARATOR = register(new Block("comparator", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(MODE_COMPARATOR, "compare", "subtract")
            .booleanState(POWERED)));
    public static final Block DAYLIGHT_DETECTOR = register(new Block("daylight_detector", builder()
            .booleanState(INVERTED)
            .intState(POWER, 0, 15)));
    public static final Block REDSTONE_BLOCK = register(new Block("redstone_block", builder()));
    public static final Block NETHER_QUARTZ_ORE = register(new Block("nether_quartz_ore", builder()));
    public static final Block HOPPER = register(new Block("hopper", builder()
            .booleanState(ENABLED)
            .enumState(FACING_HOPPER, Direction.DOWN, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block QUARTZ_BLOCK = register(new Block("quartz_block", builder()));
    public static final Block CHISELED_QUARTZ_BLOCK = register(new Block("chiseled_quartz_block", builder()));
    public static final Block QUARTZ_PILLAR = register(new Block("quartz_pillar", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block QUARTZ_STAIRS = register(new Block("quartz_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block ACTIVATOR_RAIL = register(new Block("activator_rail", builder()
            .booleanState(POWERED)
            .enumState(RAIL_SHAPE_STRAIGHT, "north_south", "east_west", "ascending_east", "ascending_west", "ascending_north", "ascending_south")
            .booleanState(WATERLOGGED)));
    public static final Block DROPPER = register(new Block("dropper", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(TRIGGERED)));
    public static final Block WHITE_TERRACOTTA = register(new Block("white_terracotta", builder()));
    public static final Block ORANGE_TERRACOTTA = register(new Block("orange_terracotta", builder()));
    public static final Block MAGENTA_TERRACOTTA = register(new Block("magenta_terracotta", builder()));
    public static final Block LIGHT_BLUE_TERRACOTTA = register(new Block("light_blue_terracotta", builder()));
    public static final Block YELLOW_TERRACOTTA = register(new Block("yellow_terracotta", builder()));
    public static final Block LIME_TERRACOTTA = register(new Block("lime_terracotta", builder()));
    public static final Block PINK_TERRACOTTA = register(new Block("pink_terracotta", builder()));
    public static final Block GRAY_TERRACOTTA = register(new Block("gray_terracotta", builder()));
    public static final Block LIGHT_GRAY_TERRACOTTA = register(new Block("light_gray_terracotta", builder()));
    public static final Block CYAN_TERRACOTTA = register(new Block("cyan_terracotta", builder()));
    public static final Block PURPLE_TERRACOTTA = register(new Block("purple_terracotta", builder()));
    public static final Block BLUE_TERRACOTTA = register(new Block("blue_terracotta", builder()));
    public static final Block BROWN_TERRACOTTA = register(new Block("brown_terracotta", builder()));
    public static final Block GREEN_TERRACOTTA = register(new Block("green_terracotta", builder()));
    public static final Block RED_TERRACOTTA = register(new Block("red_terracotta", builder()));
    public static final Block BLACK_TERRACOTTA = register(new Block("black_terracotta", builder()));
    public static final Block WHITE_STAINED_GLASS_PANE = register(new Block("white_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block ORANGE_STAINED_GLASS_PANE = register(new Block("orange_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block MAGENTA_STAINED_GLASS_PANE = register(new Block("magenta_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block LIGHT_BLUE_STAINED_GLASS_PANE = register(new Block("light_blue_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block YELLOW_STAINED_GLASS_PANE = register(new Block("yellow_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block LIME_STAINED_GLASS_PANE = register(new Block("lime_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block PINK_STAINED_GLASS_PANE = register(new Block("pink_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block GRAY_STAINED_GLASS_PANE = register(new Block("gray_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block LIGHT_GRAY_STAINED_GLASS_PANE = register(new Block("light_gray_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block CYAN_STAINED_GLASS_PANE = register(new Block("cyan_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block PURPLE_STAINED_GLASS_PANE = register(new Block("purple_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block BLUE_STAINED_GLASS_PANE = register(new Block("blue_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block BROWN_STAINED_GLASS_PANE = register(new Block("brown_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block GREEN_STAINED_GLASS_PANE = register(new Block("green_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block RED_STAINED_GLASS_PANE = register(new Block("red_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block BLACK_STAINED_GLASS_PANE = register(new Block("black_stained_glass_pane", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block ACACIA_STAIRS = register(new Block("acacia_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_STAIRS = register(new Block("cherry_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_STAIRS = register(new Block("dark_oak_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_STAIRS = register(new Block("mangrove_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_STAIRS = register(new Block("bamboo_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_MOSAIC_STAIRS = register(new Block("bamboo_mosaic_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block SLIME_BLOCK = register(new Block("slime_block", builder()));
    public static final Block BARRIER = register(new Block("barrier", builder()
            .booleanState(WATERLOGGED)));
    public static final Block LIGHT = register(new Block("light", builder()
            .intState(LEVEL, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block IRON_TRAPDOOR = register(new Block("iron_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block PRISMARINE = register(new Block("prismarine", builder()));
    public static final Block PRISMARINE_BRICKS = register(new Block("prismarine_bricks", builder()));
    public static final Block DARK_PRISMARINE = register(new Block("dark_prismarine", builder()));
    public static final Block PRISMARINE_STAIRS = register(new Block("prismarine_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block PRISMARINE_BRICK_STAIRS = register(new Block("prismarine_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block DARK_PRISMARINE_STAIRS = register(new Block("dark_prismarine_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block PRISMARINE_SLAB = register(new Block("prismarine_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block PRISMARINE_BRICK_SLAB = register(new Block("prismarine_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block DARK_PRISMARINE_SLAB = register(new Block("dark_prismarine_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SEA_LANTERN = register(new Block("sea_lantern", builder()));
    public static final Block HAY_BLOCK = register(new Block("hay_block", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block WHITE_CARPET = register(new Block("white_carpet", builder()));
    public static final Block ORANGE_CARPET = register(new Block("orange_carpet", builder()));
    public static final Block MAGENTA_CARPET = register(new Block("magenta_carpet", builder()));
    public static final Block LIGHT_BLUE_CARPET = register(new Block("light_blue_carpet", builder()));
    public static final Block YELLOW_CARPET = register(new Block("yellow_carpet", builder()));
    public static final Block LIME_CARPET = register(new Block("lime_carpet", builder()));
    public static final Block PINK_CARPET = register(new Block("pink_carpet", builder()));
    public static final Block GRAY_CARPET = register(new Block("gray_carpet", builder()));
    public static final Block LIGHT_GRAY_CARPET = register(new Block("light_gray_carpet", builder()));
    public static final Block CYAN_CARPET = register(new Block("cyan_carpet", builder()));
    public static final Block PURPLE_CARPET = register(new Block("purple_carpet", builder()));
    public static final Block BLUE_CARPET = register(new Block("blue_carpet", builder()));
    public static final Block BROWN_CARPET = register(new Block("brown_carpet", builder()));
    public static final Block GREEN_CARPET = register(new Block("green_carpet", builder()));
    public static final Block RED_CARPET = register(new Block("red_carpet", builder()));
    public static final Block BLACK_CARPET = register(new Block("black_carpet", builder()));
    public static final Block TERRACOTTA = register(new Block("terracotta", builder()));
    public static final Block COAL_BLOCK = register(new Block("coal_block", builder()));
    public static final Block PACKED_ICE = register(new Block("packed_ice", builder()));
    public static final Block SUNFLOWER = register(new Block("sunflower", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block LILAC = register(new Block("lilac", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block ROSE_BUSH = register(new Block("rose_bush", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block PEONY = register(new Block("peony", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block TALL_GRASS = register(new Block("tall_grass", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block LARGE_FERN = register(new Block("large_fern", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block WHITE_BANNER = register(new BannerBlock("white_banner", 0, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block ORANGE_BANNER = register(new BannerBlock("orange_banner", 1, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block MAGENTA_BANNER = register(new BannerBlock("magenta_banner", 2, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block LIGHT_BLUE_BANNER = register(new BannerBlock("light_blue_banner", 3, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block YELLOW_BANNER = register(new BannerBlock("yellow_banner", 4, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block LIME_BANNER = register(new BannerBlock("lime_banner", 5, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block PINK_BANNER = register(new BannerBlock("pink_banner", 6, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block GRAY_BANNER = register(new BannerBlock("gray_banner", 7, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block LIGHT_GRAY_BANNER = register(new BannerBlock("light_gray_banner", 8, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block CYAN_BANNER = register(new BannerBlock("cyan_banner", 9, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block PURPLE_BANNER = register(new BannerBlock("purple_banner", 10, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block BLUE_BANNER = register(new BannerBlock("blue_banner", 11, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block BROWN_BANNER = register(new BannerBlock("brown_banner", 12, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block GREEN_BANNER = register(new BannerBlock("green_banner", 13, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block RED_BANNER = register(new BannerBlock("red_banner", 14, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block BLACK_BANNER = register(new BannerBlock("black_banner", 15, builder()
            .intState(ROTATION_16, 0, 15)));
    public static final Block WHITE_WALL_BANNER = register(new BannerBlock("white_wall_banner", 0, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block ORANGE_WALL_BANNER = register(new BannerBlock("orange_wall_banner", 1, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block MAGENTA_WALL_BANNER = register(new BannerBlock("magenta_wall_banner", 2, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block LIGHT_BLUE_WALL_BANNER = register(new BannerBlock("light_blue_wall_banner", 3, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block YELLOW_WALL_BANNER = register(new BannerBlock("yellow_wall_banner", 4, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block LIME_WALL_BANNER = register(new BannerBlock("lime_wall_banner", 5, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block PINK_WALL_BANNER = register(new BannerBlock("pink_wall_banner", 6, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block GRAY_WALL_BANNER = register(new BannerBlock("gray_wall_banner", 7, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block LIGHT_GRAY_WALL_BANNER = register(new BannerBlock("light_gray_wall_banner", 8, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block CYAN_WALL_BANNER = register(new BannerBlock("cyan_wall_banner", 9, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block PURPLE_WALL_BANNER = register(new BannerBlock("purple_wall_banner", 10, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BLUE_WALL_BANNER = register(new BannerBlock("blue_wall_banner", 11, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BROWN_WALL_BANNER = register(new BannerBlock("brown_wall_banner", 12, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block GREEN_WALL_BANNER = register(new BannerBlock("green_wall_banner", 13, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block RED_WALL_BANNER = register(new BannerBlock("red_wall_banner", 14, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BLACK_WALL_BANNER = register(new BannerBlock("black_wall_banner", 15, builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block RED_SANDSTONE = register(new Block("red_sandstone", builder()));
    public static final Block CHISELED_RED_SANDSTONE = register(new Block("chiseled_red_sandstone", builder()));
    public static final Block CUT_RED_SANDSTONE = register(new Block("cut_red_sandstone", builder()));
    public static final Block RED_SANDSTONE_STAIRS = register(new Block("red_sandstone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block OAK_SLAB = register(new Block("oak_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SPRUCE_SLAB = register(new Block("spruce_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block BIRCH_SLAB = register(new Block("birch_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block JUNGLE_SLAB = register(new Block("jungle_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block ACACIA_SLAB = register(new Block("acacia_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block CHERRY_SLAB = register(new Block("cherry_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block DARK_OAK_SLAB = register(new Block("dark_oak_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block MANGROVE_SLAB = register(new Block("mangrove_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_SLAB = register(new Block("bamboo_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_MOSAIC_SLAB = register(new Block("bamboo_mosaic_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block STONE_SLAB = register(new Block("stone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_STONE_SLAB = register(new Block("smooth_stone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SANDSTONE_SLAB = register(new Block("sandstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block CUT_SANDSTONE_SLAB = register(new Block("cut_sandstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block PETRIFIED_OAK_SLAB = register(new Block("petrified_oak_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block COBBLESTONE_SLAB = register(new Block("cobblestone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block BRICK_SLAB = register(new Block("brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block STONE_BRICK_SLAB = register(new Block("stone_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block MUD_BRICK_SLAB = register(new Block("mud_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block NETHER_BRICK_SLAB = register(new Block("nether_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block QUARTZ_SLAB = register(new Block("quartz_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block RED_SANDSTONE_SLAB = register(new Block("red_sandstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block CUT_RED_SANDSTONE_SLAB = register(new Block("cut_red_sandstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block PURPUR_SLAB = register(new Block("purpur_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_STONE = register(new Block("smooth_stone", builder()));
    public static final Block SMOOTH_SANDSTONE = register(new Block("smooth_sandstone", builder()));
    public static final Block SMOOTH_QUARTZ = register(new Block("smooth_quartz", builder()));
    public static final Block SMOOTH_RED_SANDSTONE = register(new Block("smooth_red_sandstone", builder()));
    public static final Block SPRUCE_FENCE_GATE = register(new Block("spruce_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block BIRCH_FENCE_GATE = register(new Block("birch_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block JUNGLE_FENCE_GATE = register(new Block("jungle_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block ACACIA_FENCE_GATE = register(new Block("acacia_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block CHERRY_FENCE_GATE = register(new Block("cherry_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block DARK_OAK_FENCE_GATE = register(new Block("dark_oak_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block MANGROVE_FENCE_GATE = register(new Block("mangrove_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block BAMBOO_FENCE_GATE = register(new Block("bamboo_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block SPRUCE_FENCE = register(new Block("spruce_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block BIRCH_FENCE = register(new Block("birch_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block JUNGLE_FENCE = register(new Block("jungle_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block ACACIA_FENCE = register(new Block("acacia_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block CHERRY_FENCE = register(new Block("cherry_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block DARK_OAK_FENCE = register(new Block("dark_oak_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block MANGROVE_FENCE = register(new Block("mangrove_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block BAMBOO_FENCE = register(new Block("bamboo_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block SPRUCE_DOOR = register(new Block("spruce_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block BIRCH_DOOR = register(new Block("birch_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block JUNGLE_DOOR = register(new Block("jungle_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block ACACIA_DOOR = register(new Block("acacia_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block CHERRY_DOOR = register(new Block("cherry_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block DARK_OAK_DOOR = register(new Block("dark_oak_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block MANGROVE_DOOR = register(new Block("mangrove_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block BAMBOO_DOOR = register(new Block("bamboo_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block END_ROD = register(new Block("end_rod", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block CHORUS_PLANT = register(new Block("chorus_plant", builder()
            .booleanState(DOWN)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WEST)));
    public static final Block CHORUS_FLOWER = register(new Block("chorus_flower", builder()
            .intState(AGE_5, 0, 5)));
    public static final Block PURPUR_BLOCK = register(new Block("purpur_block", builder()));
    public static final Block PURPUR_PILLAR = register(new Block("purpur_pillar", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block PURPUR_STAIRS = register(new Block("purpur_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block END_STONE_BRICKS = register(new Block("end_stone_bricks", builder()));
    public static final Block TORCHFLOWER_CROP = register(new Block("torchflower_crop", builder()
            .intState(AGE_1, 0, 1)));
    public static final Block PITCHER_CROP = register(new Block("pitcher_crop", builder()
            .intState(AGE_4, 0, 4)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block PITCHER_PLANT = register(new Block("pitcher_plant", builder()
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")));
    public static final Block BEETROOTS = register(new Block("beetroots", builder()
            .intState(AGE_3, 0, 3)));
    public static final Block DIRT_PATH = register(new Block("dirt_path", builder()));
    public static final Block END_GATEWAY = register(new Block("end_gateway", builder()));
    public static final Block REPEATING_COMMAND_BLOCK = register(new Block("repeating_command_block", builder()
            .booleanState(CONDITIONAL)
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block CHAIN_COMMAND_BLOCK = register(new Block("chain_command_block", builder()
            .booleanState(CONDITIONAL)
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block FROSTED_ICE = register(new Block("frosted_ice", builder()
            .intState(AGE_3, 0, 3)));
    public static final Block MAGMA_BLOCK = register(new Block("magma_block", builder()));
    public static final Block NETHER_WART_BLOCK = register(new Block("nether_wart_block", builder()));
    public static final Block RED_NETHER_BRICKS = register(new Block("red_nether_bricks", builder()));
    public static final Block BONE_BLOCK = register(new Block("bone_block", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRUCTURE_VOID = register(new Block("structure_void", builder()));
    public static final Block OBSERVER = register(new Block("observer", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(POWERED)));
    public static final Block SHULKER_BOX = register(new Block("shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block WHITE_SHULKER_BOX = register(new Block("white_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block ORANGE_SHULKER_BOX = register(new Block("orange_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block MAGENTA_SHULKER_BOX = register(new Block("magenta_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block LIGHT_BLUE_SHULKER_BOX = register(new Block("light_blue_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block YELLOW_SHULKER_BOX = register(new Block("yellow_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block LIME_SHULKER_BOX = register(new Block("lime_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block PINK_SHULKER_BOX = register(new Block("pink_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block GRAY_SHULKER_BOX = register(new Block("gray_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block LIGHT_GRAY_SHULKER_BOX = register(new Block("light_gray_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block CYAN_SHULKER_BOX = register(new Block("cyan_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block PURPLE_SHULKER_BOX = register(new Block("purple_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block BLUE_SHULKER_BOX = register(new Block("blue_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block BROWN_SHULKER_BOX = register(new Block("brown_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block GREEN_SHULKER_BOX = register(new Block("green_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block RED_SHULKER_BOX = register(new Block("red_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block BLACK_SHULKER_BOX = register(new Block("black_shulker_box", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)));
    public static final Block WHITE_GLAZED_TERRACOTTA = register(new Block("white_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block ORANGE_GLAZED_TERRACOTTA = register(new Block("orange_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block MAGENTA_GLAZED_TERRACOTTA = register(new Block("magenta_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block LIGHT_BLUE_GLAZED_TERRACOTTA = register(new Block("light_blue_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block YELLOW_GLAZED_TERRACOTTA = register(new Block("yellow_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block LIME_GLAZED_TERRACOTTA = register(new Block("lime_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block PINK_GLAZED_TERRACOTTA = register(new Block("pink_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block GRAY_GLAZED_TERRACOTTA = register(new Block("gray_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block LIGHT_GRAY_GLAZED_TERRACOTTA = register(new Block("light_gray_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block CYAN_GLAZED_TERRACOTTA = register(new Block("cyan_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block PURPLE_GLAZED_TERRACOTTA = register(new Block("purple_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BLUE_GLAZED_TERRACOTTA = register(new Block("blue_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BROWN_GLAZED_TERRACOTTA = register(new Block("brown_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block GREEN_GLAZED_TERRACOTTA = register(new Block("green_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block RED_GLAZED_TERRACOTTA = register(new Block("red_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BLACK_GLAZED_TERRACOTTA = register(new Block("black_glazed_terracotta", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block WHITE_CONCRETE = register(new Block("white_concrete", builder()));
    public static final Block ORANGE_CONCRETE = register(new Block("orange_concrete", builder()));
    public static final Block MAGENTA_CONCRETE = register(new Block("magenta_concrete", builder()));
    public static final Block LIGHT_BLUE_CONCRETE = register(new Block("light_blue_concrete", builder()));
    public static final Block YELLOW_CONCRETE = register(new Block("yellow_concrete", builder()));
    public static final Block LIME_CONCRETE = register(new Block("lime_concrete", builder()));
    public static final Block PINK_CONCRETE = register(new Block("pink_concrete", builder()));
    public static final Block GRAY_CONCRETE = register(new Block("gray_concrete", builder()));
    public static final Block LIGHT_GRAY_CONCRETE = register(new Block("light_gray_concrete", builder()));
    public static final Block CYAN_CONCRETE = register(new Block("cyan_concrete", builder()));
    public static final Block PURPLE_CONCRETE = register(new Block("purple_concrete", builder()));
    public static final Block BLUE_CONCRETE = register(new Block("blue_concrete", builder()));
    public static final Block BROWN_CONCRETE = register(new Block("brown_concrete", builder()));
    public static final Block GREEN_CONCRETE = register(new Block("green_concrete", builder()));
    public static final Block RED_CONCRETE = register(new Block("red_concrete", builder()));
    public static final Block BLACK_CONCRETE = register(new Block("black_concrete", builder()));
    public static final Block WHITE_CONCRETE_POWDER = register(new Block("white_concrete_powder", builder()));
    public static final Block ORANGE_CONCRETE_POWDER = register(new Block("orange_concrete_powder", builder()));
    public static final Block MAGENTA_CONCRETE_POWDER = register(new Block("magenta_concrete_powder", builder()));
    public static final Block LIGHT_BLUE_CONCRETE_POWDER = register(new Block("light_blue_concrete_powder", builder()));
    public static final Block YELLOW_CONCRETE_POWDER = register(new Block("yellow_concrete_powder", builder()));
    public static final Block LIME_CONCRETE_POWDER = register(new Block("lime_concrete_powder", builder()));
    public static final Block PINK_CONCRETE_POWDER = register(new Block("pink_concrete_powder", builder()));
    public static final Block GRAY_CONCRETE_POWDER = register(new Block("gray_concrete_powder", builder()));
    public static final Block LIGHT_GRAY_CONCRETE_POWDER = register(new Block("light_gray_concrete_powder", builder()));
    public static final Block CYAN_CONCRETE_POWDER = register(new Block("cyan_concrete_powder", builder()));
    public static final Block PURPLE_CONCRETE_POWDER = register(new Block("purple_concrete_powder", builder()));
    public static final Block BLUE_CONCRETE_POWDER = register(new Block("blue_concrete_powder", builder()));
    public static final Block BROWN_CONCRETE_POWDER = register(new Block("brown_concrete_powder", builder()));
    public static final Block GREEN_CONCRETE_POWDER = register(new Block("green_concrete_powder", builder()));
    public static final Block RED_CONCRETE_POWDER = register(new Block("red_concrete_powder", builder()));
    public static final Block BLACK_CONCRETE_POWDER = register(new Block("black_concrete_powder", builder()));
    public static final Block KELP = register(new Block("kelp", builder()
            .intState(AGE_25, 0, 25)));
    public static final Block KELP_PLANT = register(new Block("kelp_plant", builder()));
    public static final Block DRIED_KELP_BLOCK = register(new Block("dried_kelp_block", builder()));
    public static final Block TURTLE_EGG = register(new Block("turtle_egg", builder()
            .intState(EGGS, 1, 4)
            .intState(HATCH, 0, 2)));
    public static final Block SNIFFER_EGG = register(new Block("sniffer_egg", builder()
            .intState(HATCH, 0, 2)));
    public static final Block DEAD_TUBE_CORAL_BLOCK = register(new Block("dead_tube_coral_block", builder()));
    public static final Block DEAD_BRAIN_CORAL_BLOCK = register(new Block("dead_brain_coral_block", builder()));
    public static final Block DEAD_BUBBLE_CORAL_BLOCK = register(new Block("dead_bubble_coral_block", builder()));
    public static final Block DEAD_FIRE_CORAL_BLOCK = register(new Block("dead_fire_coral_block", builder()));
    public static final Block DEAD_HORN_CORAL_BLOCK = register(new Block("dead_horn_coral_block", builder()));
    public static final Block TUBE_CORAL_BLOCK = register(new Block("tube_coral_block", builder()));
    public static final Block BRAIN_CORAL_BLOCK = register(new Block("brain_coral_block", builder()));
    public static final Block BUBBLE_CORAL_BLOCK = register(new Block("bubble_coral_block", builder()));
    public static final Block FIRE_CORAL_BLOCK = register(new Block("fire_coral_block", builder()));
    public static final Block HORN_CORAL_BLOCK = register(new Block("horn_coral_block", builder()));
    public static final Block DEAD_TUBE_CORAL = register(new Block("dead_tube_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_BRAIN_CORAL = register(new Block("dead_brain_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_BUBBLE_CORAL = register(new Block("dead_bubble_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_FIRE_CORAL = register(new Block("dead_fire_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_HORN_CORAL = register(new Block("dead_horn_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block TUBE_CORAL = register(new Block("tube_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block BRAIN_CORAL = register(new Block("brain_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block BUBBLE_CORAL = register(new Block("bubble_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block FIRE_CORAL = register(new Block("fire_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block HORN_CORAL = register(new Block("horn_coral", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_TUBE_CORAL_FAN = register(new Block("dead_tube_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_BRAIN_CORAL_FAN = register(new Block("dead_brain_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_BUBBLE_CORAL_FAN = register(new Block("dead_bubble_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_FIRE_CORAL_FAN = register(new Block("dead_fire_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_HORN_CORAL_FAN = register(new Block("dead_horn_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block TUBE_CORAL_FAN = register(new Block("tube_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block BRAIN_CORAL_FAN = register(new Block("brain_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block BUBBLE_CORAL_FAN = register(new Block("bubble_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block FIRE_CORAL_FAN = register(new Block("fire_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block HORN_CORAL_FAN = register(new Block("horn_coral_fan", builder()
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_TUBE_CORAL_WALL_FAN = register(new Block("dead_tube_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_BRAIN_CORAL_WALL_FAN = register(new Block("dead_brain_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_BUBBLE_CORAL_WALL_FAN = register(new Block("dead_bubble_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_FIRE_CORAL_WALL_FAN = register(new Block("dead_fire_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block DEAD_HORN_CORAL_WALL_FAN = register(new Block("dead_horn_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block TUBE_CORAL_WALL_FAN = register(new Block("tube_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block BRAIN_CORAL_WALL_FAN = register(new Block("brain_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block BUBBLE_CORAL_WALL_FAN = register(new Block("bubble_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block FIRE_CORAL_WALL_FAN = register(new Block("fire_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block HORN_CORAL_WALL_FAN = register(new Block("horn_coral_wall_fan", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block SEA_PICKLE = register(new Block("sea_pickle", builder()
            .intState(PICKLES, 1, 4)
            .booleanState(WATERLOGGED)));
    public static final Block BLUE_ICE = register(new Block("blue_ice", builder()));
    public static final Block CONDUIT = register(new Block("conduit", builder()
            .booleanState(WATERLOGGED)));
    public static final Block BAMBOO_SAPLING = register(new Block("bamboo_sapling", builder()));
    public static final Block BAMBOO = register(new Block("bamboo", builder()
            .intState(AGE_1, 0, 1)
            .enumState(BAMBOO_LEAVES, "none", "small", "large")
            .intState(STAGE, 0, 1)));
    public static final Block POTTED_BAMBOO = register(new Block("potted_bamboo", builder()));
    public static final Block VOID_AIR = register(new Block("void_air", builder()));
    public static final Block CAVE_AIR = register(new Block("cave_air", builder()));
    public static final Block BUBBLE_COLUMN = register(new Block("bubble_column", builder()
            .booleanState(DRAG)));
    public static final Block POLISHED_GRANITE_STAIRS = register(new Block("polished_granite_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_RED_SANDSTONE_STAIRS = register(new Block("smooth_red_sandstone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block MOSSY_STONE_BRICK_STAIRS = register(new Block("mossy_stone_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_DIORITE_STAIRS = register(new Block("polished_diorite_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block MOSSY_COBBLESTONE_STAIRS = register(new Block("mossy_cobblestone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block END_STONE_BRICK_STAIRS = register(new Block("end_stone_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block STONE_STAIRS = register(new Block("stone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_SANDSTONE_STAIRS = register(new Block("smooth_sandstone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_QUARTZ_STAIRS = register(new Block("smooth_quartz_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block GRANITE_STAIRS = register(new Block("granite_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block ANDESITE_STAIRS = register(new Block("andesite_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block RED_NETHER_BRICK_STAIRS = register(new Block("red_nether_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_ANDESITE_STAIRS = register(new Block("polished_andesite_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block DIORITE_STAIRS = register(new Block("diorite_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_GRANITE_SLAB = register(new Block("polished_granite_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_RED_SANDSTONE_SLAB = register(new Block("smooth_red_sandstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block MOSSY_STONE_BRICK_SLAB = register(new Block("mossy_stone_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_DIORITE_SLAB = register(new Block("polished_diorite_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block MOSSY_COBBLESTONE_SLAB = register(new Block("mossy_cobblestone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block END_STONE_BRICK_SLAB = register(new Block("end_stone_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_SANDSTONE_SLAB = register(new Block("smooth_sandstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block SMOOTH_QUARTZ_SLAB = register(new Block("smooth_quartz_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block GRANITE_SLAB = register(new Block("granite_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block ANDESITE_SLAB = register(new Block("andesite_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block RED_NETHER_BRICK_SLAB = register(new Block("red_nether_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_ANDESITE_SLAB = register(new Block("polished_andesite_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block DIORITE_SLAB = register(new Block("diorite_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block BRICK_WALL = register(new Block("brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block PRISMARINE_WALL = register(new Block("prismarine_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block RED_SANDSTONE_WALL = register(new Block("red_sandstone_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block MOSSY_STONE_BRICK_WALL = register(new Block("mossy_stone_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block GRANITE_WALL = register(new Block("granite_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block STONE_BRICK_WALL = register(new Block("stone_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block MUD_BRICK_WALL = register(new Block("mud_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block NETHER_BRICK_WALL = register(new Block("nether_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block ANDESITE_WALL = register(new Block("andesite_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block RED_NETHER_BRICK_WALL = register(new Block("red_nether_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block SANDSTONE_WALL = register(new Block("sandstone_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block END_STONE_BRICK_WALL = register(new Block("end_stone_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block DIORITE_WALL = register(new Block("diorite_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block SCAFFOLDING = register(new Block("scaffolding", builder()
            .booleanState(BOTTOM)
            .intState(STABILITY_DISTANCE, 0, 7)
            .booleanState(WATERLOGGED)));
    public static final Block LOOM = register(new Block("loom", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BARREL = register(new Block("barrel", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(OPEN)));
    public static final Block SMOKER = register(new Block("smoker", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(LIT)));
    public static final Block BLAST_FURNACE = register(new Block("blast_furnace", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(LIT)));
    public static final Block CARTOGRAPHY_TABLE = register(new Block("cartography_table", builder()));
    public static final Block FLETCHING_TABLE = register(new Block("fletching_table", builder()));
    public static final Block GRINDSTONE = register(new Block("grindstone", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block LECTERN = register(new Block("lectern", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(HAS_BOOK)
            .booleanState(POWERED)));
    public static final Block SMITHING_TABLE = register(new Block("smithing_table", builder()));
    public static final Block STONECUTTER = register(new Block("stonecutter", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)));
    public static final Block BELL = register(new Block("bell", builder()
            .enumState(BELL_ATTACHMENT, "floor", "ceiling", "single_wall", "double_wall")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block LANTERN = register(new Block("lantern", builder()
            .booleanState(HANGING)
            .booleanState(WATERLOGGED)));
    public static final Block SOUL_LANTERN = register(new Block("soul_lantern", builder()
            .booleanState(HANGING)
            .booleanState(WATERLOGGED)));
    public static final Block CAMPFIRE = register(new Block("campfire", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(LIT)
            .booleanState(SIGNAL_FIRE)
            .booleanState(WATERLOGGED)));
    public static final Block SOUL_CAMPFIRE = register(new Block("soul_campfire", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(LIT)
            .booleanState(SIGNAL_FIRE)
            .booleanState(WATERLOGGED)));
    public static final Block SWEET_BERRY_BUSH = register(new Block("sweet_berry_bush", builder()
            .intState(AGE_3, 0, 3)));
    public static final Block WARPED_STEM = register(new Block("warped_stem", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_WARPED_STEM = register(new Block("stripped_warped_stem", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block WARPED_HYPHAE = register(new Block("warped_hyphae", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_WARPED_HYPHAE = register(new Block("stripped_warped_hyphae", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block WARPED_NYLIUM = register(new Block("warped_nylium", builder()));
    public static final Block WARPED_FUNGUS = register(new Block("warped_fungus", builder()));
    public static final Block WARPED_WART_BLOCK = register(new Block("warped_wart_block", builder()));
    public static final Block WARPED_ROOTS = register(new Block("warped_roots", builder()));
    public static final Block NETHER_SPROUTS = register(new Block("nether_sprouts", builder()));
    public static final Block CRIMSON_STEM = register(new Block("crimson_stem", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_CRIMSON_STEM = register(new Block("stripped_crimson_stem", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block CRIMSON_HYPHAE = register(new Block("crimson_hyphae", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block STRIPPED_CRIMSON_HYPHAE = register(new Block("stripped_crimson_hyphae", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block CRIMSON_NYLIUM = register(new Block("crimson_nylium", builder()));
    public static final Block CRIMSON_FUNGUS = register(new Block("crimson_fungus", builder()));
    public static final Block SHROOMLIGHT = register(new Block("shroomlight", builder()));
    public static final Block WEEPING_VINES = register(new Block("weeping_vines", builder()
            .intState(AGE_25, 0, 25)));
    public static final Block WEEPING_VINES_PLANT = register(new Block("weeping_vines_plant", builder()));
    public static final Block TWISTING_VINES = register(new Block("twisting_vines", builder()
            .intState(AGE_25, 0, 25)));
    public static final Block TWISTING_VINES_PLANT = register(new Block("twisting_vines_plant", builder()));
    public static final Block CRIMSON_ROOTS = register(new Block("crimson_roots", builder()));
    public static final Block CRIMSON_PLANKS = register(new Block("crimson_planks", builder()));
    public static final Block WARPED_PLANKS = register(new Block("warped_planks", builder()));
    public static final Block CRIMSON_SLAB = register(new Block("crimson_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block WARPED_SLAB = register(new Block("warped_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block CRIMSON_PRESSURE_PLATE = register(new Block("crimson_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block WARPED_PRESSURE_PLATE = register(new Block("warped_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block CRIMSON_FENCE = register(new Block("crimson_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block WARPED_FENCE = register(new Block("warped_fence", builder()
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block CRIMSON_TRAPDOOR = register(new Block("crimson_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block WARPED_TRAPDOOR = register(new Block("warped_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block CRIMSON_FENCE_GATE = register(new Block("crimson_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block WARPED_FENCE_GATE = register(new Block("warped_fence_gate", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(IN_WALL)
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block CRIMSON_STAIRS = register(new Block("crimson_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block WARPED_STAIRS = register(new Block("warped_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block CRIMSON_BUTTON = register(new Block("crimson_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block WARPED_BUTTON = register(new Block("warped_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block CRIMSON_DOOR = register(new Block("crimson_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block WARPED_DOOR = register(new Block("warped_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block CRIMSON_SIGN = register(new Block("crimson_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block WARPED_SIGN = register(new Block("warped_sign", builder()
            .intState(ROTATION_16, 0, 15)
            .booleanState(WATERLOGGED)));
    public static final Block CRIMSON_WALL_SIGN = register(new Block("crimson_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block WARPED_WALL_SIGN = register(new Block("warped_wall_sign", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block STRUCTURE_BLOCK = register(new Block("structure_block", builder()
            .enumState(STRUCTUREBLOCK_MODE, "save", "load", "corner", "data")));
    public static final Block JIGSAW = register(new Block("jigsaw", builder()
            .enumState(ORIENTATION, "down_east", "down_north", "down_south", "down_west", "up_east", "up_north", "up_south", "up_west", "west_up", "east_up", "north_up", "south_up")));
    public static final Block COMPOSTER = register(new Block("composter", builder()
            .intState(LEVEL_COMPOSTER, 0, 8)));
    public static final Block TARGET = register(new Block("target", builder()
            .intState(POWER, 0, 15)));
    public static final Block BEE_NEST = register(new Block("bee_nest", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .intState(LEVEL_HONEY, 0, 5)));
    public static final Block BEEHIVE = register(new Block("beehive", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .intState(LEVEL_HONEY, 0, 5)));
    public static final Block HONEY_BLOCK = register(new Block("honey_block", builder()));
    public static final Block HONEYCOMB_BLOCK = register(new Block("honeycomb_block", builder()));
    public static final Block NETHERITE_BLOCK = register(new Block("netherite_block", builder()));
    public static final Block ANCIENT_DEBRIS = register(new Block("ancient_debris", builder()));
    public static final Block CRYING_OBSIDIAN = register(new Block("crying_obsidian", builder()));
    public static final Block RESPAWN_ANCHOR = register(new Block("respawn_anchor", builder()
            .intState(RESPAWN_ANCHOR_CHARGES, 0, 4)));
    public static final Block POTTED_CRIMSON_FUNGUS = register(new Block("potted_crimson_fungus", builder()));
    public static final Block POTTED_WARPED_FUNGUS = register(new Block("potted_warped_fungus", builder()));
    public static final Block POTTED_CRIMSON_ROOTS = register(new Block("potted_crimson_roots", builder()));
    public static final Block POTTED_WARPED_ROOTS = register(new Block("potted_warped_roots", builder()));
    public static final Block LODESTONE = register(new Block("lodestone", builder()));
    public static final Block BLACKSTONE = register(new Block("blackstone", builder()));
    public static final Block BLACKSTONE_STAIRS = register(new Block("blackstone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block BLACKSTONE_WALL = register(new Block("blackstone_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block BLACKSTONE_SLAB = register(new Block("blackstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_BLACKSTONE = register(new Block("polished_blackstone", builder()));
    public static final Block POLISHED_BLACKSTONE_BRICKS = register(new Block("polished_blackstone_bricks", builder()));
    public static final Block CRACKED_POLISHED_BLACKSTONE_BRICKS = register(new Block("cracked_polished_blackstone_bricks", builder()));
    public static final Block CHISELED_POLISHED_BLACKSTONE = register(new Block("chiseled_polished_blackstone", builder()));
    public static final Block POLISHED_BLACKSTONE_BRICK_SLAB = register(new Block("polished_blackstone_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_BLACKSTONE_BRICK_STAIRS = register(new Block("polished_blackstone_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_BLACKSTONE_BRICK_WALL = register(new Block("polished_blackstone_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block GILDED_BLACKSTONE = register(new Block("gilded_blackstone", builder()));
    public static final Block POLISHED_BLACKSTONE_STAIRS = register(new Block("polished_blackstone_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_BLACKSTONE_SLAB = register(new Block("polished_blackstone_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_BLACKSTONE_PRESSURE_PLATE = register(new Block("polished_blackstone_pressure_plate", builder()
            .booleanState(POWERED)));
    public static final Block POLISHED_BLACKSTONE_BUTTON = register(new Block("polished_blackstone_button", builder()
            .enumState(ATTACH_FACE, "floor", "wall", "ceiling")
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(POWERED)));
    public static final Block POLISHED_BLACKSTONE_WALL = register(new Block("polished_blackstone_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block CHISELED_NETHER_BRICKS = register(new Block("chiseled_nether_bricks", builder()));
    public static final Block CRACKED_NETHER_BRICKS = register(new Block("cracked_nether_bricks", builder()));
    public static final Block QUARTZ_BRICKS = register(new Block("quartz_bricks", builder()));
    public static final Block CANDLE = register(new Block("candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block WHITE_CANDLE = register(new Block("white_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block ORANGE_CANDLE = register(new Block("orange_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block MAGENTA_CANDLE = register(new Block("magenta_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block LIGHT_BLUE_CANDLE = register(new Block("light_blue_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block YELLOW_CANDLE = register(new Block("yellow_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block LIME_CANDLE = register(new Block("lime_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block PINK_CANDLE = register(new Block("pink_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block GRAY_CANDLE = register(new Block("gray_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block LIGHT_GRAY_CANDLE = register(new Block("light_gray_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block CYAN_CANDLE = register(new Block("cyan_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block PURPLE_CANDLE = register(new Block("purple_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block BLUE_CANDLE = register(new Block("blue_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block BROWN_CANDLE = register(new Block("brown_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block GREEN_CANDLE = register(new Block("green_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block RED_CANDLE = register(new Block("red_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block BLACK_CANDLE = register(new Block("black_candle", builder()
            .intState(CANDLES, 1, 4)
            .booleanState(LIT)
            .booleanState(WATERLOGGED)));
    public static final Block CANDLE_CAKE = register(new Block("candle_cake", builder()
            .booleanState(LIT)));
    public static final Block WHITE_CANDLE_CAKE = register(new Block("white_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block ORANGE_CANDLE_CAKE = register(new Block("orange_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block MAGENTA_CANDLE_CAKE = register(new Block("magenta_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block LIGHT_BLUE_CANDLE_CAKE = register(new Block("light_blue_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block YELLOW_CANDLE_CAKE = register(new Block("yellow_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block LIME_CANDLE_CAKE = register(new Block("lime_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block PINK_CANDLE_CAKE = register(new Block("pink_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block GRAY_CANDLE_CAKE = register(new Block("gray_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block LIGHT_GRAY_CANDLE_CAKE = register(new Block("light_gray_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block CYAN_CANDLE_CAKE = register(new Block("cyan_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block PURPLE_CANDLE_CAKE = register(new Block("purple_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block BLUE_CANDLE_CAKE = register(new Block("blue_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block BROWN_CANDLE_CAKE = register(new Block("brown_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block GREEN_CANDLE_CAKE = register(new Block("green_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block RED_CANDLE_CAKE = register(new Block("red_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block BLACK_CANDLE_CAKE = register(new Block("black_candle_cake", builder()
            .booleanState(LIT)));
    public static final Block AMETHYST_BLOCK = register(new Block("amethyst_block", builder()));
    public static final Block BUDDING_AMETHYST = register(new Block("budding_amethyst", builder()));
    public static final Block AMETHYST_CLUSTER = register(new Block("amethyst_cluster", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(WATERLOGGED)));
    public static final Block LARGE_AMETHYST_BUD = register(new Block("large_amethyst_bud", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(WATERLOGGED)));
    public static final Block MEDIUM_AMETHYST_BUD = register(new Block("medium_amethyst_bud", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(WATERLOGGED)));
    public static final Block SMALL_AMETHYST_BUD = register(new Block("small_amethyst_bud", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(WATERLOGGED)));
    public static final Block TUFF = register(new Block("tuff", builder()));
    public static final Block TUFF_SLAB = register(new Block("tuff_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block TUFF_STAIRS = register(new Block("tuff_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block TUFF_WALL = register(new Block("tuff_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block POLISHED_TUFF = register(new Block("polished_tuff", builder()));
    public static final Block POLISHED_TUFF_SLAB = register(new Block("polished_tuff_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_TUFF_STAIRS = register(new Block("polished_tuff_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_TUFF_WALL = register(new Block("polished_tuff_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block CHISELED_TUFF = register(new Block("chiseled_tuff", builder()));
    public static final Block TUFF_BRICKS = register(new Block("tuff_bricks", builder()));
    public static final Block TUFF_BRICK_SLAB = register(new Block("tuff_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block TUFF_BRICK_STAIRS = register(new Block("tuff_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block TUFF_BRICK_WALL = register(new Block("tuff_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block CHISELED_TUFF_BRICKS = register(new Block("chiseled_tuff_bricks", builder()));
    public static final Block CALCITE = register(new Block("calcite", builder()));
    public static final Block TINTED_GLASS = register(new Block("tinted_glass", builder()));
    public static final Block POWDER_SNOW = register(new Block("powder_snow", builder()));
    public static final Block SCULK_SENSOR = register(new Block("sculk_sensor", builder()
            .intState(POWER, 0, 15)
            .enumState(SCULK_SENSOR_PHASE, "inactive", "active", "cooldown")
            .booleanState(WATERLOGGED)));
    public static final Block CALIBRATED_SCULK_SENSOR = register(new Block("calibrated_sculk_sensor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .intState(POWER, 0, 15)
            .enumState(SCULK_SENSOR_PHASE, "inactive", "active", "cooldown")
            .booleanState(WATERLOGGED)));
    public static final Block SCULK = register(new Block("sculk", builder()));
    public static final Block SCULK_VEIN = register(new Block("sculk_vein", builder()
            .booleanState(DOWN)
            .booleanState(EAST)
            .booleanState(NORTH)
            .booleanState(SOUTH)
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .booleanState(WEST)));
    public static final Block SCULK_CATALYST = register(new Block("sculk_catalyst", builder()
            .booleanState(BLOOM)));
    public static final Block SCULK_SHRIEKER = register(new Block("sculk_shrieker", builder()
            .booleanState(CAN_SUMMON)
            .booleanState(SHRIEKING)
            .booleanState(WATERLOGGED)));
    public static final Block COPPER_BLOCK = register(new Block("copper_block", builder()));
    public static final Block EXPOSED_COPPER = register(new Block("exposed_copper", builder()));
    public static final Block WEATHERED_COPPER = register(new Block("weathered_copper", builder()));
    public static final Block OXIDIZED_COPPER = register(new Block("oxidized_copper", builder()));
    public static final Block COPPER_ORE = register(new Block("copper_ore", builder()));
    public static final Block DEEPSLATE_COPPER_ORE = register(new Block("deepslate_copper_ore", builder()));
    public static final Block OXIDIZED_CUT_COPPER = register(new Block("oxidized_cut_copper", builder()));
    public static final Block WEATHERED_CUT_COPPER = register(new Block("weathered_cut_copper", builder()));
    public static final Block EXPOSED_CUT_COPPER = register(new Block("exposed_cut_copper", builder()));
    public static final Block CUT_COPPER = register(new Block("cut_copper", builder()));
    public static final Block OXIDIZED_CHISELED_COPPER = register(new Block("oxidized_chiseled_copper", builder()));
    public static final Block WEATHERED_CHISELED_COPPER = register(new Block("weathered_chiseled_copper", builder()));
    public static final Block EXPOSED_CHISELED_COPPER = register(new Block("exposed_chiseled_copper", builder()));
    public static final Block CHISELED_COPPER = register(new Block("chiseled_copper", builder()));
    public static final Block WAXED_OXIDIZED_CHISELED_COPPER = register(new Block("waxed_oxidized_chiseled_copper", builder()));
    public static final Block WAXED_WEATHERED_CHISELED_COPPER = register(new Block("waxed_weathered_chiseled_copper", builder()));
    public static final Block WAXED_EXPOSED_CHISELED_COPPER = register(new Block("waxed_exposed_chiseled_copper", builder()));
    public static final Block WAXED_CHISELED_COPPER = register(new Block("waxed_chiseled_copper", builder()));
    public static final Block OXIDIZED_CUT_COPPER_STAIRS = register(new Block("oxidized_cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block WEATHERED_CUT_COPPER_STAIRS = register(new Block("weathered_cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block EXPOSED_CUT_COPPER_STAIRS = register(new Block("exposed_cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block CUT_COPPER_STAIRS = register(new Block("cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block OXIDIZED_CUT_COPPER_SLAB = register(new Block("oxidized_cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block WEATHERED_CUT_COPPER_SLAB = register(new Block("weathered_cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block EXPOSED_CUT_COPPER_SLAB = register(new Block("exposed_cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block CUT_COPPER_SLAB = register(new Block("cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_COPPER_BLOCK = register(new Block("waxed_copper_block", builder()));
    public static final Block WAXED_WEATHERED_COPPER = register(new Block("waxed_weathered_copper", builder()));
    public static final Block WAXED_EXPOSED_COPPER = register(new Block("waxed_exposed_copper", builder()));
    public static final Block WAXED_OXIDIZED_COPPER = register(new Block("waxed_oxidized_copper", builder()));
    public static final Block WAXED_OXIDIZED_CUT_COPPER = register(new Block("waxed_oxidized_cut_copper", builder()));
    public static final Block WAXED_WEATHERED_CUT_COPPER = register(new Block("waxed_weathered_cut_copper", builder()));
    public static final Block WAXED_EXPOSED_CUT_COPPER = register(new Block("waxed_exposed_cut_copper", builder()));
    public static final Block WAXED_CUT_COPPER = register(new Block("waxed_cut_copper", builder()));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_STAIRS = register(new Block("waxed_oxidized_cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_STAIRS = register(new Block("waxed_weathered_cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_STAIRS = register(new Block("waxed_exposed_cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_CUT_COPPER_STAIRS = register(new Block("waxed_cut_copper_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_OXIDIZED_CUT_COPPER_SLAB = register(new Block("waxed_oxidized_cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_WEATHERED_CUT_COPPER_SLAB = register(new Block("waxed_weathered_cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_EXPOSED_CUT_COPPER_SLAB = register(new Block("waxed_exposed_cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_CUT_COPPER_SLAB = register(new Block("waxed_cut_copper_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block COPPER_DOOR = register(new Block("copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block EXPOSED_COPPER_DOOR = register(new Block("exposed_copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block OXIDIZED_COPPER_DOOR = register(new Block("oxidized_copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block WEATHERED_COPPER_DOOR = register(new Block("weathered_copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block WAXED_COPPER_DOOR = register(new Block("waxed_copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block WAXED_EXPOSED_COPPER_DOOR = register(new Block("waxed_exposed_copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block WAXED_OXIDIZED_COPPER_DOOR = register(new Block("waxed_oxidized_copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block WAXED_WEATHERED_COPPER_DOOR = register(new Block("waxed_weathered_copper_door", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .enumState(DOOR_HINGE, "left", "right")
            .booleanState(OPEN)
            .booleanState(POWERED)));
    public static final Block COPPER_TRAPDOOR = register(new Block("copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block EXPOSED_COPPER_TRAPDOOR = register(new Block("exposed_copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block OXIDIZED_COPPER_TRAPDOOR = register(new Block("oxidized_copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block WEATHERED_COPPER_TRAPDOOR = register(new Block("weathered_copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_COPPER_TRAPDOOR = register(new Block("waxed_copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = register(new Block("waxed_exposed_copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = register(new Block("waxed_oxidized_copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = register(new Block("waxed_weathered_copper_trapdoor", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .booleanState(OPEN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block COPPER_GRATE = register(new Block("copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block EXPOSED_COPPER_GRATE = register(new Block("exposed_copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block WEATHERED_COPPER_GRATE = register(new Block("weathered_copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block OXIDIZED_COPPER_GRATE = register(new Block("oxidized_copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_COPPER_GRATE = register(new Block("waxed_copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_EXPOSED_COPPER_GRATE = register(new Block("waxed_exposed_copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_WEATHERED_COPPER_GRATE = register(new Block("waxed_weathered_copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block WAXED_OXIDIZED_COPPER_GRATE = register(new Block("waxed_oxidized_copper_grate", builder()
            .booleanState(WATERLOGGED)));
    public static final Block COPPER_BULB = register(new Block("copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block EXPOSED_COPPER_BULB = register(new Block("exposed_copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block WEATHERED_COPPER_BULB = register(new Block("weathered_copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block OXIDIZED_COPPER_BULB = register(new Block("oxidized_copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block WAXED_COPPER_BULB = register(new Block("waxed_copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block WAXED_EXPOSED_COPPER_BULB = register(new Block("waxed_exposed_copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block WAXED_WEATHERED_COPPER_BULB = register(new Block("waxed_weathered_copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block WAXED_OXIDIZED_COPPER_BULB = register(new Block("waxed_oxidized_copper_bulb", builder()
            .booleanState(LIT)
            .booleanState(POWERED)));
    public static final Block LIGHTNING_ROD = register(new Block("lightning_rod", builder()
            .enumState(FACING, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP, Direction.DOWN)
            .booleanState(POWERED)
            .booleanState(WATERLOGGED)));
    public static final Block POINTED_DRIPSTONE = register(new Block("pointed_dripstone", builder()
            .enumState(DRIPSTONE_THICKNESS, "tip_merge", "tip", "frustum", "middle", "base")
            .enumState(VERTICAL_DIRECTION, Direction.UP, Direction.DOWN)
            .booleanState(WATERLOGGED)));
    public static final Block DRIPSTONE_BLOCK = register(new Block("dripstone_block", builder()));
    public static final Block CAVE_VINES = register(new Block("cave_vines", builder()
            .intState(AGE_25, 0, 25)
            .booleanState(BERRIES)));
    public static final Block CAVE_VINES_PLANT = register(new Block("cave_vines_plant", builder()
            .booleanState(BERRIES)));
    public static final Block SPORE_BLOSSOM = register(new Block("spore_blossom", builder()));
    public static final Block AZALEA = register(new Block("azalea", builder()));
    public static final Block FLOWERING_AZALEA = register(new Block("flowering_azalea", builder()));
    public static final Block MOSS_CARPET = register(new Block("moss_carpet", builder()));
    public static final Block PINK_PETALS = register(new Block("pink_petals", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .intState(FLOWER_AMOUNT, 1, 4)));
    public static final Block MOSS_BLOCK = register(new Block("moss_block", builder()));
    public static final Block BIG_DRIPLEAF = register(new Block("big_dripleaf", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(TILT, "none", "unstable", "partial", "full")
            .booleanState(WATERLOGGED)));
    public static final Block BIG_DRIPLEAF_STEM = register(new Block("big_dripleaf_stem", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block SMALL_DRIPLEAF = register(new Block("small_dripleaf", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(DOUBLE_BLOCK_HALF, "upper", "lower")
            .booleanState(WATERLOGGED)));
    public static final Block HANGING_ROOTS = register(new Block("hanging_roots", builder()
            .booleanState(WATERLOGGED)));
    public static final Block ROOTED_DIRT = register(new Block("rooted_dirt", builder()));
    public static final Block MUD = register(new Block("mud", builder()));
    public static final Block DEEPSLATE = register(new Block("deepslate", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block COBBLED_DEEPSLATE = register(new Block("cobbled_deepslate", builder()));
    public static final Block COBBLED_DEEPSLATE_STAIRS = register(new Block("cobbled_deepslate_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block COBBLED_DEEPSLATE_SLAB = register(new Block("cobbled_deepslate_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block COBBLED_DEEPSLATE_WALL = register(new Block("cobbled_deepslate_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block POLISHED_DEEPSLATE = register(new Block("polished_deepslate", builder()));
    public static final Block POLISHED_DEEPSLATE_STAIRS = register(new Block("polished_deepslate_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_DEEPSLATE_SLAB = register(new Block("polished_deepslate_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block POLISHED_DEEPSLATE_WALL = register(new Block("polished_deepslate_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block DEEPSLATE_TILES = register(new Block("deepslate_tiles", builder()));
    public static final Block DEEPSLATE_TILE_STAIRS = register(new Block("deepslate_tile_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block DEEPSLATE_TILE_SLAB = register(new Block("deepslate_tile_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block DEEPSLATE_TILE_WALL = register(new Block("deepslate_tile_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block DEEPSLATE_BRICKS = register(new Block("deepslate_bricks", builder()));
    public static final Block DEEPSLATE_BRICK_STAIRS = register(new Block("deepslate_brick_stairs", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .enumState(HALF, "top", "bottom")
            .enumState(STAIRS_SHAPE, "straight", "inner_left", "inner_right", "outer_left", "outer_right")
            .booleanState(WATERLOGGED)));
    public static final Block DEEPSLATE_BRICK_SLAB = register(new Block("deepslate_brick_slab", builder()
            .enumState(SLAB_TYPE, "top", "bottom", "double")
            .booleanState(WATERLOGGED)));
    public static final Block DEEPSLATE_BRICK_WALL = register(new Block("deepslate_brick_wall", builder()
            .enumState(EAST_WALL, "none", "low", "tall")
            .enumState(NORTH_WALL, "none", "low", "tall")
            .enumState(SOUTH_WALL, "none", "low", "tall")
            .booleanState(UP)
            .booleanState(WATERLOGGED)
            .enumState(WEST_WALL, "none", "low", "tall")));
    public static final Block CHISELED_DEEPSLATE = register(new Block("chiseled_deepslate", builder()));
    public static final Block CRACKED_DEEPSLATE_BRICKS = register(new Block("cracked_deepslate_bricks", builder()));
    public static final Block CRACKED_DEEPSLATE_TILES = register(new Block("cracked_deepslate_tiles", builder()));
    public static final Block INFESTED_DEEPSLATE = register(new Block("infested_deepslate", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block SMOOTH_BASALT = register(new Block("smooth_basalt", builder()));
    public static final Block RAW_IRON_BLOCK = register(new Block("raw_iron_block", builder()));
    public static final Block RAW_COPPER_BLOCK = register(new Block("raw_copper_block", builder()));
    public static final Block RAW_GOLD_BLOCK = register(new Block("raw_gold_block", builder()));
    public static final Block POTTED_AZALEA_BUSH = register(new Block("potted_azalea_bush", builder()));
    public static final Block POTTED_FLOWERING_AZALEA_BUSH = register(new Block("potted_flowering_azalea_bush", builder()));
    public static final Block OCHRE_FROGLIGHT = register(new Block("ochre_froglight", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block VERDANT_FROGLIGHT = register(new Block("verdant_froglight", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block PEARLESCENT_FROGLIGHT = register(new Block("pearlescent_froglight", builder()
            .enumState(AXIS, Axis.VALUES)));
    public static final Block FROGSPAWN = register(new Block("frogspawn", builder()));
    public static final Block REINFORCED_DEEPSLATE = register(new Block("reinforced_deepslate", builder()));
    public static final Block DECORATED_POT = register(new Block("decorated_pot", builder()
            .booleanState(CRACKED)
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(WATERLOGGED)));
    public static final Block CRAFTER = register(new Block("crafter", builder()
            .booleanState(CRAFTING)
            .enumState(ORIENTATION, "down_east", "down_north", "down_south", "down_west", "up_east", "up_north", "up_south", "up_west", "west_up", "east_up", "north_up", "south_up")
            .booleanState(TRIGGERED)));
    public static final Block TRIAL_SPAWNER = register(new Block("trial_spawner", builder()
            .booleanState(OMINOUS)
            .enumState(TRIAL_SPAWNER_STATE, "inactive", "waiting_for_players", "active", "waiting_for_reward_ejection", "ejecting_reward", "cooldown")));
    public static final Block VAULT = register(new Block("vault", builder()
            .enumState(HORIZONTAL_FACING, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST)
            .booleanState(OMINOUS)
            .enumState(VAULT_STATE, "inactive", "active", "unlocking", "ejecting")));
    public static final Block HEAVY_CORE = register(new Block("heavy_core", builder()
            .booleanState(WATERLOGGED)));

    private static <T extends Block> T register(T block) {
        BlockRegistries.JAVA_BLOCKS_TO_RENAME.get().add(block);
        return block;
    }

    private Blocks() {
    }
}