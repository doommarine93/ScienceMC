package com.church.sciencemc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SteelCrateModel extends ModelBase {
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
	ModelRenderer Shape16;
	ModelRenderer Shape17;

	public SteelCrateModel() {
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 0, 30);
		Shape1.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape1.setRotationPoint(-7F, 23F, 7F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape2.setRotationPoint(-8F, 23F, -8F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape3.setRotationPoint(7F, 23F, -8F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 30);
		Shape4.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape4.setRotationPoint(-7F, 23F, -8F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 57, 0);
		Shape5.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape5.setRotationPoint(7F, 9F, 7F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 57, 0);
		Shape6.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape6.setRotationPoint(7F, 9F, -8F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 57, 0);
		Shape7.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape7.setRotationPoint(-8F, 9F, 7F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 57, 0);
		Shape8.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape8.setRotationPoint(-8F, 9F, -8F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 0);
		Shape9.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape9.setRotationPoint(7F, 8F, -8F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 0, 0);
		Shape10.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape10.setRotationPoint(-8F, 8F, -8F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 0, 30);
		Shape11.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape11.setRotationPoint(-7F, 8F, 7F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 0);
		Shape12.addBox(0F, 0F, 0F, 14, 15, 14);
		Shape12.setRotationPoint(-7F, 9F, -7F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 0);
		Shape13.addBox(0F, 0F, 0F, 4, 14, 1);
		Shape13.setRotationPoint(-2F, 9F, 7F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 0, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 14, 4);
		Shape14.setRotationPoint(7F, 9F, -2F);
		Shape14.setTextureSize(64, 32);
		Shape14.mirror = true;
		setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 54, 0);
		Shape15.addBox(0F, 0F, 0F, 1, 14, 4);
		Shape15.setRotationPoint(-8F, 9F, -2F);
		Shape15.setTextureSize(64, 32);
		Shape15.mirror = true;
		setRotation(Shape15, 0F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 0, 0);
		Shape16.addBox(0F, 0F, 0F, 4, 14, 1);
		Shape16.setRotationPoint(-2F, 9F, -8F);
		Shape16.setTextureSize(64, 32);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 0, 30);
		Shape17.addBox(0F, 0F, 0F, 14, 1, 1);
		Shape17.setRotationPoint(-7F, 8F, -8F);
		Shape17.setTextureSize(64, 32);
		Shape17.mirror = true;
		setRotation(Shape17, 0F, 0F, 0F);
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
		Shape16.render(f5);
		Shape17.render(f5);
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
		Shape8.render(r);
		Shape9.render(r);
		Shape10.render(r);
		Shape11.render(r);
		Shape12.render(r);
		Shape13.render(r);
		Shape14.render(r);
		Shape15.render(r);
		Shape16.render(r);
		Shape17.render(r);
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
