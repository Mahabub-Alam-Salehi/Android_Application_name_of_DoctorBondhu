package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class DiabitiesDiseasActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		 tv.setTypeface(tf);
         
      
         tv.setText("ডায়াবেটিস রোগটি দুই প্রকার :" +
        		 "১.ডায়াবেটিস মেলাইটাস (Mellitus)" +
        		 "২.ডায়াবেটিস ইন্সিপিডাস (Insipidus)" +

				"ডায়াবেটিস মেলাইটাস (Mellitus): ডায়াবেটিস মেলাইটাসও কিন্ত আবার দুই প্রকার – " +
				"টাইপ ওয়ানঃ যে ডায়াবেটিস শিশুকাল বা বাল্যকাল থেকেই শুরু হয় তা হলো টাইপ ওয়ান।" +
				"টাইপ টুঃ যেটা ৪০ বছরের কাছা কাছি শুরু হয় সেটা টাইপ টু।" +

        		 "ডায়াবেটিস ইন্সিপিডাস (Insipidus): ডায়াবেটি্স ইনসিপিডাস হলে কিন্ত রক্তে সুগার বাড়ে না একটুও। মস্তিস্ক নিঃসৃত হরমোনের অভাবে অথবা কিডনি সমস্যার কারনে এমনটি হতে পারে।   ");
       
		
	}
	

}
