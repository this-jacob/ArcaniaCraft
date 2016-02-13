package com.ar13mis.arcaniacraft.recipes.Armor;

import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.recipes.Recipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class DormantArmor extends Recipes
{
    public static void init()
    {

        //TODO: Clean up crafting letters

        //Register strange armor crafting recipes here
        //Strange Helmet Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.dormanthelmet),
                "sss", "s s", "   ",
                's', new ItemStack(ModItems.dormantshard));

        //Strange Chestplate Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.dormantchestplate),
                "s s", "sss", "sss",
                's', new ItemStack(ModItems.dormantshard));

        //Strange Leggings Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.dormantleggings),
                "sss", "s s", "s s",
                's', new ItemStack(ModItems.dormantshard));

        //Strange Boots Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.dormantboots),
                "   ", "s s", "s s",
                's', new ItemStack(ModItems.dormantshard));

    }
}
