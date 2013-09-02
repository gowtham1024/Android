package com.streak.test1;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Textplay extends Activity implements View.OnClickListener{
	Button b1;
	ToggleButton t1;
	 EditText et1;
	 TextView txt1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		b1 = (Button) findViewById(R.id.btnres);
		 t1 = (ToggleButton) findViewById(R.id.tbpass);
		 et1 = (EditText) findViewById(R.id.etCommands);
		txt1 = (TextView) findViewById(R.id.tViewI);
		
		t1.setOnClickListener(this);
		b1.setOnClickListener(this);
			
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId())
		{
		case R.id.btnres:
		{
			
			String check = et1.getText().toString();
			if(check.contentEquals("left"))
			{
				txt1.setGravity(Gravity.LEFT);
			}
			else if (check.contentEquals("center"))
			{
				txt1.setGravity(Gravity.CENTER);
			}
			else if (check.contentEquals("right"))
			{
				txt1.setGravity(Gravity.RIGHT);
			}
			else if (check.contentEquals("green"))
			{
				txt1.setTextColor(Color.GREEN);
			}
			else if (check.contentEquals("blue"))
			{
				txt1.setTextColor(Color.BLUE);
			}
			else if (check.contentEquals("red"))
			{
				txt1.setTextColor(Color.RED);
			}
			else if (check.contentEquals("WTF"))
			{
				Random crazy = new Random();
				txt1.setText("WTF!!!");
				txt1.setTextSize(crazy.nextInt(70));
				txt1.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));
						
			}
			break;
		}
		case R.id.tbpass:
		{
			if(t1.isChecked())
			{
				et1.setInputType(InputType.TYPE_CLASS_TEXT  | InputType.TYPE_TEXT_VARIATION_PASSWORD);
			}
			else
			{
				et1.setInputType(InputType.TYPE_CLASS_TEXT);
			}
			break;
		}
		}
	}
	
	

}
