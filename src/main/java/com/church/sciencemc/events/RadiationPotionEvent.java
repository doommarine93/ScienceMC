package com.church.sciencemc.events;

import java.util.Random;

import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.effects.StatusEffectsList;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class RadiationPotionEvent {

	String[] deathMessages = { "radiation1", "radiation2", "radiation3" };
	Random random = new Random();
	DamageSource effect = new DamageSource( ScienceMCMod.MODID + "." + deathMessages[random.nextInt(deathMessages.length)]);

	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent e) {
		if (e.entityLiving.isPotionActive(StatusEffectsList.radiation)) {
			if (e.entityLiving.getActivePotionEffect(StatusEffectsList.radiation).getDuration() == 0) {
				e.entityLiving.removePotionEffect(StatusEffectsList.radiation.id);
				return;
			} else if (e.entityLiving.worldObj.rand.nextInt(30) == 0) {
				e.entityLiving
						.attackEntityFrom(effect, 4);
			}
		}
	}
}
