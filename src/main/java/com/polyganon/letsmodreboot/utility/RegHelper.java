package com.polyganon.letsmodreboot.utility;

import com.polyganon.letsmodreboot.item.ItemLMR;
import com.polyganon.letsmodreboot.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/* Thanks to Sky_01 from the Curse Minecraft Forums for
 * this Helper class for registering Items and Blocks. */

public class RegHelper {
    public static void register(ItemLMR item, String name, String unlocal)
    {
        item.setUnlocalizedName(unlocal).setRegistryName(Reference.MOD_ID, name);
        GameRegistry.register(item);
    }

    public static void register(Block block, ItemBlock ib, String name, String unlocal)
    {
        block.setUnlocalizedName(unlocal).setRegistryName(Reference.MOD_ID, name);
        ib.setUnlocalizedName(unlocal).setRegistryName(Reference.MOD_ID, name);
        GameRegistry.register(block);
        GameRegistry.register(ib);
    }
}
