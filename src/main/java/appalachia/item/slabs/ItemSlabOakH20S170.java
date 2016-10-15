package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH20S170;

public class ItemSlabOakH20S170 extends AppalachiaItemSlab {

    public ItemSlabOakH20S170(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_20_170.getDefaultState().withProperty(BlockPlanksOakH20S170.DOUBLE, Boolean.valueOf(true));
    }
}