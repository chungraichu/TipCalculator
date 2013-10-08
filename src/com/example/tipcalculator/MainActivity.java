package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button btn10 = (Button) findViewById(R.id.btn10);
        Button btn15 = (Button) findViewById(R.id.btn15);
        Button btn20 = (Button) findViewById(R.id.btn20);
        ((TextView)findViewById(R.id.output)).setText("Tip is : (need a valid input)");
        
        btn10.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		Log.d("DEBUG", "Inside 10% button");
        		try {
	        		double input = Double.parseDouble(((EditText) findViewById(R.id.input)).getText().toString());
	        		((TextView)findViewById(R.id.output)).setText(String.format("Tip is : %.2f", input*0.2));
        		} catch (Exception e) {
        			((TextView)findViewById(R.id.output)).setText("Tip is : (need a valid input)");
        			Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
        		}
        	}
        });
        
        btn15.setOnClickListener(new OnClickListener(){	 
        	@Override
        	public void onClick(View v){
        		Log.d("DEBUG", "Inside 15% button");
        		try {
	        		double input = Double.parseDouble(((EditText) findViewById(R.id.input)).getText().toString());
	        		((TextView)findViewById(R.id.output)).setText(String.format("Tip is : %.2f", input*0.15));
        		} catch (Exception e) {
        			((TextView)findViewById(R.id.output)).setText("Tip is : (need a valid input)");
        			Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
        		}
        	}
        });
        
        btn20.setOnClickListener(new OnClickListener(){ 
        	@Override
        	public void onClick(View v){
        		Log.d("DEBUG", "Inside 20% button");
        		try {
        			double input = Double.parseDouble(((EditText) findViewById(R.id.input)).getText().toString());
        			((TextView)findViewById(R.id.output)).setText(String.format("Tip is : %.2f", input*0.2));
        		} catch (Exception e) {
        			((TextView)findViewById(R.id.output)).setText("Tip is : (need a valid input)");
        			Toast.makeText(getBaseContext(), "Invalid Input", Toast.LENGTH_LONG).show();
        		}
        	}
        });
    }    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
