package com.ar13mis.arcaniacraft.item.tools.awakenedtools;

import com.ar13mis.arcaniacraft.creativetab.CreativeTabArcaniaCraft;
import com.ar13mis.arcaniacraft.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemAwakenedPick extends ItemPickaxe
{
    public ItemAwakenedPick(ToolMaterial material, String name)
    {
        super(material);
        setUnlocalizedName(Reference.MOD_ID + ":" + name);
        setTextureName(Reference.MOD_ID + ":" + name);
        this.setCreativeTab(CreativeTabArcaniaCraft.ARC_TAB);
    }
}
