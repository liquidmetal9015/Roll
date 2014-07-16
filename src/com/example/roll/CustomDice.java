package com.example.roll;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class CustomDice extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.custom_roll);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		Button go = (Button) findViewById(R.id.button1);

		go.setOnClickListener(new View.OnClickListener() {

			TextView result = (TextView) findViewById(R.id.textView4);
			EditText Dice = (EditText) findViewById(R.id.editText1);
			EditText Sucess = (EditText) findViewById(R.id.editText2);

			CheckBox roll2 = (CheckBox) findViewById(R.id.roll2);
			CheckBox roll3 = (CheckBox) findViewById(R.id.roll3);
			CheckBox roll4 = (CheckBox) findViewById(R.id.roll4);
			CheckBox roll5 = (CheckBox) findViewById(R.id.roll5);

			EditText roll2s = (EditText) findViewById(R.id.roll2s);
			EditText roll3s = (EditText) findViewById(R.id.roll3s);
			EditText roll4s = (EditText) findViewById(R.id.roll4s);
			EditText roll5s = (EditText) findViewById(R.id.roll5s);

			@Override
			public void onClick(View v) {

				

				String input = Dice.getText().toString();
				int in = Integer.parseInt(input);

				String success = Sucess.getText().toString();
				int goodDice = Integer.parseInt(success);

				int sucessRolls = AppUtils.test(goodDice, in);

				if (roll2.isChecked()) {

					sucessRolls = AppUtils.test(Integer.parseInt(roll2s.getText().toString()), sucessRolls);
				}

				if (roll3.isChecked()) {
					sucessRolls = AppUtils.test(Integer.parseInt(roll3s.getText().toString()), sucessRolls);
				}

				if (roll4.isChecked()) {
					sucessRolls = AppUtils.test(Integer.parseInt(roll4s.getText().toString()), sucessRolls);
				}

				if (roll5.isChecked()) {
					sucessRolls = AppUtils.test(Integer.parseInt(roll5s.getText().toString()), sucessRolls);
				}

				result.setText(sucessRolls + " sucessful rolls \n "
						+ (in - sucessRolls) + " failed rolls");
			}

		});

	}

	/*
	 * 
	 * @Override public boolean onOptionsItemSelected(MenuItem item){ switch
	 * (item.getItemId()) {
	 * 
	 * case android.R.id.home: NavUtils.navigateUpFromSameTask(this);
	 * //overridePendingTransition(R.anim.slide_in_top,
	 * R.anim.slide_out_bottom); return true; } return
	 * super.onOptionsItemSelected(item); }
	 */

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.other, menu);
		return true;
	}

	// @Override
	// public boolean onOptionsItemSelected(MenuItem item) {
	// // Handle action bar item clicks here. The action bar will
	// // automatically handle clicks on the Home/Up button, so long
	// // as you specify a parent activity in AndroidManifest.xml.
	// int id = item.getItemId();
	// if (id == R.id.action_settings) {
	// return true;
	// }
	// return super.onOptionsItemSelected(item);
	// }
}