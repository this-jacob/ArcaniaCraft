package com.ar13mis.arcaniacraft.recipes.Armor;

import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.recipes.Recipes;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class MysticalArmor extends Recipes
{
    public static void init()
    {

        //TODO: Clean up crafting letters

        //Register strange armor crafting recipes here
        //Strange Helmet Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mysticalhelmet),
                "sss", "s s", "   ",
                's', new ItemStack(ModItems.mysticalingot));

        //Strange Chestplate Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mysticalchestplate),
                "s s", "sss", "sss",
                's', new ItemStack(ModItems.mysticalingot));

        //Strange Leggings Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mysticalleggings),
                "sss", "s s", "s s",
                's', new ItemStack(ModItems.mysticalingot));

        //Strange Boots Recipe
        GameRegistry.addShapedRecipe(new ItemStack(ModArmor.mysticalboots),
                "   ", "s s", "s s",
                's', new ItemStack(ModItems.mysticalingot));

    }
}
