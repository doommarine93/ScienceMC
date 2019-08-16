package com.church.sciencemc.container;

import com.church.sciencemc.items.ChemicalHandler;
import com.church.sciencemc.items.ChemicalList;
import com.church.sciencemc.items.RadioactiveChemicalHandler;
import com.church.sciencemc.tileentities.TileEntityTestTubeRack;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ContainerTileEntityTestTubeRack extends Container{
	
	
	public static ChemicalHandler aluminum, antimony, argon, arsenic, barium, beryllium, bismuth, bohrium, boron,
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
	
	private TileEntityTestTubeRack te;
	
	public ContainerTileEntityTestTubeRack(IInventory playerInv, TileEntityTestTubeRack te) {
    	this.te = te;

        // Tile Entity, Slot 0-6, Slot IDs 0-6
        for (int x = 0; x < 7; ++x) { // "x < __" <-- number of boxes wide (no height)
            this.addSlotToContainer(new Slot(te, x, 26 + x * 18, 26));
        }

        // Player Inventory, Slot 7-26, Slot IDs 7-26
        for (int y = 0; y < 3; ++y) { // "y < __" <-- number of boxes high 
            for (int x = 0; x < 9; ++x) { // "x < __" <-- number of boxes wide
                this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 62 + y * 18));
            }
        }

        // Player Inventory, Slot 0-8, Slot IDs 27-35
        for (int x = 0; x < 9; ++x) { // "x < __" <-- dont bother touching, this is ALWAYS 9
            this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 120));
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
        ItemStack previous = null;
        Slot slot = (Slot) this.inventorySlots.get(fromSlot);

        if (slot != null && slot.getHasStack()) {
            ItemStack current = slot.getStack();
            previous = current.copy();

            if (fromSlot < 6) {
                // From TE Inventory to Player Inventory
                if (!this.mergeItemStack(current, 6, 35, true))
                    return null;
            } else {
                // From Player Inventory to TE Inventory
                if (!this.mergeItemStack(current, 0, 6, false))
                    return null;
            }

            if (current.stackSize == 0)
                slot.putStack((ItemStack) null);
            else
                slot.onSlotChanged();

            if (current.stackSize == previous.stackSize)
                return null;
            slot.onPickupFromSlot(playerIn, current);
        }
        return previous;
    }
	
    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return this.te.isUseableByPlayer(playerIn);
    }

}
