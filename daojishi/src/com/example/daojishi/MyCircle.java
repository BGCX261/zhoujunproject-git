package com.example.daojishi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyCircle extends View {

	Paint paint = new Paint();

	public MyCircle(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		float center = getWidth() / 2;
		this.paint.setAntiAlias(true);// û�о��
		this.paint.setStyle(Paint.Style.STROKE);// ������
		this.paint.setARGB(155, 167, 190, 206);
		this.paint.setStrokeWidth(2);// �����������
		canvas.drawCircle(center, center, 100+20, paint);

		this.paint.setARGB(255, 212, 225, 233);
		this.paint.setStrokeWidth(5);// �м�Բ�����
		canvas.drawCircle(center, center, 100 + 1 + 5 / 2+20, this.paint);

		// ������Բ
		this.paint.setARGB(155, 167, 190, 206);
		this.paint.setStrokeWidth(2);
		canvas.drawCircle(center, center, 100 + 5+20, this.paint);
	}
}
