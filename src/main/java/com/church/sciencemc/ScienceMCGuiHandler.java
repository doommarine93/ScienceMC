package com.church.sciencemc;

import com.church.sciencemc.container.ContainerTileEntityIndustrialForge;
import com.church.sciencemc.container.ContainerTileEntityMicroscope;
import com.church.sciencemc.container.ContainerTileEntitySteelCrate;
import com.church.sciencemc.container.ContainerTileEntityTestTubeRack;
import com.church.sciencemc.gui.GuiTileEntityIndustrialForge;
import com.church.sciencemc.gui.GuiTileEntityMicroscope;
import com.church.sciencemc.gui.GuiTileEntitySteelCrate;
import com.church.sciencemc.gui.GuiTileEntityTestTubeRack;
import com.church.sciencemc.tileentities.TileEntityIndustrialForge;
import com.church.sciencemc.tileentities.TileEntityMicroscope;
import com.church.sciencemc.tileentities.TileEntitySteelCrate;
import com.church.sciencemc.tileentities.TileEntityTestTubeRack;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ScienceMCGuiHandler implements IGuiHandler {

	public static final int TILE_ENTITY_GUI_INDUSTRIALFORGE = 0;
	public static final int TILE_ENTITY_GUI_STEELCRATE = 1;
	public static final int TILE_ENTITY_GUI_TESTTUBERACK = 2;
	public static final int TILE_ENTITY_GUI_MICROSCOPE = 3;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	    if (ID == TILE_ENTITY_GUI_INDUSTRIALFORGE)
	        return new ContainerTileEntityIndustrialForge(player.inventory, (TileEntityIndustrialForge) world.getTileEntity(x, y, z));
	    if (ID == TILE_ENTITY_GUI_STEELCRATE)
	        return new ContainerTileEntitySteelCrate(player.inventory, (TileEntitySteelCrate) world.getTileEntity(x, y, z));
	    if (ID == TILE_ENTITY_GUI_TESTTUBERACK)
	    	return new ContainerTileEntityTestTubeRack(player.inventory, (TileEntityTestTubeRack) world.getTileEntity(x, y, z));
	    if (ID == TILE_ENTITY_GUI_MICROSCOPE)
	    	return new ContainerTileEntityMicroscope(player.inventory, (TileEntityMicroscope) world.getTileEntity(x, y, z));

	    return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
	    if (ID == TILE_ENTITY_GUI_INDUSTRIALFORGE){
	    	System.out.println("Tile entity located at " + x + ", " + y + ", " + z);
	        return new GuiTileEntityIndustrialForge(player.inventory, (TileEntityIndustrialForge) world.getTileEntity(x, y, z));
	    }
	    if (ID == TILE_ENTITY_GUI_STEELCRATE){
	    	System.out.println("Tile entity located at " + x + ", " + y + ", " + z);
	        return new GuiTileEntitySteelCrate(player.inventory, (TileEntitySteelCrate) world.getTileEntity(x, y, z));
	    }
	    if (ID == TILE_ENTITY_GUI_TESTTUBERACK){
	    	System.out.println("Tile entity located at " + x + ", " + y + ", " + z);
	        return new GuiTileEntityTestTubeRack(player.inventory, (TileEntityTestTubeRack) world.getTileEntity(x, y, z));
	    }
	    if (ID == TILE_ENTITY_GUI_MICROSCOPE){
	    	System.out.println("Tile entity located at " + x + ", " + y + ", " + z);
	        return new GuiTileEntityMicroscope(player.inventory, (TileEntityMicroscope) world.getTileEntity(x, y, z));
	    }

	    return null;
	}
}