package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Kidni_potikarActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
		 tv.setText("কিডনি রোগের সুনির্দিষ্ট কোনো প্রতিরোধ ব্যবস্থা নেই। তবে কিডনি রোগের প্রকোপ থেকে বাঁচতে নিচের বিষয়গুলো মনে রাখা অত্যন্ত জরুরি :"+
"১. উচ্চ রক্তচাপ এবং ডায়াবেটিস নিয়ন্ত্রণে রাখা।"+
"২. ডায়রিয়াজনিত পানিশূন্যতার যথাযথ ব্যবস্থা নেয়া।"+
"৩. চিকিত্সকের পরামর্শ ছাড়া কোনো ওষুধ সেবন না করা। বিশেষ করে কারণে-অকারণে ব্যথানাশক ওষুধ সেবন না করা ও সব ধরনের কবিরাজি ওষুধ এড়িয়ে  চলা।"+
"৪. প্রাথমিক অবস্থায় কিডনি রোগ ধরা পড়ার সঙ্গে সঙ্গে কিডনি রোগ বিশেষজ্ঞের পরামর্শ নেয়া, যাতে স্থায়ী কিডনি বিকল রোগ প্রতিরোধ করা যায়।"+

"কিডনি সুস্থ্য রাখার ৭ টি উপায় :"+
"কিডনি ফেইলুর বা রেনাল ফেইলুর শরীরের এক নীরব ঘাতক, প্রায় প্রতিটি পরিবারেরই কেউ না কেউ এই ভয়াবহ রোগে আক্রান্ত। তাই আমরা সকলেই কমবেশী জানি এ রোগের ভোগান্তি কতটা নির্মম; কিন্ত আমরা কি জানি কিছু সাবধানতা অবলম্বন করলে সহজেই এই রোগ এড়িয়ে যাওয়া সম্ভব। আসুন জেনে নেই কিভাবে সহজেই আপনার কিডনিকে সুস্থ্য রাখা সম্ভব,"+
"১। কর্মঠ থাকুনঃ নিয়মিত হাটা,দৌড়ানো,স্লাইকিং করা বা সাতার কাটার মতো হাল্কা ব্যায়াম করে আপনার শরীরকে কর্মঠ ও সতেজ রাখুন। কর্মঠ ও সতেজ শরীরে অন্যান্য যেকোন রোগ হবার মতো কিডনি রোগ হবার ঝুকিও খুব কম থাকে।"+
"২। ডায়াবেটিস নিয়ন্ত্রনে রাখুনঃ ডায়াবেটিসে আক্রান্ত রোগীর শতকরা ৫০ জনই কিডনি রোগে আক্রান্ত হন। রক্তের সুগার নিয়ন্ত্রনে না থাকলে কিডনি নষ্ট হবার ঝুকি আরো বেড়ে যায়। তাই ডায়াবেটিস নিয়ন্ত্রনে রাখুন,নিয়মিত আপনার রক্তের সুগার পরীক্ষা করিয়ে দেখুন তা স্বাভাবিক মাত্রায় আছে কিনা,না থাকলে চিকিৎসকের পরামর্শ নিন। শুধু তাই নয় অন্তত তিন মাস পরপর হলেও একবার আপনার কিডনি পরীক্ষা করিয়ে জেনে নিন সেটা সুস্থ্য আছে কিনা।"+
"৩। রক্তচাপ নিয়ন্ত্রনে রাখুনঃ অনেকেরই ধারনা যে উচ্চ রক্তচাপ শুধু ব্রেইন স্ট্রোক (stroke) আর হার্ট এটাকের (heart attack) এর ঝুকি বাড়ায়,তাদের জেনে রাখা ভালো যে কিডনি ফেইলুর হবার প্রধান কারণ হলো অনিয়ন্ত্রিত উচ্চ রক্তচাপ। তাই এ রোগ থেকে বাঁচতে অবশ্যই আপনার রক্তচাপ নিয়ন্ত্রনে রাখতে হবে। কোন কারনে তা ১২৯/৮৯ মি,মি, এর বেশী হলে সাথে সাথে চিকিৎসকের পরামর্শ নিতে হবে। নিয়মিত অসুধ সেবন এবং তদসংক্রান্ত উপদেশ মেনে চললেই সহজেই রক্তচাপ নিয়ন্ত্রনে রাখা যায়।"+
"৪। পরিমিত আহার করুন এবং ওজন নিয়ন্ত্রনে রাখুনঃ অতিরিক্ত ওজন কিডনির জন্য ঝুকিপূর্ণ,তাই সুস্থ্য থাকতে হলে ওজন কমিয়ে স্বাভাবিক মাত্রায় নিয়ে আসতে হবে। পরিমিত স্বাস্থ্যকর খাবার খেলে কিডনি রোগ হবার ঝুকি অনেক কমে যায়।অন্য দিকে হোটেলের তেলমশলা যুক্ত খাবার,ফাষ্টফুড,প্রক্রিয়াজাত খাবার খেলে রোগ হবার ঝুকি অনেকাংশে বেড়ে যায়। মানুষের দৈনিক মাত্র ১ চা চামচ লবন খাবার প্রয়োজন আছে -খাবারে অতিরিক্ত লবন খাওয়াও কিডনি রোগ হবার ঝুকি বাড়িয়ে দেয়। তাই খাবারে অতিরিক্ত লবন পরিহার করুন।"+
"৫। ধুমপান পরিহার করুনঃ অধুমপায়ীদের তুলনায় ধুমপায়ীদের কিডনি ক্যান্সার হবার সম্ভাবনা শতকরা ৫০ গুণ বেশী। শুধু তাই নয় ধুমপানের কারণে কিডনিতে রক্তপ্রবাহ কমে যেতে থাকে এবং এর ফলে কিডনির কর্মক্ষমতাও হ্রাস পেতে শুরু করে। এভাবে ধুমপায়ী একসময় কিডনি ফেইলুর রোগে আক্রান্ত হয়ে যায়।"+
"৬। অপ্রয়োজনীয় অসুধ সেবনঃ আমাদের মাঝে অনেকেরই বাতিক রয়েছে প্রয়োজন / অপ্রয়োজনে দোকান থেকে অসুধ কিনে খাওয়া। এদের মধ্যে ব্যথার অসুধ (NSAID) রয়েছে শীর্ষ তালিকায়। জেনে রাখা ভাল যে প্রায় সব অসুধই কিডনির জন্য কমবেশী ক্ষতিকর আর এর মধ্যে ব্যথার অসুধ সবার চেয়ে এগিয়ে। নিয়ম না জেনে অপ্রয়োজনীয় অসুধ খেয়ে আপনি হয়তো মনের অজান্তেই আপনার কিডনিকে ধংস করে যাচ্ছেন -তাই যে কোন অসুধ ব্যবহারের আগে অবশ্যই নিবন্ধিত চিকিৎসকের কাছ থেকে জেনে নিন তা আপনার ক্ষতি করবে কিনা।"+
"৭। নিয়মিত কিডনি পরীক্ষা করানঃ আমাদের মাঝে কেউ কেউ আছেন যাদের কিডনি রোগ হবার ঝুকি অনেক বেশী, তাদের অবশ্যই নিয়মিত কিডনি পরীক্ষা করানো উচিত। কারো যদি ডায়াবেটিস এবং / অথবা উচ্চ রক্তচাপ থাকে,ওজন বেশী থাকে (স্থুলতা / Obesity),পরিবারের কেউ কিডনি রোগে আক্রান্ত থাকে তাহলে ধরে নিতে হবে তার কিডনি রোগে আক্রান্ত হবার ঝুকি অনেক বেশী। তাই এসব কারন থাকলে অবশ্যই নিয়মিত কিডনি পরীক্ষা করাতে হবে।"+
"কিডনি ফেইলুর হয়ে গেলে ভালো হয়ে যাবার কোন সুযোগ নেই, ডায়ালাইসিস কিংবা প্রতিস্থাপন (Renal Transplant) করে শুধু জীবনকে দীর্ঘায়িত করা সম্ভব। তাই এই রোগ এড়িয়ে যাবার চেষ্টা চালিয়ে যাওয়াটা প্রতিটি সুস্থ্য মানুষের জন্য বুদ্ধিমানের কাজ হবে।");
	}
}