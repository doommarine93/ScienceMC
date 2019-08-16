package com.church.sciencemc.blocks;

import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.tileentities.TileEntityChemicalMixer;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ChemicalMixer extends BlockHandler implements ITileEntityProvider {
	
	private final String textureLocation = ScienceMCMod.MODID + ":" + "chemicalMixer";

	public ChemicalMixer(Material material, String unlocalizedName, float hardness, String harvestToolClass,
			int harvestLevel, float resistance) {
		super(material, unlocalizedName, hardness, harvestToolClass, harvestLevel, resistance);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityChemicalMixer();
	}

	// Custom Render garbage to make it a 3d model

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase,
			ItemStack par6ItemStack) {
		int l = MathHelper.floor_double((double) (par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (l == 0) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
		}

		if (l == 1) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
		}

		if (l == 2) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
		}

		if (l == 3) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
		}
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public void registerBlockIcons(IIconRegister icon) {
		this.blockIcon = icon.registerIcon(textureLocation);
	}

}
