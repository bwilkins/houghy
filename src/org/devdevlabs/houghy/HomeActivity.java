package org.devdevlabs.houghy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.home);
    }
    
    @Override
    public void onStart() {
    	super.onStart();
        Button startCamera = (Button) findViewById(R.id.startCamera);
        startCamera.setOnClickListener(mCorkyListener);
    }
    
 // Create an anonymous implementation of OnClickListener
    private OnClickListener mCorkyListener = new OnClickListener() {
        public void onClick(View v) {
          // do something when the button is clicked
            Intent myIntent = new Intent(v.getContext(), ViewCaptureActivity.class);
            startActivityForResult(myIntent, 0);
        }
    };

}