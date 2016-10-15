package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S110;

public class ItemSlabOakH40S110 extends AppalachiaItemSlab {

    public ItemSlabOakH40S110(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_110.getDefaultState().withProperty(BlockPlanksOakH40S110.DOUBLE, Boolean.valueOf(true));
    }
}