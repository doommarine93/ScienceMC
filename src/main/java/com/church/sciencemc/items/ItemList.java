package com.church.sciencemc.items;

import java.util.Arrays;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.oredict.OreDictionary;

public class ItemList {
	
	public static ItemHandler 
	//THIS LIST IS NOT THE SORT ORDER IN GAME. THE SORT ORDER IN-GAME IS BY THE INIT() METHOD
		// Ingots
		copperIngot,
		tinIngot,
		tungstenIngot,
		aluminiumIngot,
		bronzeIngot,
		steelIngot,
		silverIngot,
		leadIngot,
	
		// Wires (non-insulated)
		copperWire, 
		tinWire,
		tungstenWire, 
		goldWire, 
		aluminiumWire, 
		bronzeWire, 
		
		// Spools (non-insulated)
		copperWireSpool, 
		tinWireSpool, 
		tungstenWireSpool,
		goldWireSpool,
		aluminiumWireSpool, 
		bronzeWireSpool,
		
		// Wires (insulated)
		insulatedCopperWire, 
		insulatedTinWire,
		insulatedTungstenWire, 
		insulatedGoldWire, 
		insulatedAluminiumWire, 
		insulatedBronzeWire, 
		
		// Spools (insulated)
		insulatedCopperWireSpool, 
		insulatedTinWireSpool, 
		insulatedTungstenWireSpool,
		insulatedGoldWireSpool,
		insulatedAluminiumWireSpool, 
		insulatedBronzeWireSpool,
		
		// Plates
		copperPlate,
		tinPlate,
		tungstenPlate,
		goldPlate,
		aluminiumPlate,
		bronzePlate,
		leadPlate,
		
		// Tech
		circuitBasic, 
		circuitAdvanced,
		 
		// Misc 
		rubber,
		latex,
		wireCoating,
		concrete,
		testTube,
		
		//Tools
		steelPickaxe;

