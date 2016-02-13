package com.ar13mis.arcaniacraft.recipes.Armor;

import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.recipes.Recipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class strangearmor extends Recipes
{
    public static void init()
    {

        //Register strange armor crafting recipes here
        //Strange Helmet Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.strangehelmet),
                "sss", "s s", "   ",
                's', new ItemStack(ModItems.strangeingot));

        //Strange Chestplate Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.strangechestplate),
                "s s", "sss", "sss",
                's', new ItemStack(ModItems.strangeingot));

        //Strange Leggings Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.strangeleggings),
                "sss", "s s", "s s",
                's', new ItemStack(ModItems.strangeingot));

        //Strange Boots Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.strangeboots),
                "   ", "s s", "s s",
                's', new ItemStack(ModItems.strangeingot));

    }
}
