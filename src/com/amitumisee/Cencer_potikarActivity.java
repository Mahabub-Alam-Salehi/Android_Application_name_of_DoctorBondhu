package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Cencer_potikarActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
		 tv.setText(" গবেষণায় দেখা গেছে যে নিয়মিত কিছু ব্যাপার মেনে চললে ক্যান্সারের ঝুঁকি অনেকখানি কমানো যায়। যেমন:"+ 

"ব্যায়াম এবং ক্যান্সার প্রত্যেকদিন নিয়মিত কিছু ব্যায়াম করা যেমন-দৌড়ানো, সাইকেল চালনো, নাচ করা, হাঁটা, খাদ্যভ্যাস ও ক্যান্সার"+

"ধূমপান বা মদ্যপান ছেড়ে দেয়া বা পরিমাণ কমিয়ে আনা। পান-সুপারি জর্দা, তামাকপাতা খাওয়া বন্ধ করা। চর্বিজাতীয় পদার্থ কম খাওয়া। সম্ভব হলে মাংস খাওয়া বন্ধ করে দেয়া বা কমিয়ে দেয়া। প্রচুর পরিমাণে শাক-সবজি, ফলমূল এবঙ আঁশজাতীয় খাবার খাওয়া।"+ 

"সচেতনতা বাইরে বের হওয়ার সময় সানস্ক্রিন মেখে বের হওয়া। নিয়মিত ডাক্তার দেখানো। সেটা সম্ভব না হলে শরীরে কোন অস্বাভাবিকতা দেখা দিলেই ডাক্তারের কাছে যাওয়া। ৫০ বছরের বেশি বয়স হলে অবশ্যই নিয়মিত ডাক্তারের কাছে গিয়ে শরীর পরীক্ষা করানো।  ");
	}
}