	public static void init() {

		// Ingots

			// Copper
			copperIngot = new ItemHandler("copperIngot");
			register(copperIngot, "ingotCopper");	
			
			// Tin
			tinIngot = new ItemHandler("tinIngot");
			register(tinIngot, "ingotTin");
			
			// Tungsten
			tungstenIngot = new ItemHandler("tungstenIngot");
			register(tungstenIngot, "ingotTungsten");
	
			// Aluminium
			aluminiumIngot = new ItemHandler("aluminiumIngot");
			register(aluminiumIngot, "ingotAluminium");
			
			// Bronze
			bronzeIngot = new ItemHandler("bronzeIngot");
			register(bronzeIngot, "ingotBronze");
	
			// Steel
			steelIngot = new ItemHandler("steelIngot");
			register(steelIngot, "ingotSteel");
	
			// Silver
			silverIngot = new ItemHandler("silverIngot");
			register(silverIngot, "ingotSilver");
			
			// Silver
			leadIngot = new ItemHandler("leadIngot");
			register(leadIngot, "ingotLead");
	
		// Wires (non-insulated)

			// Copper
			copperWire = new ItemHandler("copperWire");
			register(copperWire, "copperWire");
	
			// Tin 
			tinWire = new ItemHandler("tinWire");
			register(tinWire, "tinWire");
			
			// Tungsten
			tungstenWire = new ItemHandler("tungstenWire");
			register(tungstenWire, "tungstenWire");
			
			// Gold 
			goldWire = new ItemHandler("goldWire");
			register(goldWire, "goldWire");
	
			// Aluminium
			aluminiumWire = new ItemHandler("aluminiumWire");
			register(aluminiumWire, "aluminiumWire");
			
			// Bronze
			bronzeWire = new ItemHandler("bronzeWire");
			register(bronzeWire, "bronzeWire");
			
		// Wires (insulated)

			// Copper
			insulatedCopperWire = new ItemHandler("insulatedCopperWire");
			register(insulatedCopperWire, "insulatedCopperWire");
	
			// Tin 
			insulatedTinWire = new ItemHandler("insulatedTinWire");
			register(insulatedTinWire, "insulatedTinWire");
			
			// Tungsten
			insulatedTungstenWire = new ItemHandler("insulatedTungstenWire");
			register(insulatedTungstenWire, "insulatedTungstenWire");
			
			// Gold 
			insulatedGoldWire = new ItemHandler("insulatedGoldWire");
			register(insulatedGoldWire, "insulatedGoldWire");
	
			// Aluminium
			insulatedAluminiumWire = new ItemHandler("insulatedAluminiumWire");
			register(insulatedAluminiumWire, "insulatedAluminiumWire");
			
			// Bronze
			insulatedBronzeWire = new ItemHandler("insulatedBronzeWire");
			register(insulatedBronzeWire, "insulatedBronzeWire");
	
		// Spools (non-insulated)
			
			// Copper 
			copperWireSpool = new ItemHandler("copperWireSpool");
			register(copperWireSpool, "copperWireSpool");
			
			// Tin
			tinWireSpool = new ItemHandler("tinWireSpool");
			register(tinWireSpool, "tinWireSpool");
			
			// Tungsten
			tungstenWireSpool = new ItemHandler("tungstenWireSpool");
			register(tungstenWireSpool, "tungstenWireSpool");
	
			// Gold
			goldWireSpool = new ItemHandler("goldWireSpool");
			register(goldWireSpool, "goldWireSpool");
	
			// Aluminium
			aluminiumWireSpool = new ItemHandler("aluminiumWireSpool");
			register(aluminiumWireSpool, "aluminiumWireSpool");
			
			// Bronze
			bronzeWireSpool = new ItemHandler("bronzeWireSpool");
			register(bronzeWireSpool, "bronzeWireSpool");
			
		// Spools (insulated)
			
			// Copper 
			insulatedCopperWireSpool = new ItemHandler("insulatedCopperWireSpool");
			register(insulatedCopperWireSpool, "insulatedCopperWireSpool");
			
			// Tin
			insulatedTinWireSpool = new ItemHandler("insulatedTinWireSpool");
			register(insulatedTinWireSpool, "insulatedTinWireSpool");
			
			// Tungsten
			insulatedTungstenWireSpool = new ItemHandler("insulatedTungstenWireSpool");
			register(insulatedTungstenWireSpool, "insulatedTungstenWireSpool");
	
			// Gold
			insulatedGoldWireSpool = new ItemHandler("insulatedGoldWireSpool");
			register(insulatedGoldWireSpool, "insulatedGoldWireSpool");
	
			// Aluminium
			insulatedAluminiumWireSpool = new ItemHandler("insulatedAluminiumWireSpool");
			register(insulatedAluminiumWireSpool, "insulatedAluminiumWireSpool");
			
			// Bronze
			insulatedBronzeWireSpool = new ItemHandler("insulatedBronzeWireSpool");
			register(insulatedBronzeWireSpool, "insulatedBronzeWireSpool");
			
		// Plates
			
			// Copper
			copperPlate = new ItemHandler("copperPlate");
			register(copperPlate, "copperPlate");

			// Tin
			tinPlate = new ItemHandler("tinPlate");
			register(tinPlate, "tinPlate");
						
			// Tungsten
			tungstenPlate = new ItemHandler("tungstenPlate");
			register(tungstenPlate, "tungstenPlate");
					
			// Gold
			goldPlate = new ItemHandler("goldPlate");
			register(goldPlate, "goldPlate");
						
			// Aluminium
			aluminiumPlate = new ItemHandler("aluminiumPlate");
			register(aluminiumPlate, "aluminiumPlate");
						
			// Bronze
			bronzePlate = new ItemHandler("bronzePlate");
			register(bronzePlate, "bronzePlate");
		
			// Lead
			leadPlate = new ItemHandler("leadPlate");
			register(leadPlate, "leadPlate");
			
		// Tech Items

			// Circuit - Basic
			circuitBasic = new ItemHandler("circuitBasic");
			register(circuitBasic, "circuitBasic");
	
			// Circuit - Advanced
			circuitAdvanced = new ItemHandler("circuitAdvanced");
			register(circuitAdvanced, "circuitAdvanced");
			
		// Misc Items
			
			// Rubber
			rubber = new ItemHandler("rubber");
			register(rubber, "rubber");
			
			// Latex
			latex = new ItemHandler("latex");
			register(latex, "latex");
			
			// Wire Coating
			wireCoating = new ItemHandler("wireCoating");
			register(wireCoating, "wireCoating");
			
			// Concrete
			concrete = new ItemHandler("concrete");
			register(concrete, "concrete");
			
			// Test Tube
			testTube = new ItemHandler("testTube");
			register(testTube, "testTube");

	}

	public static void register(ItemHandler item) {
		GameRegistry.registerItem(item, item.unlocName);
	}

	public static void register(ItemHandler item, String oreDictName) {
		register(item);
		OreDictionary.registerOre(oreDictName, item);
	}
}
