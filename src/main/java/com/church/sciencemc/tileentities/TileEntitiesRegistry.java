package com.church.sciencemc.tileentities;

import com.church.sciencemc.ScienceMCMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.tileentity.TileEntity;

public class TileEntitiesRegistry {

	public static void init() {

		// Core Function
		register(TileEntityIndustrialForge.class, "tileEntityIndustrialForge");
		register(TileEntitySteelCrate.class, "tileEntitySteelCrate");
		register(TileEntityFluorescentLightTube.class, "tileEntityFluorescentLightTube");

		// Chemistry
		register(TileEntityChemicalMixer.class, "tileEntityChemicalMixer");
		register(TileEntityTestTubeRack.class, "tileEntityTestTubeRack");
		register(TileEntityMicroscope.class, "tileEntityMicroscope");

	}

	private static void register(Class<? extends TileEntity> tileEntityClass, String id) {
		GameRegistry.registerTileEntity(tileEntityClass, ScienceMCMod.MODID + "_" + id);
	}

}
