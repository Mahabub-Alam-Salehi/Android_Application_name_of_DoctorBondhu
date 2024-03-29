package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Kidni_lokkonActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
       
             
         tv.setText(" প্রথমেই বলে নেয়া ভালো, লক্ষণ দেখে কিডনি রোগ শনাক্ত করা দুরূহ। বরং বেশির ভাগ ক্ষেত্রে কোন লক্ষনই প্রকাশ পায় না। তবে খুব সাধারণভাবে কিডনি রোগের লক্ষণগুলো হলো :"+

        		 " * খাবারে অরুচি বা ক্ষুধামন্দা "+
        		 " * বমি বমি ভাব অথবা বমি হওয়া "+
        		 " * শারীরিক দুর্বলতা "+
        		 " * কোমরের দুই পাশে কিংবা পেছনের নিচের দিকে মৃদু থেকে প্রচণ্ড ব্যথা অনুভব করা। "+
        		 " * মুখণ্ডল, হাত-পা এমনকি সারা শরীর ফুলে যাওয়া "+
        		 " * দিন দিন প্রস্রাবের পরিমাণ কমতে থাকা অথবা একেবারেই প্রস্রাব না হওয়া অথবা হঠাত্ প্রস্রাব বন্ধ হয়ে যাওয়া।"+

        		 " তবে এ লক্ষণগুলোই কিডনি রোগের চূড়ান্ত লক্ষণ নয়। ক্ষুধামন্দা, বমি হওয়া, শারীরিক দুর্বলতার যেমন অনেক কারণ রয়েছে তেমনি কোমরে ব্যথা অথবা শরীর ফুলে যাওয়ার কিডনি রোগ ছাড়াও অন্য অনেক কারণ রয়েছে। আবার প্রকারভেদে কিডনি রোগের লক্ষণগুলোরও হেরফের হয়। অন্যদিকে অল্পকিছু রোগীর মাঝে কিডনি রোগের কোনো লক্ষণই খুঁজে পাওয়া যায় না। এই রোগীরা অন্য দশজন সুস্থ মানুষের মতোই জীবনযাপন করেন। রুটিন চেকআপ অথবা অন্যকোন রোগের চিকিত্সার জন্য পরীক্ষা করতে গিয়ে দৈবাত তাদের কিডনি রোগ ধরা পড়ে।"+
 
        		 " পরীক্ষা-নিরিক্ষা : প্রাথমিকভাবে কিডনি রোগ শনাক্ত করতে খুব বেশি পরীক্ষার প্রয়োজন হয় না এবং এগুলো খুব ব্যয়বহুল নয়। কারও কিডনি রোগ আছে কিনা তা জানার জন্য প্রথমেই নিচের পরীক্ষাগুলো করা যেতে পারে—"+
        		 " * Urine for R/M/E "+
        		 " * S. Creatinine "+
        		 " * Ultrasonogram of KUB region. "+
        		 " * Plain X-Ray KUB region."+

        		 " এই পরীক্ষাগুলোর কোনো একটিতে কোনোরকমের অস্বাভাবিকতা থাকলে পরবর্তী ধাপের পরীক্ষা, রোগ নির্ণয় ও যথাযথ চিকিত্সার জন্য কিডনি রোগ বিশেষজ্ঞের পরামর্শ নিতে হবে।"+

        		 " চিকিত্সা:"+
        		 " চিকিত্সার আগে কিডনি রোগের প্রকার ও কারণ শনাক্ত করা জরুরি। এজন্য সব সময়ই কিডনি রোগীদের বিশেষজ্ঞের পরামর্শের প্রয়োজন হয়। সাময়িক কিডনি রোগে আক্রান্ত রোগীর যে কারণে কিডনি রোগ হয়েছে তা চিহ্নিত করে দ্রুত অভিযুক্ত কারণটির চিকিত্সা দিতে হয়। এ জন্য রোগীকে হাসপাতালে একজন কিডনি বিশেষজ্ঞের তত্ত্বাবধানে ভর্তি থাকতে হয়। দীর্ঘমেয়াদি কিডনি রোগীদের সাধারণত হাসপাতালে ভর্তি থাকতে হয় না। এসব রোগীদের প্রতিদিনের খাদ্য তালিকায় প্রোটিন জাতীয় খাবারের পরিমাণ কমিয়ে, প্রতিদিন কতটুকু পানি খাবেন তা নির্ধারণ করে এর সঙ্গে আনুষঙ্গিক অন্যান্য ওষুধ দিয়ে বাড়িতে থেকে এ রোগের চিকিত্সা করা সম্ভব। তবে নিয়মিত এসব রোগীর ফলোআপে আসতে হয়। স্থায়ী কিডনি বিকল রোগে আক্রান্ত রোগীকে নিয়মিত হেমোডায়ালাইসিস অথবা কিডনি সংযোজন করে বেঁচে থাকতে হয়।");
         
	}}