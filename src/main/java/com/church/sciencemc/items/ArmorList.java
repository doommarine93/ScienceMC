package com.church.sciencemc.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class ArmorList {
	
	public static CustomArmor hazmatHelmet;
	public static CustomArmor hazmatChestplate;
	public static CustomArmor hazmatLeggings;
	public static CustomArmor hazmatBoots;
	
	public static void init() {
		
		GameRegistry.registerItem(hazmatHelmet = new CustomArmor("hazmatHelmet", ArmorMaterials.HAZMAT, "hazmatSuit", 0), "hazmatHelmet"); //0 for helmet
		GameRegistry.registerItem(hazmatChestplate = new CustomArmor("hazmatChestplate", ArmorMaterials.HAZMAT, "hazmatSuit", 1), "hazmatChestplate"); // 1 for chestplate
		GameRegistry.registerItem(hazmatLeggings = new CustomArmor("hazmatLeggings", ArmorMaterials.HAZMAT, "hazmatSuit", 2), "hazmatLeggings"); // 2 for leggings
		GameRegistry.registerItem(hazmatBoots = new CustomArmor("hazmatBoots", ArmorMaterials.HAZMAT, "hazmatSuit", 3), "hazmatBoots"); // 3 for boots 
		
	}

}
