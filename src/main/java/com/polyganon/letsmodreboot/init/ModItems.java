package com.polyganon.letsmodreboot.init;

import com.polyganon.letsmodreboot.item.ItemLMR;
import com.polyganon.letsmodreboot.item.ItemMapleLeaf;
import com.polyganon.letsmodreboot.reference.Reference;
import com.polyganon.letsmodreboot.utility.RegHelper;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static ItemLMR mapleLeaf;

    public static void init()
    {
        mapleLeaf = new ItemMapleLeaf();
        //Item2 = new ItemItem2(); etc
    }

    public static void register()
    {
        RegHelper.register(mapleLeaf, "mapleLeaf", "mapleLeaf");

        //GameRegistry.registerItem(mapleLeaf, mapleLeaf.getUnlocalizedName().substring(mapleLeaf.getUnlocalizedName().indexOf(".")+1));
    }


    public static void registerRenders() {
        registerRender(mapleLeaf);
    }

    public static void registerRender(ItemLMR item)
    {
        ModelLoader.setCustomModelResourceLocation
                (item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(item.getUnlocalizedName().indexOf(".") + 1), "inventory"));

        /*Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register
                (item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(item.getUnlocalizedName().indexOf(".") + 1), "inventory"));
        */
    }
}
