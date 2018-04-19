package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class cencer_lokkonActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
       
             
         tv.setText(" একেক ক্যান্সারের জন্য একেক ধরনের লক্ষণ বা উপসর্গ থাকে। তবে সাধারণ কিছু লক্ষণ হচ্ছে: খুব ক্লান্ত বোধ করা  শরীরের যে কোনজায়গায় চাকা বা দলা দেখা দেয়া  দীর্ঘস্থায়ী কাশি বা গলা ভাঙ্গা  মলত্যাগে পরিবর্তন আসা (ডায়রিয়া, কোষ্ঠকাঠিন্য কিংবা মলের সাথে রক্ত যাওয়া) জ্বর, রাতে ঠান্ডা লাগা বা ঘেমে যাওয়া  অস্বাভাবিকভাবে ওজন কমা  অস্বাভাবিক রক্তপাত হওয়া  ত্বকের পরিবর্তন দেখা যাওয়া");
         
	}}