package co.eltrut.lepton.core.compat;

import co.eltrut.differentiate.common.block.VerticalSlabBlock;
import co.eltrut.differentiate.core.util.CompatUtil;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.mehvahdjukaar.every_compat.ECPlatStuff;
import net.mehvahdjukaar.every_compat.api.*;
import net.mehvahdjukaar.moonlight.api.resources.pack.ResourceGenTask;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodChildKeys;
import net.mehvahdjukaar.moonlight.api.set.wood.VanillaWoodTypes;
import net.mehvahdjukaar.moonlight.api.set.wood.WoodType;
import net.mehvahdjukaar.moonlight.api.util.Utils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;

import java.util.function.Consumer;

public class LeptonEveryCompatModule extends SimpleModule {

    public final SimpleEntrySet<WoodType, Block> woodSlab;
//    public final SimpleEntrySet<WoodType, Block> woodStairs;
//    public final SimpleEntrySet<WoodType, Block> woodVerticalSlab;
//    public final SimpleEntrySet<WoodType, Block> woodWall;

    public final SimpleEntrySet<WoodType, Block> strippedWoodSlab;
//    public final SimpleEntrySet<WoodType, Block> strippedWoodStairs;
//    public final SimpleEntrySet<WoodType, Block> strippedWoodVerticalSlab;
//    public final SimpleEntrySet<WoodType, Block> strippedWoodWall;

    public static void registerEveryCompatModule() {
        // goofy ass abstraction
        EveryCompatAPI.registerModule(new LeptonEveryCompatModule());
    }

    public LeptonEveryCompatModule() {
        super(Lepton.MOD_ID, "lp", "everycomp");

        woodSlab = SimpleEntrySet.builder(WoodType.class, "wood_slab", LeptonBlocks.OAK.woods().getSlabBlock(),
                () -> VanillaWoodTypes.OAK, s -> new SlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.WOOD, VanillaWoodChildKeys.LOG)
                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "oak_log"), PaletteStrategies.LOG_SIDE_STANDARD)
                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_slabs"), Registries.BLOCK, Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/oak_wood_slab"))
                .build();
        this.addEntry(woodSlab);

//        woodStairs = SimpleEntrySet.builder(WoodType.class, "wood_stairs", LeptonBlocks.OAK.woods().getStairsBlock(),
//                () -> VanillaWoodTypes.OAK, s -> new StairBlock(VanillaWoodTypes.OAK.log.defaultBlockState(), Utils.copyPropertySafe(s.log)))
//                .requiresChildren(VanillaWoodChildKeys.LOG)
//                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "oak_log"), PaletteStrategies.LOG_SIDE_STANDARD)
//                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
//                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
//                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_stairs"), Registries.BLOCK, Registries.ITEM)
//                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/oak_wood_stairs"))
//                .build();
//        this.addEntry(woodStairs);

//        woodVerticalSlab = SimpleEntrySet.builder(WoodType.class, "wood_vertical_slab", LeptonBlocks.OAK.woods().getVerticalSlabBlock(),
//                () -> VanillaWoodTypes.OAK, s -> new VerticalSlabBlock(Utils.copyPropertySafe(s.log)))
//                .requiresChildren(VanillaWoodChildKeys.LOG)
//                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "oak_log"), PaletteStrategies.LOG_SIDE_STANDARD)
//                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
//                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
//                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_vertical_slab"), Registries.BLOCK, Registries.ITEM)
//                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/oak_wood_vertical_slab"))
//                .build();
//        this.addEntry(woodVerticalSlab);

