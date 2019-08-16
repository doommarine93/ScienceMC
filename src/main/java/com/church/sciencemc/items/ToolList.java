package com.church.sciencemc.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class ToolList {
	
	public static CustomPickaxe steelPickaxe;

	public static void init(){
		
		// Steel Pickaxe
		GameRegistry.registerItem(steelPickaxe = new CustomPickaxe("steelPickaxe", ToolMaterials.STEEL), "steelPickaxe");
		
	}
	
}
