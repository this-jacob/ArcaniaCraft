package com.ar13mis.arcaniacraft.recipes.Armor;

import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.recipes.Recipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ArcaneArmor extends Recipes
{
    public static void init()
    {

        //TODO: Clean up crafting letters

        //Register strange armor crafting recipes here
        //Strange Helmet Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.arcanehelmet),
                "sss", "s s", "   ",
                's', new ItemStack(ModItems.arcanegem));

        //Strange Chestplate Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.arcanechestplate),
                "s s", "sss", "sss",
                's', new ItemStack(ModItems.arcanegem));

        //Strange Leggings Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.arcaneleggings),
                "sss", "s s", "s s",
                's', new ItemStack(ModItems.arcanegem));

        //Strange Boots Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.arcaneboots),
                "   ", "s s", "s s",
                's', new ItemStack(ModItems.arcanegem));

    }
}
