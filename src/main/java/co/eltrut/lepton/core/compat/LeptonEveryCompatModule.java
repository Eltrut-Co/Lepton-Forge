package co.eltrut.lepton.core.compat;

import co.eltrut.differentiate.common.block.VerticalSlabBlock;
import co.eltrut.differentiate.core.util.CompatUtil;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.every_compat.api.TabAddMode;
import net.mehvahdjukaar.every_compat.misc.CompatSpritesHelper;
import net.mehvahdjukaar.every_compat.modules.EveryCompatModule;
import net.mehvahdjukaar.moonlight.api.resources.pack.ResourceGenTask;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodChildKeys;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import java.util.function.Consumer;

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
                () -> VanillaWoodTypes.OAK, s -> new SlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_slabs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_slab"))
                .build();
        this.addEntry(woodSlab);

        woodStairs = SimpleEntrySet.builder(WoodType.class, "wood_stairs", LeptonBlocks.OAK.woods().getStairsBlock(),
                () -> VanillaWoodTypes.OAK, s -> new StairBlock(VanillaWoodTypes.OAK.log.defaultBlockState(), Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_stairs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_stairs"))
                .build();
        this.addEntry(woodStairs);

        woodVerticalSlab = SimpleEntrySet.builder(WoodType.class, "wood_vertical_slab", LeptonBlocks.OAK.woods().getVerticalSlabBlock(),
                () -> VanillaWoodTypes.OAK, s -> new VerticalSlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_vertical_slab"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_vertical_slab"))
                .build();
        this.addEntry(woodVerticalSlab);

        woodWall = SimpleEntrySet.builder(WoodType.class, "wood_wall", LeptonBlocks.OAK.woods().getWallBlock(),
                () -> VanillaWoodTypes.OAK, s -> new WallBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addModelTransform(m -> m
                        .replaceWithTextureFromChild("minecraft:block/oak_log", VanillaWoodChildKeys.LOG, CompatSpritesHelper.LOOKS_LIKE_SIDE_LOG_TEXTURE)
                        .addModifier((s, blockId, woodType) -> s.replace("minecraft:block/oak_wood", Utils.getID(woodType.getBlockOfThis(VanillaWoodChildKeys.WOOD)).withPrefix("block/").toString())))
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_wall"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/wood_slab/oak_wood_wall"))
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
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_slabs"), Registries.BLOCK, Registries.ITEM)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_slab"))
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
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_stairs"), Registries.BLOCK, Registries.ITEM)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_stairs"))
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
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_vertical_slab"), Registries.BLOCK, Registries.ITEM)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_vertical_slab"))
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
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_wall"), Registries.BLOCK, Registries.ITEM)
                .addRecipe(modRes("crafting/wood_slab/stripped_oak_wood_wall"))
                .build();
        this.addEntry(strippedWoodWall);
    }

    @Override
    public void onModSetup() {
        woodSlab.blocks.forEach((w, slab) -> {
            Block strippedSlab = strippedWoodSlab.blocks.get(w);
            if (strippedSlab != null) {
                Lepton.LOGGER.info("Registering stripping of {} into {}", slab, strippedSlab);
                // TODO: stripping
//                ECPlatStuff.registerStripping(slab, strippedSlab);
            }
        });
    }

    @Override
    public void addDynamicClientResources(Consumer<ResourceGenTask> executor) {
        super.addDynamicClientResources(executor);
    }

    @Override
    public void addDynamicServerResources(Consumer<ResourceGenTask> executor) {
        super.addDynamicServerResources(executor);
    }
}
