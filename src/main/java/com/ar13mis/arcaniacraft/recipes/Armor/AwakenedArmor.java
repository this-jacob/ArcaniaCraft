package com.ar13mis.arcaniacraft.recipes.Armor;

import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.recipes.Recipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class AwakenedArmor extends Recipes
{
    public static void init()
    {

        //TODO: Clean up crafting letters
        //TODO: Create new implementation for awakened armor

        //Register strange armor crafting recipes here
        //Strange Helmet Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.awakenedhelmet),
                "sss", "s s", "   ",
                's', new ItemStack(ModItems.awakenedshard));

        //Strange Chestplate Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.awakenedchestplate),
                "s s", "sss", "sss",
                's', new ItemStack(ModItems.awakenedshard));

        //Strange Leggings Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.awakenedleggings),
                "sss", "s s", "s s",
                's', new ItemStack(ModItems.awakenedshard));

        //Strange Boots Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.awakenedboots),
                "   ", "s s", "s s",
                's', new ItemStack(ModItems.awakenedshard));

    }
}
