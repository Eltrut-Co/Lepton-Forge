package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.common.block.DifferStoneButtonBlock;
import co.eltrut.differentiate.common.interf.IColoredBlock;
import co.eltrut.lepton.client.MyaliteColorProvider;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;

public class PolishedMyaliteButtonBlock extends DifferStoneButtonBlock implements IColoredBlock {

	public PolishedMyaliteButtonBlock(Properties properties) {
		super(properties);
	}

	@Override
	public IItemColor getItemColor() {
		return MyaliteColorProvider.getItemColor();
	}

	@Override
	public IBlockColor getBlockColor() {
		return MyaliteColorProvider.getBlockColor();
	}

}
