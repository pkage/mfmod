package org.kagelabs.mfmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by patrick on 3/17/15.
 */
public class DenseIron extends Block{
    public String getName() {
        return name;
    }

    private String name;

    DenseIron() {
        super(Material.rock);
        this.name = Mfmod.MODID + "_denseIron";
        setBlockName(this.name);
        setBlockTextureName(Mfmod.MODID + ":denseIron");
        setCreativeTab(CreativeTabs.tabBlock);
    }


}
