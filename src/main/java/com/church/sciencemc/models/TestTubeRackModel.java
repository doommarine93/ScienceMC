package com.church.sciencemc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class TestTubeRackModel extends ModelBase {
	// fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;

	public TestTubeRackModel() {
		textureWidth = 32;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 12, 13);
		Shape1.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape1.setRotationPoint(6F, 23F, -2F);
		Shape1.setTextureSize(32, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 1, 13);
		Shape2.addBox(0F, 0F, 0F, 1, 1, 4);
		Shape2.setRotationPoint(-7F, 23F, -2F);
		Shape2.setTextureSize(32, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 1, 29);
		Shape3.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape3.setRotationPoint(-7F, 17F, -1F);
		Shape3.setTextureSize(32, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 1, 26);
		Shape4.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape4.setRotationPoint(-7F, 17F, 1F);
		Shape4.setTextureSize(32, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 6, 10);
		Shape5.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape5.setRotationPoint(-7F, 17F, 0F);
		Shape5.setTextureSize(32, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 1, 10);
		Shape6.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape6.setRotationPoint(6F, 17F, 0F);
		Shape6.setTextureSize(32, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 11, 19);
		Shape7.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape7.setRotationPoint(6F, 18F, -1F);
		Shape7.setTextureSize(32, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 6, 19);
		Shape8.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape8.setRotationPoint(-7F, 18F, 1F);
		Shape8.setTextureSize(32, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 16, 19);
		Shape9.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape9.setRotationPoint(6F, 18F, 1F);
		Shape9.setTextureSize(32, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 1, 19);
		Shape10.addBox(0F, 0F, 0F, 1, 5, 1);
		Shape10.setRotationPoint(-7F, 18F, -1F);
		Shape10.setTextureSize(32, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 0, 0);
		Shape11.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape11.setRotationPoint(-4F, 16F, 0F);
		Shape11.setTextureSize(32, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 0);
		Shape12.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape12.setRotationPoint(-2F, 16F, 0F);
		Shape12.setTextureSize(32, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 0);
		Shape13.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape13.setRotationPoint(0F, 16F, 0F);
		Shape13.setTextureSize(32, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 0, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape14.setRotationPoint(2F, 16F, 0F);
		Shape14.setTextureSize(32, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 0);
		Shape15.addBox(0F, 0F, 0F, 1, 6, 1);
		Shape15.setRotationPoint(4F, 16F, 0F);
		Shape15.setTextureSize(32, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
		Shape15.render(f5);
	}
	
	public void render() {
		float r = 0.0625F;
		Shape1.render(r);
		Shape2.render(r);
		Shape3.render(r);
		Shape4.render(r);
		Shape5.render(r);
		Shape6.render(r);
		Shape7.render(r);
		Shape9.render(r);
		Shape10.render(r);
		Shape11.render(r);
		Shape12.render(r);
		Shape13.render(r);
		Shape14.render(r);
		Shape15.render(r);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}
