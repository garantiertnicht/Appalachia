package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksOakH20S140 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksOakH20S140() {

        super("planks.oak.20.140");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_oak_20_140 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}