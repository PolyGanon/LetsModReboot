package com.polyganon.letsmodreboot.proxy;

import com.polyganon.letsmodreboot.init.ModItems;
import com.polyganon.letsmodreboot.item.ItemLMR;


public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ModItems.registerRenders();
    }

}
