package com.polyganon.letsmodreboot.client.gui;

import com.polyganon.letsmodreboot.handler.ConfigurationHandler;
import com.polyganon.letsmodreboot.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class LMRGuiConfig extends GuiConfig
{
    public LMRGuiConfig (GuiScreen guiScreen)
    {
        super (guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                        Reference.MOD_ID,
                        false,
                        false,
                        GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
