package com.l.belowtheground.entities;
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.l.belowtheground.animations.Animation;
import com.l.belowtheground.animations.LivingAnimation;
import com.l.belowtheground.animations.KeyFrame;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class TestEntityModel extends EntityModel<TestEntity> {
	private final ModelRenderer root;
	private final ModelRenderer leg1R;
	private final ModelRenderer leg2R;
	private final ModelRenderer claw1R;
	private final ModelRenderer claw2R;
	private final ModelRenderer claw3R;
	private final ModelRenderer leg1L;
	private final ModelRenderer leg2L;
	private final ModelRenderer claw1L;
	private final ModelRenderer claw2L;
	private final ModelRenderer claw3L;
	private final ModelRenderer body2;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer bodycentral;
	private final ModelRenderer neck1;
	private final ModelRenderer neck2;
	private final ModelRenderer head;
	private final ModelRenderer upperjaw;
	private final ModelRenderer teeth2;
	private final ModelRenderer lowerjaw1;
	private final ModelRenderer lowerjaw2;
	private final ModelRenderer hornthingL;
	private final ModelRenderer hornthingR;
	private final ModelRenderer teeth1;
	private final ModelRenderer arm1L;
	private final ModelRenderer arm2L;
	private final ModelRenderer handL;
	private final ModelRenderer handclaw1L;
	private final ModelRenderer handclaw2L;
	private final ModelRenderer handclaw3L;
	private final ModelRenderer arm1R;
	private final ModelRenderer arm2R;
	private final ModelRenderer handR;
	private final ModelRenderer handclaw1R;
	private final ModelRenderer handclaw2R;
	private final ModelRenderer handclaw3R;
	
	private LivingAnimation walking;
	
	private boolean setup;
	//private long startTimer;
	public TestEntityModel() {
		setup = false;
		//startTimer = Minecraft.getInstance().world.getGameTime();
		textureWidth = 112;
		textureHeight = 112;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leg1R = new ModelRenderer(this);
		leg1R.setRotationPoint(5.0F, 5.3F, 3.0F);
		root.addChild(leg1R);
		setRotationAngle(leg1R, -0.1963F, 0.0F, 0.0F);
		leg1R.setTextureOffset(68, 68).addBox(-3.0F, -2.5F, -4.0F, 5.0F, 10.0F, 8.0F, 0.0F, false);

		leg2R = new ModelRenderer(this);
		leg2R.setRotationPoint(-0.5F, 4.5F, 1.5F);
		leg1R.addChild(leg2R);
		setRotationAngle(leg2R, -0.1963F, 0.0F, 0.0F);
		leg2R.setTextureOffset(0, 51).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		claw1R = new ModelRenderer(this);
		claw1R.setRotationPoint(0.0F, 11.5F, 3.0F);
		leg2R.addChild(claw1R);
		setRotationAngle(claw1R, -1.1781F, 0.0F, 0.0F);
		claw1R.setTextureOffset(26, 60).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		claw2R = new ModelRenderer(this);
		claw2R.setRotationPoint(1.0F, 12.0F, 3.5F);
		leg2R.addChild(claw2R);
		setRotationAngle(claw2R, -1.1781F, -0.3927F, -0.1309F);
		claw2R.setTextureOffset(26, 60).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		claw3R = new ModelRenderer(this);
		claw3R.setRotationPoint(-1.0F, 12.0F, 3.5F);
		leg2R.addChild(claw3R);
		setRotationAngle(claw3R, -1.1781F, 0.3927F, 0.1309F);
		claw3R.setTextureOffset(26, 60).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		leg1L = new ModelRenderer(this);
		leg1L.setRotationPoint(-5.0F, 5.3F, 3.0F);
		root.addChild(leg1L);
		setRotationAngle(leg1L, -0.1963F, 0.0F, 0.0F);
		leg1L.setTextureOffset(66, 30).addBox(-2.0F, -2.5F, -4.0F, 5.0F, 10.0F, 8.0F, 0.0F, false);

		leg2L = new ModelRenderer(this);
		leg2L.setRotationPoint(0.5F, 4.5F, 1.5F);
		leg1L.addChild(leg2L);
		setRotationAngle(leg2L, -0.1963F, 0.0F, 0.0F);
		leg2L.setTextureOffset(0, 27).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		claw1L = new ModelRenderer(this);
		claw1L.setRotationPoint(0.0F, 12.0F, 3.0F);
		leg2L.addChild(claw1L);
		setRotationAngle(claw1L, -1.1781F, 0.0F, 0.0F);
		claw1L.setTextureOffset(26, 60).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		claw2L = new ModelRenderer(this);
		claw2L.setRotationPoint(1.0F, 12.0F, 3.5F);
		leg2L.addChild(claw2L);
		setRotationAngle(claw2L, -1.1781F, -0.3927F, -0.1309F);
		claw2L.setTextureOffset(26, 60).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		claw3L = new ModelRenderer(this);
		claw3L.setRotationPoint(-1.0F, 12.0F, 3.5F);
		leg2L.addChild(claw3L);
		setRotationAngle(claw3L, -1.1781F, 0.3927F, 0.1309F);
		claw3L.setTextureOffset(26, 60).addBox(-1.0F, 0.0F, -1.5F, 2.0F, 6.0F, 3.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 3.8F, -4.5F);
		root.addChild(body2);
		body2.setTextureOffset(0, 0).addBox(-5.5F, -6.5F, 0.0F, 11.0F, 13.0F, 14.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, -2.0F, 14.0F);
		body2.addChild(tail1);
		setRotationAngle(tail1, -0.0489F, 0.0F, 0.0F);
		tail1.setTextureOffset(0, 27).addBox(-3.5F, -4.0F, -2.0F, 7.0F, 8.0F, 16.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -0.5F, 14.0F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, 0.0983F, 0.0F, 0.0F);
		tail2.setTextureOffset(56, 0).addBox(-2.5F, -3.0F, 0.0F, 5.0F, 6.0F, 16.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, -0.5F, 16.0F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.0489F, 0.0F, 0.0F);
		tail3.setTextureOffset(0, 51).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 18.0F, 0.0F, false);

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.0F, 18.0F);
		tail3.addChild(tail4);
		setRotationAngle(tail4, -0.1471F, 0.0F, 0.0F);
		tail4.setTextureOffset(30, 7).addBox(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 20.0F, 0.0F, false);

		bodycentral = new ModelRenderer(this);
		bodycentral.setRotationPoint(0.0F, 1.8F, -4.0F);
		root.addChild(bodycentral);
		setRotationAngle(bodycentral, -0.0489F, 0.0F, 0.0F);
		bodycentral.setTextureOffset(34, 39).addBox(-5.0F, -3.7093F, -11.3951F, 10.0F, 12.0F, 12.0F, 0.0F, false);

		neck1 = new ModelRenderer(this);
		neck1.setRotationPoint(0.0F, 0.2907F, -10.3951F);
		bodycentral.addChild(neck1);
		setRotationAngle(neck1, -0.8072F, 0.0F, 0.0F);
		neck1.setTextureOffset(34, 63).addBox(-3.49F, -3.5F, -8.0F, 7.0F, 6.0F, 10.0F, 0.0F, false);

		neck2 = new ModelRenderer(this);
		neck2.setRotationPoint(0.0F, -0.2378F, -6.6979F);
		neck1.addChild(neck2);
		setRotationAngle(neck2, 0.1745F, 0.0F, 0.0F);
		neck2.setTextureOffset(0, 73).addBox(-3.0F, -3.0F, -7.0F, 6.0F, 5.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, -6.0F);
		neck2.addChild(head);
		setRotationAngle(head, 0.6981F, 0.0F, 0.0F);
		head.setTextureOffset(82, 0).addBox(-3.01F, -3.0F, -6.0F, 6.0F, 4.0F, 7.0F, 0.0F, false);

		upperjaw = new ModelRenderer(this);
		upperjaw.setRotationPoint(0.0F, 0.9983F, -6.1F);
		head.addChild(upperjaw);
		upperjaw.setTextureOffset(68, 53).addBox(-2.01F, -3.9834F, -9.0001F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		teeth2 = new ModelRenderer(this);
		teeth2.setRotationPoint(0.0F, 0.0F, 0.0F);
		upperjaw.addChild(teeth2);
		teeth2.setTextureOffset(18, 79).addBox(-2.0F, 0.0166F, -9.0001F, 4.0F, 2.0F, 10.0F, 0.0F, false);

		lowerjaw1 = new ModelRenderer(this);
		lowerjaw1.setRotationPoint(0.0F, 1.0F, 0.0F);
		head.addChild(lowerjaw1);
		setRotationAngle(lowerjaw1, 0.0F, 0.0F, 0.0F);
		lowerjaw1.setTextureOffset(30, 30).addBox(-2.5F, 0.0F, -6.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		lowerjaw2 = new ModelRenderer(this);
		lowerjaw2.setRotationPoint(0.0F, 0.005F, -5.7F);
		lowerjaw1.addChild(lowerjaw2);
		lowerjaw2.setTextureOffset(46, 79).addBox(-1.5F, 0.0133F, -9.2001F, 3.0F, 2.0F, 10.0F, 0.0F, false);

		hornthingL = new ModelRenderer(this);
		hornthingL.setRotationPoint(-2.6F, -3.0F, -4.0F);
		head.addChild(hornthingL);
		setRotationAngle(hornthingL, 0.2662F, -0.0489F, -0.1963F);
		hornthingL.setTextureOffset(30, 38).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		hornthingR = new ModelRenderer(this);
		hornthingR.setRotationPoint(2.6F, -3.0F, -4.0F);
		head.addChild(hornthingR);
		setRotationAngle(hornthingR, 0.2662F, 0.0489F, 0.1963F);
		hornthingR.setTextureOffset(0, 9).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		teeth1 = new ModelRenderer(this);
		teeth1.setRotationPoint(0.0F, 1.0F, -2.0F);
		head.addChild(teeth1);
		teeth1.setTextureOffset(36, 0).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		arm1L = new ModelRenderer(this);
		arm1L.setRotationPoint(-5.0F, 5.7907F, -7.3951F);
		bodycentral.addChild(arm1L);
		setRotationAngle(arm1L, 0.9817F, 0.0F, 0.0F);
		arm1L.setTextureOffset(36, 63).addBox(-1.01F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		arm2L = new ModelRenderer(this);
		arm2L.setRotationPoint(0.0F, 2.75F, 0.0F);
		arm1L.addChild(arm2L);
		setRotationAngle(arm2L, -1.3744F, 0.0F, 0.0F);
		arm2L.setTextureOffset(62, 30).addBox(-0.99F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		handL = new ModelRenderer(this);
		handL.setRotationPoint(0.0F, 3.75F, 0.0F);
		arm2L.addChild(handL);
		setRotationAngle(handL, -0.1963F, 0.0F, 0.0983F);
		handL.setTextureOffset(38, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		handclaw1L = new ModelRenderer(this);
		handclaw1L.setRotationPoint(-0.5F, 2.0F, 0.5F);
		handL.addChild(handclaw1L);
		setRotationAngle(handclaw1L, 0.0052F, 0.0F, -0.6655F);
		handclaw1L.setTextureOffset(0, 27).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		handclaw2L = new ModelRenderer(this);
		handclaw2L.setRotationPoint(-0.5F, 2.0F, -0.5F);
		handL.addChild(handclaw2L);
		setRotationAngle(handclaw2L, -0.011F, 0.0F, -0.5346F);
		handclaw2L.setTextureOffset(30, 30).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);

		handclaw3L = new ModelRenderer(this);
		handclaw3L.setRotationPoint(-0.5F, 1.0F, -1.0F);
		handL.addChild(handclaw3L);
		setRotationAngle(handclaw3L, -0.2182F, 0.0F, -0.6655F);
		handclaw3L.setTextureOffset(10, 0).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		arm1R = new ModelRenderer(this);
		arm1R.setRotationPoint(5.0F, 5.7907F, -7.3951F);
		bodycentral.addChild(arm1R);
		setRotationAngle(arm1R, 0.9817F, 0.0F, 0.0F);
		arm1R.setTextureOffset(56, 9).addBox(-0.99F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		arm2R = new ModelRenderer(this);
		arm2R.setRotationPoint(0.0F, 2.75F, 0.0F);
		arm1R.addChild(arm2R);
		setRotationAngle(arm2R, -1.3744F, 0.0F, 0.0F);
		arm2R.setTextureOffset(26, 51).addBox(-1.01F, 0.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		handR = new ModelRenderer(this);
		handR.setRotationPoint(0.0F, 3.75F, 0.0F);
		arm2R.addChild(handR);
		setRotationAngle(handR, -0.1963F, 0.0F, -0.0983F);
		handR.setTextureOffset(38, 38).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		handclaw1R = new ModelRenderer(this);
		handclaw1R.setRotationPoint(0.5F, 2.0F, 0.5F);
		handR.addChild(handclaw1R);
		setRotationAngle(handclaw1R, 0.0052F, 0.0F, 0.6655F);
		handclaw1R.setTextureOffset(0, 27).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		handclaw2R = new ModelRenderer(this);
		handclaw2R.setRotationPoint(0.5F, 2.0F, -0.5F);
		handR.addChild(handclaw2R);
		setRotationAngle(handclaw2R, -0.011F, 0.0F, 0.5346F);
		handclaw2R.setTextureOffset(30, 30).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		handclaw3R = new ModelRenderer(this);
		handclaw3R.setRotationPoint(0.5F, 1.0F, -1.0F);
		handR.addChild(handclaw3R);
		setRotationAngle(handclaw3R, -0.2182F, 0.0F, 0.6655F);
		handclaw3R.setTextureOffset(10, 0).addBox(-0.5F, 0.0F, -0.25F, 1.0F, 6.0F, 1.0F, 0.0F, false);
	
		
	}



	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		root.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(TestEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		if(!setup) {
		setupAnimation(entityIn);
		setup=true;
		}
		walking.interpolate(limbSwing, limbSwingAmount);
		//System.out.println(leg1R.rotateAngleX);
		//System.out.println(entityIn.getEntityWorld().getGameTime()+Minecraft.getInstance().getRenderPartialTicks());
		
		
	}
	private void setupAnimation(TestEntity entityIn) {
		walking = new LivingAnimation(entityIn,80F);
		walking.addKeyFrame(new KeyFrame(leg1L, -11.25F, 0, 0, 0));
		
		walking.addKeyFrame(new KeyFrame(leg1L, -30.25F, 0, 0, 20));
		walking.addKeyFrame(new KeyFrame(leg1L, -30.25F, 0, 0, 40));
		walking.addKeyFrame(new KeyFrame(leg1L, -11.25F, 0, 0, 80));
		
		
		
	}

}