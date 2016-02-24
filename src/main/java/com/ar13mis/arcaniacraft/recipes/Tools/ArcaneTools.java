package com.ar13mis.arcaniacraft.recipes.Tools;

import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.item.tools.arcanetools.ItemArcaneAxe;
import com.ar13mis.arcaniacraft.item.tools.arcanetools.ItemArcaneTools;
import com.ar13mis.arcaniacraft.item.tools.mysticaltools.ItemMysticalTools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ArcaneTools
{
    public static void init()
    {
        //Arcane pick
        GameRegistry.addShapedRecipe(new ItemStack(ItemArcaneTools.arcanepick),
                "sss", " l ", " l ",
                's', new ItemStack(ModItems.arcanegem),
                'l', new ItemStack(Items.stick));

        //Arcane axe
        GameRegistry.addShapedRecipe(new ItemStack(ItemArcaneTools.arcaneaxe),
                "ss ", "sl ", " l ",
                's', new ItemStack(ModItems.arcanegem),
                'l', new ItemStack(Items.stick));

        //Arcane shovel
        GameRegistry.addShapedRecipe(new ItemStack(ItemArcaneTools.arcaneshovel),
                " s ", " l ", " l ",
                's', new ItemStack(ModItems.arcanegem),
                'l', new ItemStack(Items.stick));

        //Arcane Hoe
        GameRegistry.addShapedRecipe(new ItemStack(ItemArcaneTools.arcanehoe),
                "ss ", " l ", " l ",
                's', new ItemStack(ModItems.arcanegem),
                'l', new ItemStack(Items.stick));

        //Arcane Sword
        GameRegistry.addShapedRecipe(new ItemStack(ItemArcaneTools.arcanesword),
                " s ", " s ", " l ",
                's', new ItemStack(ModItems.arcanegem),
                'l', new ItemStack(Items.stick));
    }
}
