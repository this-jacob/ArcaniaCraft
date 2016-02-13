package com.ar13mis.arcaniacraft;

import com.ar13mis.arcaniacraft.configuration.ConfigurationHandler;
import com.ar13mis.arcaniacraft.init.ModArmor;
import com.ar13mis.arcaniacraft.init.ModBlocks;
import com.ar13mis.arcaniacraft.init.ModItems;
import com.ar13mis.arcaniacraft.recipes.Recipes;
import com.ar13mis.arcaniacraft.proxy.IProxy;
import com.ar13mis.arcaniacraft.reference.Reference;
import com.ar13mis.arcaniacraft.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class arcaniacraft
{

    @Mod.Instance(Reference.MOD_ID)
    public static arcaniacraft instance;

    @SidedProxy(clientSide = Reference.MOD_CLIENT_PROXY, serverSide = Reference.MOD_SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("ArcaniaCraft Pre Initialization Complete.");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("ArcaniaCraft Initialization Complete.");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("ArcaniaCraft Post Initialization Complete.");
    }
}
