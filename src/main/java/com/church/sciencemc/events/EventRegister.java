package com.church.sciencemc.events;

import net.minecraftforge.common.MinecraftForge;

public class EventRegister {

	public static void init() {
		MinecraftForge.EVENT_BUS.register(new RadiationPotionEvent());
		MinecraftForge.EVENT_BUS.register(new LeadLinedPotionEvent());
	}
}
