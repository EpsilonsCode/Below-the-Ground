package com.l.belowtheground.entities;

import com.l.belowtheground.animations.AnimState;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.world.World;

public class TestEntity extends CreatureEntity {
	
	AnimState animeState = AnimState.STLL;
	

	public TestEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		
	}
	@Override
	protected void registerGoals() {
		this.goalSelector.addGoal(0, new SwimGoal(this));
	    this.goalSelector.addGoal(1, new PanicGoal(this, 0.8D));
	}
	@Override
	   protected void registerAttributes() {
		      super.registerAttributes();
		      this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
		      this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
		   }




}
