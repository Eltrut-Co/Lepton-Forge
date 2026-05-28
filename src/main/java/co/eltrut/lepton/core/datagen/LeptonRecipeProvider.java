package co.eltrut.lepton.core.datagen;

import co.eltrut.differentiate.core.datagen.provider.DifferentiateRecipeProvider;
import co.eltrut.differentiate.core.util.BlockUtil;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
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

        this.buildStonecuttingRecipes(List.of(Blocks.QUARTZ_BLOCK, Blocks.QUARTZ_BRICKS), LeptonBlocks.QUARTZ_BRICK, output);

    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LeptonRecipeProvider(output, lookupProvider));
    }

}
