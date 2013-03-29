package com.example.daojishi;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class MyAnimation extends Animation {
	private int width;
	private int height;
   
    
	public MyAnimation(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void initialize(int width, int height, int parentWidth,
			int parentHeight) {
		// TODO Auto-generated method stub
		
		super.initialize(width, height, parentWidth, parentHeight);
		setFillAfter(true);
		setDuration(500);
		setInterpolator(new AccelerateDecelerateInterpolator()); //选择一个先加速后减速的效果


	}

	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		// TODO Auto-generated method stub
		Matrix matrix = t.getMatrix();
		if(interpolatedTime< 0.8){
			matrix.setScale(1.0f+interpolatedTime, 1.0f-interpolatedTime/0.8f, width/2, height/2);
			
		}else {
			matrix.setScale(1.0f-interpolatedTime, 0, width/2, height/2);
		}
	}

}
