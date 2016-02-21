package com.ar13mis.arcaniacraft.item.tools.mysticaltools;

import com.ar13mis.arcaniacraft.init.ModToolMaterials;
import com.ar13mis.arcaniacraft.item.armor.ItemMysticalArmor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemMysticalTools
{
    public static Item mysticalpick = new ItemMysticalPick(ModToolMaterials.mysticalMaterial, "mysticalpick");
    public static Item mysticalaxe = new ItemMysticalAxe(ModToolMaterials.mysticalMaterial, "mysticalaxe");
    public static Item mysticalshovel = new ItemMysticalShovel(ModToolMaterials.mysticalMaterial, "mysticalshovel");
    public static Item mysticalhoe = new ItemMysticalHoe(ModToolMaterials.mysticalMaterial, "mysticalhoe");
    public static Item mysticalsword = new ItemMysticalSword(ModToolMaterials.mysticalMaterial, "mysticalsword");

    public static void init()
    {
        GameRegistry.registerItem(mysticalpick, "mysticalpick");
        GameRegistry.registerItem(mysticalaxe, "mysticalaxe");
        GameRegistry.registerItem(mysticalshovel, "mysticalshovel");
        GameRegistry.registerItem(mysticalhoe, "mysticalhoe");
        GameRegistry.registerItem(mysticalsword, "mysticalsword");
    }
}
