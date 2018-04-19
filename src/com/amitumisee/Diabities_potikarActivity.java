package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Diabities_potikarActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
		 tv.setText(" খাদ্য তালিকা অনুযায়ী বিধি নিষেধ মেনে খাবার খেতে হবে। "+
"· নিয়মিত কিছু কায়িক পরিশ্রম / ব্যয়াম করতে হবে।  "+
"· নির্দেশ অনুযায়ী রক্ত বা প্রস্রাবে সুগার এর মাত্রা মেপে দেখতে হবে এবং কম-বেশী হলে চিকিৎসকের স্মরণাপন্ন হতে হবে। "+
"· ডায়াবেটিস বিশেষজ্ঞের পরামর্শ ব্যতীত এ রোগের চিকিৎসা কখনোই বন্ধ রাখা যাবেনা। "+
"· পায়ের বিশেষ যত্ন নিতে হবে যেমন খালি পায়ে হাটা যাবেনা, নরম জুতা পরতে হবে, নিয়মিত নখ কাটতে হবে, সবসময় পা পরিস্কার রাখতে হবে, কোনো আঘাত পেলে চিকিৎসকের পরামর্শ নিতে হবে। "+
"· দাঁতের বিশেষ যত্ন নিতে হবে, যেমন দুই বেলা ব্রাশ ও টুথপেষ্ট দিয়ে দাত মাজা, ব্রাশ করার পর ১ মিনিট ধরে দাঁতের মাড়ি মালিশ করা, পান-জর্দা-সুপারি-চুন-তামাক এসব ব্যবহার না করা ইত্যাদি।দাঁতে কোনো সমস্যা হলে সাথে সাথেই দাঁতের ডাক্তার কে দেখিয়ে নিবেন এবং প্রতি বৎসর কমপক্ষে একবার তার স্মরনাপন্ন হলে উপকৃত হবেন। "+
"· শরীরে কোনো ছোটো-খাটো কাটা ছেড়া হলেও চিকিৎসককে জানাতে হবে এবং তার প্রতি বিশেষ যত্নবান হতে হবে। ");
	}
}