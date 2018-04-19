package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Diabities_lokkonActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
       
             
         tv.setText(" জেনে নিন, ডায়াবেটিসের ৭ টি লক্ষণ:" +
"১.ঘন ঘন তৃষ্ণার্ত হয়ে যাওয়া এবং মুখ শুকিয়ে যাওয়া" +
"২.ঘন ঘন প্রস্রাবের চাপ আসা এবং প্রচুর প্রস্রাব হওয়া" +

"৩.ক্ষুধা বৃদ্ধি" + 
"৪. ওজন কমে যাওয়া (বেশি খাওয়ার পরেও ওজন না বাড়া)" +
"৫. দুর্বলতা (সামান্য পরিশ্রমেই আচ্ছন্নতা ও ক্লান্তি)" +

"৬. ঘন ঘন সংক্রমণ, ক্ষত আরোগ্য হতে দেরি হওয়া। দেহের বিভিন্ন অঙ্গে ফাঙ্গাস সংক্রমণ হওয়া। বিশেষ করে যেসব অংশ ঢেকে থাকে সেসব অংশে ঘন ঘন চুলকানি হওয়া " +
"৭. দৃষ্টি ঘোলা হয়ে যাওয়া।" +
"এর কোনো লক্ষণ মিলে গেলেই যে আপনার ডায়াবেটিস হয়েছে, এমনটা বলা যাবে না। " +
"তবে চিকিৎসকের পরামর্শ নিয়ে ডায়াবেটিস পরীক্ষা করে দেখতে হবে।" +
"এক্ষেত্রে আপনার যদি ডায়াবেটিস নির্ণীত হয় তাহলেও চিন্তার কিছু নেই।" +
"সঠিক নিয়ম মেনে চললে ডায়াবেটিস রোগী সুস্থ থাকতে পারে।" +
"আর রোগটি যদি নির্ণয় করা না হয় তাহলেই বিপদ। কারণ এতে রোগীর দেহে অজান্তেই মারাত্মক ক্ষতি করতে পারে রোগটি, যার কারণে মৃত্যুও হতে পারে।");      
	}}