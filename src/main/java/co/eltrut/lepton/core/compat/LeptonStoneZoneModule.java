package co.eltrut.lepton.core.compat;

import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.stone_zone.api.StoneZoneModule;
import net.mehvahdjukaar.stone_zone.api.set.stone.StoneType;
import net.mehvahdjukaar.stone_zone.api.set.stone.VanillaStoneChildKeys;
import net.mehvahdjukaar.stone_zone.api.set.stone.VanillaStoneTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class LeptonStoneZoneModule extends StoneZoneModule {

    public final SimpleEntrySet<StoneType, Block> polishedButton;

    public static void registerStoneZoneModule() {
        // goofy ass abstraction
        EveryCompatAPI.registerModule(new LeptonStoneZoneModule());
    }

    public LeptonStoneZoneModule() {
        super(Lepton.MOD_ID, "lp");

        polishedButton = SimpleEntrySet.builder(StoneType.class, "button", "polished", LeptonBlocks.POLISHED_ANDESITE_BUTTON,
                        () -> VanillaStoneTypes.ANDESITE, s -> {
            Block stone = s.stone;
            BlockSetType stoneType = LeptonBlocks.BlockSetTypes.stoneType(stone.getSoundType(stone.defaultBlockState(), null, null, null));
            return LeptonBlocks.stoneButton(stoneType);
                        })
                .addModelTransform(m -> m.replaceWithTextureFromChild("minecraft:block/polished_andesite", VanillaStoneChildKeys.POLISHED))
                .requiresChildren(VanillaStoneChildKeys.POLISHED)
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .addTag(BlockTags.BUTTONS, Registries.BLOCK)
                .addTag(ItemTags.BUTTONS, Registries.ITEM)
                .addRecipe(modRes("crafting/polished_andesite_button"))
                .build();
        this.addEntry(polishedButton);
    }

}
