package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksOakH10S110 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksOakH10S110() {

        super("planks.oak.10.110");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_oak_10_110 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}