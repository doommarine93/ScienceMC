package com.church.sciencemc.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.church.sciencemc.models.SteelCrateModel;


public class SteelCrateItemRenderer implements IItemRenderer {

	private final SteelCrateModel model;

	public SteelCrateItemRenderer() {
		model = new SteelCrateModel();
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

		float scale = 2F;
		GL11.glPushMatrix();
		GL11.glRotatef(180F, 180F, 0F, 4F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(SteelCrateRenderer.textureLocation);
		switch (type) {
		case EQUIPPED:
			scale = 1F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.5F, -1.5F, -0.5F);
			break;
		case ENTITY:
			scale = 1F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.0F, -1F, 0.0F);
			break;
		case INVENTORY:
			scale = 1F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.0F, -1F, 0.0F);
			break;
		case EQUIPPED_FIRST_PERSON:
			scale = 0.9F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.7F, -1.8F, -0.6F);
			break;
		default:
			break;
		}
		new SteelCrateModel().render();
		GL11.glPopMatrix();

	}

}
