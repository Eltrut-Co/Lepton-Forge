package co.eltrut.lepton.common.blocks;

import co.eltrut.differentiate.common.block.wood.LogWallBlock;
import co.eltrut.differentiate.common.interf.IRenderTypeBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;
import java.util.function.Supplier;

public class AlphaLogWallBlock extends LogWallBlock implements IRenderTypeBlock {

	public AlphaLogWallBlock(Supplier<Block> strippedBlock, Properties properties) {
		super(strippedBlock, properties);
	}
	
	public AlphaLogWallBlock(Properties properties) {
		super(properties);
	}
	
    @Override
    public boolean skipRendering(BlockState bs1, BlockState bs2, Direction side) {
        return bs1 == bs2 || bs2.getBlock() instanceof AlphaLogWallBlock;
    }
	
	// Quark copy-paste for consistency
    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState stateIn, Level worldIn, BlockPos pos, Random rand) {
        super.animateTick(stateIn, worldIn, pos, rand);

        if(rand.nextInt(10) == 0)
            worldIn.addParticle(ParticleTypes.END_ROD, pos.getX() + rand.nextDouble(), pos.getY() + rand.nextDouble(), pos.getZ() + rand.nextDouble(), 0, 0, 0);
    }

	@Override
	public RenderType getRenderType() {
		return RenderType.translucent();
	}
}
