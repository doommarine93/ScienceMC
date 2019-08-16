package com.church.sciencemc.items;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.oredict.OreDictionary;

public class ChemicalList {
	
	private static EntityPlayer player;
	private static List list;
	private static boolean par4;

	public static ChemicalHandler aluminium, antimony, argon, arsenic, barium, beryllium, bismuth, bohrium, boron,
			bromine, cadmium, calcium, carbon, cerium, cesium, chlorine, chromium, cobalt, copernicium, copper,
			dysprosium, erbium, europium, fluorine, gadolinium, gallium, germanium, gold, hafnium, helium, holmium,
			hydrogen, indium, iodine, iridium, iron, krypton, lanthanum, lead, lithium, lutetium, magnesium, manganese,
			mercury, molybdenum, neodymium, neon, nickel, niobium, nitrogen, osmium, oxygen, palladium, phosphorus,
			platinum, potassium, praseodymium, protactinium, rhenium, rhodium, roentgenium, rubidium, ruthenium,
			samarium, scandium, selenium, sethium, silicon, silver, sodium, strontium, sulfur, tantalum, tellurium,
			terbium, thallium, thulium, tin, titanium, tungsten, vanadium, xenon, ytterbium, yttrium, zinc, zirconium;

	public static RadioactiveChemicalHandler actinium, americium, astatine, berkelium, bohrim, californium, copernicum,
			curium, darmstadtium, dubnium, einsteinium, fermium, flerovium, francium, hassium, lawrencium, livermorium,
			meitnerium, mendelevium, neptunium, nobelium, plutonium, polonium, promethium, protactinum, radium, radon,
			rutherfordium, seaborgium, technetium, thorium, ununoctium, ununpentium, ununseptium, ununtrium, uranium;

	public static void chemical(ChemicalHandler input, String stringInput) {
		input = new ChemicalHandler(stringInput);
		register(input, stringInput);
	}

	public static void radioactiveChemical(RadioactiveChemicalHandler input, String stringInput) {
		input = new RadioactiveChemicalHandler(stringInput);
		registerRadioactive(input, stringInput);
	}

