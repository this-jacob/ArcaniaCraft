package com.ar13mis.arcaniacraft.recipes.Tools;

import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.item.tools.strangetools.ItemStrangeTools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class StrangeTools
{
    public static void init()
    {
        //Strange pick
        GameRegistry.addShapedRecipe(new ItemStack(ItemStrangeTools.strangepick),
                "sss", " l ", " l ",
                's', new ItemStack(ModItems.strangeingot),
                'l', new ItemStack(Items.stick));

        //Strange axe
        GameRegistry.addShapedRecipe(new ItemStack(ItemStrangeTools.strangeaxe),
                "ss ", "sl ", " l ",
                's', new ItemStack(ModItems.strangeingot),
                'l', new ItemStack(Items.stick));

        //Strange shovel
        GameRegistry.addShapedRecipe(new ItemStack(ItemStrangeTools.strangeshovel),
                " s ", " l ", " l ",
                's', new ItemStack(ModItems.strangeingot),
                'l', new ItemStack(Items.stick));

        //Strange Hoe
        GameRegistry.addShapedRecipe(new ItemStack(ItemStrangeTools.strangehoe),
                "ss ", " l ", " l ",
                's', new ItemStack(ModItems.strangeingot),
                'l', new ItemStack(Items.stick));

        //Strange Sword
        GameRegistry.addShapedRecipe(new ItemStack(ItemStrangeTools.strangesword),
                " s ", " s ", " l ",
                's', new ItemStack(ModItems.strangeingot),
                'l', new ItemStack(Items.stick));
    }
}
