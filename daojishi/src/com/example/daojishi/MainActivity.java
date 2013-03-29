package com.example.daojishi;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;



public class MainActivity extends Activity {
	MyShanXing myShanXing;
	Handler handler;
	float phase=0;
	private Timer timer; 
	Button button;
	ImageView imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		handler = new Handler() {
			@Override
			public void handleMessage(Message msg) {
				if(msg.what==111){
					
					myShanXing.setPhase(phase);
				}

			}

		};
		
		myShanXing = (MyShanXing) findViewById(R.id.myShangXing);
		imageView=(ImageView) findViewById(R.id.img);
		button = (Button)findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				imageView.startAnimation(new MyAnimation(imageView.getWidth(), imageView.getHeight()));
				
			}
		});
		
		timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				phase+=0.6;
				handler.sendEmptyMessage(111);
				if(phase>=1){
					
				}

			}
		}, 0, 100);
	}
    @Override
    protected void onDestroy() {
    	timer.cancel();
    	super.onDestroy();
    }
}
