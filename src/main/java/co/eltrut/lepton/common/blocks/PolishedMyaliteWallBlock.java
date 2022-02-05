package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.client.provider.MyaliteColorProvider;
import co.eltrut.differentiate.common.interf.IColoredBlock;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.level.block.WallBlock;

public class PolishedMyaliteWallBlock extends WallBlock implements IColoredBlock {

	public PolishedMyaliteWallBlock(Properties properties) {
		super(properties);
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
