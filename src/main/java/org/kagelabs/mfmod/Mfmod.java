package org.kagelabs.mfmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by patrick on 3/17/15.
 */

@Mod(modid = Mfmod.MODID, version = Mfmod.VERSION)
public class Mfmod {
    public static final String MODID = "mfmod";
    public static final String VERSION = "0.0.1";

    

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent e) {

    }
}
