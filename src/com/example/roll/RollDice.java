package com.example.roll;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RollDice extends ActionBarActivity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.roll_dice);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		
		EditText input = (EditText)findViewById(R.id.editText1);
		
		Button go = (Button)findViewById(R.id.button1);
		
		TextView one = (TextView)findViewById(R.id.textView3);
		TextView two = (TextView)findViewById(R.id.textView4);
		TextView three = (TextView)findViewById(R.id.textView5);
		TextView four = (TextView)findViewById(R.id.textView6);
		TextView five = (TextView)findViewById(R.id.textView7);
		TextView six = (TextView)findViewById(R.id.textView8);
		
		
go.setOnClickListener(new View.OnClickListener() {
			
        	EditText input = (EditText)findViewById(R.id.editText1);
        		
        		Button go = (Button)findViewById(R.id.button1);
        		
        		TextView one = (TextView)findViewById(R.id.textView3);
        		TextView two = (TextView)findViewById(R.id.textView4);
        		TextView three = (TextView)findViewById(R.id.textView5);
        		TextView four = (TextView)findViewById(R.id.textView6);
        		TextView five = (TextView)findViewById(R.id.textView7);
        		TextView six = (TextView)findViewById(R.id.textView8);
        	@Override
        	public void onClick(View v){
        		
        	int in = Integer.parseInt(input.getText().toString());
        	
        	int[] results = AppUtils.multiRoll(in);
        		
        	one.setText("1: " + results[0]);
        	two.setText("2: " + results[1]);
        	three.setText("3: " + results[2]);
        	four.setText("4: " + results[3]);
        	five.setText("5: " + results[4]);
        	six.setText("6: " + results[5]);
        		
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