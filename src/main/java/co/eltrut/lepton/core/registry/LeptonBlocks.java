package co.eltrut.lepton.core.registry;

import co.eltrut.differentiate.common.block.DifferStoneButtonBlock;
import co.eltrut.differentiate.common.block.StonePressurePlateBlock;
import co.eltrut.differentiate.common.block.VerticalSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogStairBlock;
import co.eltrut.differentiate.common.block.wood.LogVerticalSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogWallBlock;
import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.common.repo.WoodVariantRepo;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import co.eltrut.lepton.common.blocks.*;
import co.eltrut.lepton.core.Lepton;
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
	
	public static final BlockHelper HELPER = Lepton.REGISTRATOR.getHelper(ForgeRegistries.BLOCKS);

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
	public static final RegistryObject<Block> POLISHED_DEEPSLATE_BUTTON = HELPER.createSimpleBlock("polished_deepslate_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE);

	public static final RegistryObject<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_andesite_pressure_plate", () -> new StonePressurePlateBlock(Properties.ANDESITE), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_diorite_pressure_plate", () -> new StonePressurePlateBlock(Properties.DIORITE), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_granite_pressure_plate", () -> new StonePressurePlateBlock(Properties.GRANITE), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_deepslate_pressure_plate", () -> new StonePressurePlateBlock(Properties.DEEPSLATE), CreativeModeTab.TAB_REDSTONE);

	// Quark
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_STAIRS = HELPER.createSimpleBlock("cut_soul_sandstone_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE_POWDER::defaultBlockState, BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.QUARK);

	public static final RegistryObject<Block> MIDORI_WALL = HELPER.createSimpleBlock("midori_wall", () -> new WallBlock(BlockUtil.QuarkProperties.MIDORI), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_LIMESTONE_WALL = HELPER.createSimpleBlock("polished_limestone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.LIMESTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_JASPER_WALL = HELPER.createSimpleBlock("polished_jasper_wall", () -> new WallBlock(BlockUtil.QuarkProperties.JASPER), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_SHALE_WALL = HELPER.createSimpleBlock("polished_shale_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SLATE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_MYALITE_WALL = HELPER.createSimpleBlock("polished_myalite_wall", () -> new PolishedMyaliteWallBlock(BlockUtil.QuarkProperties.MYALITE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_CALCITE_WALL = HELPER.createSimpleBlock("polished_calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE)), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_DRIPSTONE_WALL = HELPER.createSimpleBlock("polished_dripstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_TUFF_WALL = HELPER.createSimpleBlock("polished_tuff_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF)), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createSimpleBlock("cut_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
	public static final RegistryObject<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createSimpleBlock("smooth_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);

	public static final RegistryObject<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createSimpleBlock("polished_limestone_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_JASPER_BUTTON = HELPER.createSimpleBlock("polished_jasper_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_SHALE_BUTTON = HELPER.createSimpleBlock("polished_shale_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_MYALITE_BUTTON = HELPER.createSimpleBlock("polished_myalite_button", () -> new PolishedMyaliteButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_CALCITE_BUTTON = HELPER.createSimpleBlock("polished_calcite_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_DRIPSTONE_BUTTON = HELPER.createSimpleBlock("polished_dripstone_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_TUFF_BUTTON = HELPER.createSimpleBlock("polished_tuff_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	
	public static final RegistryObject<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_limestone_pressure_plate", () -> new StonePressurePlateBlock(Properties.LIMESTONE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_jasper_pressure_plate", () -> new StonePressurePlateBlock(Properties.JASPER), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_SHALE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_shale_pressure_plate", () -> new StonePressurePlateBlock(Properties.SHALE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_MYALITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_myalite_pressure_plate", () -> new PolishedMyalitePressurePlateBlock(Properties.MYALITE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_CALCITE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_calcite_pressure_plate", () -> new StonePressurePlateBlock(Properties.CALCITE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_DRIPSTONE_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_dripstone_pressure_plate", () -> new StonePressurePlateBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
	public static final RegistryObject<Block> POLISHED_TUFF_PRESSURE_PLATE = HELPER.createSimpleBlock("polished_tuff_pressure_plate", () -> new StonePressurePlateBlock(Properties.TUFF), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);

	public static class Properties {

		public static final BlockBehaviour.Properties BUTTON = BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F);

		public static final BlockBehaviour.Properties ANDESITE = pressurePlate(MaterialColor.STONE);
		public static final BlockBehaviour.Properties DIORITE = pressurePlate(MaterialColor.QUARTZ);
		public static final BlockBehaviour.Properties GRANITE = pressurePlate(MaterialColor.DIRT);
		public static final BlockBehaviour.Properties DEEPSLATE = pressurePlate(MaterialColor.DEEPSLATE);
		public static final BlockBehaviour.Properties LIMESTONE = pressurePlate(MaterialColor.STONE);
		public static final BlockBehaviour.Properties JASPER = pressurePlate(MaterialColor.TERRACOTTA_RED);
		public static final BlockBehaviour.Properties SHALE = pressurePlate(MaterialColor.ICE);
		public static final BlockBehaviour.Properties MYALITE = pressurePlate(MaterialColor.COLOR_PURPLE);
		public static final BlockBehaviour.Properties CALCITE = pressurePlate(MaterialColor.TERRACOTTA_WHITE);
		public static final BlockBehaviour.Properties DRIPSTONE = pressurePlate(MaterialColor.TERRACOTTA_BROWN);
		public static final BlockBehaviour.Properties TUFF = pressurePlate(MaterialColor.TERRACOTTA_GRAY);

		private static BlockBehaviour.Properties pressurePlate(MaterialColor materialColor) {
			return BlockBehaviour.Properties.of(Material.STONE, materialColor).requiresCorrectToolForDrops().noCollission().strength(0.5F);
		}

	}
	
}
