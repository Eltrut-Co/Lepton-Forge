package co.eltrut.lepton.core.datagen;

import co.eltrut.differentiate.core.datagen.provider.DifferentiateRecipeProvider;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.differentiate.core.util.CompatUtil;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Lepton.MOD_ID)
public class LeptonRecipeProvider extends DifferentiateRecipeProvider {

    public LeptonRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Lepton.MOD_ID);
    }

    protected void buildRecipes(RecipeOutput output) {

//        for (Map.Entry<List<String>, DeferredBlock<Block>> entry : LeptonBlocks.Collections.QUARK_STONE_WALLS.entrySet()) {
//            for (String name : entry.getKey()) {
//                Block block = BlockUtil.getBlockFromId(CompatUtil.Mods.QUARK, name);
//                SingleItemRecipeBuilder.stonecutting(Ingredient.of(block), RecipeCategory.BUILDING_BLOCKS, entry.getValue())
//                        .unlockedBy("has_" + name, has(block))
//                        .save(output.withConditions(new ModLoadedCondition(CompatUtil.Mods.QUARK)),
//                                ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "stonecutting/" + name + "_wall"));
//            }
//        }

//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.CALCITE), RecipeCategory.BUILDING_BLOCKS, LeptonBlocks.POLISHED_CALCITE_WALL)
//                .unlockedBy("has_calcite", has(Blocks.CALCITE))
//                .save(output.withConditions(new ModLoadedCondition(CompatUtil.Mods.QUARK), new FlagCondition("calcite", Optional.of(false))),
//                        ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "stonecutting/calcite_wall"));
//
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(Blocks.DRIPSTONE_BLOCK), RecipeCategory.BUILDING_BLOCKS, LeptonBlocks.POLISHED_CALCITE_WALL)
//                .unlockedBy("has_calcite", has(Blocks.DRIPSTONE_BLOCK))
//                .save(output.withConditions(new ModLoadedCondition(CompatUtil.Mods.QUARK), new FlagCondition("dripstone", Optional.of(false))),
//                        ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "stonecutting/dripstone_wall"));
//
//        ItemLike soulSandstone = BlockUtil.getBlockFromId(CompatUtil.Mods.QUARK, "soul_sandstone");
//        ItemLike cutSoulSandstone = BlockUtil.getBlockFromId(CompatUtil.Mods.QUARK, "cut_soul_sandstone");
//
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(soulSandstone), RecipeCategory.BUILDING_BLOCKS, LeptonBlocks.CUT_SOUL_SANDSTONE_STAIRS)
//                .unlockedBy("has_soul_sandstone", has(soulSandstone))
//                .save(output.withConditions(new ModLoadedCondition(CompatUtil.Mods.QUARK), new FlagCondition("soul_sandstone", null)),
//                        ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "stonecutting/soul_sandstone_stairs"));
//        SingleItemRecipeBuilder.stonecutting(Ingredient.of(cutSoulSandstone), RecipeCategory.BUILDING_BLOCKS, LeptonBlocks.CUT_SOUL_SANDSTONE_STAIRS)
//                .unlockedBy("has_soul_sandstone", has(cutSoulSandstone))
//                .save(output.withConditions(new ModLoadedCondition(CompatUtil.Mods.QUARK), new FlagCondition("soul_sandstone", null)),
//                        ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "stonecutting/cut_soul_sandstone_stairs"));


//        for (Map.Entry<List<Block>, DeferredBlock<Block>> entry : LeptonBlocks.Collections.STONE_WALLS.entrySet()) {
//            for (Block block : entry.getKey()) {
//                String name = BlockUtil.getIdFromBlock(block);
//                SingleItemRecipeBuilder.stonecutting(Ingredient.of(block), RecipeCategory.BUILDING_BLOCKS, entry.getValue())
//                        .unlockedBy("has_" + name, has(block))
//                        .save(output, ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "stonecutting/" + name + "_wall"));
//            }
//        }
//
//        for (Map.Entry<List<Block>, DeferredBlock<Block>> entry : LeptonBlocks.Collections.STONE_STAIRS.entrySet()) {
//            for (Block block : entry.getKey()) {
//                String name = BlockUtil.getIdFromBlock(block);
//                SingleItemRecipeBuilder.stonecutting(Ingredient.of(block), RecipeCategory.BUILDING_BLOCKS, entry.getValue())
//                        .unlockedBy("has_" + name, has(block))
//                        .save(output, ResourceLocation.fromNamespaceAndPath(Lepton.MOD_ID, "stonecutting/" + name + "_stairs"));
//            }
//        }

//        this.buildStonecuttingRecipes(List.of(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BRICKS), LeptonBlocks.QUARTZ_BRICK, output);

    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LeptonRecipeProvider(output, lookupProvider));
    }

}
