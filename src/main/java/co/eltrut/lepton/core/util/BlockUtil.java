package co.eltrut.lepton.core.util;

import net.minecraft.block.BlockState;
import net.minecraft.state.Property;

public class BlockUtil {
	
	// TODO: change this and move it to Differentiate
	public static BlockState transferAllBlockStates(BlockState initial, BlockState after) {
		BlockState block = after;
		for (Property property : initial.getBlock().getStateContainer().getProperties()) {
			if (after.hasProperty(property) && initial.get(property) != null) {
				block = block.with(property, initial.get(property));
			}
		}
		return block;
	}
	
}
