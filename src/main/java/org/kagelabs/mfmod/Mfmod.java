package org.kagelabs.mfmod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by patrick on 3/17/15.
 */

@Mod(modid = Mfmod.MODID, version = Mfmod.VERSION)
public class Mfmod {
    public static final String MODID = "mfmod";
    public static final String VERSION = "0.0.1";

    private DenseIron denseIron;
    public Copper copper;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent e) {
        denseIron = new DenseIron();
        GameRegistry.registerBlock(denseIron, denseIron.getName());
        System.out.println("Dense iron unlocalized: " + denseIron.getUnlocalizedName());

        copper = new Copper();
        GameRegistry.registerBlock(copper, "Copper");
    }
}
