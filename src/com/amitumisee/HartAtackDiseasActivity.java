package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class HartAtackDiseasActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		 tv.setTypeface(tf);
         
      
         tv.setText("মূল কথা হার্ট অ্যাটাক হল হার্ট ঠিক মত কাজ না করা । করোনারি আর্টারি নামে হৃৎপিন্ডের গায়ে থাকে দুটি ছোট ধমনী।এরাই হৃৎপিন্ডে পুষ্টির যোগান দেয়। কোন কারনে এই করোনারি আর্টারিতে যদি ব্লক সৃষ্টি হয় তাহলে যে এলাকা ঐ আর্টারি বা ধমনীর রক্তের পুষ্টি নিয়ে চলে সে জায়গার হৃৎপেশি কাজ করে না। তখনই হার্ট অ্যাটাক হয়ে থাকে। এর কেতাবি নাম মায়োকার্ডিয়াল ইনফার্কশন।হার্ট অ্যাটাক বুকে প্রচন্ড ব্যাথা অনুভূত হয়। এই ব্যাথা ২০-৩০ মিনিট স্থায়ী হয়। বেশিরভাগ ক্ষেত্রেই রোগী হাসপাতালে পৌছার আগেই মৃত্যুবরন করে।তাই এটি একটি মেডিকেল ইমার্জেন্সি।"+


"হার্ট অ্যাটাক কখন হয়?"+

"আমরা ভাবি মানুষ বুড়ো হলে ,মোটা হলে বা টেনশন করলে হার্ট অ্যাটাক হয়। কিন্তু এটা ভুল যে কোন সময় হার্ট অ্যাটাক হয়ে যেতে পারে। যেমন: "+

"ঘুমের সময় হতে পারে।"+

"বিশ্রামের সময় হতে পারে।"+

"হঠাৎ ভারী কায়িক শ্রমের পর হতে পারে।"+

"বাইরে ঠান্ডা আবহাওয়ায় বেরুলেন, তখন হতে পারে।"+

"ইমোশনাল স্ট্রেসের জন্য হতে পারে।");
       
		
	}
	

}
