package com.l.belowtheground.entities;

import javax.annotation.Nullable;

import com.l.belowtheground.BelowTheGround;


import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class TestEntityRenderer extends MobRenderer<TestEntity, TestEntityModel> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(BelowTheGround.MODID, "textures/model/entity/baryonyx/baryonyx_brown_female.png");
	
	public TestEntityRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new TestEntityModel(), 0.5F);

	}
	@Nullable
	@Override
	public ResourceLocation getEntityTexture(TestEntity entity) {

		return TEXTURE;
	}

}
