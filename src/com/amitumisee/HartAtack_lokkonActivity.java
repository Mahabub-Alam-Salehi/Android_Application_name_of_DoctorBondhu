package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class HartAtack_lokkonActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
       
             
         tv.setText(" বাতের সমস্যা সাধারণত বৃদ্ধাঙ্গুলিতে প্রথম দেখা দেয়। এর প্রধান লক্ষণগুলো হচ্ছে—"+
"— প্রদাহ"+
"— ব্যথা"+
"— অস্থিসন্ধি লাল হয়ে যাওয়া"+
"— অস্থিসন্ধি ফুলে যাওয়া ইত্যাদি।"+
"— বাতে পায়ের অঙুল নাড়াতে তীব্র ব্যথা হয়; অনেক সময় রোগীরা বলে থাকে যে, চাদরের স্পর্শেও ব্যথা লাগে। "+

"বাতের লক্ষণগুলো খুব দ্রুতই দেখা দেয়, যেমন কখনও কখনও এক দিনের মধ্যেই দেখা দেয় এবং একই সঙ্গে একটি মাত্র অস্থিসন্ধিতে লক্ষণ দেখা দেয়। বিরল ক্ষেত্রে ২-৩টি অস্থিসন্ধিতে এক সঙ্গে ব্যথা হয়। যদি অনেক স্থানে এক সঙ্গে লক্ষণ দেখা দেয়, তবে হয়তো তা বাতের কারণে নাও হতে পারে। তবে চিকিত্সা না করা হলে বাত অস্থিসন্ধির যথেষ্ট ক্ষতি করতে এমনকি চলনক্ষমতাও হ্রাস করতে পারে।");
         
	}}