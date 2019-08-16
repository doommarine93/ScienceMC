package com.church.sciencemc.renderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.church.sciencemc.models.TestTubeRackModel;


public class TestTubeRackItemRenderer implements IItemRenderer {

	private final TestTubeRackModel model;

	public TestTubeRackItemRenderer() {
		model = new TestTubeRackModel();
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
		Minecraft.getMinecraft().getTextureManager().bindTexture(TestTubeRackRenderer.textureLocation);
		switch (type) {
		case EQUIPPED:
			scale = 1.3F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.5F, -1.8F, -0.5F);
			break;
		case ENTITY:
			scale = 2F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.0F, -1.5F, 0.0F);
			break;
		case INVENTORY:
			scale = 1.5F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.0F, -1.2F, 0.0F);
			break;
		case EQUIPPED_FIRST_PERSON:
			scale = 1.2F;
			GL11.glScalef(scale, scale, scale);
			GL11.glTranslatef(0.7F, -1.8F, -0.6F);
			break;
		default:
			break;
		}
		new TestTubeRackModel().render();
		GL11.glPopMatrix();

	}

}
