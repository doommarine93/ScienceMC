package com.church.sciencemc.events;

import java.util.Random;

import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.effects.StatusEffectsList;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class LeadLinedPotionEvent {

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent e) {
		if (e.entityLiving.isPotionActive(StatusEffectsList.leadLined)) {
			if (e.entityLiving.getActivePotionEffect(StatusEffectsList.leadLined).getDuration() == 0) {
				e.entityLiving.removePotionEffect(StatusEffectsList.leadLined.id);
				return;
			} else {
				return;
			}
		}
	}
}
