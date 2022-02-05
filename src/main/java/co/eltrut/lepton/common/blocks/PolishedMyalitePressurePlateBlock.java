package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.client.provider.MyaliteColorProvider;
import co.eltrut.differentiate.common.block.StonePressurePlateBlock;
import co.eltrut.differentiate.common.interf.IColoredBlock;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;

public class PolishedMyalitePressurePlateBlock extends StonePressurePlateBlock implements IColoredBlock {

	public PolishedMyalitePressurePlateBlock(Properties propertiesIn) {
		super(propertiesIn);
	}

	@Override
	public ItemColor getItemColor() {
		return MyaliteColorProvider.getItemColor();
	}

	@Override
	public BlockColor getBlockColor() {
		return MyaliteColorProvider.getBlockColor();
	}

}
