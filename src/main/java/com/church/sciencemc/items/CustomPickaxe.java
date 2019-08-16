package com.church.sciencemc.items;

import com.church.sciencemc.ScienceMCMod;

import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe{

	public CustomPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setCreativeTab(ScienceMCMod.sciencemcItemsTab);
		this.setUnlocalizedName(ScienceMCMod.MODID + "_" + unlocalizedName);
		this.setTextureName(ScienceMCMod.MODID + ":" + unlocalizedName);
	}
	

}
