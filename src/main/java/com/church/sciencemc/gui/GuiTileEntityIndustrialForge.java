package com.church.sciencemc.gui;

import org.lwjgl.opengl.GL11;

import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.blocks.BlockList;
import com.church.sciencemc.container.ContainerTileEntityIndustrialForge;
import com.church.sciencemc.tileentities.TileEntityIndustrialForge;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiTileEntityIndustrialForge extends GuiContainer {

	public static final ResourceLocation bground = new ResourceLocation(
			ScienceMCMod.MODID + ":" + "textures/gui/industrialForge.png");

	public TileEntityIndustrialForge te;

	public GuiTileEntityIndustrialForge(InventoryPlayer inventoryPlayer, TileEntityIndustrialForge entity) {
		super(new ContainerTileEntityIndustrialForge(inventoryPlayer, entity));

		this.te = entity;

		this.xSize = 176;
		this.ySize = 166;
	}

	public void drawGuiContainerForegroundLayer(int par1, int par2) {

		String name = "Industrial Forge";
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6,
				4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2,
				4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);

		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

		if (this.te.isBurning()) {
			int k = this.te.getBurnTimeRemainingScaled(40);
			int j = 40 - k;
			drawTexturedModalRect(guiLeft + 29, guiTop + 65, 176, 0, 40 - j, 10);
		}

		int k = this.te.getCookProgressScaled(24);
		drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1, 16);
	}

}
