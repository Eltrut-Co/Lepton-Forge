package co.eltrut.lepton.core.registry;

import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.common.repo.WoodVariantRepo;
import co.eltrut.differentiate.core.event.LoadEvent;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.lepton.core.Lepton;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.DeferredBlock;

@EventBusSubscriber(modid = Lepton.MOD_ID)
public class LeptonBlocks {
	@SubscribeEvent
	public static void load(LoadEvent event) {}
	
	public static final BlockHelper HELPER = Lepton.REGISTRATOR.getHelper(Registries.BLOCK);

	// Vanilla
	public static final WoodVariantRepo ACACIA = HELPER.createWoodVariants(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD, "acacia");
	public static final WoodVariantRepo BIRCH = HELPER.createWoodVariants(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD, "birch");
	public static final WoodVariantRepo DARK_OAK = HELPER.createWoodVariants(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD, "dark_oak");
	public static final WoodVariantRepo JUNGLE = HELPER.createWoodVariants(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD, "jungle");
	public static final WoodVariantRepo OAK = HELPER.createWoodVariants(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD, "oak");
	public static final WoodVariantRepo SPRUCE = HELPER.createWoodVariants(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD, "spruce");
	public static final WoodVariantRepo CRIMSON = HELPER.createWoodVariants(Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE, "crimson", true);
	public static final WoodVariantRepo WARPED = HELPER.createWoodVariants(Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE, "warped", true);

	public static final VariantBlocksRepo QUARTZ_BRICK = HELPER.createBlockVariants(Blocks.QUARTZ_BRICKS, CreativeModeTabs.BUILDING_BLOCKS);

