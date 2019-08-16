package com.church.sciencemc.gui;

import com.church.sciencemc.ChemicalComposition;
import com.church.sciencemc.ScienceMCMod;
import com.church.sciencemc.container.ContainerTileEntityMicroscope;
import com.church.sciencemc.renderer.MicroscopeRenderGUIItem;
import com.church.sciencemc.tileentities.TileEntityMicroscope;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class GuiTileEntityMicroscope extends GuiContainer {

	private IInventory playerInv;
	private TileEntityMicroscope te;
	private String inputName = "";
	private String inputID = "";
	private String inputComposition = "";
	private int id = 0;
	private final RenderItem renderItem;
	public InventoryPlayer inventoryPlayer;
	private ContainerTileEntityMicroscope containerMicroscope;

	public GuiTileEntityMicroscope(IInventory playerInv, TileEntityMicroscope te) {
		super(new ContainerTileEntityMicroscope(playerInv, te));

		this.playerInv = playerInv;
		this.te = te;

		this.xSize = 256;
		this.ySize = 203;

		this.renderItem = new MicroscopeRenderGUIItem(this);

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTick, int mouseX, int mouseY) {
		this.mc.getTextureManager()
				.bindTexture(new ResourceLocation(ScienceMCMod.MODID + ":textures/gui/microscope.png"));
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {

		//ChemicalComposition.ChemicalCompositionList();
		if (te.getStackInSlot(0) != null) {
			inputName = te.getStackInSlot(0).getDisplayName();

			ItemStack slot = te.getStackInSlot(0);
			Item item = slot.getItem();
			id = item.getIdFromItem(item);
			inputID = Integer.toString(id);
			
			inputComposition = ChemicalComposition.Composition;

		} else {
			inputName = "";
			inputID = "";
			inputComposition = "";
		}

		String s = this.te.getInventoryName();

		this.fontRendererObj.drawString(s, 88 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); // #404040

		this.fontRendererObj.drawString( LanguageRegistry.instance().getStringLocalization(this.playerInv.getInventoryName()), 7, 111, 4210752); // #404040

		this.fontRendererObj.drawString("Microscope", 60 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752); // #404040

		this.fontRendererObj.drawString("Input Info", 186 - this.fontRendererObj.getStringWidth(s) / 2, 13, 4210752); // #404040

		this.fontRendererObj.drawString("Name:", 180 - this.fontRendererObj.getStringWidth(s) / 2, 30, 4210752); // #404040

		this.fontRendererObj.drawSplitString(inputName, 180 - this.fontRendererObj.getStringWidth(s) / 2, 42, 67, 4210752); // #404040

		this.fontRendererObj.drawString("ID: " + inputID, 180 - this.fontRendererObj.getStringWidth(s) / 2, 72, 4210752); // #404040

		this.fontRendererObj.drawString("Composition:", 180 - this.fontRendererObj.getStringWidth(s) / 2, 105, 4210752); // #404040

		this.fontRendererObj.drawSplitString(inputComposition, 180 - this.fontRendererObj.getStringWidth(s) / 2, 117, 68, 4210752); // #404040

		renderItem.renderItemAndEffectIntoGUI(fontRendererObj, this.mc.getTextureManager(), te.getStackInSlot(0), 9, 9);
	}

	@Override
	public void drawScreen(int par1, int par2, float par3) {
		super.drawScreen(par1, par2, par3);

	}

}
