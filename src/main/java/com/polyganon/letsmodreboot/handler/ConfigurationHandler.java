package com.polyganon.letsmodreboot.handler;

import com.polyganon.letsmodreboot.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }

    }

    public void loadConfiguration()
    {
        testValue = configuration.getBoolean("ConfigValue", Configuration.CATEGORY_GENERAL, false, "An Example Value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }





}
