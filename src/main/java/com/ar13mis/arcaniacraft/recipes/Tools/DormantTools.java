package com.ar13mis.arcaniacraft.recipes.Tools;

import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.item.tools.dormanttools.ItemDormantTools;
import com.ar13mis.arcaniacraft.item.tools.mysticaltools.ItemMysticalTools;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DormantTools
{
    public static void init()
    {
        //Dormant pick
        GameRegistry.addShapedRecipe(new ItemStack(ItemDormantTools.dormantpick),
                "sss", " l ", " l ",
                's', new ItemStack(ModItems.dormantshard),
                'l', new ItemStack(Items.stick));

        //Dormant axe
        GameRegistry.addShapedRecipe(new ItemStack(ItemDormantTools.dormantaxe),
                "ss ", "sl ", " l ",
                's', new ItemStack(ModItems.dormantshard),
                'l', new ItemStack(Items.stick));

        //Dormant shovel
        GameRegistry.addShapedRecipe(new ItemStack(ItemDormantTools.dormantshovel),
                " s ", " l ", " l ",
                's', new ItemStack(ModItems.dormantshard),
                'l', new ItemStack(Items.stick));

        //Dormant Hoe
        GameRegistry.addShapedRecipe(new ItemStack(ItemDormantTools.dormanthoe),
                "ss ", " l ", " l ",
                's', new ItemStack(ModItems.dormantshard),
                'l', new ItemStack(Items.stick));

        //Dormant Sword
        GameRegistry.addShapedRecipe(new ItemStack(ItemDormantTools.dormantsword),
                " s ", " s ", " l ",
                's', new ItemStack(ModItems.dormantshard),
                'l', new ItemStack(Items.stick));
    }
}
