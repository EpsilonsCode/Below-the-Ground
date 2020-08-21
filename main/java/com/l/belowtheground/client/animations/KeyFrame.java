package com.l.belowtheground.animations;

import net.minecraft.client.renderer.model.ModelRenderer;

public class KeyFrame {
	private ModelRenderer model;
	private float rotationX;
	private float rotationY;
	private float rotationZ;
	private float time;
	public KeyFrame(ModelRenderer model, float rotationX, float rotationY, float rotationZ, float time) {
		this.model=model;
		this.rotationX=rotationX;
		this.rotationY=rotationY;
		this.rotationZ=rotationZ;
		this.time=time;
	}
	public float getTime() {
		return time;
	}
	public float getX() {
		return rotationX;
	}
	public float getY() {
		return rotationY;
	}
	public float getZ() {
		return rotationZ;
	}
	public ModelRenderer getModel() {
		return model;
	}


}
