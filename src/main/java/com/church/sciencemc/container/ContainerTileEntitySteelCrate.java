package com.church.sciencemc.container;

import com.church.sciencemc.tileentities.TileEntitySteelCrate;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerTileEntitySteelCrate extends Container{
	
	private TileEntitySteelCrate te;
	
	public ContainerTileEntitySteelCrate(IInventory playerInv, TileEntitySteelCrate te) {
    	this.te = te;

        // Tile Entity, Slot 0-71, Slot IDs 0-71
        for (int y = 0; y < 8; ++y) { // "y < __" <-- number of boxes high 
            for (int x = 0; x < 9; ++x) { // "x < __" <-- number of boxes wide
            	this.addSlotToContainer(new Slot(te, x + y * 9, 7 + x * 18, 17 + y * 18)); 
            }
        }

        // Player Inventory, Slot 72-98, Slot IDs 72-98
        for (int y = 0; y < 3; ++y) { // "y < __" <-- number of boxes high 
            for (int x = 0; x < 9; ++x) { // "x < __" <-- number of boxes wide
                this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 7 + x * 18, 174 + y * 18));
            }
        }

        // Player Inventory, Slot 0-8, Slot IDs 99-107
        for (int x = 0; x < 9; ++x) { // "x < __" <-- dont bother touching, this is ALWAYS 9
            this.addSlotToContainer(new Slot(playerInv, x, 7 + x * 18, 232));
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
        ItemStack previous = null;
        Slot slot = (Slot) this.inventorySlots.get(fromSlot);

        if (slot != null && slot.getHasStack()) {
            ItemStack current = slot.getStack();
            previous = current.copy();

            if (fromSlot < 71) {
                // From TE Inventory to Player Inventory
                if (!this.mergeItemStack(current, 71, 107, true))
                    return null;
            } else {
                // From Player Inventory to TE Inventory
                if (!this.mergeItemStack(current, 0, 71, false))
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
