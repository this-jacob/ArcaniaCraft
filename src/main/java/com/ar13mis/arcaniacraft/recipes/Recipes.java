package com.ar13mis.arcaniacraft.recipes;

import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.recipes.Armor.strangearmor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init()
    {

        //register armor recipes
        strangearmor.init();

        //just for testing purposes
        //will be replaced with crafting of
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.awakenedshard), new ItemStack(ModItems.dormantshard));

    }
}
