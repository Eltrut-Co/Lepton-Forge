package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.common.interf.IColoredBlock;
import co.eltrut.lepton.client.MyaliteColorProvider;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;

public class PolishedMyalitePressurePlateBlock extends InjectedPressurePlateBlock implements IColoredBlock {

	public PolishedMyalitePressurePlateBlock(Sensitivity sensitivityIn, Properties propertiesIn) {
		super(sensitivityIn, propertiesIn);
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
