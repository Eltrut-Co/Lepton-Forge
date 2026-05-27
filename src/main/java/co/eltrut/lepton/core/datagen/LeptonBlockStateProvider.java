package co.eltrut.lepton.core.datagen;

import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Lepton.MOD_ID)
public class LeptonBlockStateProvider extends BlockStateProvider {

    public LeptonBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Lepton.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        wallBlock((WallBlock) LeptonBlocks.CUT_COPPER_WALL.get(), mcLoc("block/cut_copper"));
        wallBlock((WallBlock) LeptonBlocks.EXPOSED_CUT_COPPER_WALL.get(), mcLoc("block/exposed_cut_copper"));
        wallBlock((WallBlock) LeptonBlocks.OXIDIZED_CUT_COPPER_WALL.get(), mcLoc("block/oxidized_cut_copper"));
        wallBlock((WallBlock) LeptonBlocks.WEATHERED_CUT_COPPER_WALL.get(), mcLoc("block/weathered_cut_copper"));

        wallBlock((WallBlock) LeptonBlocks.WAXED_CUT_COPPER_WALL.get(), mcLoc("block/cut_copper"));
        wallBlock((WallBlock) LeptonBlocks.WAXED_EXPOSED_CUT_COPPER_WALL.get(), mcLoc("block/exposed_cut_copper"));
        wallBlock((WallBlock) LeptonBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL.get(), mcLoc("block/oxidized_cut_copper"));
        wallBlock((WallBlock) LeptonBlocks.WAXED_WEATHERED_CUT_COPPER_WALL.get(), mcLoc("block/weathered_cut_copper"));

        simpleBlockItem(LeptonBlocks.CUT_COPPER_WALL.get(), models().wallInventory("cut_copper_wall_inventory", mcLoc("block/cut_copper")));
        simpleBlockItem(LeptonBlocks.EXPOSED_CUT_COPPER_WALL.get(), models().wallInventory("exposed_cut_copper_wall_inventory", mcLoc("block/exposed_cut_copper")));
        simpleBlockItem(LeptonBlocks.OXIDIZED_CUT_COPPER_WALL.get(), models().wallInventory("oxidized_cut_copper_wall_inventory", mcLoc("block/oxidized_cut_copper")));
        simpleBlockItem(LeptonBlocks.WEATHERED_CUT_COPPER_WALL.get(), models().wallInventory("weathered_cut_copper_wall_inventory", mcLoc("block/weathered_cut_copper")));

        simpleBlockItem(LeptonBlocks.WAXED_CUT_COPPER_WALL.get(), models().wallInventory("waxed_cut_copper_wall_inventory", mcLoc("block/cut_copper")));
        simpleBlockItem(LeptonBlocks.WAXED_EXPOSED_CUT_COPPER_WALL.get(), models().wallInventory("waxed_exposed_cut_copper_wall_inventory", mcLoc("block/exposed_cut_copper")));
        simpleBlockItem(LeptonBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL.get(), models().wallInventory("waxed_oxidized_cut_copper_wall_inventory", mcLoc("block/oxidized_cut_copper")));
        simpleBlockItem(LeptonBlocks.WAXED_WEATHERED_CUT_COPPER_WALL.get(), models().wallInventory("waxed_weathered_cut_copper_wall_inventory", mcLoc("block/weathered_cut_copper")));

    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(event.includeClient(), new LeptonBlockStateProvider(packOutput, existingFileHelper));
    }
}
