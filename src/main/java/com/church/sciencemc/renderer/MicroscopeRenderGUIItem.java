package com.church.sciencemc.renderer;

import org.lwjgl.opengl.GL11;

import com.church.sciencemc.container.ContainerTileEntityMicroscope;
import com.church.sciencemc.gui.GuiTileEntityMicroscope;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class MicroscopeRenderGUIItem extends RenderItem {
	
    public ContainerTileEntityMicroscope microscopeContainer;
    public InventoryPlayer inventoryPlayer;
    public GuiTileEntityMicroscope microscopeGui;

    public MicroscopeRenderGUIItem(GuiTileEntityMicroscope microscopeGui)
    {
        super();
        this.microscopeGui = microscopeGui;
        microscopeContainer = (ContainerTileEntityMicroscope) microscopeGui.inventorySlots;
        inventoryPlayer = microscopeGui.inventoryPlayer;
    }

	@Override
	public void renderItemAndEffectIntoGUI(FontRenderer fontRenderer, TextureManager textureManager, ItemStack itemStack, int x, int y) {
		if (itemStack == null) {
			
			return;
			
		}
		
		RenderHelper.enableGUIStandardItemLighting();
		
		Slot slot = microscopeContainer.getSlot(0);
        if (slot.getStack() != null)
        {
            GL11.glPushMatrix();
            GL11.glScalef(3.0F, 3.0F, 1.0F);
            GL11.glTranslatef(0.25F, 0F, 0F);
            super.renderItemAndEffectIntoGUI(fontRenderer, textureManager, slot.getStack(), x, y);
            GL11.glPopMatrix();
        }
		
	
	}
}
