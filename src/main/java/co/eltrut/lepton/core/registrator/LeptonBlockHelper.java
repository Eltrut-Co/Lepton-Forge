package co.eltrut.lepton.core.registrator;

import co.eltrut.differentiate.common.block.wood.LogSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogStairBlock;
import co.eltrut.differentiate.common.block.wood.LogVerticalSlabBlock;
import co.eltrut.differentiate.common.block.wood.LogWallBlock;
import co.eltrut.differentiate.common.repo.VariantBlocksRepo;
import co.eltrut.differentiate.core.registrator.BlockHelper;
import co.eltrut.differentiate.core.registrator.Registrator;
import co.eltrut.lepton.common.repo.WoodVariantRepo;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.ArrayUtils;

public class LeptonBlockHelper extends BlockHelper {
    public LeptonBlockHelper(Registrator parent) {
        super(parent);
    }

    public VariantBlocksRepo createSimpleVariants(String name, Block base, String ...mods) {
        BlockBehaviour.Properties props = BlockBehaviour.Properties.copy(base);
        RegistryObject<Block> slabBlock = this.createSlabBlock(name, props, mods);
        RegistryObject<Block> stairBlock = this.createStairsBlock(name, () -> new StairBlock(base::defaultBlockState, props), mods);
        RegistryObject<Block> wallBlock = this.createWallBlock(name, props, mods);
        RegistryObject<Block> verticalSlabBlock = this.createVerticalSlabBlock(name, props, mods);
        return new VariantBlocksRepo.Builder().setSlabBlock(slabBlock).setStairsBlock(stairBlock).setWallBlock(wallBlock).setVerticalSlabBlock(verticalSlabBlock).build();
    }

    public WoodVariantRepo createSimpleWoodVariants(Block block, String ...mods) {
        String name = block.getRegistryName().getPath();
        String[] modsWithQuark = ArrayUtils.contains(mods, "quark") ? mods : ArrayUtils.add(mods, "quark");
        BlockBehaviour.Properties props = BlockBehaviour.Properties.copy(block);

        // Stripped Woods
        RegistryObject<Block> strippedSlabBlock = this.createSimpleFuelBlock("stripped_" + name + "_slab",
                () -> new LogSlabBlock(props), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, mods);
        RegistryObject<Block> strippedStairBlock = this.createSimpleFuelBlock("stripped_" + name + "_stairs",
                () -> new LogStairBlock(block::defaultBlockState, props), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, mods);
        RegistryObject<Block> strippedWallBlock = this.createSimpleFuelBlock("stripped_" + name + "_wall",
                () -> new LogWallBlock(props), CreativeModeTab.TAB_DECORATIONS, 300, mods);
        RegistryObject<Block> strippedVerticalSlabBlock = this.createSimpleFuelBlock("stripped_" + name + "_vertical_slab",
                () -> new LogVerticalSlabBlock(props), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, modsWithQuark);
        VariantBlocksRepo strippedWoods = new VariantBlocksRepo.Builder()
                .setSlabBlock(strippedSlabBlock)
                .setStairsBlock(strippedStairBlock)
                .setWallBlock(strippedWallBlock)
                .setVerticalSlabBlock(strippedVerticalSlabBlock)
                .build();

        // Woods
        RegistryObject<Block> slabBlock = this.createSimpleFuelBlock(name + "_slab",
                () -> new LogSlabBlock(strippedSlabBlock, props), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, mods);
        RegistryObject<Block> stairBlock = this.createSimpleFuelBlock(name + "_stairs",
                () -> new LogStairBlock(strippedStairBlock, block::defaultBlockState, props), CreativeModeTab.TAB_BUILDING_BLOCKS, 300, mods);
        RegistryObject<Block> wallBlock = this.createSimpleFuelBlock(name + "_wall",
                () -> new LogWallBlock(strippedWallBlock, props), CreativeModeTab.TAB_DECORATIONS, 300, mods);
        RegistryObject<Block> verticalSlabBlock = this.createSimpleFuelBlock(name + "_vertical_slab",
                () -> new LogVerticalSlabBlock(strippedVerticalSlabBlock, props), CreativeModeTab.TAB_BUILDING_BLOCKS, 150, modsWithQuark);
        VariantBlocksRepo woods = new VariantBlocksRepo.Builder()
                .setSlabBlock(slabBlock)
                .setStairsBlock(stairBlock)
                .setWallBlock(wallBlock)
                .setVerticalSlabBlock(verticalSlabBlock)
                .build();

        return new WoodVariantRepo(strippedWoods, woods);
    }

    public WoodVariantRepo createNetherWoodVariants(Block block, String ...mods) {
        String name = block.getRegistryName().getPath();
        String[] modsWithQuark = ArrayUtils.contains(mods, "quark") ? mods : ArrayUtils.add(mods, "quark");
        BlockBehaviour.Properties props = BlockBehaviour.Properties.copy(block);

        // Stripped Woods
        RegistryObject<Block> strippedSlabBlock = this.createSimpleBlock("stripped_" + name + "_slab",
                () -> new LogSlabBlock(props, true), CreativeModeTab.TAB_BUILDING_BLOCKS,  mods);
        RegistryObject<Block> strippedStairBlock = this.createSimpleBlock("stripped_" + name + "_stairs",
                () -> new LogStairBlock(block::defaultBlockState, props, true), CreativeModeTab.TAB_BUILDING_BLOCKS, mods);
        RegistryObject<Block> strippedWallBlock = this.createSimpleBlock("stripped_" + name + "_wall",
                () -> new LogWallBlock(props, true), CreativeModeTab.TAB_DECORATIONS, mods);
        RegistryObject<Block> strippedVerticalSlabBlock = this.createSimpleBlock("stripped_" + name + "_vertical_slab",
                () -> new LogVerticalSlabBlock(props, true), CreativeModeTab.TAB_BUILDING_BLOCKS, modsWithQuark);
        VariantBlocksRepo strippedWoods = new VariantBlocksRepo.Builder()
                .setSlabBlock(strippedSlabBlock)
                .setStairsBlock(strippedStairBlock)
                .setWallBlock(strippedWallBlock)
                .setVerticalSlabBlock(strippedVerticalSlabBlock)
                .build();

        // Woods
        RegistryObject<Block> slabBlock = this.createSimpleBlock(name + "_slab",
                () -> new LogSlabBlock(strippedSlabBlock, props, true), CreativeModeTab.TAB_BUILDING_BLOCKS, mods);
        RegistryObject<Block> stairBlock = this.createSimpleBlock(name + "_stairs",
                () -> new LogStairBlock(strippedStairBlock, block::defaultBlockState, props, true), CreativeModeTab.TAB_BUILDING_BLOCKS, mods);
        RegistryObject<Block> wallBlock = this.createSimpleBlock(name + "_wall",
                () -> new LogWallBlock(strippedWallBlock, props, true), CreativeModeTab.TAB_DECORATIONS, mods);
        RegistryObject<Block> verticalSlabBlock = this.createSimpleBlock(name + "_vertical_slab",
                () -> new LogVerticalSlabBlock(strippedVerticalSlabBlock, props, true), CreativeModeTab.TAB_BUILDING_BLOCKS, modsWithQuark);
        VariantBlocksRepo woods = new VariantBlocksRepo.Builder()
                .setSlabBlock(slabBlock)
                .setStairsBlock(stairBlock)
                .setWallBlock(wallBlock)
                .setVerticalSlabBlock(verticalSlabBlock)
                .build();

        return new WoodVariantRepo(strippedWoods, woods);
    }

}
