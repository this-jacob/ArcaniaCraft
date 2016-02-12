package com.ar13mis.arcaniacraft.item.armor;

import com.ar13mis.arcaniacraft.creativetab.CreativeTabArcaniaCraft;
import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemStrangeArmor extends ItemArmor {
    public ItemStrangeArmor(ArmorMaterial strangeArmorMaterial, int armorType, String name)
    {

        super(strangeArmorMaterial, 0, armorType);

        setUnlocalizedName(Reference.MOD_ID + ":" + name);

        setTextureName(Reference.MOD_ID + ":" + name);

        setCreativeTab(CreativeTabArcaniaCraft.ARC_TAB);

    }

    //Defines the textures for the armor
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {

        if(stack.getItem() == ModArmor.strangehelmet || stack.getItem() == ModArmor.strangechestplate || stack.getItem() == ModArmor.strangeboots)
        {

            return Reference.MOD_ID + ":models/armor/strangearmor1.png";

        }else if(stack.getItem() == ModArmor.strangeleggings){

            return Reference.MOD_ID + ":models/armor/strangearmor2.png";

        }else{

            System.out.println("Invalid Item");
            return null;

        }
    }
}
