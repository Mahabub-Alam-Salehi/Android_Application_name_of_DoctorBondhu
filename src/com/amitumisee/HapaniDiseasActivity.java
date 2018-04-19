package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class HapaniDiseasActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		 tv.setTypeface(tf);
         
      
         tv.setText("হাপানি কয়েক রকমের হয়... "+
"১।ইডিওপ্যাথিক এ্যাজমা"+
"২।সেকেন্ডারি এ্যাজমা "+
"৩।কাডিয়াক এ্যাজমা "+
"৪।রেনাল এ্যাজমা");
       
		
	}
	

}
