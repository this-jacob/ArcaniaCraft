package com.ar13mis.arcaniacraft.init;

import net.minecraft.item.Item.ToolMaterial ;
import net.minecraftforge.common.util.EnumHelper;

public class ModToolMaterials
{
    public static ToolMaterial strangeMaterial = EnumHelper.addToolMaterial("strangeMaterial", 4, 1000, 9.5F, 3.5F, 17);
    public static ToolMaterial mysticalMaterial = EnumHelper.addToolMaterial("mysticalMaterial", 5, 2000, 10.0F, 4.5F, 20);
    public static ToolMaterial arcaneMaterial = EnumHelper.addToolMaterial("arcaneMaterial", 6, 5000, 11.0F, 5.5F, 22);
    public static ToolMaterial dormantMaterial = EnumHelper.addToolMaterial("dormantMaterial", 7, 10000, 12.0F, 6.5F, 22);
    public static ToolMaterial awakenedMaterial = EnumHelper.addToolMaterial("awakendedMaterial", 8, 25000, 20.0F, 11.0F, 50);
}
