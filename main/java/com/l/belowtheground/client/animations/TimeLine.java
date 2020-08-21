package com.l.belowtheground.animations;

import java.util.ArrayList;
import java.util.Collections;

import net.minecraft.client.renderer.model.ModelRenderer;

public class TimeLine {
private ModelRenderer model;
private ArrayList<KeyFrame> keyFrames = new ArrayList<KeyFrame>();

	public TimeLine(ModelRenderer model) {
		this.model=model;
		
		
	}
	public ModelRenderer getModel() {
		return model;
	}
	public float getTime(float timeIn) {
		float previous=0;
		KeyFrame activeFrame=new KeyFrame(model, model.rotateAngleX, model.rotateAngleY, model.rotateAngleZ, 0);
		KeyFrame previousFrame=new KeyFrame(model, model.rotateAngleX, model.rotateAngleY, model.rotateAngleZ, 0);
		ArrayList<Float> times = new ArrayList<Float>();
	for(KeyFrame frame : keyFrames) {
		times.add(frame.getTime());
	}
	Collections.sort(times);
	for(Float time : times) {
		System.out.println(time);
		//System.out.println(time);
		if(time>timeIn) {
			for(KeyFrame frame : keyFrames) {
				if(frame.getTime()==time) {
					//System.out.println(frame.getTime());
					activeFrame=frame;
					break;
				}

			}
			for(KeyFrame frame : keyFrames) {
				if(frame.getTime()==previous) {
					//System.out.println(frame.getTime());
					previousFrame=frame;
					break;
				}
			}
			break;
		}
		previous=time;
	}
	return sInterpolate(activeFrame.getTime(), previousFrame.getTime(), timeIn, activeFrame.getX(), previousFrame.getX());
	
	
	}
	public void addKeyFrame(KeyFrame frame) {
		keyFrames.add(frame);
	}
	public float sInterpolate(float firstTime, float secondTime, float time, float firstAngle, float secondAngle) {
		//System.out.println("ft "+firstTime+" st "+secondTime+" t "+time+" fa "+firstAngle+" sa "+secondAngle);
		float angle;
		float a = firstTime-secondTime;
		float b = 1/a;
		float c = b*(time-secondTime);
		float angl1 = firstAngle-secondAngle;
		if(angl1<0) {
			 angle = Math.abs(angl1)*(1-c)+firstAngle;
		}
		else {
		 angle = angl1*c+secondAngle;
		}
		return angle;
	}

}
