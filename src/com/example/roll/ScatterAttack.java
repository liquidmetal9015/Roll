package com.example.roll;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ScatterAttack extends ActionBarActivity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scatter_die);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		Button go = (Button)findViewById(R.id.button1);
		
		
		
		go.setOnClickListener(new View.OnClickListener() {
			
			TextView result = (TextView)findViewById(R.id.textView2);
        	ImageView arrow = (ImageView)findViewById(R.id.imageView1);
        	
        	@Override
        	public void onClick(View v){
        		
        		
        		if(AppUtils.roll() >= 5){
        			arrow.setRotation(0);
        			arrow.setImageResource(R.drawable.target);
        			result.setText("Hit!!!!!!");
        			
        		}else {
        			arrow.setImageResource(R.drawable.arrow);
        	arrow.setRotation((int)Math.ceil(Math.random()*360));	
        	
        	int rolls = AppUtils.roll() + AppUtils.roll();
        		
        		result.setText("Roll Result: " + rolls);
        		
        		}
        		
        	}
        	
        });
		
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