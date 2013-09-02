package com.streak.test1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	String classes[] = {"MainActivity","Scren","Splash","Email","example4","example5","example6"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String pos = classes[position];
		try{
		Class c1 = Class.forName("com.streak.test1." + pos);
		Intent i1 = new Intent(Menu.this,c1);
		startActivity(i1);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

	

}
