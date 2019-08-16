package com.church.sciencemc.gui;

import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.container.ContainerTileEntityTestTubeRack;
import com.church.sciencemc.tileentities.TileEntityTestTubeRack;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiTileEntityTestTubeRack extends GuiContainer {
	
	private IInventory playerInv;
	private TileEntityTestTubeRack te;

    public GuiTileEntityTestTubeRack(IInventory playerInv, TileEntityTestTubeRack te) {
        super(new ContainerTileEntityTestTubeRack(playerInv, te));
        
        this.playerInv = playerInv;
		this.te = te;

        this.xSize = 175; 
        this.ySize = 144;
        
    }

    @Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY) {
		this.mc.getTextureManager()
				.bindTexture(new ResourceLocation(ScienceMCMod.MODID + ":textures/gui/testTubeRack.png"));
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		String s = this.te.getInventoryName();
		String r = "Test Tube Rack";
		this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 5, 4210752); // #404040
		this.fontRendererObj.drawString(
				LanguageRegistry.instance().getStringLocalization(this.playerInv.getInventoryName()), 6, 50, 4210752); // #404040
		this.fontRendererObj.drawString(r, 6 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); // #404040
	}
}
