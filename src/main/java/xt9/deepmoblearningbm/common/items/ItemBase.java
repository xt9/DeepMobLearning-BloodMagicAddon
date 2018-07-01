package xt9.deepmoblearningbm.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xt9.deepmoblearningbm.DeepMobLearningBM;
import xt9.deepmoblearningbm.ModConstants;

/**
 * Created by xt9 on 2018-07-01.
 */
public class ItemBase extends Item {
    public String itemName;

    public ItemBase(String name, int stackSize) {
        setUnlocalizedName(ModConstants.MODID + "." + name);
        setCreativeTab(DeepMobLearningBM.creativeTab);
        setRegistryName(name);
        setMaxStackSize(stackSize);
        this.itemName = name;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
        if(isInCreativeTab(tab)) {
            list.add(new ItemStack(this));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return getUnlocalizedName();
    }
}
