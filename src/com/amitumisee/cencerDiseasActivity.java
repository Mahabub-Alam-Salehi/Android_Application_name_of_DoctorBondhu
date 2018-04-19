package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class cencerDiseasActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		 tv.setTypeface(tf);
         
      
         tv.setText("ক্যান্সার কি?"+
"     "+
"ক্যান্সার বা কর্কটরোগ অনিয়ন্ত্রিত কোষ বিভাজন সংক্রান্ত রোগসমূহের সমষ্টি। এখনও পর্যন্ত এই রোগে মৃত্যুর হার অনেক বেশি। কারণ হচ্ছে প্রাথমিক অবস্থায় ক্যান্সার রোগ সহজে ধরা পরে না, ফলে শেষ পর্যায়ে গিয়ে ভালো কোনও চিকিৎসা দেয়াও সম্ভব হয় না। বাস্তবিক অর্থে এখনও পর্যন্ত ক্যান্সারের চিকিৎসায় পুরোপুরি কার্যকর কোনও ওষুধ আবিষ্কৃত হয় নি। ক্যান্সার সারানোর জন্য বিভিন্ন ধরেনর চিকিৎসা পদ্ধতি প্রয়োগ করা হয়। তবে প্রাথমিক অবস্থায় ধরা পরলে এই রোগ সারানোর সম্ভাবনা বেড়ে যায় অনেকখানি। ২০০ প্রকারেরও বেশি ক্যান্সার রয়েছে। প্রত্যেক ক্যান্সারই আলাদা আলাদা এবং এদের চিকিৎসা পদ্ধতিও আলাদা। ");
       
		
	}
	

}
