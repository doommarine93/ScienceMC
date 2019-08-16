package com.church.sciencemc.items;

import java.util.List;

import com.church.sciencemc.ScienceMCMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ChemicalHandler extends Item {
	public String unlocName;

	protected ChemicalHandler(String unlocalizedName, boolean customRender) {
		super();
		this.unlocName = unlocalizedName;
		setUnlocalizedName(ScienceMCMod.MODID + "_" + unlocalizedName);
		setCreativeTab(ScienceMCMod.sciencemcItemsTab);
		if (!customRender)
			setTextureName(ScienceMCMod.MODID + ":" + unlocalizedName);
	}

	public ChemicalHandler(String unlocalizedName) {
		super();
		this.unlocName = unlocalizedName;
		setUnlocalizedName(ScienceMCMod.MODID + "_chemicals_" + unlocalizedName);
		setCreativeTab(ScienceMCMod.sciencemcItemsTab);
		setTextureName(ScienceMCMod.MODID + ":" + "chemicals/" + unlocalizedName);
	}
	
	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.AQUA + "ELEMENT INFO IS WIP");
	}

}
