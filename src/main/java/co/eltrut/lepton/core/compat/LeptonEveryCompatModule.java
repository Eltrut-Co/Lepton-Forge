package co.eltrut.lepton.core.compat;

import co.eltrut.differentiate.common.block.VerticalSlabBlock;
import co.eltrut.differentiate.core.registry.DifferentiateTags;
import co.eltrut.lepton.common.blocks.*;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.TabAddMode;
import net.mehvahdjukaar.every_compat.misc.CompatSpritesHelper;
import net.mehvahdjukaar.every_compat.modules.EveryCompatModule;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodChildKeys;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

public class LeptonEveryCompatModule extends EveryCompatModule {

    public final SimpleEntrySet<WoodType, Block> woodSlab;
    public final SimpleEntrySet<WoodType, Block> woodStairs;
    public final SimpleEntrySet<WoodType, Block> woodVerticalSlab;
    public final SimpleEntrySet<WoodType, Block> woodWall;

    public final SimpleEntrySet<WoodType, Block> strippedWoodSlab;
    public final SimpleEntrySet<WoodType, Block> strippedWoodStairs;
    public final SimpleEntrySet<WoodType, Block> strippedWoodVerticalSlab;
    public final SimpleEntrySet<WoodType, Block> strippedWoodWall;

    public static void registerEveryCompatModule() {
        // goofy ass abstraction
        EveryCompatAPI.registerModule(new LeptonEveryCompatModule());
    }

    public LeptonEveryCompatModule() {
        super(Lepton.MOD_ID, "lp");

        woodSlab = SimpleEntrySet.builder(WoodType.class, "wood_slab", LeptonBlocks.OAK.woods().getSlabBlock(),
                () -> VanillaWoodTypes.OAK, s -> new StrippableSlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_slabs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_slab"))
                .copyParentDrop()
                .build();
        this.addEntry(woodSlab);

        woodStairs = SimpleEntrySet.builder(WoodType.class, "wood_stairs", LeptonBlocks.OAK.woods().getStairsBlock(),
                () -> VanillaWoodTypes.OAK, s -> new StrippableStairBlock(VanillaWoodTypes.OAK.log.defaultBlockState(), Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_stairs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_stairs"))
                .copyParentDrop()
                .build();
        this.addEntry(woodStairs);

        woodVerticalSlab = SimpleEntrySet.builder(WoodType.class, "wood_vertical_slab", LeptonBlocks.OAK.woods().getVerticalSlabBlock(),
                () -> VanillaWoodTypes.OAK, s -> new StrippableVerticalSlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_vertical_slabs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_vertical_slab"))
                .copyParentDrop()
                .build();
        this.addEntry(woodVerticalSlab);

        woodWall = SimpleEntrySet.builder(WoodType.class, "wood_wall", LeptonBlocks.OAK.woods().getWallBlock(),
                () -> VanillaWoodTypes.OAK, s -> new StrippableWallBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_walls"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_wall"))
                .copyParentDrop()
                .build();
        this.addEntry(woodWall);

        strippedWoodSlab = SimpleEntrySet.builder(WoodType.class, "wood_slab", "stripped", LeptonBlocks.OAK.strippedWoods().getSlabBlock(),
                        () -> VanillaWoodTypes.OAK, s -> new SlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.STRIPPED_WOOD, VanillaWoodChildKeys.STRIPPED_LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/stripped_oak_log", VanillaWoodChildKeys.STRIPPED_LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/stripped_oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.STRIPPED_WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_slabs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_slab"))
                .copyParentDrop()
                .build();
        this.addEntry(strippedWoodSlab);

        strippedWoodStairs = SimpleEntrySet.builder(WoodType.class, "wood_stairs", "stripped", LeptonBlocks.OAK.strippedWoods().getStairsBlock(),
                        () -> VanillaWoodTypes.OAK, s -> new StairBlock(VanillaWoodTypes.OAK.log.defaultBlockState(), Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.STRIPPED_WOOD, VanillaWoodChildKeys.STRIPPED_LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/stripped_oak_log", VanillaWoodChildKeys.STRIPPED_LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/stripped_oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.STRIPPED_WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_stairs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_stairs"))
                .copyParentDrop()
                .build();
        this.addEntry(strippedWoodStairs);

        strippedWoodVerticalSlab = SimpleEntrySet.builder(WoodType.class, "wood_vertical_slab", "stripped", LeptonBlocks.OAK.strippedWoods().getVerticalSlabBlock(),
                        () -> VanillaWoodTypes.OAK, s -> new VerticalSlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.STRIPPED_WOOD, VanillaWoodChildKeys.STRIPPED_LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/stripped_oak_log", VanillaWoodChildKeys.STRIPPED_LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/stripped_oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.STRIPPED_WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_vertical_slabs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_vertical_slab"))
                .copyParentDrop()
                .build();
        this.addEntry(strippedWoodVerticalSlab);

        strippedWoodWall = SimpleEntrySet.builder(WoodType.class, "wood_wall", "stripped", LeptonBlocks.OAK.strippedWoods().getWallBlock(),
                        () -> VanillaWoodTypes.OAK, s -> new WallBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.STRIPPED_WOOD, VanillaWoodChildKeys.STRIPPED_LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/stripped_oak_log", VanillaWoodChildKeys.STRIPPED_LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/stripped_oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.STRIPPED_WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(modRes("wood_walls"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_wall"))
                .copyParentDrop()
                .build();
        this.addEntry(strippedWoodWall);
    }

    @Override
    public void onModSetup() {
        this.strip(woodSlab, strippedWoodSlab);
        this.strip(woodStairs, strippedWoodStairs);
        this.strip(woodWall, strippedWoodWall);
        this.strip(woodVerticalSlab, strippedWoodVerticalSlab);
    }

    private void strip(SimpleEntrySet<WoodType, Block> strippable, SimpleEntrySet<WoodType, Block> stripped) {
        strippable.blocks.forEach((w, wood) -> {
            Block strippedWood = stripped.blocks.get(w);
            if (strippedWood != null && wood instanceof IStrippable) {
                Lepton.LOGGER.info("Registering stripping of {} into {}", wood, strippedWood);
                ((IStrippable) wood).setStrippedBlock(strippedWood);
            } else {
                Lepton.LOGGER.info("Uh oh");
            }
        });
    }

}
