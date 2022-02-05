package co.eltrut.lepton.core.registry;

import co.eltrut.differentiate.common.block.DifferStoneButtonBlock;
import co.eltrut.differentiate.common.block.StonePressurePlateBlock;
import co.eltrut.differentiate.common.block.VerticalSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogStairBlock;
import co.eltrut.differentiate.common.block.wood.LogVerticalSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogWallBlock;
import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import co.eltrut.lepton.common.blocks.*;
import co.eltrut.lepton.common.repo.WoodVariantRepo;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registrator.LeptonBlockHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Lepton.MOD_ID, bus = Bus.MOD)
public class LeptonBlocks {
	
	public static final LeptonBlockHelper HELPER = Lepton.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);

	// Vanilla
	public static final WoodVariantRepo ACACIA = HELPER.createSimpleWoodVariants(Blocks.ACACIA_WOOD);
	public static final WoodVariantRepo BIRCH = HELPER.createSimpleWoodVariants(Blocks.BIRCH_WOOD);
	public static final WoodVariantRepo DARK_OAK = HELPER.createSimpleWoodVariants(Blocks.DARK_OAK_WOOD);
	public static final WoodVariantRepo JUNGLE = HELPER.createSimpleWoodVariants(Blocks.JUNGLE_WOOD);
	public static final WoodVariantRepo OAK = HELPER.createSimpleWoodVariants(Blocks.OAK_WOOD);
	public static final WoodVariantRepo SPRUCE = HELPER.createSimpleWoodVariants(Blocks.SPRUCE_WOOD);
	public static final WoodVariantRepo CRIMSON = HELPER.createNetherWoodVariants(Blocks.CRIMSON_HYPHAE);
	public static final WoodVariantRepo WARPED = HELPER.createNetherWoodVariants(Blocks.WARPED_HYPHAE);

	public static final VariantBlocksRepo QUARTZ_BRICK = HELPER.createSimpleVariants("quartz_brick", Blocks.QUARTZ_BRICKS);

	public static final RegistryObject<Block> SMOOTH_STONE_STAIRS = HELPER.createSimpleBlock("smooth_stone_stairs", () -> new StairBlock(Blocks.SMOOTH_STONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cut_sandstone_stairs", () -> new StairBlock(Blocks.CUT_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cut_red_sandstone_stairs", () -> new StairBlock(Blocks.CUT_RED_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> PURPUR_WALL = HELPER.createSimpleBlock("purpur_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> QUARTZ_WALL = HELPER.createSimpleBlock("quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_QUARTZ_WALL = HELPER.createSimpleBlock("smooth_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> POLISHED_ANDESITE_WALL = HELPER.createSimpleBlock("polished_andesite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> POLISHED_DIORITE_WALL = HELPER.createSimpleBlock("polished_diorite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> POLISHED_GRANITE_WALL = HELPER.createSimpleBlock("polished_granite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> STONE_WALL = HELPER.createSimpleBlock("stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_STONE_WALL = HELPER.createSimpleBlock("smooth_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> PRISMARINE_BRICK_WALL = HELPER.createSimpleBlock("prismarine_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> DARK_PRISMARINE_WALL = HELPER.createSimpleBlock("dark_prismarine_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CUT_SANDSTONE_WALL = HELPER.createSimpleBlock("cut_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = HELPER.createSimpleBlock("cut_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = HELPER.createSimpleBlock("smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = HELPER.createSimpleBlock("smooth_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> POLISHED_ANDESITE_BUTTON = HELPER.createSimpleBlock("polished_andesite_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_BUTTON = HELPER.createSimpleBlock("polished_diorite_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_BUTTON = HELPER.createSimpleBlock("polished_granite_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE);

	public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_andesite_pressure_plate", () -> new StonePressurePlateBlock(Properties.ANDESITE_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_diorite_pressure_plate", () -> new StonePressurePlateBlock(Properties.DIORITE_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_granite_pressure_plate", () -> new StonePressurePlateBlock(Properties.GRANITE_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE);

	// Quark
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cut_soul_sandstone_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE_POWDER::defaultBlockState, BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.QUARK);

	public static final RegistryObject<Block> MIDORI_WALL = HELPER.createSimpleBlock("midori_wall", () -> new WallBlock(BlockUtil.QuarkProperties.MIDORI), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = HELPER.createSimpleBlock("polished_limestone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.LIMESTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_JASPER_WALL = HELPER.createSimpleBlock("polished_jasper_wall", () -> new WallBlock(BlockUtil.QuarkProperties.JASPER), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_SLATE_WALL = HELPER.createSimpleBlock("polished_slate_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SLATE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_MYALITE_WALL = HELPER.createSimpleBlock("polished_myalite_wall", () -> new PolishedMyaliteWallBlock(BlockUtil.QuarkProperties.MYALITE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> ELDER_PRISMARINE_BRICK_WALL = HELPER.createSimpleBlock("elder_prismarine_brick_wall", () -> new WallBlock(BlockUtil.QuarkProperties.ELDER_PRISMARINE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> DARK_ELDER_PRISMARINE_WALL = HELPER.createSimpleBlock("dark_elder_prismarine_wall", () -> new WallBlock(BlockUtil.QuarkProperties.ELDER_PRISMARINE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createSimpleBlock("cut_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createSimpleBlock("smooth_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);

	public static final RegistryObject<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createSimpleBlock("polished_limestone_button", () -> new DifferStoneButtonBlock(LeptonBlocks.Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_JASPER_BUTTON = HELPER.createSimpleBlock("polished_jasper_button", () -> new DifferStoneButtonBlock(LeptonBlocks.Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_SLATE_BUTTON = HELPER.createSimpleBlock("polished_slate_button", () -> new DifferStoneButtonBlock(LeptonBlocks.Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_MYALITE_BUTTON = HELPER.createSimpleBlock("polished_myalite_button", () -> new PolishedMyaliteButtonBlock(LeptonBlocks.Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);

	public static final RegistryObject<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_limestone_pressure_plate", () -> new StonePressurePlateBlock(Properties.LIMESTONE_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_jasper_pressure_plate", () -> new StonePressurePlateBlock(Properties.JASPER_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_SLATE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_slate_pressure_plate", () -> new StonePressurePlateBlock(Properties.SLATE_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_MYALITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_myalite_pressure_plate", () -> new PolishedMyalitePressurePlateBlock(Properties.MYALITE_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	
	// Atmospheric
	public static final RegistryObject<Block> CUT_ARID_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cut_arid_sandstone_stairs", () -> new StairBlock(Blocks.CUT_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> CUT_RED_ARID_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cut_red_arid_sandstone_stairs", () -> new StairBlock(Blocks.CUT_RED_SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.ATMOSPHERIC);
	
	public static final RegistryObject<Block> CUT_ARID_SANDSTONE_WALL = HELPER.createSimpleBlock("cut_arid_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> CUT_RED_ARID_SANDSTONE_WALL = HELPER.createSimpleBlock("cut_red_arid_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> SMOOTH_ARID_SANDSTONE_WALL = HELPER.createSimpleBlock("smooth_arid_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> SMOOTH_RED_ARID_SANDSTONE_WALL = HELPER.createSimpleBlock("smooth_red_arid_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE)), CreativeModeTab.TAB_DECORATIONS, Mods.ATMOSPHERIC);
	
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_rosewood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_rosewood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_WALL = HELPER.createSimpleFuelBlock("stripped_rosewood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_ROSEWOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_rosewood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK, Mods.ATMOSPHERIC);
	
	public static final RegistryObject<Block> ROSEWOOD_SLAB = HELPER.createSimpleFuelBlock("rosewood_slab", () -> new LogSlabBlock(STRIPPED_ROSEWOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> ROSEWOOD_STAIRS = HELPER.createSimpleFuelBlock("rosewood_stairs", () -> new LogStairBlock(STRIPPED_ROSEWOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> ROSEWOOD_WALL = HELPER.createSimpleFuelBlock("rosewood_wall", () -> new LogWallBlock(STRIPPED_ROSEWOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> ROSEWOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("rosewood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ROSEWOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_morado_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_morado_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_morado_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_MORADO_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_morado_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> MORADO_WOOD_SLAB = HELPER.createSimpleFuelBlock("morado_wood_slab", () -> new LogSlabBlock(STRIPPED_MORADO_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> MORADO_WOOD_STAIRS = HELPER.createSimpleFuelBlock("morado_wood_stairs", () -> new LogStairBlock(STRIPPED_MORADO_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> MORADO_WOOD_WALL = HELPER.createSimpleFuelBlock("morado_wood_wall", () -> new LogWallBlock(STRIPPED_MORADO_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> MORADO_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("morado_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_MORADO_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_yucca_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_yucca_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_yucca_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_YUCCA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_yucca_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> YUCCA_WOOD_SLAB = HELPER.createSimpleFuelBlock("yucca_wood_slab", () -> new LogSlabBlock(STRIPPED_YUCCA_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> YUCCA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("yucca_wood_stairs", () -> new LogStairBlock(STRIPPED_YUCCA_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> YUCCA_WOOD_WALL = HELPER.createSimpleFuelBlock("yucca_wood_wall", () -> new LogWallBlock(STRIPPED_YUCCA_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> YUCCA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("yucca_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_YUCCA_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_kousa_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_kousa_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_kousa_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_KOUSA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_kousa_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> KOUSA_WOOD_SLAB = HELPER.createSimpleFuelBlock("kousa_wood_slab", () -> new LogSlabBlock(STRIPPED_KOUSA_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> KOUSA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("kousa_wood_stairs", () -> new LogStairBlock(STRIPPED_KOUSA_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> KOUSA_WOOD_WALL = HELPER.createSimpleFuelBlock("kousa_wood_wall", () -> new LogWallBlock(STRIPPED_KOUSA_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> KOUSA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("kousa_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_KOUSA_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_aspen_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_aspen_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_aspen_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_ASPEN_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_aspen_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> ASPEN_WOOD_SLAB = HELPER.createSimpleFuelBlock("aspen_wood_slab", () -> new LogSlabBlock(STRIPPED_ASPEN_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> ASPEN_WOOD_STAIRS = HELPER.createSimpleFuelBlock("aspen_wood_stairs", () -> new LogStairBlock(STRIPPED_ASPEN_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> ASPEN_WOOD_WALL = HELPER.createSimpleFuelBlock("aspen_wood_wall", () -> new LogWallBlock(STRIPPED_ASPEN_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> ASPEN_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("aspen_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_ASPEN_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_grimwood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_grimwood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_WALL = HELPER.createSimpleFuelBlock("stripped_grimwood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> STRIPPED_GRIMWOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_grimwood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	public static final RegistryObject<Block> GRIMWOOD_SLAB = HELPER.createSimpleFuelBlock("grimwood_slab", () -> new LogSlabBlock(STRIPPED_GRIMWOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> GRIMWOOD_STAIRS = HELPER.createSimpleFuelBlock("grimwood_stairs", () -> new LogStairBlock(STRIPPED_GRIMWOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> GRIMWOOD_WALL = HELPER.createSimpleFuelBlock("grimwood_wall", () -> new LogWallBlock(STRIPPED_GRIMWOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ATMOSPHERIC);
	public static final RegistryObject<Block> GRIMWOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("grimwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_GRIMWOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ATMOSPHERIC, Mods.QUARK);
	
	// Autumnity
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_maple_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.AUTUMNITY);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_maple_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.AUTUMNITY);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_maple_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.AUTUMNITY);
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_maple_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.AUTUMNITY, Mods.QUARK);
	
	public static final RegistryObject<Block> MAPLE_WOOD_SLAB = HELPER.createSimpleFuelBlock("maple_wood_slab", () -> new LogSlabBlock(STRIPPED_MAPLE_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.AUTUMNITY);
	public static final RegistryObject<Block> MAPLE_WOOD_STAIRS = HELPER.createSimpleFuelBlock("maple_wood_stairs", () -> new LogStairBlock(STRIPPED_MAPLE_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.AUTUMNITY);
	public static final RegistryObject<Block> MAPLE_WOOD_WALL = HELPER.createSimpleFuelBlock("maple_wood_wall", () -> new LogWallBlock(STRIPPED_MAPLE_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.AUTUMNITY);
	public static final RegistryObject<Block> MAPLE_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("maple_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_MAPLE_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.AUTUMNITY, Mods.QUARK);
	
	// Endergetic Expansion
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_poise_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENDERGETIC_EXPANSION);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_poise_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENDERGETIC_EXPANSION);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_poise_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENDERGETIC_EXPANSION);
	public static final RegistryObject<Block> STRIPPED_POISE_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_poise_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENDERGETIC_EXPANSION, Mods.QUARK);
	
	public static final RegistryObject<Block> POISE_WOOD_SLAB = HELPER.createSimpleFuelBlock("poise_wood_slab", () -> new LogSlabBlock(STRIPPED_POISE_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENDERGETIC_EXPANSION);
	public static final RegistryObject<Block> POISE_WOOD_STAIRS = HELPER.createSimpleFuelBlock("poise_wood_stairs", () -> new LogStairBlock(STRIPPED_POISE_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENDERGETIC_EXPANSION);
	public static final RegistryObject<Block> POISE_WOOD_WALL = HELPER.createSimpleFuelBlock("poise_wood_wall", () -> new LogWallBlock(STRIPPED_POISE_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENDERGETIC_EXPANSION);
	public static final RegistryObject<Block> POISE_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("poise_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_POISE_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENDERGETIC_EXPANSION, Mods.QUARK);
	
	// Upgrade Aquatic
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_driftwood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_driftwood_stairs", () -> new LogStairBlock(Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_WALL = HELPER.createSimpleFuelBlock("stripped_driftwood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> STRIPPED_DRIFTWOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_driftwood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC, Mods.QUARK);
	
	public static final RegistryObject<Block> DRIFTWOOD_SLAB = HELPER.createSimpleFuelBlock("driftwood_slab", () -> new LogSlabBlock(STRIPPED_DRIFTWOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> DRIFTWOOD_STAIRS = HELPER.createSimpleFuelBlock("driftwood_stairs", () -> new LogStairBlock(STRIPPED_DRIFTWOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> DRIFTWOOD_WALL = HELPER.createSimpleFuelBlock("driftwood_wall", () -> new LogWallBlock(STRIPPED_DRIFTWOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> DRIFTWOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("driftwood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_DRIFTWOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_river_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_river_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_river_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> STRIPPED_RIVER_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_river_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC, Mods.QUARK);
	
	public static final RegistryObject<Block> RIVER_WOOD_SLAB = HELPER.createSimpleFuelBlock("river_wood_slab", () -> new LogSlabBlock(STRIPPED_RIVER_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> RIVER_WOOD_STAIRS = HELPER.createSimpleFuelBlock("river_wood_stairs", () -> new LogStairBlock(STRIPPED_RIVER_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> RIVER_WOOD_WALL = HELPER.createSimpleFuelBlock("river_wood_wall", () -> new LogWallBlock(STRIPPED_RIVER_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.UPGRADE_AQUATIC);
	public static final RegistryObject<Block> RIVER_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("river_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RIVER_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.UPGRADE_AQUATIC, Mods.QUARK);
	
	// Environmental
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_wisteria_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_wisteria_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_wisteria_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_WISTERIA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_wisteria_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL, Mods.QUARK);

	public static final RegistryObject<Block> WISTERIA_WOOD_SLAB = HELPER.createSimpleFuelBlock("wisteria_wood_slab", () -> new LogSlabBlock(STRIPPED_WISTERIA_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> WISTERIA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("wisteria_wood_stairs", () -> new LogStairBlock(STRIPPED_WISTERIA_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> WISTERIA_WOOD_WALL = HELPER.createSimpleFuelBlock("wisteria_wood_wall", () -> new LogWallBlock(STRIPPED_WISTERIA_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> WISTERIA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("wisteria_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WISTERIA_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL, Mods.QUARK);

	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_cherry_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_cherry_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_cherry_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_CHERRY_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_cherry_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL, Mods.QUARK);

	public static final RegistryObject<Block> CHERRY_WOOD_SLAB = HELPER.createSimpleFuelBlock("cherry_wood_slab", () -> new LogSlabBlock(STRIPPED_CHERRY_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> CHERRY_WOOD_STAIRS = HELPER.createSimpleFuelBlock("cherry_wood_stairs", () -> new LogStairBlock(STRIPPED_CHERRY_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> CHERRY_WOOD_WALL = HELPER.createSimpleFuelBlock("cherry_wood_wall", () -> new LogWallBlock(STRIPPED_CHERRY_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> CHERRY_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("cherry_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_CHERRY_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL, Mods.QUARK);

	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_willow_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_willow_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_willow_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_willow_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL, Mods.QUARK);

	public static final RegistryObject<Block> WILLOW_WOOD_SLAB = HELPER.createSimpleFuelBlock("willow_wood_slab", () -> new LogSlabBlock(STRIPPED_WILLOW_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> WILLOW_WOOD_STAIRS = HELPER.createSimpleFuelBlock("willow_wood_stairs", () -> new LogStairBlock(STRIPPED_WILLOW_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> WILLOW_WOOD_WALL = HELPER.createSimpleFuelBlock("willow_wood_wall", () -> new LogWallBlock(STRIPPED_WILLOW_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENVIRONMENTAL);
	public static final RegistryObject<Block> WILLOW_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("willow_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_WILLOW_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENVIRONMENTAL, Mods.QUARK);

	// Enhanced Mushrooms
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_SLAB = HELPER.createSimpleFuelBlock("stripped_red_mushroom_hyphae_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createSimpleFuelBlock("stripped_red_mushroom_hyphae_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_WALL = HELPER.createSimpleFuelBlock("stripped_red_mushroom_hyphae_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_red_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_SLAB = HELPER.createSimpleFuelBlock("red_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_SLAB, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_STAIRS = HELPER.createSimpleFuelBlock("red_mushroom_hyphae_stairs", () -> new LogStairBlock(STRIPPED_RED_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_WALL = HELPER.createSimpleFuelBlock("red_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_RED_MUSHROOM_HYPHAE_WALL, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> RED_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("red_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_RED_MUSHROOM_HYPHAE_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createSimpleFuelBlock("stripped_brown_mushroom_hyphae_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createSimpleFuelBlock("stripped_brown_mushroom_hyphae_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createSimpleFuelBlock("stripped_brown_mushroom_hyphae_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_brown_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_SLAB = HELPER.createSimpleFuelBlock("brown_mushroom_hyphae_slab", () -> new LogSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_SLAB, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_STAIRS = HELPER.createSimpleFuelBlock("brown_mushroom_hyphae_stairs", () -> new LogStairBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_WALL = HELPER.createSimpleFuelBlock("brown_mushroom_hyphae_wall", () -> new LogWallBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_WALL, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENHANCED_MUSHROOMS);
	public static final RegistryObject<Block> BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("brown_mushroom_hyphae_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_BROWN_MUSHROOM_HYPHAE_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_SLAB = HELPER.createSimpleFuelBlock("stripped_glowshroom_hyphae_slab", () -> new AlphaLogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_STAIRS = HELPER.createSimpleFuelBlock("stripped_glowshroom_hyphae_stairs", () -> new AlphaLogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_WALL = HELPER.createSimpleFuelBlock("stripped_glowshroom_hyphae_wall", () -> new AlphaLogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	public static final RegistryObject<Block> STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_glowshroom_hyphae_vertical_slab", () -> new AlphaLogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_SLAB = HELPER.createSimpleFuelBlock("glowshroom_hyphae_slab", () -> new AlphaLogSlabBlock(STRIPPED_GLOWSHROOM_HYPHAE_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_STAIRS = HELPER.createSimpleFuelBlock("glowshroom_hyphae_stairs", () -> new AlphaLogStairBlock(STRIPPED_GLOWSHROOM_HYPHAE_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_WALL = HELPER.createSimpleFuelBlock("glowshroom_hyphae_wall", () -> new AlphaLogWallBlock(STRIPPED_GLOWSHROOM_HYPHAE_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);
	public static final RegistryObject<Block> GLOWSHROOM_HYPHAE_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("glowshroom_hyphae_vertical_slab", () -> new AlphaLogVerticalSlabBlock(STRIPPED_GLOWSHROOM_HYPHAE_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion().lightLevel(value -> 14)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ENHANCED_MUSHROOMS, Mods.QUARK);

	// Abundance
	public static final RegistryObject<Block> STRIPPED_JACARANDA_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_jacaranda_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE);
	public static final RegistryObject<Block> STRIPPED_JACARANDA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_jacaranda_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> STRIPPED_JACARANDA_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_jacaranda_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> STRIPPED_JACARANDA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_jacaranda_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE, Mods.QUARK);

	public static final RegistryObject<Block> JACARANDA_WOOD_SLAB = HELPER.createSimpleFuelBlock("jacaranda_wood_slab", () -> new LogSlabBlock(STRIPPED_JACARANDA_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE);
	public static final RegistryObject<Block> JACARANDA_WOOD_STAIRS = HELPER.createSimpleFuelBlock("jacaranda_wood_stairs", () -> new LogStairBlock(STRIPPED_JACARANDA_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> JACARANDA_WOOD_WALL = HELPER.createSimpleFuelBlock("jacaranda_wood_wall", () -> new LogWallBlock(STRIPPED_JACARANDA_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> JACARANDA_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("jacaranda_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_JACARANDA_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE, Mods.QUARK);
		
	public static final RegistryObject<Block> STRIPPED_REDBUD_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_redbud_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE);
	public static final RegistryObject<Block> STRIPPED_REDBUD_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_redbud_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> STRIPPED_REDBUD_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_redbud_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> STRIPPED_REDBUD_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_redbud_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE, Mods.QUARK);

	public static final RegistryObject<Block> REDBUD_WOOD_SLAB = HELPER.createSimpleFuelBlock("redbud_wood_slab", () -> new LogSlabBlock(STRIPPED_REDBUD_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE);
	public static final RegistryObject<Block> REDBUD_WOOD_STAIRS = HELPER.createSimpleFuelBlock("redbud_wood_stairs", () -> new LogStairBlock(STRIPPED_REDBUD_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> REDBUD_WOOD_WALL = HELPER.createSimpleFuelBlock("redbud_wood_wall", () -> new LogWallBlock(STRIPPED_REDBUD_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.ABUNDANCE);
	public static final RegistryObject<Block> REDBUD_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("redbud_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_REDBUD_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.ABUNDANCE, Mods.QUARK);
		
	// Bayou Blues
	public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD_SLAB = HELPER.createSimpleFuelBlock("stripped_cypress_wood_slab", () -> new LogSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.BAYOU_BLUES);
	public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD_STAIRS = HELPER.createSimpleFuelBlock("stripped_cypress_wood_stairs", () -> new LogStairBlock(Blocks.STRIPPED_OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.BAYOU_BLUES);
	public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD_WALL = HELPER.createSimpleFuelBlock("stripped_cypress_wood_wall", () -> new LogWallBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.BAYOU_BLUES);
	public static final RegistryObject<Block> STRIPPED_CYPRESS_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("stripped_cypress_wood_vertical_slab", () -> new LogVerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.BAYOU_BLUES, Mods.QUARK);

	public static final RegistryObject<Block> CYPRESS_WOOD_SLAB = HELPER.createSimpleFuelBlock("cypress_wood_slab", () -> new LogSlabBlock(STRIPPED_CYPRESS_WOOD_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.BAYOU_BLUES);
	public static final RegistryObject<Block> CYPRESS_WOOD_STAIRS = HELPER.createSimpleFuelBlock("cypress_wood_stairs", () -> new LogStairBlock(STRIPPED_CYPRESS_WOOD_STAIRS, Blocks.OAK_WOOD::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, Mods.BAYOU_BLUES);
	public static final RegistryObject<Block> CYPRESS_WOOD_WALL = HELPER.createSimpleFuelBlock("cypress_wood_wall", () -> new LogWallBlock(STRIPPED_CYPRESS_WOOD_WALL, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_DECORATIONS, 300, Mods.BAYOU_BLUES);
	public static final RegistryObject<Block> CYPRESS_WOOD_VERTICAL_SLAB = HELPER.createSimpleFuelBlock("cypress_wood_vertical_slab", () -> new LogVerticalSlabBlock(STRIPPED_CYPRESS_WOOD_VERTICAL_SLAB, BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, Mods.BAYOU_BLUES, Mods.QUARK);
		
	// Infernal Expansion
	public static final RegistryObject<Block> CRACKED_GLOWDUST_SANDSTONE = HELPER.createSimpleBlock("cracked_glowdust_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_BUILDING_BLOCKS, "infernalexp");
	public static final RegistryObject<Block> CRACKED_GLOWDUST_SANDSTONE_SLAB = HELPER.createSimpleBlock("cracked_glowdust_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_BUILDING_BLOCKS, "infernalexp");
	public static final RegistryObject<Block> CRACKED_GLOWDUST_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cracked_glowdust_sandstone_stairs", () -> new StairBlock(Blocks.SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_BUILDING_BLOCKS, "infernalexp");
	public static final RegistryObject<Block> CRACKED_GLOWDUST_SANDSTONE_WALL = HELPER.createSimpleBlock("cracked_glowdust_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_DECORATIONS, "infernalexp");
	public static final RegistryObject<Block> CRACKED_GLOWDUST_SANDSTONE_VERTICAL_SLAB = HELPER.createSimpleBlock("cracked_glowdust_sandstone_vertical_slab", () -> new VerticalSlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_BUILDING_BLOCKS, "infernalexp", Mods.QUARK);
	
	public static final RegistryObject<Block> CUT_GLOWDUST_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cut_glowdust_sandstone_stairs", () -> new StairBlock(Blocks.SANDSTONE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_BUILDING_BLOCKS, "infernalexp");
	public static final RegistryObject<Block> CUT_GLOWDUST_SANDSTONE_WALL = HELPER.createSimpleBlock("cut_glowdust_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_DECORATIONS, "infernalexp");
	public static final RegistryObject<Block> SMOOTH_GLOWDUST_SANDSTONE_WALL = HELPER.createSimpleBlock("smooth_glowdust_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel(value -> 8)), CreativeModeTab.TAB_DECORATIONS, "infernalexp");
	
	// Outer End
	public static final RegistryObject<Block> HIMMEL_WALL = HELPER.createSimpleBlock("himmel_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK)), CreativeModeTab.TAB_DECORATIONS, "outer_end");
	
	public static class Properties {

		public static final BlockBehaviour.Properties BUTTON = BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F);

		public static final BlockBehaviour.Properties ANDESITE_PRESSURE_PLATE = pressurePlate(MaterialColor.STONE);
		public static final BlockBehaviour.Properties DIORITE_PRESSURE_PLATE = pressurePlate(MaterialColor.QUARTZ);
		public static final BlockBehaviour.Properties GRANITE_PRESSURE_PLATE = pressurePlate(MaterialColor.DIRT);
		public static final BlockBehaviour.Properties LIMESTONE_PRESSURE_PLATE = pressurePlate(MaterialColor.STONE);
		public static final BlockBehaviour.Properties JASPER_PRESSURE_PLATE = pressurePlate(MaterialColor.TERRACOTTA_RED);
		public static final BlockBehaviour.Properties SLATE_PRESSURE_PLATE = pressurePlate(MaterialColor.ICE);
		public static final BlockBehaviour.Properties MYALITE_PRESSURE_PLATE = pressurePlate(MaterialColor.COLOR_PURPLE);

		private static BlockBehaviour.Properties pressurePlate(MaterialColor materialColor) {
			return BlockBehaviour.Properties.of(Material.STONE, materialColor).requiresCorrectToolForDrops().noCollission().strength(0.5F);
		}
	}
	
}
