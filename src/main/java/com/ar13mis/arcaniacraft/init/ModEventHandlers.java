package com.ar13mis.arcaniacraft.init;

import com.ar13mis.arcaniacraft.worldgen.OreGeneration;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModEventHandlers
{

    static OreGeneration oreHandler = new OreGeneration();

    public static void init()
    {

        GameRegistry.registerWorldGenerator(oreHandler, 0);

    }
}
