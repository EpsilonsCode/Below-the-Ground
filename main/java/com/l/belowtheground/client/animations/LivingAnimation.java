package com.l.belowtheground.animations;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.util.math.MathHelper;

public class LivingAnimation {
	float timeIn = 0;
	private float timeAmount;
	private CreatureEntity entityIn;
	private boolean executing = false;
	private ArrayList<TimeLine> timeLines = new ArrayList<TimeLine>();
	public LivingAnimation(CreatureEntity e, float timeAmount) {
		entityIn = e;
		this.timeAmount = timeAmount;
	}
	public void addKeyFrame(KeyFrame keyFrame) {
		for(TimeLine timeLine : timeLines) {
			if(timeLine.getModel() == keyFrame.getModel()){
				timeLine.addKeyFrame(keyFrame);
			return;
			
				
			
		}
	}
		TimeLine newTimeLine = new TimeLine(keyFrame.getModel());
		timeLines.add(newTimeLine);
		newTimeLine.addKeyFrame(keyFrame);
	}
	public void transition(float time) {
		
	}
	public void interpolate(float limbSwing, float limbSwingAmount) {
		if(!executing) {
			timeIn = entityIn.getEntityWorld().getGameTime();
			executing=true;
		}
		if(executing) {
		float time = entityIn.getEntityWorld().getGameTime()+Minecraft.getInstance().getRenderPartialTicks()-timeIn;
		if(time>timeAmount) {
			float bruh=time-timeAmount;
			timeIn = entityIn.getEntityWorld().getGameTime();
			time = entityIn.getEntityWorld().getGameTime()+Minecraft.getInstance().getRenderPartialTicks()-timeIn+bruh;
		}
		for(TimeLine timeLine : timeLines) {
			timeLine.getModel().rotateAngleX=(float) Math.toRadians(timeLine.getTime(time));
			}
		}
	}
}
