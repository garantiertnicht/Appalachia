package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH10S70;

public class ItemSlabOakH10S70 extends AppalachiaItemSlab {

    public ItemSlabOakH10S70(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_10_70.getDefaultState().withProperty(BlockPlanksOakH10S70.DOUBLE, Boolean.valueOf(true));
    }
}