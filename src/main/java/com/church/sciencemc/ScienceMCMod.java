package com.church.sciencemc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.church.sciencemc.blocks.BlockList;
import com.church.sciencemc.effects.StatusEffectsList;
import com.church.sciencemc.events.EventRegister;
import com.church.sciencemc.items.ArmorList;
import com.church.sciencemc.items.ChemicalList;
import com.church.sciencemc.items.ItemList;
import com.church.sciencemc.items.ToolList;
import com.church.sciencemc.proxy.CommonProxy;
import com.church.sciencemc.tileentities.TileEntitiesRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = ScienceMCMod.MODID, name = ScienceMCMod.MODNAME, version = ScienceMCMod.VERSION)
public class ScienceMCMod {

	@SidedProxy(clientSide = "com.church.sciencemc.proxy.ClientProxy", serverSide = "com.church.sciencemc.proxy.ServerProxy")
	public static CommonProxy proxy;

	// Mod Info
	public static final String MODID = "sciencemc";
	public static final String MODNAME = "Science MC";
	public static final String VERSION = "1.0.0 Alpha";

	@Instance
	public static ScienceMCMod instance = new ScienceMCMod();

	//Blocks Tab
	public static CreativeTabs sciencemcBlocksTab = new CreativeTabs("sciencemcBlocksTab") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(BlockList.chemicalMixer);
		}
	};
	//Items Tab
	public static CreativeTabs sciencemcItemsTab = new CreativeTabs("sciencemcItemsTab") {
		public Item getTabIconItem() {
			return ItemList.copperWireSpool;
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		BlockList.init();
		ItemList.init();
		ToolList.init();
		ArmorList.init();
		StatusEffectsList.init();
		EventRegister.init();
		ChemicalList.init();
		RecipeManager.init();
		TileEntitiesRegistry.init();
		GameRegistry.registerWorldGenerator(new OreGenerator(), 2);

	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}