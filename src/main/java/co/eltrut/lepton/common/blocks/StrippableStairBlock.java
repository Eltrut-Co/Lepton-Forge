package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.core.util.BlockUtil;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbilities;
import net.neoforged.neoforge.common.ItemAbility;

import javax.annotation.Nullable;

public class StrippableStairBlock extends StairBlock implements IStrippable {

    public Block strippedBlock;

    public StrippableStairBlock(BlockState baseState, Properties properties) {
        super(baseState, properties);
    }

    @Override
    @Nullable
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (ItemAbilities.AXE_STRIP == itemAbility)
            return this.strippedBlock != null ? BlockUtil.transferAllBlockStates(state, this.strippedBlock.defaultBlockState()) : null;
        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }

    @Override
    public void setStrippedBlock(Block strippedBlock) {
        this.strippedBlock = strippedBlock;
    }
}
