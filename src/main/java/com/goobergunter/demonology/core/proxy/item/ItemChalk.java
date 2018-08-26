package com.goobergunter.demonology.core.proxy.item;

import com.goobergunter.demonology.resources.DemoReferences;

import net.minecraft.item.Item;
import net.minecraft.item.ItemColored;

public class ItemChalk extends Item{
	
	public ItemChalk(String name){
		super();
		this.setRegistryName(name);
		this.setUnlocalizedName(DemoReferences.MODID+"."+name);
	}
	
	
}
