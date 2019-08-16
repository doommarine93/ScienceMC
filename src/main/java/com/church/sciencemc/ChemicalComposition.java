package com.church.sciencemc;

import com.church.sciencemc.blocks.BlockList;
import com.church.sciencemc.items.ChemicalList;
import com.church.sciencemc.items.ItemList;
import com.church.sciencemc.tileentities.TileEntityMicroscope;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ChemicalComposition {

	public static String Composition = "Work in Progress";
	private ItemStack itemStack;
	private static TileEntityMicroscope te;

	public static void ChemicalCompositionList() {

		// VANILLA ITEMS
		if (te.getStackInSlot(0) != null) {
			if (te.getStackInSlot(0) == new ItemStack(Items.apple))
				Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.baked_potato))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.beef))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.blaze_powder))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.blaze_rod))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.bone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.bread))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.brick))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.bucket))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.carrot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.chicken))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.clay_ball))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.coal))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.cooked_beef))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.cooked_chicken))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.cooked_fished))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.cooked_porkchop))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.diamond))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.dye))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.egg))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.emerald))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.ender_eye))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.ender_pearl))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.feather))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.fermented_spider_eye))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.fire_charge))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.fish))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.flint))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.ghast_tear))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.gold_ingot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.glowstone_dust))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.gold_nugget))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.gunpowder))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.iron_ingot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.leather))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.magma_cream))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.melon))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.melon_seeds))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.nether_star))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.nether_wart))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.paper))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.netherbrick))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.poisonous_potato))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.porkchop))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.potato))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.pumpkin_pie))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.pumpkin_seeds))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.quartz))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.redstone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.reeds))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.rotten_flesh))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.skull))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.slime_ball))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.snowball))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.spawn_egg))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.spider_eye))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.stick))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.string))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.sugar))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.wheat))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Items.wheat_seeds))
				  Composition = "it worked";

			// VANILLA BLOCKS
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.bedrock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.brick_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.brown_mushroom_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.cactus))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.carrots))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.clay))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.coal_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.coal_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.cobblestone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.cocoa))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.diamond_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.diamond_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.dirt))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.dragon_egg))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.emerald_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.emerald_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.end_portal))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.end_portal_frame))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.farmland))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.glass))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.glass_pane))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.glowstone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.gold_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.gold_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.gravel))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.grass))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.hardened_clay))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.hay_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.ice))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.iron_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.iron_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.lapis_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.lapis_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.lava))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.log))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.log2))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.melon_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.melon_stem))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.mob_spawner))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.monster_egg))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.mossy_cobblestone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.nether_brick))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.nether_wart))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.netherrack))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.obsidian))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.packed_ice))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.potatoes))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.planks))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.pumpkin))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.pumpkin_stem))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.quartz_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.quartz_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.red_mushroom_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.redstone_block))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.redstone_ore))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.redstone_wire))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.reeds))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.sandstone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.sapling))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.skull))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.snow))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.snow_layer))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.soul_sand))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.sponge))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.stone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.stonebrick))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.sandstone))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.sand))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.vine))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.water))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.waterlily))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.web))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.wheat))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.wool))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.brown_mushroom))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.deadbush))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.double_plant))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.fire))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.flowing_lava))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.flowing_water))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.leaves))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.leaves2))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.mycelium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.portal))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.red_flower))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.red_mushroom))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.tallgrass))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(Blocks.yellow_flower))
				  Composition = "it worked";

			// MOD BLOCKS
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.aluminiumBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.aluminiumOre))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.bronzeBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.copperBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.copperOre))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.leadBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.leadOre))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.silverBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.silverOre))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.steelBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.tinBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.tinOre))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.tungstenBlock))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(BlockList.tungstenOre))
				  Composition = "it worked";

			// MOD ITEMS
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.aluminiumIngot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.bronzeIngot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.concrete))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.copperIngot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.latex))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.leadIngot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.rubber))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.silverIngot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.steelIngot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.tinIngot))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ItemList.tungstenIngot))
				  Composition = "it worked";

			// CHEMICALS
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.actinium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.aluminium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.americium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.antimony))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.argon))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.arsenic))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.astatine))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.barium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.berkelium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.beryllium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.bismuth))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.bohrim))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.bohrium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.boron))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.bromine))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.cadmium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.californium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.carbon))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.cerium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.cesium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.chlorine))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.chromium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.cobalt))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.copernicium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.copper))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.curium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.darmstadtium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.dubnium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.dysprosium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.erbium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.europium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.fermium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.flerovium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.fluorine))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.francium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.gadolinium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.gallium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.germanium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.gold))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.hafnium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.hassium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.helium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.holmium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.hydrogen))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.indium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.iodine))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.iridium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.iron))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.krypton))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.lanthanum))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.lawrencium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.lead))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.lithium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.livermorium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.lutetium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.magnesium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.manganese))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.meitnerium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.mercury))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.molybdenum))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.neodymium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.neon))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.neptunium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.nickel))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.niobium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.nitrogen))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.nobelium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.osmium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.oxygen))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.palladium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.phosphorus))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.platinum))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.plutonium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.polonium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.potassium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.praseodymium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.promethium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.protactinium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.protactinum))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.radium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.radon))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.rhenium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.rhodium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.roentgenium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.rubidium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.rutherfordium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.samarium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.scandium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.seaborgium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.selenium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.sethium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.silicon))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.silver))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.sodium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.strontium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.sulfur))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.tantalum))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.technetium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.tellurium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.terbium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.thallium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.thorium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.thulium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.ununoctium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.ununpentium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.ununseptium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.ununtrium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.uranium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.vanadium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.xenon))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.ytterbium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.yttrium))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.zinc))
				  Composition = "it worked";
			else if (te.getStackInSlot(0) == new ItemStack(ChemicalList.zirconium))
				  Composition = "it worked";
			else
				  Composition = "Check a base item.";
		} else {
			 Composition =  "NO ITEM";
		}

	}

}
