package com.church.sciencemc;

import com.church.sciencemc.blocks.BlockHandler;
import com.church.sciencemc.blocks.BlockList;
import com.church.sciencemc.items.ArmorList;
import com.church.sciencemc.items.ItemHandler;
import com.church.sciencemc.items.ItemList;
import com.church.sciencemc.items.ToolList;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class RecipeManager {
	
	public static void wireRecipe(ItemHandler output, int outputAmount, ItemStack input){
		GameRegistry.addRecipe(new ItemStack(output, outputAmount),
				"AA",
				"AA",
				'A', input);
	}
	
	public static void plateRecipe(ItemHandler output, ItemStack input){
		GameRegistry.addRecipe(new ItemStack(output),
				"AA",
				'A', input);
	}
	
	public static void insulatedWireRecipe(ItemHandler output, ItemHandler input){
		GameRegistry.addRecipe(new ItemStack(output),
				"B",
				"A",
				"B",
				'A', input,
				'B', ItemList.wireCoating);
	}
	
	public static void fullTableRecipe(ItemStack output, ItemHandler input){
		GameRegistry.addRecipe(output,
				"AAA",
				"AAA", 
				"AAA", 
				'A', input);
	}
	
	public static void latexRecipeOneTallFlower(int id){
		GameRegistry.addRecipe(new ItemStack(ItemList.latex),
				"AAA",
				"AAA", 
				"AAA", 
				'A', new ItemStack(Blocks.red_flower, 1, id));
	}
	
	public static void latexRecipeTwoTallFlower(int id){
		GameRegistry.addRecipe(new ItemStack(ItemList.latex),
				"AAA",
				"AAA", 
				"AAA", 
				'A', new ItemStack(Blocks.double_plant, 1, id));
	}
	
	public static void init(){
		
		// Smelting recipes
		
			// Blocks
		
				GameRegistry.addSmelting(BlockList.aluminiumOre, new ItemStack(ItemList.aluminiumIngot), 50);
				GameRegistry.addSmelting(BlockList.copperOre, new ItemStack(ItemList.copperIngot), 50);
				GameRegistry.addSmelting(Items.iron_ingot, new ItemStack(ItemList.steelIngot), 60);
				GameRegistry.addSmelting(BlockList.tinOre, new ItemStack(ItemList.tinIngot), 50);
				GameRegistry.addSmelting(BlockList.silverOre, new ItemStack(ItemList.silverIngot), 50);
				GameRegistry.addSmelting(BlockList.tungstenOre, new ItemStack(ItemList.tungstenIngot), 80);
				GameRegistry.addSmelting(ItemList.latex, new ItemStack(ItemList.rubber, 2), 20);
				GameRegistry.addSmelting(BlockList.leadOre, new ItemStack(ItemList.leadIngot), 60);
		
				

		// Crafting Recipes (Shaped)
			
			// Blocks
		
				// Whole Metal Blocks
				fullTableRecipe(new ItemStack(BlockList.aluminiumBlock), ItemList.aluminiumIngot); // Aluminium
				fullTableRecipe(new ItemStack(BlockList.copperBlock), ItemList.copperIngot); // Copper
				fullTableRecipe(new ItemStack(BlockList.steelBlock), ItemList.steelIngot); // Steel
				fullTableRecipe(new ItemStack(BlockList.tungstenBlock), ItemList.tungstenIngot); // Tungsten
				fullTableRecipe(new ItemStack(BlockList.bronzeBlock), ItemList.bronzeIngot); // Bronze
				fullTableRecipe(new ItemStack(BlockList.silverBlock), ItemList.silverIngot); // Silver
				fullTableRecipe(new ItemStack(BlockList.leadBlock), ItemList.leadIngot); // Lead
				
				// Test Tube Rack
				GameRegistry.addRecipe(new ItemStack(BlockList.testTubeRack),
						"ABA", 
						"A A", 
						'A', Items.stick,
						'B', ItemList.testTube);
				
				// Microscope
				GameRegistry.addRecipe(new ItemStack(BlockList.microscope),
						"BCB",
						"BAB",
						"EDE",
						'A', Blocks.glass_pane, 
						'B', ItemList.aluminiumPlate,
						'C', ItemList.steelIngot,
						'D', Items.glowstone_dust,
						'E', ItemList.circuitBasic);
			
				
				// Industrial Forge
				GameRegistry.addRecipe(new ItemStack(BlockList.industrialForgeOff),
						"AAA",
						"ABA", 
						"AAA", 
						'A', ItemList.steelIngot,
						'B', Items.iron_ingot);
				
				// Steel Crate
				GameRegistry.addRecipe(new ItemStack(BlockList.steelCrate),
						"AAA",
						"ABA", 
						"AAA", 
						'A', ItemList.steelIngot,
						'B', Blocks.chest);
				
				// Chemical Mixer
				GameRegistry.addRecipe(new ItemStack(BlockList.chemicalMixer),
						"AAA",
						"ABA",
						"BAB",
						'A', ItemList.aluminiumIngot,
						'B', BlockList.machineBase);
				
				// Machine Base
				GameRegistry.addRecipe(new ItemStack(BlockList.machineBase),
						"AAA",
						"ABA",
						"C C",
						'A', ItemList.tinIngot,
						'B', ItemList.aluminiumIngot,
						'C', ItemList.copperWire);
				
				// Large Fluorescent Light 
				GameRegistry.addRecipe(new ItemStack(BlockList.largeFluorescentLight),
						"AAA",
						"BCB",
						"AAA",
						'A', Blocks.glass_pane,
						'B', ItemList.tinIngot,
						'C', ItemList.tungstenWire);
				
				// Fluorescent Light Tube
				GameRegistry.addRecipe(new ItemStack(BlockList.fluorescentLightTube),
						" A ",
						"BCB",
						" A ",
						'A', Blocks.glass_pane,
						'B', ItemList.tinIngot,
						'C', ItemList.tungstenWire);
				
				// Concrete Block
				GameRegistry.addRecipe(new ItemStack(BlockList.concreteBlock),
						"AA",
						"AA",
						'A', ItemList.concrete);
				
				// Reinforced Concrete Block
				GameRegistry.addRecipe(new ItemStack(BlockList.reinforcedConcreteBlock),
						"AAA",
						"ABA", 
						"AAA", 
						'A', ItemList.concrete,
						'B', BlockList.concreteBlock);
				
				
				
				
			// Items
				
				// Armor
					
					// Hazmat Suit
				
						// Helmet
						GameRegistry.addRecipe(new ItemStack(ArmorList.hazmatHelmet),
								"BBB",
								"ACA",
								'A', ItemList.rubber,
								'B', ItemList.leadIngot,
								'C', Items.leather_helmet);
						
						// Chestplate
						GameRegistry.addRecipe(new ItemStack(ArmorList.hazmatChestplate),
								"B B",
								"ACA",
								"AAA",
								'A', ItemList.rubber,
								'B', ItemList.leadIngot,
								'C', Items.leather_chestplate);
						
						// Leggings
						GameRegistry.addRecipe(new ItemStack(ArmorList.hazmatLeggings),
								"ABA",
								"ACA",
								"A A",
								'A', ItemList.rubber,
								'B', ItemList.leadIngot,
								'C', Items.leather_leggings);
						
						// Boots
						GameRegistry.addRecipe(new ItemStack(ArmorList.hazmatBoots),
								"ACA",
								"ABA",
								'A', ItemList.rubber,
								'B', ItemList.leadIngot,
								'C', Items.leather_boots);
			
				// Misc Items
					
					// Bronze Ingot
					GameRegistry.addRecipe(new ItemStack(ItemList.bronzeIngot, 4),
							"A A",
							" B ",
							"A A",
							'A', ItemList.copperIngot,
							'B', ItemList.tinIngot);
					
					// Concrete
					GameRegistry.addRecipe(new ItemStack(ItemList.concrete),
							"AA",
							"AA",
							'A', Blocks.stone);
					
					// Test Tube
					GameRegistry.addRecipe(new ItemStack(ItemList.testTube),
							"A",
							"A",
							'A', Blocks.glass_pane);
					
					// Wire Coating
					GameRegistry.addRecipe(new ItemStack(ItemList.wireCoating),
							"AAA",
							'A', ItemList.rubber);
					
					// Latex
					latexRecipeOneTallFlower(0);
					latexRecipeOneTallFlower(1);
					latexRecipeOneTallFlower(2);
					latexRecipeOneTallFlower(3);
					latexRecipeOneTallFlower(4);
					latexRecipeOneTallFlower(5);
					latexRecipeOneTallFlower(6);
					latexRecipeOneTallFlower(7);
					latexRecipeOneTallFlower(8);
					
					latexRecipeTwoTallFlower(0);
					latexRecipeTwoTallFlower(1);
					latexRecipeTwoTallFlower(4);
					latexRecipeTwoTallFlower(5);
					
					GameRegistry.addRecipe(new ItemStack(ItemList.latex),
							"AAA",
							"AAA", 					// Yellow flowers (dandelions) have their own block
							"AAA", 					// so a new recipe entirely is required. Mojang why
							'A', Blocks.yellow_flower);
					
				// Wires
					
					// Wires (non-insulated) | (output, outputAmount, input)
					wireRecipe(ItemList.copperWire, 2, new ItemStack(ItemList.copperIngot)); // Copper
					wireRecipe(ItemList.tinWire, 2, new ItemStack(ItemList.tinIngot)); // Tin
					wireRecipe(ItemList.tungstenWire, 2, new ItemStack(ItemList.tungstenIngot)); // Tungsten
					wireRecipe(ItemList.aluminiumWire, 2, new ItemStack(ItemList.aluminiumIngot)); // Aluminium
					wireRecipe(ItemList.goldWire, 2, new ItemStack(Items.gold_ingot)); // Gold
					wireRecipe(ItemList.bronzeWire, 2, new ItemStack(ItemList.bronzeIngot)); // Bronze
					
					// Wire Spools (non-insulated) | (output, input)
					fullTableRecipe(new ItemStack(ItemList.copperWireSpool), ItemList.copperWire); // Copper
					fullTableRecipe(new ItemStack(ItemList.tinWireSpool), ItemList.tinWire); // Tin
					fullTableRecipe(new ItemStack(ItemList.tungstenWireSpool), ItemList.tungstenWire); // Tungsten
					fullTableRecipe(new ItemStack(ItemList.aluminiumWireSpool), ItemList.aluminiumWire); // Aluminium
					fullTableRecipe(new ItemStack(ItemList.goldWireSpool), ItemList.goldWire); // Gold
					fullTableRecipe(new ItemStack(ItemList.bronzeWireSpool), ItemList.bronzeWire); // Bronze
					
					// Wires (insulated) | (output, input)
					insulatedWireRecipe(ItemList.insulatedCopperWire, ItemList.copperWire); // Copper
					insulatedWireRecipe(ItemList.insulatedTinWire, ItemList.tinWire); // Tin
					insulatedWireRecipe(ItemList.insulatedTungstenWire, ItemList.tungstenWire); // Tungsten
					insulatedWireRecipe(ItemList.insulatedAluminiumWire, ItemList.aluminiumWire); // Aluminium
					insulatedWireRecipe(ItemList.insulatedGoldWire, ItemList.goldWire); // Gold
					insulatedWireRecipe(ItemList.insulatedBronzeWire, ItemList.bronzeWire); // Bronze
					
					// Wire Spools (insulated) | (output, input)
					fullTableRecipe(new ItemStack(ItemList.insulatedCopperWireSpool), ItemList.insulatedCopperWire); // Copper
					fullTableRecipe(new ItemStack(ItemList.insulatedTinWireSpool), ItemList.insulatedTinWire); // Tin
					fullTableRecipe(new ItemStack(ItemList.insulatedTungstenWireSpool), ItemList.insulatedTungstenWire); // Tungsten
					fullTableRecipe(new ItemStack(ItemList.insulatedAluminiumWireSpool), ItemList.insulatedAluminiumWire); // Aluminium
					fullTableRecipe(new ItemStack(ItemList.insulatedGoldWireSpool), ItemList.insulatedGoldWire); // Gold
					fullTableRecipe(new ItemStack(ItemList.insulatedBronzeWireSpool), ItemList.insulatedBronzeWire); // Bronze
					
				// Plates
					
					plateRecipe(ItemList.copperPlate, new ItemStack(ItemList.copperIngot)); // Copper
					plateRecipe(ItemList.tinPlate, new ItemStack(ItemList.tinIngot)); // Tin
					plateRecipe(ItemList.tungstenPlate, new ItemStack(ItemList.tungstenIngot)); // Tungsten
					plateRecipe(ItemList.aluminiumPlate, new ItemStack(ItemList.aluminiumIngot)); // Aluminium
					plateRecipe(ItemList.goldPlate, new ItemStack(Items.gold_ingot)); // Gold
					plateRecipe(ItemList.bronzePlate, new ItemStack(ItemList.bronzeIngot)); // Bronze
					plateRecipe(ItemList.leadPlate, new ItemStack(ItemList.leadIngot)); // Lead
					
				// Tech Items
					
					// Basic Circuit
					GameRegistry.addRecipe(new ItemStack(ItemList.circuitBasic),
							"BCB",
							"ABA",
							'A', Items.gold_nugget,
							'B', ItemList.aluminiumIngot,
							'C', ItemList.copperWire);
					
					// Advanced Circuit
					GameRegistry.addRecipe(new ItemStack(ItemList.circuitAdvanced),
							"BCB",
							"ABA",
							'A', ItemList.goldWire,
							'B', ItemList.aluminiumIngot,
							'C', new ItemStack(Items.dye, 1, 4));
					
				// Tools
					
					// Steel Pickaxe
					GameRegistry.addRecipe(new ItemStack(ToolList.steelPickaxe),
							"AAA",
							" B ",
							" B ",
							'A', ItemList.steelIngot,
							'B', Items.stick);
	}
}