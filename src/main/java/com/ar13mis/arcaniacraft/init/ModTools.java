package com.ar13mis.arcaniacraft.init;

import com.ar13mis.arcaniacraft.item.tools.arcanetools.ItemArcaneTools;
import com.ar13mis.arcaniacraft.item.tools.mysticaltools.ItemMysticalTools;
import com.ar13mis.arcaniacraft.item.tools.strangetools.ItemStrangeTools;

public class ModTools
{
    public static void init()
    {
        ItemStrangeTools.init();
        ItemMysticalTools.init();
        ItemArcaneTools.init();
    }
}
