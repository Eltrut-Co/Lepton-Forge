package co.eltrut.lepton.core.datagen;

import java.util.function.Consumer;

import co.eltrut.differentiate.core.util.RecipeUtil;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class LeptonRecipes extends RecipeProvider {

	public LeptonRecipes(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		RecipeUtil.slabCraftingRecipe(consumer, LeptonBlocks.ACACIA_WOOD_SLAB.get(), Blocks.ACACIA_WOOD, null, null, null);
		
		ForgeRegistries.BLOCKS.getValues().stream()
				.filter(s -> s.getRegistryName().getPath().contains("wood_slab"))
				.forEach(s -> {
					String name = s.getRegistryName().getPath();
					Block parent = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", name.replace("_slab", "")));
					RecipeUtil.sawingRecipe(Ingredient.fromItems(parent), s, 2)
						.build(consumer, new ResourceLocation("lepton", "sawing/" + name));
				});
	}

}
