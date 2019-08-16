package com.church.sciencemc.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class LargeFluorescentLight extends BlockHandler implements ITileEntityProvider {

	public LargeFluorescentLight(Material material, String unlocalizedName, float hardness, String harvestToolClass,
			int harvestLevel, float resistance) {
		super(material, unlocalizedName, hardness, harvestToolClass, harvestLevel, resistance);
		this.setLightLevel(50F);
	}

	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return null;
	}

    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }

}
