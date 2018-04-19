package com.amitumisee;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class all_madicall_listActivity extends Activity implements View.OnClickListener{
	Button img1,img2,img3,img4,img5,img6,img7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.madical_list_layout);
		img1=(Button) findViewById(R.id.button1);
		img2=(Button) findViewById(R.id.button2);
		img3=(Button) findViewById(R.id.button3);
		img4=(Button) findViewById(R.id.button4);
		img5=(Button) findViewById(R.id.button5);
		
		
		
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
	        
		 img1 = (Button)findViewById(R.id.button1);
		 img1.setTypeface(tf);
		 img1.setText("ঢাকা মেডিকেল কলেজ হাসপাতাল ");
			
		 img2 = (Button)findViewById(R.id.button2);
		 img2.setTypeface(tf);
		 img2.setText("চট্টগ্রাম মেডিকেল কলেজ");
		    
		 img3 = (Button)findViewById(R.id.button3);
		 img3.setTypeface(tf);
		 img3.setText("সিলেট এম.এ জি ওসমানি মেডিক্যাল কলেজ");
			         
		 img4 = (Button)findViewById(R.id.button4);
		 img4.setTypeface(tf);
		 img4.setText("রাজশাহী মেডিকেল কলেজ");
		 
		 img5 = (Button)findViewById(R.id.button5);
		 img5.setTypeface(tf);
		 img5.setText("বরিশাল   মেডিকেল কলেজ");
				        
		
		
		img1.setOnClickListener(this);
		img2.setOnClickListener(this);
		img3.setOnClickListener(this);
		img4.setOnClickListener(this);
		img5.setOnClickListener(this);
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 switch(v.getId()) {
         case R.id.button1:
        	// Toast.makeText(null, "", 1);
        	 Intent openstartingpoint1=new Intent(getApplicationContext(), myMdclActivity.class);
             startActivity(openstartingpoint1);
        	 
         // do stuff;
         break;
         case R.id.button2:
        	// Toast.makeText(null, "", 1);
        	 Intent openstartingpoint11=new Intent(getApplicationContext(), myMdclActivity.class);
             startActivity(openstartingpoint11);
        	 
             // do stuff;
             break;
         case R.id.button3:
        	 Intent openstartingpoint2=new Intent(getApplicationContext(), myMdclActivity.class);
             startActivity(openstartingpoint2);
        	 
             // do stuff;
             break;
         case R.id.button4:
             // do stuff;
        	 Intent openstartingpoint3=new Intent(getApplicationContext(), myMdclActivity.class);
             startActivity(openstartingpoint3);
        	 
             break;
         case R.id.button5:
             // do stuff;
        	 Intent openstartingpoint33=new Intent(getApplicationContext(), myMdclActivity.class);
             startActivity(openstartingpoint33);
        	 
             break;
        
        	 
		
		
	}
	}
}
