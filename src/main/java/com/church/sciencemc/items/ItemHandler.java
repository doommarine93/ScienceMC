package com.church.sciencemc.items;

import com.church.sciencemc.ScienceMCMod;

import net.minecraft.item.Item;

public class ItemHandler extends Item {
	public String unlocName;

	protected ItemHandler(String unlocalizedName, boolean customRender){
		super();
		this.unlocName = unlocalizedName;
		setUnlocalizedName(ScienceMCMod.MODID + "_" + unlocalizedName);
		setCreativeTab(ScienceMCMod.sciencemcItemsTab);
		if (!customRender)
			setTextureName(ScienceMCMod.MODID + ":" + unlocalizedName);
	}
	
	public ItemHandler(String unlocalizedName){
		super();
		this.unlocName = unlocalizedName;
		setUnlocalizedName(ScienceMCMod.MODID + "_" + unlocalizedName);
		setCreativeTab(ScienceMCMod.sciencemcItemsTab);
		setTextureName(ScienceMCMod.MODID + ":" + unlocalizedName);
	}
}
