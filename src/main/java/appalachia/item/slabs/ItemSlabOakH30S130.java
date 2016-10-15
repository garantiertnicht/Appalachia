package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S130;

public class ItemSlabOakH30S130 extends AppalachiaItemSlab {

    public ItemSlabOakH30S130(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_130.getDefaultState().withProperty(BlockPlanksOakH30S130.DOUBLE, Boolean.valueOf(true));
    }
}