package com.ar13mis.arcaniacraft.init;

import com.ar13mis.arcaniacraft.block.BlockArcaneOre;
import com.ar13mis.arcaniacraft.block.BlockArcaniaCraft;
import com.ar13mis.arcaniacraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockArcaniaCraft arcaneore = new BlockArcaneOre();

    public static void init()
    {
        GameRegistry.registerBlock(arcaneore, "arcaneore");
    }
}
