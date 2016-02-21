package com.ar13mis.arcaniacraft.item.tools.awakenedtools;

import com.ar13mis.arcaniacraft.init.ModToolMaterials;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemAwakenedTools
{
    public static Item awakenedpick = new ItemAwakenedPick(ModToolMaterials.awakenedMaterial, "awakenedpick");
    public static Item awakenedaxe = new ItemAwakenedAxe(ModToolMaterials.awakenedMaterial, "awakenedaxe");
    public static Item awakenedshovel = new ItemAwakenedShovel(ModToolMaterials.awakenedMaterial, "awakenedshovel");
    public static Item awakenedhoe = new ItemAwakenedHoe(ModToolMaterials.awakenedMaterial, "awakenedhoe");
    public static Item awakenedsword = new ItemAwakenedSword(ModToolMaterials.awakenedMaterial, "awakenedsword");

    public static void init()
    {
        GameRegistry.registerItem(awakenedpick, "awakenedpick");
        GameRegistry.registerItem(awakenedaxe, "awakenedaxe");
        GameRegistry.registerItem(awakenedshovel, "awakenedshovel");
        GameRegistry.registerItem(awakenedhoe, "awakenedhoe");
        GameRegistry.registerItem(awakenedsword, "awakenedsword");
    }
}