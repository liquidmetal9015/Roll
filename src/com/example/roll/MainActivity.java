package com.example.roll;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        
        Button cRoll = (Button)findViewById(R.id.cRollBut);
        Button meleeBut = (Button)findViewById(R.id.meleeBut);
        Button shootBut = (Button)findViewById(R.id.shootBut);
        Button scatterBut = (Button)findViewById(R.id.scatterBut);
        
        ImageView settings = (ImageView)findViewById(R.id.settings);        
        
        cRoll.setOnClickListener(new View.OnClickListener() {
        	
        	@Override
        	public void onClick(View v){
        	
        		Intent intent = new Intent(MainActivity.this, CustomDice.class);
        		startActivity(intent);
        		
        	}
        	
        });
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
