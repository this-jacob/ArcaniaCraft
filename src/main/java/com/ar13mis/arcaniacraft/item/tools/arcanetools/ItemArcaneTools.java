package com.ar13mis.arcaniacraft.item.tools.arcanetools;

import com.ar13mis.arcaniacraft.init.ModToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemArcaneTools
{
    public static Item arcanepick = new ItemArcanePick(ModToolMaterials.arcaneMaterial, "arcanepick");
    public static Item arcaneaxe = new ItemArcaneAxe(ModToolMaterials.arcaneMaterial, "arcaneaxe");
    public static Item arcaneshovel = new ItemArcaneShovel(ModToolMaterials.arcaneMaterial, "arcaneshovel");
    public static Item arcanehoe = new ItemArcaneHoe(ModToolMaterials.arcaneMaterial, "arcanehoe");
    public static Item arcanesword = new ItemArcaneSword(ModToolMaterials.arcaneMaterial, "arcanesword");

    public static void init()
    {
        GameRegistry.registerItem(arcanepick, "arcanepick");
        GameRegistry.registerItem(arcaneaxe, "arcaneaxe");
        GameRegistry.registerItem(arcaneshovel, "arcaneshovel");
        GameRegistry.registerItem(arcanehoe, "arcanehoe");
        GameRegistry.registerItem(arcanesword, "arcanesword");
    }
}
