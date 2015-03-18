package org.kagelabs.mfmod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Philip on 3/17/15.
 */
public class CopperBlock extends Block{
    CopperBlock(){
        super(Material.rock);
        setBlockName(Mfmod.MODID + "_" + "copperblock");
        setCreativeTab(CreativeTabs.tabBlock);
        setBlockTextureName(Mfmod.MODID + ":" + "copperblock");
    }
}
