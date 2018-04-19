package com.amitumisee;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class madical_twoActivity extends Activity implements View.OnClickListener{
	Button img1,img2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mdcl_two_btn);
		img1=(Button) findViewById(R.id.button1);
		img2=(Button) findViewById(R.id.button2);
		
		
		
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
	        
		 img1 = (Button)findViewById(R.id.button1);
		 img1.setTypeface(tf);
		 img1.setText("মানচিত্র ");
			
		 img2 = (Button)findViewById(R.id.button2);
		 img2.setTypeface(tf);
		 img2.setText("অবস্থান");
		 
				        
		
		
		img1.setOnClickListener(this);
		img2.setOnClickListener(this);
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 switch(v.getId()) {
         case R.id.button1:
        	// Toast.makeText(null, "", 1);
        	 Intent openstartingpoint1=new Intent(getApplicationContext(), map_layout.class);
             startActivity(openstartingpoint1);
        	 
         // do stuff;
         break;
         case R.id.button2:
        	// Toast.makeText(null, "", 1);
        	 Intent openstartingpoint11=new Intent(getApplicationContext(), myMdclActivity.class);
             startActivity(openstartingpoint11);
        	 
             // do stuff;
             break;
         
        	 
		
		
	}
	}
}
