package com.streak.test1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Scren extends Activity{
Button b1;
EditText t1 ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nxt);
		b1= (Button) findViewById(R.id.btn11);
		t1 = (EditText) findViewById(R.id.edit1);
		b1.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String s = t1.getText().toString();
				if(s=="")
				{
					//Toast.makeText(getApplicationContext(), t1.toString() , Toast.LENGTH_SHORT).show();
					Toast.makeText(getApplicationContext(), t1.toString(), Toast.LENGTH_LONG).show();
				}
				else
				{
								
				//Toast.makeText(getApplicationContext(),  t1.toString() , Toast.LENGTH_SHORT).show();
				Toast.makeText(getApplicationContext(), t1.toString(), Toast.LENGTH_LONG).show();
				}
			}
		});
	}
	
	

}