	public static final DeferredBlock<Block> SMOOTH_STONE_STAIRS = HELPER.createBlock("smooth_stone_stairs", () -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> CUT_SANDSTONE_STAIRS = HELPER.createBlock("cut_sandstone_stairs", () -> new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> CUT_RED_SANDSTONE_STAIRS = HELPER.createBlock("cut_red_sandstone_stairs", () -> new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS);

	public static final DeferredBlock<Block> PURPUR_WALL = HELPER.createBlock("purpur_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> QUARTZ_WALL = HELPER.createBlock("quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> SMOOTH_QUARTZ_WALL = HELPER.createBlock("smooth_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_ANDESITE_WALL = HELPER.createBlock("polished_andesite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_DIORITE_WALL = HELPER.createBlock("polished_diorite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_GRANITE_WALL = HELPER.createBlock("polished_granite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> STONE_WALL = HELPER.createBlock("stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> SMOOTH_STONE_WALL = HELPER.createBlock("smooth_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> PRISMARINE_BRICK_WALL = HELPER.createBlock("prismarine_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> DARK_PRISMARINE_WALL = HELPER.createBlock("dark_prismarine_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> CUT_SANDSTONE_WALL = HELPER.createBlock("cut_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> CUT_RED_SANDSTONE_WALL = HELPER.createBlock("cut_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> SMOOTH_SANDSTONE_WALL = HELPER.createBlock("smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS);
	public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE_WALL = HELPER.createBlock("smooth_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS);

	public static final DeferredBlock<Block> POLISHED_ANDESITE_BUTTON = HELPER.createBlock("polished_andesite_button", LeptonBlocks::stoneButton, CreativeModeTabs.REDSTONE_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_DIORITE_BUTTON = HELPER.createBlock("polished_diorite_button", LeptonBlocks::stoneButton, CreativeModeTabs.REDSTONE_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_GRANITE_BUTTON = HELPER.createBlock("polished_granite_button", LeptonBlocks::stoneButton, CreativeModeTabs.REDSTONE_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_DEEPSLATE_BUTTON = HELPER.createBlock("polished_deepslate_button", LeptonBlocks::stoneButton, CreativeModeTabs.REDSTONE_BLOCKS);

	public static final DeferredBlock<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createBlock("polished_andesite_pressure_plate", () -> stonePressureBlock(MapColor.STONE), CreativeModeTabs.REDSTONE_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createBlock("polished_diorite_pressure_plate", () -> stonePressureBlock(MapColor.QUARTZ), CreativeModeTabs.REDSTONE_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createBlock("polished_granite_pressure_plate", () -> stonePressureBlock(MapColor.DIRT), CreativeModeTabs.REDSTONE_BLOCKS);
	public static final DeferredBlock<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = HELPER.createBlock("polished_deepslate_pressure_plate", () -> stonePressureBlock(MapColor.DEEPSLATE), CreativeModeTabs.REDSTONE_BLOCKS);

	// Quark
//	public static final DeferredBlock<Block> CUT_SOUL_SANDSTONE_STAIRS = HELPER.createBlock("cut_soul_sandstone_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE_POWDER::defaultBlockState, BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS, Mods.QUARK);
//
//	public static final DeferredBlock<Block> MIDORI_WALL = HELPER.createBlock("midori_wall", () -> new WallBlock(BlockUtil.QuarkProperties.MIDORI), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_LIMESTONE_WALL = HELPER.createBlock("polished_limestone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.LIMESTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_JASPER_WALL = HELPER.createBlock("polished_jasper_wall", () -> new WallBlock(BlockUtil.QuarkProperties.JASPER), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_SHALE_WALL = HELPER.createBlock("polished_shale_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SLATE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_MYALITE_WALL = HELPER.createBlock("polished_myalite_wall", () -> new PolishedMyaliteWallBlock(BlockUtil.QuarkProperties.MYALITE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_CALCITE_WALL = HELPER.createBlock("polished_calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_DRIPSTONE_WALL = HELPER.createBlock("polished_dripstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_TUFF_WALL = HELPER.createBlock("polished_tuff_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.TUFF)), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createBlock("cut_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//	public static final DeferredBlock<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createBlock("smooth_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTab.TAB_DECORATIONS, Mods.QUARK);
//
//	public static final DeferredBlock<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createBlock("polished_limestone_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_JASPER_BUTTON = HELPER.createBlock("polished_jasper_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_SHALE_BUTTON = HELPER.createBlock("polished_shale_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_MYALITE_BUTTON = HELPER.createBlock("polished_myalite_button", () -> new PolishedMyaliteButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_CALCITE_BUTTON = HELPER.createBlock("polished_calcite_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_DRIPSTONE_BUTTON = HELPER.createBlock("polished_dripstone_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_TUFF_BUTTON = HELPER.createBlock("polished_tuff_button", () -> new DifferStoneButtonBlock(Properties.BUTTON), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//
//	public static final DeferredBlock<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createBlock("polished_limestone_pressure_plate", () -> new StonePressurePlateBlock(Properties.LIMESTONE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createBlock("polished_jasper_pressure_plate", () -> new StonePressurePlateBlock(Properties.JASPER), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_SHALE_PRESSURE_PLATE = HELPER.createBlock("polished_shale_pressure_plate", () -> new StonePressurePlateBlock(Properties.SHALE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_MYALITE_PRESSURE_PLATE = HELPER.createBlock("polished_myalite_pressure_plate", () -> new PolishedMyalitePressurePlateBlock(Properties.MYALITE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_CALCITE_PRESSURE_PLATE = HELPER.createBlock("polished_calcite_pressure_plate", () -> new StonePressurePlateBlock(Properties.CALCITE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_DRIPSTONE_PRESSURE_PLATE = HELPER.createBlock("polished_dripstone_pressure_plate", () -> new StonePressurePlateBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);
//	public static final DeferredBlock<Block> POLISHED_TUFF_PRESSURE_PLATE = HELPER.createBlock("polished_tuff_pressure_plate", () -> new StonePressurePlateBlock(Properties.TUFF), CreativeModeTab.TAB_REDSTONE, Mods.QUARK);

	private static Block stoneButton() {
		return new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
	}

	private static Block stonePressureBlock(MapColor color) {
		return new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().mapColor(color).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
	}

	public static class Properties {

//		public static final BlockBehaviour.Properties BUTTON = BlockBehaviour.Properties.of(Material.DECORATION).noCollission().strength(0.5F);
//
//		public static final BlockBehaviour.Properties ANDESITE = pressurePlate(MaterialColor.STONE);
//		public static final BlockBehaviour.Properties DIORITE = pressurePlate(MaterialColor.QUARTZ);
//		public static final BlockBehaviour.Properties GRANITE = pressurePlate(MaterialColor.DIRT);
//		public static final BlockBehaviour.Properties DEEPSLATE = pressurePlate(MaterialColor.DEEPSLATE);
//		public static final BlockBehaviour.Properties LIMESTONE = pressurePlate(MaterialColor.STONE);
//		public static final BlockBehaviour.Properties JASPER = pressurePlate(MaterialColor.TERRACOTTA_RED);
//		public static final BlockBehaviour.Properties SHALE = pressurePlate(MaterialColor.ICE);
//		public static final BlockBehaviour.Properties MYALITE = pressurePlate(MaterialColor.COLOR_PURPLE);
//		public static final BlockBehaviour.Properties CALCITE = pressurePlate(MaterialColor.TERRACOTTA_WHITE);
//		public static final BlockBehaviour.Properties DRIPSTONE = pressurePlate(MaterialColor.TERRACOTTA_BROWN);
//		public static final BlockBehaviour.Properties TUFF = pressurePlate(MaterialColor.TERRACOTTA_GRAY);
//
//		private static BlockBehaviour.Properties pressurePlate(MaterialColor materialColor) {
//			return BlockBehaviour.Properties.of(Material.STONE, materialColor).requiresCorrectToolForDrops().noCollission().strength(0.5F);
//		}

	}
	
}
