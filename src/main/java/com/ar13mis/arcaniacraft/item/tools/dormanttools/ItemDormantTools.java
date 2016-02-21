package com.ar13mis.arcaniacraft.item.tools.dormanttools;

import com.ar13mis.arcaniacraft.init.ModToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemDormantTools
{
    public static Item dormantpick = new ItemDormantPick(ModToolMaterials.dormantMaterial, "dormantpick");
    public static Item dormantaxe = new ItemDormantShovel(ModToolMaterials.dormantMaterial, "dormantaxe");
    public static Item dormantshovel = new ItemDormantShovel(ModToolMaterials.dormantMaterial, "dormantshovel");
    public static Item dormanthoe = new ItemDormantHoe(ModToolMaterials.dormantMaterial, "dormanthoe");
    public static Item dormantsword = new ItemDormantSword(ModToolMaterials.dormantMaterial, "dormantsword");

    public static void init()
    {
        GameRegistry.registerItem(dormantpick, "dormantpick");
        GameRegistry.registerItem(dormantaxe, "dormantaxe");
        GameRegistry.registerItem(dormantshovel, "dormantshovel");
        GameRegistry.registerItem(dormanthoe, "dormanthoe");
        GameRegistry.registerItem(dormantsword, "dormantsword");
    }
}
