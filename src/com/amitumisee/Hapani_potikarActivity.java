package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Hapani_potikarActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
		 tv.setText("১।মানসিক শান্তির চেষ্টা করিতে হইবে এবং মানসিক রোগ থাকিলে তাহার চিকিৎসা করিতে হবে। "+
"২।হালকা ব্যায়াম ও হালকা পুষ্টিকর পথ্য দিতে হইবে। "+
"৩।রোগির ঘরে বায়ু চলাচলের ব্যবস্থা যেন থাকে এমন ঘরে রোগিকে রাখিতে হবে। ৪।যখন হাপানি বেশি হয়। "+
"৪।ধাতুরা পাতা পুড়িয়ে গন্ধ নিলে উপকার হয়। "+
"৫।ঠান্ডা,ধুলোবালির কাজ এড়িয়ে চলিতে হইবে। "+
"৬।কাডিয়াক এ্যাজমা রোগিকে হ্দ রোগের চিৎকিসা নিতে হবে। inhaler ব্যবহার বাড়িতে শিখাইতে হবে।  ");
	}
}