//        woodWall = SimpleEntrySet.builder(WoodType.class, "wood_wall", LeptonBlocks.OAK.woods().getWallBlock(),
//                () -> VanillaWoodTypes.OAK, s -> new WallBlock(Utils.copyPropertySafe(s.log)))
//                .requiresChildren(VanillaWoodChildKeys.WOOD)
//                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "oak_log"), PaletteStrategies.LOG_SIDE_STANDARD)
//                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
//                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
//                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_wall"), Registries.BLOCK, Registries.ITEM)
//                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/oak_wood_wall"))
//                .build();
//        this.addEntry(woodWall);

        strippedWoodSlab = SimpleEntrySet.builder(WoodType.class, "wood_slab", "stripped", LeptonBlocks.OAK.strippedWoods().getSlabBlock(),
                        () -> VanillaWoodTypes.OAK, s -> new SlabBlock(Utils.copyPropertySafe(s.log)))
                .requiresChildren(VanillaWoodChildKeys.STRIPPED_WOOD, VanillaWoodChildKeys.STRIPPED_LOG)
                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "stripped_oak_log"), PaletteStrategies.STRIPPED_LOG_SIDE_STANDARD)
                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
                .addTag(BlockTags.MINEABLE_WITH_AXE, Registries.BLOCK)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_slabs"), Registries.BLOCK, Registries.ITEM)
                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/stripped_oak_wood_slab"))
                .build();
        this.addEntry(strippedWoodSlab);

//        strippedWoodStairs = SimpleEntrySet.builder(WoodType.class, "stripped_wood_stairs", LeptonBlocks.OAK.strippedWoods().getStairsBlock(),
//                        () -> VanillaWoodTypes.OAK, s -> new StairBlock(VanillaWoodTypes.OAK.log.defaultBlockState(), Utils.copyPropertySafe(s.log)))
//                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "stripped_oak_log"), PaletteStrategies.LOG_SIDE_STANDARD)
//                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
//                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
//                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_stairs"), Registries.BLOCK, Registries.ITEM)
//                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/stripped_oak_wood_stairs"))
//                .build();
//        this.addEntry(strippedWoodStairs);

//        strippedWoodVerticalSlab = SimpleEntrySet.builder(WoodType.class, "stripped_wood_vertical_slab", LeptonBlocks.OAK.strippedWoods().getVerticalSlabBlock(),
//                        () -> VanillaWoodTypes.OAK, s -> new VerticalSlabBlock(Utils.copyPropertySafe(s.log)))
//                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "stripped_oak_log"), PaletteStrategies.LOG_SIDE_STANDARD)
//                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
//                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
//                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_vertical_slab"), Registries.BLOCK, Registries.ITEM)
//                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/stripped_oak_wood_vertical_slab"))
//                .build();
//        this.addEntry(strippedWoodVerticalSlab);

//        strippedWoodWall = SimpleEntrySet.builder(WoodType.class, "stripped_wood_wall", LeptonBlocks.OAK.strippedWoods().getWallBlock(),
//                        () -> VanillaWoodTypes.OAK, s -> new WallBlock(Utils.copyPropertySafe(s.log)))
//                .addTexture(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "stripped_oak_log"), PaletteStrategies.LOG_SIDE_STANDARD)
//                .setTab(() -> BuiltInRegistries.CREATIVE_MODE_TAB.get(CreativeModeTabs.BUILDING_BLOCKS))
//                .setTabMode(TabAddMode.AFTER_SAME_WOOD)
//                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.DIFFERENTIATE, "wood_wall"), Registries.BLOCK, Registries.ITEM)
//                .addRecipe(ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "crafting/wood_slab/stripped_oak_wood_wall"))
//                .build();
//        this.addEntry(strippedWoodWall);
    }

//    @Override
//    public void onModSetup() {
//        woodSlab.blocks.forEach((w, slab) -> {
//            Block strippedSlab = strippedWoodSlab.blocks.get(w);
//            if (strippedSlab != null) ECPlatStuff.registerStripping(slab, strippedSlab);
//        });
//    }

    @Override
    public void addDynamicClientResources(Consumer<ResourceGenTask> executor) {
        super.addDynamicClientResources(executor);
    }

    @Override
    public void addDynamicServerResources(Consumer<ResourceGenTask> executor) {
        super.addDynamicServerResources(executor);
    }
}
