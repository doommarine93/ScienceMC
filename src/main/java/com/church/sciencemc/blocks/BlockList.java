package com.church.sciencemc.blocks;

import java.util.Arrays;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.oredict.OreDictionary;

public class BlockList {
	public static BlockHandler 
	//THIS LIST IS NOT THE SORT ORDER IN GAME. THE SORT ORDER IN-GAME IS BY THE INIT() METHOD
	aluminiumBlock,
	aluminiumOre,
	copperBlock,
	copperOre,
	steelBlock,
	tinOre,
	tinBlock,
	silverOre,
	silverBlock,
	bronzeBlock,
	tungstenBlock,
	tungstenOre,
	leadBlock,
	leadOre,
	machineBase,
	fluorescentLightTube,
	largeFluorescentLight,
	concreteBlock,
	reinforcedConcreteBlock,

	chemicalMixer,
	microscope,
	industrialForgeOn,
	industrialForgeOff,
	steelCrate,
	testTubeRack;

	private static Class<? extends ItemBlock> imbh = ItemMetaBlockHandler.class;

	public static void init() {

		/**
		 * Block Format:
		 * 
		 * nameOfBlock = new BlockHandler(Material.yourChoice, "nameofBlock", hardness, "toolType", harvestLevel, resistance);
		 * register(nameOfBlock, "ore/blockName");
		 * 
		 * 
		 * Harvest Levels: 
		 * 0 = Wood or Gold 
		 * 1 = Stone 
		 * 2 = Iron 
		 * 3 = Diamond
		 * 
		 * Resistance Examples:
		 * Stone: 30
		 * Iron Ore: 15
		 * Iron Block: 30
		 * Chest: 12.5
		 * Dirt: 2.5
		 * Obsidian: 6000
		 * 
		 * Hardness Examples:
		 * Stone: 1.5
		 * Iron Ore: 3
		 * Iron Block: 5
		 * Chest: 2.5
		 * Dirt: 0.5
		 * Obsidian: 50
		 * 
		 */

		// Ores
		aluminiumOre = new BlockHandler(Material.rock, "aluminiumOre", 2, "pickaxe", 1, 10);
		register(aluminiumOre, "oreAluminium");

		copperOre = new BlockHandler(Material.rock, "copperOre", 2, "pickaxe", 1, 15);
		register(copperOre, "oreCopper");
		
		tinOre = new BlockHandler(Material.rock, "tinOre", 2, "pickaxe", 1, 10);
		register(tinOre, "oreTin");
		
		silverOre = new BlockHandler(Material.rock, "silverOre", 3, "pickaxe", 2, 25);
		register(silverOre, "oreSilver");
		
		tungstenOre = new BlockHandler(Material.rock, "tungstenOre", 2, "pickaxe", 2, 15);
		register(tungstenOre, "oreTungsten");
		
		leadOre = new BlockHandler(Material.rock, "leadOre", 4, "pickaxe", 2, 20);
		register(leadOre, "oreLead");

		// Blocks
		aluminiumBlock = new BlockHandler(Material.iron, "aluminiumBlock", 4, "pickaxe", 1, 30);
		register(aluminiumBlock, "blockAluminium");

		copperBlock = new BlockHandler(Material.iron, "copperBlock", 4, "pickaxe", 1, 35);
		register(copperBlock, "blockCopper");

		steelBlock = new BlockHandler(Material.iron, "steelBlock", 7, "pickaxe", 2, 50);
		register(steelBlock, "blockSteel");
		
		tinBlock = new BlockHandler(Material.iron, "tinBlock", 4, "pickaxe", 1, 30);
		register(tinBlock, "blockTin");
		
		silverBlock = new BlockHandler(Material.iron, "silverBlock", 5, "pickaxe", 2, 35);
		register(silverBlock, "blockSilver");
		
		bronzeBlock = new BlockHandler(Material.iron, "bronzeBlock", 6, "pickaxe", 2, 35);
		register(bronzeBlock, "blockBronze");
		
		tungstenBlock = new BlockHandler(Material.iron, "tungstenBlock", 5, "pickaxe", 2, 35);
		register(tungstenBlock, "blockTungsten");
		
		leadBlock = new BlockHandler(Material.iron, "leadBlock", 5, "pickaxe", 2, 35);
		register(leadBlock, "blockLead");
		
		machineBase = new BlockHandler(Material.anvil, "machineBase", 3, "pickaxe", 2, 20);
		register(machineBase, "machineBase");
		
		concreteBlock = new BlockHandler(Material.rock, "concreteBlock", 15, "pickaxe", 2, 80);
		register(concreteBlock, "concreteBlock");
		
		reinforcedConcreteBlock = new BlockHandler(Material.rock, "reinforcedConcreteBlock", 30, "pickaxe", 2, 200);
		register(reinforcedConcreteBlock, "reinforcedConcreteBlock");
		
		
		// Tile Entities and Special Blocks		
		largeFluorescentLight = new LargeFluorescentLight(Material.glass, "largeFluorescentLight", 0, "pickaxe", 0, 0.5F);
		register(largeFluorescentLight, "largeFluorescentLight");
		
		fluorescentLightTube = new FluorescentLightTube(Material.glass, "fluorescentLightTube", 0, "pickaxe", 0, 0);
		register(fluorescentLightTube);
		
		industrialForgeOn = new IndustrialForge(Material.iron, "industrialForgeOn", 3, "pickaxe", 2, 25, true);
		register(industrialForgeOn);
		
		industrialForgeOff = new IndustrialForge(Material.iron, "industrialForgeOff", 3, "pickaxe", 2, 25, false);
		register(industrialForgeOff);
		
		steelCrate = new SteelCrate(Material.iron, "steelCrate", 2, "pickaxe", 2, 25);
		register(steelCrate);
		
		testTubeRack = new TestTubeRack(Material.wood, "testTubeRack", 1, "pickaxe", 0, 10);
		register(testTubeRack);
		
		chemicalMixer = new ChemicalMixer(Material.iron, "chemicalMixer", 2, "pickaxe", 0, 25);
		register(chemicalMixer);
		
		microscope = new Microscope(Material.iron, "microscope", 0.5F, "pickaxe", 0, 10);
		register(microscope);

	}


	private static void register(BlockHandler block) {
		GameRegistry.registerBlock(block, block.unlocName);
	}

	private static void register(BlockHandler block, Class<? extends ItemBlock> itemBlock) {
		GameRegistry.registerBlock(block, itemBlock, block.unlocName);
	}

	private static void register(BlockHandler block, String oreDictName) {
		register(block);
		OreDictionary.registerOre(oreDictName, block);
	}
}
