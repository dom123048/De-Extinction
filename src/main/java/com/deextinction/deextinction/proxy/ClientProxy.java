package com.deextinction.deextinction.proxy;

import com.deextinction.deextinction.client.Deextinction;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
public void registerItemRenderer(Item item, int meta, String id)
{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
	
	}

@Override
public void registerVariantRenderer(Item item, int meta, String filename, String id)
{
	ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Deextinction.MODID, filename), id));
}


}
