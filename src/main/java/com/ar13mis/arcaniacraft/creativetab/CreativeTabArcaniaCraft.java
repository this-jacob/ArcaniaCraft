package com.ar13mis.arcaniacraft.creativetab;

import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabArcaniaCraft
{
    public static final CreativeTabs ARC_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.arcanegem;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Arcaniacraft";
        }
    };
}