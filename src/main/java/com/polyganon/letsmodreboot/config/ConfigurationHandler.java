package com.polyganon.letsmodreboot.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        boolean configValue = false;
        try
        {
            configuration.load();

            // Read in properties from config
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the Exception
        }
        finally
        {
            configuration.save();
        }
        System.out.println(configValue);
    }
}
