package com.church.sciencemc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ChemicalMixerModel extends ModelBase {
	// fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape14;
	ModelRenderer Shape15;
	ModelRenderer Shape16;
	ModelRenderer Shape17;

	public ChemicalMixerModel() {
		textureWidth = 128;
		textureHeight = 64;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 10, 14);
		Shape1.setRotationPoint(-8F, 14F, -6F);
		Shape1.setTextureSize(128, 64);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 59);
		Shape2.addBox(0F, 0F, 0F, 16, 1, 2);
		Shape2.setRotationPoint(-8F, 23F, -8F);
		Shape2.setTextureSize(128, 64);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 25);
		Shape3.addBox(0F, 0F, 0F, 1, 11, 2);
		Shape3.setRotationPoint(7F, 12F, -8F);
		Shape3.setTextureSize(128, 64);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 25);
		Shape4.addBox(0F, 0F, 0F, 1, 11, 2);
		Shape4.setRotationPoint(-8F, 12F, -8F);
		Shape4.setTextureSize(128, 64);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 55);
		Shape5.addBox(0F, 0F, 0F, 14, 1, 2);
		Shape5.setRotationPoint(-7F, 17F, -8F);
		Shape5.setTextureSize(128, 64);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 40);
		Shape6.addBox(0F, 0F, 0F, 16, 5, 2);
		Shape6.setRotationPoint(-8F, 9F, 6F);
		Shape6.setTextureSize(128, 64);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 38, 47);
		Shape7.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape7.setRotationPoint(-8.01F, 12F, -8F);
		Shape7.setTextureSize(128, 64);
		Shape7.mirror = true;
		setRotation(Shape7, 0.1919862F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 7, 36);
		Shape9.addBox(0F, 0F, 0F, 14, 1, 2);
		Shape9.setRotationPoint(-7F, 14F, -8F);
		Shape9.setTextureSize(128, 64);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 40, 36);
		Shape10.addBox(0F, 0F, 0F, 3, 1, 10);
		Shape10.setRotationPoint(-6F, 13.83333F, -6F);
		Shape10.setTextureSize(128, 64);
		Shape10.mirror = true;
		setRotation(Shape10, 0F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 28, 24);
		Shape11.addBox(0F, 0F, 0F, 8, 1, 10);
		Shape11.setRotationPoint(-2F, 13.8F, -6F);
		Shape11.setTextureSize(128, 64);
		Shape11.mirror = true;
		setRotation(Shape11, 0F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 9, 49);
		Shape12.addBox(0F, 0F, 0F, 4, 1, 4);
		Shape12.setRotationPoint(0F, 13F, -3F);
		Shape12.setTextureSize(128, 64);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 30, 49);
		Shape13.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape13.setRotationPoint(-5F, 12.2F, -2F);
		Shape13.setTextureSize(128, 64);
		Shape13.mirror = true;
		setRotation(Shape13, -0.5235988F, 0F, 0F);
		Shape14 = new ModelRenderer(this, 30, 49);
		Shape14.addBox(0F, 0F, 0F, 1, 2, 1);
		Shape14.setRotationPoint(-5F, 12.65F, -2F);
		Shape14.setTextureSize(128, 64);
		Shape14.mirror = true;
		setRotation(Shape14, 0.5235988F, 0F, 0F);
		Shape15 = new ModelRenderer(this, 0, 49);
		Shape15.addBox(0F, 0F, 0F, 3, 1, 1);
		Shape15.setRotationPoint(-6F, 14F, -8F);
		Shape15.setTextureSize(128, 64);
		Shape15.mirror = true;
		setRotation(Shape15, 0.5235988F, 0F, 0F);
		Shape16 = new ModelRenderer(this, 10, 31);
		Shape16.addBox(0F, 0F, 0F, 2, 2, 2);
		Shape16.setRotationPoint(-5.5F, 10.25F, -2.65F);
		Shape16.setTextureSize(128, 64);
		Shape16.mirror = true;
		setRotation(Shape16, 0F, 0F, 0F);
		Shape17 = new ModelRenderer(this, 38, 47);
		Shape17.addBox(0F, 0F, 0F, 1, 1, 16);
		Shape17.setRotationPoint(7.01F, 12F, -8F);
		Shape17.setTextureSize(128, 64);
		Shape17.mirror = true;
		setRotation(Shape17, 0.1919862F, 0F, 0F);
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
