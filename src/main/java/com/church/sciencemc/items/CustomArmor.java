package com.church.sciencemc.items;

import com.church.sciencemc.ScienceMCMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class CustomArmor extends ItemArmor {

	public String textureName;

	public CustomArmor(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    super(material, 0, type);
	    this.textureName = textureName;
	    this.setUnlocalizedName(ScienceMCMod.MODID + "_" + unlocalizedName);
	    this.setCreativeTab(ScienceMCMod.sciencemcItemsTab);
	    this.setTextureName(ScienceMCMod.MODID + ":" + unlocalizedName);
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return ScienceMCMod.MODID + ":textures/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
}