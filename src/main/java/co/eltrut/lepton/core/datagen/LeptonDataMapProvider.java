package co.eltrut.lepton.core.datagen;

import co.eltrut.differentiate.common.repo.WoodVariantRepo;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Lepton.MOD_ID)
public class LeptonDataMapProvider extends DataMapProvider {

    protected LeptonDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {

        for (WoodVariantRepo repo : LeptonBlocks.Collections.WOODS) {
            Map<DeferredBlock<Block>, DeferredBlock<Block>> map = repo.getBlocksAsMap();

            for (Map.Entry<DeferredBlock<Block>, DeferredBlock<Block>> entry : map.entrySet()) {
                builder(NeoForgeDataMaps.STRIPPABLES).add(entry.getKey(), new Strippable(entry.getValue().get()), false);
            }
        }

    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new LeptonDataMapProvider(output, lookupProvider));
    }

}
