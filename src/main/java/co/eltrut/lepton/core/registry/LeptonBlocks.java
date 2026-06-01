package co.eltrut.lepton.core.registry;

import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.common.repo.WoodVariantRepo;
import co.eltrut.differentiate.core.event.LoadEvent;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.differentiate.core.util.CompatUtil;
import co.eltrut.lepton.common.blocks.WeatheringCopperWallBlock;
import co.eltrut.lepton.core.Lepton;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
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

import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

@EventBusSubscriber(modid = Lepton.MOD_ID)
public class LeptonBlocks {
	@SubscribeEvent
	public static void load(LoadEvent event) {}

	public static final BlockHelper HELPER = Lepton.REGISTRATOR.getHelper(Registries.BLOCK);

	// Vanilla
	public static final WoodVariantRepo ACACIA = HELPER.createWoodVariants(Blocks.ACACIA_WOOD, Blocks.STRIPPED_ACACIA_WOOD, "acacia");
	public static final WoodVariantRepo BIRCH = HELPER.createWoodVariants(Blocks.BIRCH_WOOD, Blocks.STRIPPED_BIRCH_WOOD, "birch");
	public static final WoodVariantRepo CHERRY = HELPER.createWoodVariants(Blocks.CHERRY_WOOD, Blocks.STRIPPED_CHERRY_WOOD, "cherry");
	public static final WoodVariantRepo DARK_OAK = HELPER.createWoodVariants(Blocks.DARK_OAK_WOOD, Blocks.STRIPPED_DARK_OAK_WOOD, "dark_oak");
	public static final WoodVariantRepo JUNGLE = HELPER.createWoodVariants(Blocks.JUNGLE_WOOD, Blocks.STRIPPED_JUNGLE_WOOD, "jungle");
	public static final WoodVariantRepo MANGROVE = HELPER.createWoodVariants("minecraft", "mangrove_wood", BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_WOOD), BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_WOOD));
	public static final WoodVariantRepo OAK = HELPER.createWoodVariants(Blocks.OAK_WOOD, Blocks.STRIPPED_OAK_WOOD, "oak");
	public static final WoodVariantRepo SPRUCE = HELPER.createWoodVariants(Blocks.SPRUCE_WOOD, Blocks.STRIPPED_SPRUCE_WOOD, "spruce");
	public static final WoodVariantRepo CRIMSON = HELPER.createWoodVariants(Blocks.CRIMSON_HYPHAE, Blocks.STRIPPED_CRIMSON_HYPHAE, "crimson", true);
	public static final WoodVariantRepo WARPED = HELPER.createWoodVariants(Blocks.WARPED_HYPHAE, Blocks.STRIPPED_WARPED_HYPHAE, "warped", true);

	public static final VariantBlocksRepo QUARTZ_BRICK = HELPER.createBlockVariants(Blocks.QUARTZ_BRICKS, CreativeModeTabs.BUILDING_BLOCKS);

	public static final DeferredBlock<Block> SMOOTH_STONE_STAIRS = HELPER.createFollowBlock("smooth_stone_stairs", () -> new StairBlock(Blocks.SMOOTH_STONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_STONE);
	public static final DeferredBlock<Block> CUT_SANDSTONE_STAIRS = HELPER.createFollowBlock("cut_sandstone_stairs", () -> new StairBlock(Blocks.CUT_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_SANDSTONE);
	public static final DeferredBlock<Block> CUT_RED_SANDSTONE_STAIRS = HELPER.createFollowBlock("cut_red_sandstone_stairs", () -> new StairBlock(Blocks.CUT_RED_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_RED_SANDSTONE);

	public static final DeferredBlock<Block> PURPUR_WALL = HELPER.createFollowBlock("purpur_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PURPUR_BLOCK)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.PURPUR_SLAB);
	public static final DeferredBlock<Block> QUARTZ_WALL = HELPER.createFollowBlock("quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.QUARTZ_SLAB);
	public static final DeferredBlock<Block> SMOOTH_QUARTZ_WALL = HELPER.createFollowBlock("smooth_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_QUARTZ_SLAB);
	public static final DeferredBlock<Block> POLISHED_ANDESITE_WALL = HELPER.createFollowBlock("polished_andesite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_ANDESITE_SLAB);
	public static final DeferredBlock<Block> POLISHED_DIORITE_WALL = HELPER.createFollowBlock("polished_diorite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_DIORITE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_DIORITE_SLAB);
	public static final DeferredBlock<Block> POLISHED_GRANITE_WALL = HELPER.createFollowBlock("polished_granite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_GRANITE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_GRANITE_SLAB);
	public static final DeferredBlock<Block> STONE_WALL = HELPER.createFollowBlock("stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.STONE_SLAB);
	public static final DeferredBlock<Block> SMOOTH_STONE_WALL = HELPER.createFollowBlock("smooth_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_STONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_STONE_SLAB);
	public static final DeferredBlock<Block> PRISMARINE_BRICK_WALL = HELPER.createFollowBlock("prismarine_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.PRISMARINE_BRICK_SLAB);
	public static final DeferredBlock<Block> DARK_PRISMARINE_WALL = HELPER.createFollowBlock("dark_prismarine_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_PRISMARINE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.DARK_PRISMARINE_SLAB);
	public static final DeferredBlock<Block> CUT_SANDSTONE_WALL = HELPER.createFollowBlock("cut_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_SANDSTONE_SLAB);
	public static final DeferredBlock<Block> CUT_RED_SANDSTONE_WALL = HELPER.createFollowBlock("cut_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_RED_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_RED_SANDSTONE_SLAB);
	public static final DeferredBlock<Block> SMOOTH_SANDSTONE_WALL = HELPER.createFollowBlock("smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_SANDSTONE_SLAB);
	public static final DeferredBlock<Block> SMOOTH_RED_SANDSTONE_WALL = HELPER.createFollowBlock("smooth_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.SMOOTH_RED_SANDSTONE_SLAB);

	public static final DeferredBlock<Block> POLISHED_ANDESITE_PRESSURE_PLATE = HELPER.createFollowBlock("polished_andesite_pressure_plate", () -> stonePressurePlateBlock(MapColor.STONE), CreativeModeTabs.BUILDING_BLOCKS, POLISHED_ANDESITE_WALL);
	public static final DeferredBlock<Block> POLISHED_DIORITE_PRESSURE_PLATE = HELPER.createFollowBlock("polished_diorite_pressure_plate", () -> stonePressurePlateBlock(MapColor.QUARTZ), CreativeModeTabs.BUILDING_BLOCKS, POLISHED_DIORITE_WALL);
	public static final DeferredBlock<Block> POLISHED_GRANITE_PRESSURE_PLATE = HELPER.createFollowBlock("polished_granite_pressure_plate", () -> stonePressurePlateBlock(MapColor.DIRT), CreativeModeTabs.BUILDING_BLOCKS, POLISHED_GRANITE_WALL);
	public static final DeferredBlock<Block> POLISHED_DEEPSLATE_PRESSURE_PLATE = HELPER.createFollowBlock("polished_deepslate_pressure_plate", () -> stonePressurePlateBlock(MapColor.DEEPSLATE), CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_DEEPSLATE_WALL);
	public static final DeferredBlock<Block> POLISHED_TUFF_PRESSURE_PLATE = HELPER.createFollowBlock("polished_tuff_pressure_plate", () -> stonePressurePlateBlock(MapColor.TERRACOTTA_GRAY, BlockSetTypes.POLISHED_TUFF), CreativeModeTabs.BUILDING_BLOCKS, Blocks.POLISHED_TUFF_WALL);

	public static final DeferredBlock<Block> POLISHED_ANDESITE_BUTTON = HELPER.createFollowBlock("polished_andesite_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, POLISHED_ANDESITE_PRESSURE_PLATE);
	public static final DeferredBlock<Block> POLISHED_DIORITE_BUTTON = HELPER.createFollowBlock("polished_diorite_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, POLISHED_DIORITE_PRESSURE_PLATE);
	public static final DeferredBlock<Block> POLISHED_GRANITE_BUTTON = HELPER.createFollowBlock("polished_granite_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, POLISHED_GRANITE_PRESSURE_PLATE);
	public static final DeferredBlock<Block> POLISHED_DEEPSLATE_BUTTON = HELPER.createFollowBlock("polished_deepslate_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, POLISHED_DEEPSLATE_PRESSURE_PLATE);
	public static final DeferredBlock<Block> POLISHED_TUFF_BUTTON = HELPER.createFollowBlock("polished_tuff_button", () -> stoneButton(BlockSetTypes.POLISHED_TUFF), CreativeModeTabs.BUILDING_BLOCKS, POLISHED_TUFF_PRESSURE_PLATE);

	public static final DeferredBlock<Block> CUT_COPPER_WALL = HELPER.createFollowBlock("cut_copper_wall", () -> new WeatheringCopperWallBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.CUT_COPPER_SLAB);
	public static final DeferredBlock<Block> EXPOSED_CUT_COPPER_WALL = HELPER.createFollowBlock("exposed_cut_copper_wall", () -> new WeatheringCopperWallBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.EXPOSED_CUT_COPPER_SLAB);
	public static final DeferredBlock<Block> OXIDIZED_CUT_COPPER_WALL = HELPER.createFollowBlock("oxidized_cut_copper_wall", () -> new WeatheringCopperWallBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.OXIDIZED_CUT_COPPER_SLAB);
	public static final DeferredBlock<Block> WEATHERED_CUT_COPPER_WALL = HELPER.createFollowBlock("weathered_cut_copper_wall", () -> new WeatheringCopperWallBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.WEATHERED_CUT_COPPER_SLAB);

	public static final DeferredBlock<Block> WAXED_CUT_COPPER_WALL = HELPER.createFollowBlock("waxed_cut_copper_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_CUT_COPPER_SLAB);
	public static final DeferredBlock<Block> WAXED_EXPOSED_CUT_COPPER_WALL = HELPER.createFollowBlock("waxed_exposed_cut_copper_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.EXPOSED_CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB);
	public static final DeferredBlock<Block> WAXED_OXIDIZED_CUT_COPPER_WALL = HELPER.createFollowBlock("waxed_oxidized_cut_copper_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OXIDIZED_CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
	public static final DeferredBlock<Block> WAXED_WEATHERED_CUT_COPPER_WALL = HELPER.createFollowBlock("waxed_weathered_cut_copper_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WEATHERED_CUT_COPPER)), CreativeModeTabs.BUILDING_BLOCKS, Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB);

	// Quark
	public static final WoodVariantRepo AZALEA = HELPER.createWoodVariants(CompatUtil.Mods.QUARK, "azalea_wood", BlockUtil.QuarkProperties.AZALEA, BlockUtil.QuarkProperties.STRIPPED_AZALEA);
	public static final WoodVariantRepo ANCIENT = HELPER.createWoodVariants(CompatUtil.Mods.QUARK, "ancient_wood", BlockUtil.QuarkProperties.ANCIENT, BlockUtil.QuarkProperties.ANCIENT);
	public static final WoodVariantRepo BLOSSOM = HELPER.createWoodVariants(CompatUtil.Mods.QUARK, "blossom_wood", BlockUtil.QuarkProperties.BLOSSOM, BlockUtil.QuarkProperties.BLOSSOM);

	public static final DeferredBlock<Block> CUT_SOUL_SANDSTONE_STAIRS = HELPER.createBlock("cut_soul_sandstone_stairs", () -> new StairBlock(Blocks.BROWN_CONCRETE_POWDER.defaultBlockState(), BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);

	public static final DeferredBlock<Block> MIDORI_WALL = HELPER.createBlock("midori_wall", () -> new WallBlock(BlockUtil.QuarkProperties.MIDORI), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_LIMESTONE_WALL = HELPER.createBlock("polished_limestone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.LIMESTONE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_JASPER_WALL = HELPER.createBlock("polished_jasper_wall", () -> new WallBlock(BlockUtil.QuarkProperties.JASPER), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_SHALE_WALL = HELPER.createBlock("polished_shale_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SHALE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_MYALITE_WALL = HELPER.createBlock("polished_myalite_wall", () -> new WallBlock(BlockUtil.QuarkProperties.MYALITE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_CALCITE_WALL = HELPER.createBlock("polished_calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_DRIPSTONE_WALL = HELPER.createBlock("polished_dripstone_wall", () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> CUT_SOUL_SANDSTONE_WALL = HELPER.createBlock("cut_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> SMOOTH_SOUL_SANDSTONE_WALL = HELPER.createBlock("smooth_soul_sandstone_wall", () -> new WallBlock(BlockUtil.QuarkProperties.SOUL_SANDSTONE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);

	public static final DeferredBlock<Block> POLISHED_LIMESTONE_BUTTON = HELPER.createBlock("polished_limestone_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_JASPER_BUTTON = HELPER.createBlock("polished_jasper_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_SHALE_BUTTON = HELPER.createBlock("polished_shale_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_MYALITE_BUTTON = HELPER.createBlock("polished_myalite_button", LeptonBlocks::stoneButton, CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_CALCITE_BUTTON = HELPER.createBlock("polished_calcite_button", () -> stoneButton(BlockSetTypes.POLISHED_CALCITE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_DRIPSTONE_BUTTON = HELPER.createBlock("polished_dripstone_button", () -> stoneButton(BlockSetTypes.POLISHED_DRIPSTONE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);

	public static final DeferredBlock<Block> POLISHED_LIMESTONE_PRESSURE_PLATE = HELPER.createBlock("polished_limestone_pressure_plate", () -> stonePressurePlateBlock(MapColor.STONE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_JASPER_PRESSURE_PLATE = HELPER.createBlock("polished_jasper_pressure_plate", () -> stonePressurePlateBlock(MapColor.TERRACOTTA_RED), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_SHALE_PRESSURE_PLATE = HELPER.createBlock("polished_shale_pressure_plate", () -> stonePressurePlateBlock(MapColor.ICE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_MYALITE_PRESSURE_PLATE = HELPER.createBlock("polished_myalite_pressure_plate", () -> stonePressurePlateBlock(MapColor.COLOR_PURPLE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_CALCITE_PRESSURE_PLATE = HELPER.createBlock("polished_calcite_pressure_plate", () -> stonePressurePlateBlock(MapColor.TERRACOTTA_WHITE, BlockSetTypes.POLISHED_CALCITE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);
	public static final DeferredBlock<Block> POLISHED_DRIPSTONE_PRESSURE_PLATE = HELPER.createBlock("polished_dripstone_pressure_plate", () -> stonePressurePlateBlock(MapColor.TERRACOTTA_BROWN, BlockSetTypes.POLISHED_DRIPSTONE), CreativeModeTabs.BUILDING_BLOCKS, CompatUtil.Mods.QUARK);

	public static class Collections {

		public static final List<WoodVariantRepo> WOODS = List.of(ACACIA, BIRCH, CHERRY, DARK_OAK, JUNGLE, MANGROVE, OAK, SPRUCE, CRIMSON, WARPED, AZALEA, ANCIENT, BLOSSOM);

		public static final Map<List<Block>, DeferredBlock<Block>> STONE_WALLS = Map.ofEntries(
				entry(List.of(Blocks.ANDESITE, Blocks.POLISHED_ANDESITE), POLISHED_ANDESITE_WALL),
				entry(List.of(Blocks.DIORITE, Blocks.POLISHED_DIORITE), POLISHED_DIORITE_WALL),
				entry(List.of(Blocks.GRANITE, Blocks.POLISHED_GRANITE), POLISHED_GRANITE_WALL),
				entry(List.of(Blocks.PURPUR_BLOCK), PURPUR_WALL),
				entry(List.of(Blocks.STONE), STONE_WALL),
				entry(List.of(Blocks.SMOOTH_STONE), SMOOTH_STONE_WALL),
				entry(List.of(Blocks.QUARTZ_BLOCK), QUARTZ_WALL),
				entry(List.of(Blocks.SMOOTH_QUARTZ), SMOOTH_QUARTZ_WALL),
				entry(List.of(Blocks.PRISMARINE_BRICKS), PRISMARINE_BRICK_WALL),
				entry(List.of(Blocks.DARK_PRISMARINE), DARK_PRISMARINE_WALL),
				entry(List.of(Blocks.SANDSTONE, Blocks.CUT_SANDSTONE), CUT_SANDSTONE_WALL),
				entry(List.of(Blocks.RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE), CUT_RED_SANDSTONE_WALL),
				entry(List.of(Blocks.SMOOTH_SANDSTONE), SMOOTH_SANDSTONE_WALL),
				entry(List.of(Blocks.SMOOTH_RED_SANDSTONE), SMOOTH_RED_SANDSTONE_WALL),
				entry(List.of(Blocks.COPPER_BLOCK, Blocks.CUT_COPPER), CUT_COPPER_WALL),
				entry(List.of(Blocks.EXPOSED_COPPER, Blocks.EXPOSED_CUT_COPPER), EXPOSED_CUT_COPPER_WALL),
				entry(List.of(Blocks.OXIDIZED_COPPER, Blocks.OXIDIZED_CUT_COPPER), OXIDIZED_CUT_COPPER_WALL),
				entry(List.of(Blocks.WEATHERED_COPPER, Blocks.WEATHERED_CUT_COPPER), WEATHERED_CUT_COPPER_WALL),
				entry(List.of(Blocks.WAXED_COPPER_BLOCK, Blocks.WAXED_CUT_COPPER), WAXED_CUT_COPPER_WALL),
				entry(List.of(Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_EXPOSED_CUT_COPPER), WAXED_EXPOSED_CUT_COPPER_WALL),
				entry(List.of(Blocks.WAXED_OXIDIZED_COPPER, Blocks.WAXED_OXIDIZED_CUT_COPPER), WAXED_OXIDIZED_CUT_COPPER_WALL),
				entry(List.of(Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_WEATHERED_CUT_COPPER), WAXED_WEATHERED_CUT_COPPER_WALL)
		);

		public static final Map<List<Block>, DeferredBlock<Block>> STONE_STAIRS = Map.ofEntries(
				entry(List.of(Blocks.SMOOTH_STONE), SMOOTH_STONE_STAIRS),
				entry(List.of(Blocks.SANDSTONE, Blocks.CUT_SANDSTONE), CUT_SANDSTONE_STAIRS),
				entry(List.of(Blocks.RED_SANDSTONE, Blocks.CUT_RED_SANDSTONE), CUT_RED_SANDSTONE_STAIRS)
		);

		public static final Map<List<String>, DeferredBlock<Block>> QUARK_STONE_WALLS = Map.ofEntries(
				entry(List.of("midori_block"), MIDORI_WALL),
				entry(List.of("limestone", "polished_limestone"), POLISHED_LIMESTONE_WALL),
				entry(List.of("jasper", "polished_jasper"), POLISHED_JASPER_WALL),
				entry(List.of("shale", "polished_shale"), POLISHED_SHALE_WALL),
				entry(List.of("myalite", "polished_myalite"), POLISHED_MYALITE_WALL),
				entry(List.of("polished_calcite"), POLISHED_CALCITE_WALL),
				entry(List.of("polished_dripstone"), POLISHED_DRIPSTONE_WALL),
				entry(List.of("soul_sandstone", "cut_soul_sandstone"), CUT_SOUL_SANDSTONE_WALL),
				entry(List.of("smooth_soul_sandstone"), SMOOTH_SOUL_SANDSTONE_WALL)
		);

	}

	public static class BlockSetTypes {

		private static final BlockSetType POLISHED_TUFF = BlockSetType.register(new BlockSetType("stone", true, true, false, BlockSetType.PressurePlateSensitivity.MOBS, SoundType.POLISHED_TUFF, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));
		private static final BlockSetType POLISHED_CALCITE = BlockSetType.register(new BlockSetType("stone", true, true, false, BlockSetType.PressurePlateSensitivity.MOBS, SoundType.CALCITE, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));
		private static final BlockSetType POLISHED_DRIPSTONE = BlockSetType.register(new BlockSetType("stone", true, true, false, BlockSetType.PressurePlateSensitivity.MOBS, SoundType.DRIPSTONE_BLOCK, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN, SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON));

	}

	private static Block stoneButton() {
		return new ButtonBlock(BlockSetType.STONE, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
	}

	private static Block stoneButton(BlockSetType type) {
		return new ButtonBlock(type, 20, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
	}

	private static Block stonePressurePlateBlock(MapColor color) {
		return new PressurePlateBlock(BlockSetType.STONE, BlockBehaviour.Properties.of().mapColor(color).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
	}

	private static Block stonePressurePlateBlock(MapColor color, BlockSetType type) {
		return new PressurePlateBlock(type, BlockBehaviour.Properties.of().mapColor(color).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY).sound(SoundType.TUFF));
	}
}
