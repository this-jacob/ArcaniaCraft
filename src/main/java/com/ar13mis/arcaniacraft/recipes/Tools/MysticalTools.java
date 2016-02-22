package com.ar13mis.arcaniacraft.recipes.Tools;

import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.item.tools.mysticaltools.ItemMysticalTools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MysticalTools
{
    public static void init()
    {
        //Mystical pick
        GameRegistry.addShapedRecipe(new ItemStack(ItemMysticalTools.mysticalpick),
                "sss", " l ", " l ",
                's', new ItemStack(ModItems.mysticalingot),
                'l', new ItemStack(Items.stick));

        //Mystical axe
        GameRegistry.addShapedRecipe(new ItemStack(ItemMysticalTools.mysticalaxe),
                "ss ", "sl ", " l ",
                's', new ItemStack(ModItems.mysticalingot),
                'l', new ItemStack(Items.stick));

        //Mystical shovel
        GameRegistry.addShapedRecipe(new ItemStack(ItemMysticalTools.mysticalshovel),
                " s ", " l ", " l ",
                's', new ItemStack(ModItems.mysticalingot),
                'l', new ItemStack(Items.stick));

        //Mystical Hoe
        GameRegistry.addShapedRecipe(new ItemStack(ItemMysticalTools.mysticalhoe),
                "ss ", " l ", " l ",
                's', new ItemStack(ModItems.mysticalingot),
                'l', new ItemStack(Items.stick));

        //Mystical Sword
        GameRegistry.addShapedRecipe(new ItemStack(ItemMysticalTools.mysticalsword),
                " s ", " s ", " l ",
                's', new ItemStack(ModItems.mysticalingot),
                'l', new ItemStack(Items.stick));
    }
}
