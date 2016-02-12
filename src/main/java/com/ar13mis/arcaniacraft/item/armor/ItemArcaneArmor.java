package com.ar13mis.arcaniacraft.item.armor;

import com.ar13mis.arcaniacraft.creativetab.CreativeTabArcaniaCraft;
import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArcaneArmor extends ItemArmor
{
    public ItemArcaneArmor(ItemArmor.ArmorMaterial localArmorMaterial, int armorType, String name)
    {

        super(localArmorMaterial, 0, armorType);

        setUnlocalizedName(Reference.MOD_ID + ":" + name);

        setTextureName(Reference.MOD_ID + ":" + name);

        setCreativeTab(CreativeTabArcaniaCraft.ARC_TAB);

    }

    //Defines the textures for the armor
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {

        if(stack.getItem() == ModArmor.arcanehelmet || stack.getItem() == ModArmor.arcanechestplate || stack.getItem() == ModArmor.arcaneboots)
        {

            return Reference.MOD_ID + ":models/armor/arcanearmor1.png";

        }else if(stack.getItem() == ModArmor.arcaneleggings){

            return Reference.MOD_ID + ":models/armor/arcanearmor2.png";

        }else{

            System.out.println("Invalid Item");
            return null;

        }
    }
}
