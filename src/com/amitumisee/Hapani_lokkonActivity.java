package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Hapani_lokkonActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
       
             
         tv.setText(" হঠাৎ এই রোগে হলে দম বন্ধ হইবার উপকম হয়। "+

"ঘুমের ঘোরে এই রোগ শুরু হইলে রোগি হঠাৎ উঠিয়া বসে এবং অত্যন্ত শ্বাস কষ্ট হয়। "+

"শ্বাস ফেলিবার সময় রোগি কষ্ট অনুবব হয়। "+

"শ্বাস প্রশ্বাস গ্রহন ও ফেলার কাজ দূর হইতে বুঝা যায়। মাঝে মাঝে জ্বর আসে। "+

"জ্বর থাকরে শ্বাস কষ্ট বৃদ্ধি হয়। রোগির কাশ থাকে, তবে কফ বের হয় না। একটি লক্ষন দেখলে বেশি বুঝা যায়... শ্বাস টানিতে বলিলে পাজরের মাংসপেশি ও গলার গোড়ার মাংস পেশি নিচের দিকে যায়,আবার ণিঃশ্বাস ছাড়ার সময় উচু হইয়া উঠে।");
         
	}}