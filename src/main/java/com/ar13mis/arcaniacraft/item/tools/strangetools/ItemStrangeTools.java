package com.ar13mis.arcaniacraft.item.tools.strangetools;

import com.ar13mis.arcaniacraft.init.ModToolMaterials;
import com.ar13mis.arcaniacraft.item.armor.ItemStrangeArmor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemStrangeTools
{

    public static Item strangepick = new ItemStrangePick(ModToolMaterials.strangeMaterial, "strangepick");
    public static Item strangeaxe = new ItemStrangeAxe(ModToolMaterials.strangeMaterial, "strangeaxe");
    public static Item strangeshovel = new ItemStrangeShovel(ModToolMaterials.strangeMaterial, "strangeshovel");
    public static Item strangehoe = new ItemStrangeHoe(ModToolMaterials.strangeMaterial, "strangehoe");
    public static Item strangesword = new ItemStrangeSword(ModToolMaterials.strangeMaterial, "strangesword");

    public static void init()
    {
        GameRegistry.registerItem(strangepick, "strangepick");
        GameRegistry.registerItem(strangeaxe, "strangeaxe");
        GameRegistry.registerItem(strangeshovel, "strangeshovel");
        GameRegistry.registerItem(strangehoe, "strangehoe");
        GameRegistry.registerItem(strangesword, "strangesword");
    }
}
