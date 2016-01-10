package com.ar13mis.arcaniacraft.init;

import com.ar13mis.arcaniacraft.item.ItemArcaneGem;
import com.ar13mis.arcaniacraft.item.ItemArcaniaCraft;
import com.ar13mis.arcaniacraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemArcaniaCraft arcanegem = new ItemArcaneGem();

    public static void init()
    {
        GameRegistry.registerItem(arcanegem, "arcanegem");
    }
}
