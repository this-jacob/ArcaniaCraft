package com.ar13mis.arcaniacraft.init;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmorMaterials
{

    public static ArmorMaterial strangeArmorMaterial = EnumHelper.addArmorMaterial("strangeArmorMaterial", 20, new int[] {3, 7, 6, 3}, 10);
    public static ArmorMaterial mysticalArmorMaterial = EnumHelper.addArmorMaterial("mysticalArmorMaterial", 22, new int[] {3, 7, 6, 3}, 15);
    public static ArmorMaterial arcaneArmorMaterial = EnumHelper.addArmorMaterial("arcaneArmorMaterial", 24, new int[] {3, 7, 6, 3}, 20);
    public static ArmorMaterial dormantArmorMaterial = EnumHelper.addArmorMaterial("dormantArmorMaterial", 26, new int[] {3, 7, 6, 3}, 25);
    public static ArmorMaterial awakenedArmorMaterial = EnumHelper.addArmorMaterial("awakenedArmorMaterial", 30, new int[] {6, 9, 8, 6}, 30);

}
