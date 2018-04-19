package com.amitumisee;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class myMdclActivity extends Activity implements View.OnClickListener {
Button bt1,btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mdcl_two_btn);
		bt1=(Button) findViewById(R.id.button1);
		btn2=(Button) findViewById(R.id.button2);
		

		
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
	        
		 bt1 = (Button)findViewById(R.id.button1);
		 bt1.setTypeface(tf);
		 bt1.setText("মানচিত্র ");
			
		 btn2 = (Button)findViewById(R.id.button2);
		 btn2.setTypeface(tf);
		 btn2.setText("অবস্থান");
		 
				        
		
		bt1.setOnClickListener(this);
		bt1.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()) {
        case R.id.button1:
        	
        	Intent openstartingpoint1=new Intent(getApplicationContext(), map_layout.class);
            startActivity(openstartingpoint1);
       	 
        	break;
        case R.id.button2:
        	break;
		}
	}

}
