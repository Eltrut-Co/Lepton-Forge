package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.common.interf.IColoredBlock;
import co.eltrut.lepton.client.MyaliteColorProvider;
import net.minecraft.block.WallBlock;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;

public class PolishedMyaliteWallBlock extends WallBlock implements IColoredBlock {

	public PolishedMyaliteWallBlock(Properties properties) {
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
