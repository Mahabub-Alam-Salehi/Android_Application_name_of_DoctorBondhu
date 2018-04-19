package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class HartAtack_potikarActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
		 tv.setText("ধুমপান না করা।"+

"2.মাদক থেকে দূরে থাকা।"+

"3.দুশ্চিন্তা না করা।"+

"4.রক্তচাপ স্বাভাবিক রাখা।"+

"5.ডায়াবেটিস নিয়ন্ত্রন।"+

"6.কলেস্টেরন নিয়ন্ত্রন।"+

"7.চর্বি জাতীয় খাদ্য কম খাওয়া।"+

"8.শাকসবজি – ফল বেশি খাওয়া।"+

"9.দেহের অতিরিক্ত ওজন ঝেড়ে ফেলা।"+

"10.প্রতিদিন শারীরিক ব্যায়াম করা । অন্তত ৩০ মিনিট হাঁটা।");
	}
}