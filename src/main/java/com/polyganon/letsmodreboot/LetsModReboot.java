package com.polyganon.letsmodreboot;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsModReboot" , name="Lets Mod Reboot" , version="1.10.2-1.0")
public class LetsModReboot {

    @Mod.Instance("LetsModReboot")
    public static LetsModReboot instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Network handling, Mod configuration, Initialise items and Blocks
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Register GUIs, Tile Entities, Crafting Recipes, further event handlers
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrapup anything for after other mods have initialised.
    }
}
