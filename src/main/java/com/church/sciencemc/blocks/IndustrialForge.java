package com.church.sciencemc.blocks;

import java.util.Random;

import com.church.sciencemc.ScienceMCGuiHandler;
import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.renderer.IndustrialForgeRenderer;
import com.church.sciencemc.tileentities.TileEntityIndustrialForge;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class IndustrialForge extends BlockHandler implements ITileEntityProvider {

	private final String textureLocation = ScienceMCMod.MODID + ":" + "industrialForge";

	public final boolean isActive;
	private IndustrialForgeRenderer renderer;
	private static IndustrialForge block;

	@SideOnly(Side.CLIENT)
	private IIcon iconFront;

	private static boolean keepInventory;

	public IndustrialForge(Material material, String unlocalizedName, float hardness, String harvestToolClass,
			int harvestLevel, float resistance, boolean isActive) {
		super(material, unlocalizedName, hardness, harvestToolClass, harvestLevel, resistance);
		isBlockContainer = true;
		this.isActive = isActive;
		if (isActive == true) {
			this.setLightLevel(40F);
			setCreativeTab(null);
		}
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityIndustrialForge();
	}

	public static void updateIndustrialForgeBlockState(boolean active, World worldObj, int xCoord, int yCoord,
			int zCoord) {

		int i = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
		TileEntity tileentity = worldObj.getTileEntity(xCoord, yCoord, zCoord);

		keepInventory = true;

		if (active) {
			worldObj.setBlock(xCoord, yCoord, zCoord, BlockList.industrialForgeOn);
		} else {
			worldObj.setBlock(xCoord, yCoord, zCoord, BlockList.industrialForgeOff);
		}

		keepInventory = false;

		worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, i, 2);

		if (tileentity != null) {
			tileentity.validate();
			worldObj.setTileEntity(xCoord, yCoord, zCoord, tileentity);
		}

	}

	@Override
	public void breakBlock(World world, int x, int y, int z, Block oldblock, int oldMetadata) {
		Random rand = new Random();
		TileEntityIndustrialForge tileentity = (TileEntityIndustrialForge) world.getTileEntity(x, y, z);

		if (tileentity != null && !keepInventory) {
			for (int i = 0; i < tileentity.getSizeInventory(); i++) {
				ItemStack itemstack = tileentity.getStackInSlot(i);

				if (itemstack != null) {
					float f = rand.nextFloat() * 0.8F + 0.1F;
					float f1 = rand.nextFloat() * 0.8F + 0.1F;
					float f2 = rand.nextFloat() * 0.8F + 0.1F;

					while (itemstack.stackSize > 0) {
						int j = rand.nextInt(21) + 10;

						if (j > itemstack.stackSize) {
							j = itemstack.stackSize;
						}

						itemstack.stackSize -= j;

						EntityItem item = new EntityItem(world, (double) ((float) x + f), (double) ((float) y + f1),
								(double) ((float) z + f2),
								new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));

						if (itemstack.hasTagCompound()) {
							item.getEntityItem().setTagCompound((NBTTagCompound) itemstack.getTagCompound().copy());
						}

						world.spawnEntityInWorld(item);
					}
				}
			}

			world.func_147453_f(x, y, z, oldblock);
		}

		super.breakBlock(world, x, y, z, oldblock, oldMetadata);
	}

	@Override
	public boolean onBlockEventReceived(World world, int x, int y, int z, int p_149696_5_, int p_149696_6_) {
		super.onBlockEventReceived(world, x, y, x, p_149696_5_, p_149696_6_);
		TileEntity tileentity = world.getTileEntity(x, y, z);
		return tileentity != null ? tileentity.receiveClientEvent(p_149696_5_, p_149696_6_) : false;
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float dX, float dY,
			float dZ) {
		if (!world.isRemote) {
			player.openGui(ScienceMCMod.instance, ScienceMCGuiHandler.TILE_ENTITY_GUI_INDUSTRIALFORGE, world, x, y, z);
		}
		return true;
	}

	// Spawn particles when cooking
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
		if (this.isActive) {
			int direction = world.getBlockMetadata(x, y, z);

			float x1 = (float) x + 0.5F;
			float y1 = (float) y + 0.6F;
			float z1 = (float) z + 0.5F;

			float f = 0.52F;
			float f1 = random.nextFloat() * 0.6F - 0.3F;

			// facing west
			if (direction == 4) {
				world.spawnParticle("smoke", (double) (x1 - f + 0.2F), (double) (y1), (double) (z1 + f1), 0D, 0D, 0D);
				world.spawnParticle("flame", (double) (x1 - f + 0.2F), (double) (y1), (double) (z1 + f1), 0D, 0D, 0D);
			}

			// facing east
			if (direction == 2) {
				world.spawnParticle("smoke", (double) (x1 + f - 0.2F), (double) (y1), (double) (z1 + f1), 0D, 0D, 0D);
				world.spawnParticle("flame", (double) (x1 + f - 0.2F), (double) (y1), (double) (z1 + f1), 0D, 0D, 0D);
			}

			// facing north
			if (direction == 5) {
				world.spawnParticle("smoke", (double) (x1 + f1), (double) (y1), (double) (z1 - f + 0.2F), 0D, 0D, 0D);
				world.spawnParticle("flame", (double) (x1 + f1), (double) (y1), (double) (z1 - f + 0.2F), 0D, 0D, 0D);
			}

			// facing south
			if (direction == 3) {
				world.spawnParticle("smoke", (double) (x1 + f1), (double) (y1), (double) (z1 + f - 0.2F), 0D, 0D, 0D);
				world.spawnParticle("flame", (double) (x1 + f1), (double) (y1), (double) (z1 + f - 0.2F), 0D, 0D, 0D);
			}
		}
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

	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		return Item.getItemFromBlock(BlockList.industrialForgeOff);
	}

}
