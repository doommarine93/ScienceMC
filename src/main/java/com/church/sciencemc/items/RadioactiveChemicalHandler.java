package com.church.sciencemc.items;

import java.util.List;
import java.util.Random;

import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.effects.StatusEffectsList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import scala.Console;

public class RadioactiveChemicalHandler extends Item {

	public String unlocName;

	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int par4, boolean par5) {

		if (!(entity instanceof EntityPlayer))
			return;
		EntityPlayer player = (EntityPlayer) entity;

		if (player.inventory.armorInventory[0] != null && player.inventory.armorInventory[1] != null
				&& player.inventory.armorInventory[2] != null && player.inventory.armorInventory[3] != null) {

			if (player.inventory.armorInventory[0].getItem() == ArmorList.hazmatHelmet
					&& player.inventory.armorInventory[1].getItem() == ArmorList.hazmatChestplate
					&& player.inventory.armorInventory[2].getItem() == ArmorList.hazmatLeggings
					&& player.inventory.armorInventory[3].getItem() == ArmorList.hazmatBoots) {

				((EntityLivingBase) entity)
						.addPotionEffect(new PotionEffect(StatusEffectsList.leadLined.id, 300, 0, false));
			}
		} else {
			((EntityLivingBase) entity)
					.addPotionEffect(new PotionEffect(StatusEffectsList.radiation.id, 300, 0, false));
		}

	}

	protected RadioactiveChemicalHandler(String unlocalizedName, boolean customRender) {
		super();
		this.unlocName = unlocalizedName;
		setUnlocalizedName(ScienceMCMod.MODID + "_" + unlocalizedName);
		setCreativeTab(ScienceMCMod.sciencemcItemsTab);
		if (!customRender)
			setTextureName(ScienceMCMod.MODID + ":" + unlocalizedName);
	}

	public RadioactiveChemicalHandler(String unlocalizedName) {
		super();
		this.unlocName = unlocalizedName;
		setUnlocalizedName(ScienceMCMod.MODID + "_chemicals_" + unlocalizedName);
		setCreativeTab(ScienceMCMod.sciencemcItemsTab);
		setTextureName(ScienceMCMod.MODID + ":" + "chemicals/" + unlocalizedName);
	}

	public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.GREEN + "RADIOACTIVE");
		list.add(EnumChatFormatting.YELLOW + "Requires a hazmat suit to hold safely.");
		list.add("");
		list.add(EnumChatFormatting.AQUA + "ELEMENT INFO IS WIP");
	}

}