package com.church.sciencemc.gui;

import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.container.ContainerTileEntitySteelCrate;
import com.church.sciencemc.tileentities.TileEntitySteelCrate;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiTileEntitySteelCrate extends GuiContainer {
	
	private IInventory playerInv;
	private TileEntitySteelCrate te;

    public GuiTileEntitySteelCrate(IInventory playerInv, TileEntitySteelCrate te) {
        super(new ContainerTileEntitySteelCrate(playerInv, te));
        
        this.playerInv = playerInv;
		this.te = te;

        this.xSize = 175; 
        this.ySize = 256;
        
    }

    @Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY) {
		this.mc.getTextureManager()
				.bindTexture(new ResourceLocation(ScienceMCMod.MODID + ":textures/gui/steelCrate.png"));
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.te.getInventoryName();
		String r = "Steel Crate";
		this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); // #404040
		this.fontRendererObj.drawString(
				LanguageRegistry.instance().getStringLocalization(this.playerInv.getInventoryName()), 6, 163, 4210752); // #404040
		this.fontRendererObj.drawString(r, 6 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); // #404040
	}
}
