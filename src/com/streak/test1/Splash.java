package com.streak.test1;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {

	MediaPlayer m1;
	@Override
	protected void onCreate(Bundle SplashScreen) {
		// TODO Auto-generated method stub
		super.onCreate(SplashScreen);
		setContentView(R.layout.splash);
		m1 = MediaPlayer.create(Splash.this, R.raw.dreams);
		m1.start();
		Thread timer = new Thread(){
			@Override
			public void run(){
				try{
					sleep(5000);
				} catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint = new Intent(Splash.this,Menu2.class);
					startActivity(openStartingPoint);
				}
				
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		m1.release();
		finish();
	}
	

}
