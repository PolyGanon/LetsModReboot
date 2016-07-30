package com.polyganon.letsmodreboot;

import com.polyganon.letsmodreboot.config.ConfigurationHandler;
import com.polyganon.letsmodreboot.proxy.IProxy;
import com.polyganon.letsmodreboot.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME , version= Reference.VERSION)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) // Network handling, Mod configuration, Initialise items and Blocks
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) // Register GUIs, Tile Entities, Crafting Recipes, further event handlers
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) // Wrapup anything for after other mods have initialised.
    {

    }
}
