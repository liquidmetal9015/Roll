package com.example.roll;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MeleeAttack extends ActionBarActivity {
	
	
	private static int[][] melee = {{4,4,5,5,5,5,5,5,5,5},
									{3,4,4,4,5,5,5,5,5,5},
									{3,3,4,4,4,4,5,5,5,5},
									{3,3,3,4,4,4,4,4,5,5},
									{3,3,3,3,4,4,4,4,4,4},
									{3,3,3,3,3,4,4,4,4,4},
									{3,3,3,3,3,3,4,4,4,4},
									{3,3,3,3,3,3,3,4,4,4},
									{3,3,3,3,3,3,3,3,4,4},
									{3,3,3,3,3,3,3,3,3,4}
	
	};
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.melee_attack);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		
		
	}
/*
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
	    switch (item.getItemId()) {
	 
	    case android.R.id.home:
	        NavUtils.navigateUpFromSameTask(this);
	        //overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}
*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.other, menu);
		return true;
	}

//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// Handle action bar item clicks here. The action bar will
//		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
}