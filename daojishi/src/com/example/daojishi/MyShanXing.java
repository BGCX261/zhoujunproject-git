package com.example.daojishi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;

public class MyShanXing extends View {
	Paint paint = new Paint();
    float phase;//0到1之间变化
	public MyShanXing(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		RadialGradient rg = new RadialGradient(75, 75, 75, Color.argb(255,
				143, 201, 233), Color.argb(255, 166, 212, 235), TileMode.MIRROR);// 渐变
		this.paint.setShader(rg);//圆形渐变进行渲染
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		int center = getWidth();
		this.paint.setAntiAlias(true);
		RectF oval = new RectF(0, 0, getWidth(), getHeight());
		//canvas.drawArc(oval, 0, 270, true, paint); //0读到270进行RadialGradient渲染画扇形
		canvas.drawArc(oval, 0, phase, true, paint);
	}
	
	public void setPhase(float phase){
		this.phase=phase;
		invalidate();
	}
}
