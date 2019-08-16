package com.church.sciencemc.effects;

import net.minecraft.potion.Potion;

public class StatusEffectsList {
	
	public static Potion radiation, leadLined;
	
	public static void init() {
		radiation = new Radiation(25, true, 0).setIconIndex(0, 0).setPotionName("potion.sciencemc_radiation.name");
		leadLined = new LeadLined(26, false, 0).setIconIndex(0, 0).setPotionName("potion.sciencemc_leadLined.name");
	}

}
