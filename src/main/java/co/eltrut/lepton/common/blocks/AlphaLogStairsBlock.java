package co.eltrut.lepton.common.blocks;

import java.util.Random;
import java.util.function.Supplier;

import co.eltrut.differentiate.common.block.wood.LogStairsBlock;
import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AlphaLogStairsBlock extends LogStairsBlock implements IRenderTypeBlock {

	public AlphaLogStairsBlock(Supplier<Block> strippedBlock, Supplier<BlockState> state, Properties properties) {
		super(strippedBlock, state, properties);
	}
	
	public AlphaLogStairsBlock(Supplier<BlockState> state, Properties properties) {
		super(state, properties);
	}
	
    @Override
    public boolean skipRendering(BlockState bs1, BlockState bs2, Direction side) {
        return bs1 == bs2;
    }
	
	// Quark copy-paste for consistency
    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        super.animateTick(stateIn, worldIn, pos, rand);

        if(rand.nextInt(10) == 0)
            worldIn.addParticle(ParticleTypes.END_ROD, pos.getX() + rand.nextDouble(), pos.getY() + rand.nextDouble(), pos.getZ() + rand.nextDouble(), 0, 0, 0);
    }

	@Override
	public RenderType getRenderType() {
		return RenderType.translucent();
	}
}
