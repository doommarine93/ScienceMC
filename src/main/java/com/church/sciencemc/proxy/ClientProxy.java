package com.church.sciencemc.proxy;

import com.church.sciencemc.blocks.BlockList;
import com.church.sciencemc.renderer.ChemicalMixerItemRenderer;
import com.church.sciencemc.renderer.ChemicalMixerRenderer;
import com.church.sciencemc.renderer.FluorescentLightTubeItemRenderer;
import com.church.sciencemc.renderer.FluorescentLightTubeRenderer;
import com.church.sciencemc.renderer.IndustrialForgeItemRenderer;
import com.church.sciencemc.renderer.IndustrialForgeRenderer;
import com.church.sciencemc.renderer.MicroscopeItemRenderer;
import com.church.sciencemc.renderer.MicroscopeRenderer;
import com.church.sciencemc.renderer.SteelCrateItemRenderer;
import com.church.sciencemc.renderer.SteelCrateRenderer;
import com.church.sciencemc.renderer.TestTubeRackItemRenderer;
import com.church.sciencemc.renderer.TestTubeRackRenderer;
import com.church.sciencemc.tileentities.TileEntityChemicalMixer;
import com.church.sciencemc.tileentities.TileEntityFluorescentLightTube;
import com.church.sciencemc.tileentities.TileEntityIndustrialForge;
import com.church.sciencemc.tileentities.TileEntityMicroscope;
import com.church.sciencemc.tileentities.TileEntitySteelCrate;
import com.church.sciencemc.tileentities.TileEntityTestTubeRack;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		
		// Fluorescent Light Tube
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockList.fluorescentLightTube), new FluorescentLightTubeItemRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFluorescentLightTube.class, new FluorescentLightTubeRenderer());
		
		// Steel Crate
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockList.steelCrate), new SteelCrateItemRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySteelCrate.class, new SteelCrateRenderer());
		
		// Industrial Forge
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockList.industrialForgeOff), new IndustrialForgeItemRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIndustrialForge.class, new IndustrialForgeRenderer());
		
		// Chemical Mixer
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockList.chemicalMixer), new ChemicalMixerItemRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChemicalMixer.class, new ChemicalMixerRenderer());
		
		// Test Tube Rack
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockList.testTubeRack), new TestTubeRackItemRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTestTubeRack.class, new TestTubeRackRenderer());
		
		// Microscope
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockList.microscope), new MicroscopeItemRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMicroscope.class, new MicroscopeRenderer());
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}

}
