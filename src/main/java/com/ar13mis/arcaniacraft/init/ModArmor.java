package com.ar13mis.arcaniacraft.init;

import com.ar13mis.arcaniacraft.item.armor.ItemArcaneArmor;
import com.ar13mis.arcaniacraft.item.armor.ItemMysticalArmor;
import com.ar13mis.arcaniacraft.item.armor.ItemStrangeArmor;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModArmor
{

    //Strange Armor Creation
    public static ItemStrangeArmor strangehelmet = new ItemStrangeArmor(ModArmorMaterials.strangeArmorMaterial, 0, "strangehelmet");
    public static ItemStrangeArmor strangechestplate = new ItemStrangeArmor(ModArmorMaterials.strangeArmorMaterial, 1, "strangechestplate");
    public static ItemStrangeArmor strangeleggings = new ItemStrangeArmor(ModArmorMaterials.strangeArmorMaterial, 2, "strangeleggings");
    public static ItemStrangeArmor strangeboots = new ItemStrangeArmor(ModArmorMaterials.strangeArmorMaterial, 3, "strangeboots");

    //Mystical Armor Creation
    public static ItemMysticalArmor mysticalhelmet = new ItemMysticalArmor(ModArmorMaterials.mysticalArmorMaterial, 0, "mysticalhelmet");
    public static ItemMysticalArmor mysticalchestplate = new ItemMysticalArmor(ModArmorMaterials.mysticalArmorMaterial, 1, "mysticalchestplate");
    public static ItemMysticalArmor mysticalleggings = new ItemMysticalArmor(ModArmorMaterials.mysticalArmorMaterial, 2, "mysticalleggings");
    public static ItemMysticalArmor mysticalboots = new ItemMysticalArmor(ModArmorMaterials.mysticalArmorMaterial, 3, "mysticalboots");

    //Arcane Armor Creation
    public static ItemArcaneArmor arcanehelmet = new ItemArcaneArmor(ModArmorMaterials.arcaneArmorMaterial, 0, "arcanehelmet");
    public static ItemArcaneArmor arcanechestplate = new ItemArcaneArmor(ModArmorMaterials.arcaneArmorMaterial, 1, "arcanechestplate");
    public static ItemArcaneArmor arcaneleggings = new ItemArcaneArmor(ModArmorMaterials.arcaneArmorMaterial, 2, "arcaneleggings");
    public static ItemArcaneArmor arcaneboots = new ItemArcaneArmor(ModArmorMaterials.arcaneArmorMaterial, 3, "arcaneboots");

    public static void init()
    {
        //Strange Armor Registration
        GameRegistry.registerItem(strangehelmet, "strangehelmet");
        GameRegistry.registerItem(strangechestplate, "strangechestplate");
        GameRegistry.registerItem(strangeleggings, "strangeleggings");
        GameRegistry.registerItem(strangeboots, "strangeboots");

        //Mystical Armor Registration
        GameRegistry.registerItem(mysticalhelmet, "mysticalhelmet");
        GameRegistry.registerItem(mysticalchestplate, "mysticalchestplate");
        GameRegistry.registerItem(mysticalleggings, "mysticalleggings");
        GameRegistry.registerItem(mysticalboots, "mysticalboots");

        //Arcane Armor Registration
        GameRegistry.registerItem(arcanehelmet, "arcanehelmet");
        GameRegistry.registerItem(arcanechestplate, "arcanechestplate");
        GameRegistry.registerItem(arcaneleggings, "arcaneleggings");
        GameRegistry.registerItem(arcaneboots, "arcaneboots");
    }
}
