package co.eltrut.lepton.core.compat;

import co.eltrut.differentiate.core.util.CompatUtil;
import co.eltrut.lepton.core.Lepton;
import co.eltrut.lepton.core.registry.LeptonBlocks;
import net.mehvahdjukaar.every_compat.api.EveryCompatAPI;
import net.mehvahdjukaar.every_compat.api.SimpleEntrySet;
import net.mehvahdjukaar.stone_zone.api.StoneZoneModule;
import net.mehvahdjukaar.stone_zone.api.set.stone.StoneType;
import net.mehvahdjukaar.stone_zone.api.set.stone.VanillaStoneChildKeys;
import net.mehvahdjukaar.stone_zone.api.set.stone.VanillaStoneTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;

public class LeptonStoneZoneModule extends StoneZoneModule {

    public final SimpleEntrySet<StoneType, Block> polishedButton;
    public final SimpleEntrySet<StoneType, Block> polishedPressurePlate;

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
                .addTag(BlockTags.STONE_BUTTONS, Registries.BLOCK)
                .addTag(ItemTags.STONE_BUTTONS, Registries.ITEM)
                .addRecipe(modRes("crafting/polished_andesite_button"))
                .copyParentDrop()
                .build();
        this.addEntry(polishedButton);

        polishedPressurePlate = SimpleEntrySet.builder(StoneType.class, "pressure_plate", "polished", LeptonBlocks.POLISHED_ANDESITE_PRESSURE_PLATE,
                () -> VanillaStoneTypes.ANDESITE, s -> {
            Block stone = s.stone;
            BlockSetType stoneType = LeptonBlocks.BlockSetTypes.stoneType(stone.getSoundType(stone.defaultBlockState(), null, null, null));
            MapColor color = stone.defaultMapColor();
            return LeptonBlocks.stonePressurePlateBlock(color, stoneType);
                })
                .addModelTransform(m -> m.replaceWithTextureFromChild("minecraft:block/polished_andesite", VanillaStoneChildKeys.POLISHED))
                .requiresChildren(VanillaStoneChildKeys.POLISHED)
                .setTab(getTab(CreativeModeTabs.BUILDING_BLOCKS))
                .addTag(BlockTags.STONE_PRESSURE_PLATES, Registries.BLOCK)
                .addTag(ResourceLocation.fromNamespaceAndPath(CompatUtil.Mods.MINECRAFT, "stone_pressure_plates"), Registries.ITEM)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE, Registries.BLOCK)
                .addRecipe(modRes("crafting/polished_andesite_pressure_plate"))
                .copyParentDrop()
                .build();
        this.addEntry(polishedPressurePlate);
    }

}