	public static void init() {

		radioactiveChemical(actinium, "actinium");
		chemical(aluminium, "aluminium");
		radioactiveChemical(americium, "americium");
		chemical(antimony, "antimony");
		chemical(argon, "argon");
		chemical(arsenic, "arsenic");
		radioactiveChemical(astatine, "astatine");
		chemical(barium, "barium");
		radioactiveChemical(berkelium, "berkelium");
		chemical(beryllium, "beryllium");
		chemical(bismuth, "bismuth");
		chemical(bohrium, "bohrium");
		chemical(boron, "boron");
		chemical(bromine, "bromine");
		chemical(cadmium, "cadmium");
		chemical(calcium, "calcium");
		radioactiveChemical(californium, "californium");
		chemical(carbon, "carbon");
		chemical(cerium, "cerium");
		chemical(cesium, "cesium");
		chemical(chlorine, "chlorine");
		chemical(chromium, "chromium");
		chemical(cobalt, "cobalt");
		chemical(copernicium, "copernicium");
		chemical(copper, "copper");
		radioactiveChemical(curium, "curium");
		radioactiveChemical(darmstadtium, "darmstadtium");
		radioactiveChemical(dubnium, "dubnium");
		chemical(dysprosium, "dysprosium");
		radioactiveChemical(einsteinium, "einsteinium");
		chemical(erbium, "erbium");
		chemical(europium, "europium");
		radioactiveChemical(fermium, "fermium");
		radioactiveChemical(flerovium, "flerovium");
		chemical(fluorine, "fluorine");
		radioactiveChemical(francium, "francium");
		chemical(gadolinium, "gadolinium");
		chemical(gallium, "gallium");
		chemical(germanium, "germanium");
		// chemical(gold, "gold");
		chemical(hafnium, "hafnium");
		radioactiveChemical(hassium, "hassium");
		chemical(helium, "helium");
		chemical(holmium, "holmium");
		chemical(hydrogen, "hydrogen");
		chemical(indium, "indium");
		chemical(iodine, "iodine");
		chemical(iridium, "iridium");
		// chemical(iron, "iron");
		chemical(krypton, "krypton");
		chemical(lanthanum, "lanthanum");
		radioactiveChemical(lawrencium, "lawrencium");
		chemical(lead, "lead");
		chemical(lithium, "lithium");
		radioactiveChemical(livermorium, "livermorium");
		chemical(lutetium, "lutetium");
		chemical(magnesium, "magnesium");
		chemical(manganese, "manganese");
		radioactiveChemical(meitnerium, "meitnerium");
		radioactiveChemical(mendelevium, "mendelevium");
		chemical(mercury, "mercury");
		chemical(molybdenum, "molybdenum");
		chemical(neodymium, "neodymium");
		chemical(neon, "neon");
		radioactiveChemical(neptunium, "neptunium");
		chemical(nickel, "nickel");
		chemical(niobium, "niobium");
		chemical(nitrogen, "nitrogen");
		radioactiveChemical(nobelium, "nobelium");
		chemical(osmium, "osmium");
		chemical(oxygen, "oxygen");
		chemical(palladium, "palladium");
		chemical(phosphorus, "phosphorus");
		chemical(platinum, "platinum");
		radioactiveChemical(plutonium, "plutonium");
		radioactiveChemical(polonium, "polonium");
		chemical(potassium, "potassium");
		chemical(praseodymium, "praseodymium");
		radioactiveChemical(promethium, "promethium");
		chemical(protactinium, "protactinium");
		radioactiveChemical(radium, "radium");
		radioactiveChemical(radon, "radon");
		chemical(rhenium, "rhenium");
		chemical(rhodium, "rhodium");
		chemical(roentgenium, "roentgenium");
		chemical(rubidium, "rubidium");
		chemical(ruthenium, "ruthenium");
		radioactiveChemical(rutherfordium, "rutherfordium");
		chemical(samarium, "samarium");
		chemical(scandium, "scandium");
		radioactiveChemical(seaborgium, "seaborgium");
		chemical(selenium, "selenium");
		chemical(sethium, "sethium");
		chemical(silicon, "silicon");
		chemical(silver, "silver");
		chemical(sodium, "sodium");
		chemical(strontium, "strontium");
		chemical(sulfur, "sulfur");
		chemical(tantalum, "tantalum");
		radioactiveChemical(technetium, "technetium");
		chemical(tellurium, "tellurium");
		chemical(terbium, "terbium");
		chemical(thallium, "thallium");
		radioactiveChemical(thorium, "thorium");
		chemical(thulium, "thulium");
		chemical(tin, "tin");
		chemical(titanium, "titanium");
		chemical(tungsten, "tungsten");
		radioactiveChemical(ununoctium, "ununoctium");
		radioactiveChemical(ununpentium, "ununpentium");
		radioactiveChemical(ununseptium, "ununseptium");
		radioactiveChemical(ununtrium, "ununtrium");
		radioactiveChemical(uranium, "uranium");
		chemical(vanadium, "vanadium");
		chemical(xenon, "xenon");
		chemical(ytterbium, "ytterbium");
		chemical(yttrium, "yttrium");
		chemical(zinc, "zinc");
		chemical(zirconium, "zirconium");
		
	}

	// Register for regular chemicals
	public static void register(ChemicalHandler item) {
		GameRegistry.registerItem(item, item.unlocName);
	}

	public static void register(ChemicalHandler item, String oreDictName) {
		register(item);
		OreDictionary.registerOre(oreDictName, item);
	}

	// Registration for Radioactive Chemicals
	public static void registerRadioactive(RadioactiveChemicalHandler item) {
		GameRegistry.registerItem(item, item.unlocName);
	}

	public static void registerRadioactive(RadioactiveChemicalHandler item, String oreDictName) {
		registerRadioactive(item);
		OreDictionary.registerOre(oreDictName, item);
	}

}
