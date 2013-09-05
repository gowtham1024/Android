package com.streak.test1;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;



public class Camera extends Activity implements View.OnClickListener {
	
	ImageButton ib;
	Button b1;
	ImageView iv;
	Intent i;
	int cameraRes;
	final static int camData=0;
	Bitmap bmp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photo); 
		initial();
		InputStream is = getResources().openRawResource(R.drawable.ic_launcher);
		bmp = BitmapFactory.decodeStream(is);
	}
	public void initial()
	{
		ib = (ImageButton) findViewById(R.id.ibtakepic);
		b1 = (Button) findViewById(R.id.btnsetwall);
		iv = (ImageView) findViewById(R.id.ivReturnedpic);
		
		ib.setOnClickListener(this);
		b1.setOnClickListener(this);
		
	}
	@SuppressWarnings("deprecation")
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.ibtakepic:
			i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(i,camData);
			
			break;
		
		case R.id.btnsetwall:
			try
			{
				getApplicationContext().setWallpaper(bmp);
				
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			break;
		}
		
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(resultCode == RESULT_OK) //if operation succeeded
		{
			 Bundle extras = data.getExtras();
			 bmp = (Bitmap) extras.get("data");
			 iv.setImageBitmap(bmp);
		}
	}
	
	
	

}
