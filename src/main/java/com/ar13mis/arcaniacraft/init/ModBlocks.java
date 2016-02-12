package com.ar13mis.arcaniacraft.init;

import com.ar13mis.arcaniacraft.block.*;
import com.ar13mis.arcaniacraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockArcaniaCraft strangeore = new BlockStrangeOre();
    public static final BlockArcaniaCraft mysticalore = new BlockMysticalOre();
    public static final BlockArcaniaCraft arcaneore = new BlockArcaneOre();
    public static final BlockArcaniaCraft dormantore = new BlockDormantOre();

    public static void init()
    {
        GameRegistry.registerBlock(strangeore, "strangeore");
        GameRegistry.registerBlock(mysticalore, "mysticalore");
        GameRegistry.registerBlock(arcaneore, "arcaneore");
        GameRegistry.registerBlock(dormantore, "dormantore");
    }
}
