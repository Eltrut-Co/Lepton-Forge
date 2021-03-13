package co.eltrut.lepton.core.datagen;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import co.eltrut.differentiate.core.util.CompatUtil.Mods;
import co.eltrut.differentiate.core.util.RecipeUtil;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class LeptonRecipes extends RecipeProvider {

	public static final Map<String, String> NAME_TO_MODID = new HashMap<>();
	
	public LeptonRecipes(DataGenerator generatorIn) {
		super(generatorIn);
		fillMap();
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		generateSawingRecipes("slab", 2, consumer);
		generateSawingRecipes("stairs", 1, consumer);
		generateSawingRecipes("wall", 1, consumer);
		generateSawingRecipes("vertical_slab", 2, consumer);
	}
	
	public static void generateSawingRecipes(String type, int output, Consumer<IFinishedRecipe> consumer) {
		ForgeRegistries.BLOCKS.getValues().stream()
		.filter(s -> ((s.getRegistryName().getPath().contains("wood_" + type) || s.getRegistryName().getPath().contains("hyphae_" + type)) && s.getRegistryName().getNamespace().equals(Mods.LEPTON)))
		.forEach(s -> {
			String name = s.getRegistryName().getPath();
			String modifiedName = name.replace("stripped_", "").replace("_" + type, "");
			String modid = NAME_TO_MODID.get(modifiedName);
			Block parent = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(modid, name.replace("_" + type, "")));
			if (type == "vertical_slab") {
				if (modid.equals("minecraft") || modid.equals(Mods.ENVIRONMENTAL)) {
					RecipeUtil.sawingRecipe(Ingredient.fromItems(parent), s, output)
						.addModCompat(Mods.ENVIRONMENTAL)
						.addFlags("vertical_slabs")
						.build(consumer, new ResourceLocation("lepton", "sawing/" + name));
				} else {
					RecipeUtil.sawingRecipe(Ingredient.fromItems(parent), s, output)
						.addModCompat(Mods.ENVIRONMENTAL, modid)
						.addFlags("vertical_slabs")
						.build(consumer, new ResourceLocation("lepton", "sawing/" + name));
				}
			} else {
				if (modid.equals("minecraft") || modid.equals(Mods.ENVIRONMENTAL)) {
					RecipeUtil.sawingRecipe(Ingredient.fromItems(parent), s, output)
						.addModCompat(Mods.ENVIRONMENTAL)
						.build(consumer, new ResourceLocation("lepton", "sawing/" + name));
				} else {
					RecipeUtil.sawingRecipe(Ingredient.fromItems(parent), s, output)
						.addModCompat(Mods.ENVIRONMENTAL, modid)
						.build(consumer, new ResourceLocation("lepton", "sawing/" + name));
				}
			}
		});
	}
	
	public void fillMap() {
		NAME_TO_MODID.put("acacia_wood", "minecraft");
		NAME_TO_MODID.put("birch_wood", "minecraft");
		NAME_TO_MODID.put("dark_oak_wood", "minecraft");
		NAME_TO_MODID.put("jungle_wood", "minecraft");
		NAME_TO_MODID.put("oak_wood", "minecraft");
		NAME_TO_MODID.put("spruce_wood", "minecraft");
		NAME_TO_MODID.put("crimson_hyphae", "minecraft");
		NAME_TO_MODID.put("warped_hyphae", "minecraft");
		NAME_TO_MODID.put("rosewood", Mods.ATMOSPHERIC);
		NAME_TO_MODID.put("morado_wood", Mods.ATMOSPHERIC);
		NAME_TO_MODID.put("yucca_wood", Mods.ATMOSPHERIC);
		NAME_TO_MODID.put("kousa_wood", Mods.ATMOSPHERIC);
		NAME_TO_MODID.put("aspen_wood", Mods.ATMOSPHERIC);
		NAME_TO_MODID.put("grimwood", Mods.ATMOSPHERIC);
		NAME_TO_MODID.put("maple_wood", Mods.AUTUMNITY);
		NAME_TO_MODID.put("poise_wood", Mods.ENDERGETIC_EXPANSION);
		NAME_TO_MODID.put("driftwood", Mods.UPGRADE_AQUATIC);
		NAME_TO_MODID.put("river_wood", Mods.UPGRADE_AQUATIC);
		NAME_TO_MODID.put("wisteria_wood", Mods.ENVIRONMENTAL);
		NAME_TO_MODID.put("cherry_wood", Mods.ENVIRONMENTAL);
		NAME_TO_MODID.put("willow_wood", Mods.ENVIRONMENTAL);
		NAME_TO_MODID.put("red_mushroom_hyphae", Mods.ENHANCED_MUSHROOMS);
		NAME_TO_MODID.put("brown_mushroom_hyphae", Mods.ENHANCED_MUSHROOMS);
		NAME_TO_MODID.put("glowshroom_hyphae", Mods.ENHANCED_MUSHROOMS);
		NAME_TO_MODID.put("jacaranda_wood", Mods.ABUNDANCE);
		NAME_TO_MODID.put("redbud_wood", Mods.ABUNDANCE);
		NAME_TO_MODID.put("cypress_wood", Mods.BAYOU_BLUES);
	}

}
