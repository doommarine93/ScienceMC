package com.church.sciencemc.blocks;

import com.church.sciencemc.ScienceMCMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockHandler extends Block{
	
	public String unlocName;
	
	protected BlockHandler(Material material, String unlocalizedName, float hardness,
			String harvestToolClass, int harvestLevel, float resistance, boolean customRender) {
		super(material);
		init(unlocalizedName, hardness, harvestToolClass, harvestLevel, resistance, customRender);
	}
	
	public BlockHandler(Material material, String unlocalizedName, float hardness,
			String harvestToolClass, int harvestLevel, float resistance) {
		super(material);
		init(unlocalizedName, hardness, harvestToolClass, harvestLevel, resistance, false);
	}
	
	private void init(String unlocalizedName, float hardness,
			String harvestToolClass, int harvestLevel, float resistance, boolean customRender){
		this.unlocName = unlocalizedName;
		setBlockName(ScienceMCMod.MODID + "_" + unlocalizedName);
		setCreativeTab(ScienceMCMod.sciencemcBlocksTab);
		if (!customRender)
			setBlockTextureName(ScienceMCMod.MODID + ":" + unlocalizedName);
		setHardness(hardness);
		setHarvestLevel(harvestToolClass, harvestLevel);
		setResistance(resistance);
	}
}
