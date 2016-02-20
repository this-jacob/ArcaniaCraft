package com.ar13mis.arcaniacraft.init;

import com.ar13mis.arcaniacraft.item.*;
import com.ar13mis.arcaniacraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemArcaniaCraft arcanegem = new ItemArcaneGem();
    public static final ItemArcaniaCraft strangeingot = new ItemStrangeIngot();
    public static final ItemArcaniaCraft mysticalingot = new ItemMysticalIngot();
    public static final ItemArcaniaCraft dormantshard = new ItemDormantShard();
    public static final ItemArcaniaCraft awakenedshard = new ItemAwakenedShard();


    public static void init()
    {

        GameRegistry.registerItem(arcanegem, "arcanegem");
        GameRegistry.registerItem(strangeingot, "strangeingot");
        GameRegistry.registerItem(mysticalingot, "mysticalingot");
        GameRegistry.registerItem(dormantshard, "dormantshard");
        GameRegistry.registerItem(awakenedshard, "awakenedshard");

        ModArmor.init();
        ModTools.init();
    }
}
