package com.church.sciencemc.container;

import com.church.sciencemc.items.ChemicalHandler;
import com.church.sciencemc.items.ChemicalList;
import com.church.sciencemc.items.RadioactiveChemicalHandler;
import com.church.sciencemc.tileentities.TileEntityMicroscope;
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

public class ContainerTileEntityMicroscope extends Container{
	
	private TileEntityMicroscope te;
	
	public ContainerTileEntityMicroscope(IInventory playerInv, TileEntityMicroscope te) {
    	this.te = te;

        // Tile Entity, Slot 0, Slot IDs 0
        for (int x = 0; x < 1; ++x) { // "x < __" <-- number of boxes wide (no height)
            this.addSlotToContainer(new Slot(te, x, 119 + x * 18, 44));
        }

        // Player Inventory, Slot 1-26, Slot IDs 1-26
        for (int y = 0; y < 3; ++y) { // "y < __" <-- number of boxes high 
            for (int x = 0; x < 9; ++x) { // "x < __" <-- number of boxes wide
                this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 8 + x * 18, 121 + y * 18));
            }
        }

        // Player Inventory, Slot 0-8, Slot IDs 27-35
        for (int x = 0; x < 9; ++x) { // "x < __" <-- don't bother touching, this is ALWAYS 9
            this.addSlotToContainer(new Slot(playerInv, x, 8 + x * 18, 179));
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
        ItemStack previous = null;
        Slot slot = (Slot) this.inventorySlots.get(fromSlot);

        if (slot != null && slot.getHasStack()) {
            ItemStack current = slot.getStack();
            previous = current.copy();

            if (fromSlot < 0) {
                // From TE Inventory to Player Inventory
                if (!this.mergeItemStack(current, 0, 35, true))
                    return null;
            } else {
                // From Player Inventory to TE Inventory
                if (!this.mergeItemStack(current, 0, 0, false))
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
