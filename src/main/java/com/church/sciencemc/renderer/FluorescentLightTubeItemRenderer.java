package com.church.sciencemc.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.church.sciencemc.models.ChemicalMixerModel;
import com.church.sciencemc.models.FluorescentLightTubeModel;


public class FluorescentLightTubeItemRenderer implements IItemRenderer {

	private final FluorescentLightTubeModel model;

	public FluorescentLightTubeItemRenderer() {
		model = new FluorescentLightTubeModel();
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
		Minecraft.getMinecraft().getTextureManager().bindTexture(FluorescentLightTubeRenderer.textureLocation);
		switch (type) {
		case EQUIPPED:
			scale = 2F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.4F, -1.6F, -0.4F);
			break;
		case ENTITY:
			scale = 1F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.0F, 0F, 0.0F);
			break;
		case INVENTORY:
			scale = 2F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.0F, -1.15F, 0.0F);
			break;
		case EQUIPPED_FIRST_PERSON:
			scale = 2F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.5F, -1.4F, -0.4F);
			break;
		default:
			break;
		}
		new FluorescentLightTubeModel().render();
		GL11.glPopMatrix();

	}

}
