package com.ar13mis.arcaniacraft.item.armor;

import com.ar13mis.arcaniacraft.creativetab.CreativeTabArcaniaCraft;
import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAwakenedArmor extends ItemArmor
{
    public ItemAwakenedArmor(ItemArmor.ArmorMaterial localArmorMaterial, int armorType, String name)
    {

        super(localArmorMaterial, 0, armorType);

        setUnlocalizedName(Reference.MOD_ID + ":" + name);

        setTextureName(Reference.MOD_ID + ":" + name);

        setCreativeTab(CreativeTabArcaniaCraft.ARC_TAB);

    }

    //Defines the textures for the armor
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {

        if(stack.getItem() == ModArmor.awakenedhelmet || stack.getItem() == ModArmor.awakenedchestplate || stack.getItem() == ModArmor.awakenedboots)
        {

            return Reference.MOD_ID + ":models/armor/awakenedarmor1.png";

        }else if(stack.getItem() == ModArmor.awakenedleggings){

            return Reference.MOD_ID + ":models/armor/awakenedarmor2.png";

        }else{

            System.out.println("Invalid Item");
            return null;

        }
    }
}
