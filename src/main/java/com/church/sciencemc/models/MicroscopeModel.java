package com.church.sciencemc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MicroscopeModel extends ModelBase
{
  //fields
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
  
  public MicroscopeModel()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 8, 1, 8);
      Shape1.setRotationPoint(-4F, 23.5F, -4F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 33, 7);
      Shape2.addBox(0F, 0F, 0F, 2, 1, 3);
      Shape2.setRotationPoint(-1F, 23.3F, -3.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 33, 0);
      Shape3.addBox(0F, 0F, 0F, 3, 3, 3);
      Shape3.setRotationPoint(-1.5F, 21F, 0.8F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 46, 0);
      Shape4.addBox(0F, 0F, 0F, 2, 5, 1);
      Shape4.setRotationPoint(-1F, 18F, 4.4F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, -0.448799F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 44, 7);
      Shape5.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape5.setRotationPoint(-1.5F, 18F, 4.3F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 53, 0);
      Shape6.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape6.setRotationPoint(-0.5F, 21F, -0.4F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 10);
      Shape7.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape7.setRotationPoint(-2F, 20.99F, -3.5F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 17, 10);
      Shape8.addBox(0F, 0F, 0F, 2, 7, 1);
      Shape8.setRotationPoint(-1F, 15.5F, -1.5F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 1.038345F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 16);
      Shape9.addBox(0F, 0F, 0F, 3, 4, 3);
      Shape9.setRotationPoint(-1.5F, 12.75F, -2F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, -0.1487144F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 24, 10);
      Shape10.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape10.setRotationPoint(0.1F, 15.8F, -1.9F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, -0.3346075F, 0.2602503F, -0.2230717F);
      Shape11 = new ModelRenderer(this, 28, 10);
      Shape11.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape11.setRotationPoint(-0.8F, 15.8F, -1.9F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, -0.1115429F, -0.2602503F, 0.2974289F);
      Shape12 = new ModelRenderer(this, 24, 14);
      Shape12.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape12.setRotationPoint(0.9F, 16F, -1.2F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, -0.3346075F, -1.821752F, -0.2230717F);
      Shape13 = new ModelRenderer(this, 33, 12);
      Shape13.addBox(0F, 0F, 0F, 2, 1, 2);
      Shape13.setRotationPoint(-1F, 20.9F, -2.5F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 53, 5);
      Shape14.addBox(0F, 0F, 0F, 1, 4, 1);
      Shape14.setRotationPoint(0.2F, 12F, -5F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0.8179294F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 53, 5);
      Shape15.addBox(0F, 0F, 0F, 1, 4, 1);
      Shape15.setRotationPoint(-1.2F, 12F, -5F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0.8179294F, 0F, 0F);
      Shape16 = new ModelRenderer(this, 42, 12);
      Shape16.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape16.setRotationPoint(-2F, 22F, 1.8F);
      Shape16.setTextureSize(64, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
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
	}
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
