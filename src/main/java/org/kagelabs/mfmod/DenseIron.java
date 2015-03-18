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
        name = Mfmod.MODID + "_denseiron";
        this.setBlockName(name);
        this.setBlockTextureName(Mfmod.MODID + ":denseiron");
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
}
