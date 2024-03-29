package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class HiperTDiseasActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		 tv.setTypeface(tf);
         
      
         tv.setText("হঠাৎ করেই মাথাটা কেমন ঘুরছে। বুক ধড়ফড় করছে কিংবা কয়েকটা নির্ঘুম রাত পার করলেন। সবার জোরাজুরিতে রক্তচাপ পরীক্ষা করলেন। ধরা পড়ল আপনার উচ্চ রক্তচাপের সমস্যা। এটি নিয়ে আবার দুশ্চিন্তায় পড়বেন না। কেননা দুশ্চিন্তা আরও বাড়িয়ে দেবে রক্তচাপকে। আসলে রক্তচাপ একটি স্বাভাবিক প্রক্রিয়া। একজন সুস্থ পূর্ণবয়স্ক ব্যক্তির ক্ষেত্রে ১০০-১৪০ মিলিমিটার পারদ সংকোচন চাপ ও ৬৫-৯০ মিলিমিটার পারদ প্রসারণ চাপ স্বাভাবিক মাত্রা নির্দেশ করে। আর রক্তচাপ যদি ১৪০/৯০ মিলিমিটার পারদ অথবা এর বেশি হয়, তবেই উচ্চ রক্তচাপ বলা হয়। বিভিন্ন বয়সে শরীরে রক্তচাপের মাত্রা ভিন্ন হয়। আবার একই মানুষের ক্ষেত্রে দিনের বিভিন্ন সময়ে রক্তচাপ বিভিন্ন রকম হতে পারে। উত্তেজনা, দুশ্চিন্তা, পরিশ্রম, রাগ, ক্রোধ ও পর্যাপ্ত ঘুমের অভাবে রক্তচাপ বাড়তে পারে। এ ক্ষেত্রে বিশ্রাম ও পর্যাপ্ত ঘুমালে রক্তচাপ কমে যায়। এ বিষয়ে বঙ্গবন্ধু শেখ মুজিব মেডিকেল বিশ্ববিদ্যালয়ের মেডিসিন অনুষদের ডিন এ বি এম আবদুল্লাহ বলেন, ‘উচ্চ রক্তচাপ একটি নীরব ঘাতক। বেশির ভাগ ক্ষেত্রে উচ্চ রক্তচাপের কোনো লক্ষণ প্রকাশ পায় না। প্রাপ্তবয়স্ক ব্যক্তির রক্তচাপ বছরে অন্তত একবার মাপা উচিত।’ উচ্চ রক্তচাপকে কমিয়ে নিয়ন্ত্রণে না রাখলে শরীরের গুরুত্বপূর্ণ অঙ্গসমূহ, যেমন হূৎপিণ্ড, কিডনি, মস্তিষ্ক ও চোখ যেকোনো সময় মারাত্মক ক্ষতিগ্রস্ত হতে পারে।"+ 

"কেন হয় উচ্চ রক্তচাপ?"+
"৯০ শতাংশ রোগীর ক্ষেত্রে উচ্চ রক্তচাপের কোনো নির্দিষ্ট কারণ জানা যায় না। যেসব কারণে ধারণা করা হয় যে উচ্চ রক্তচাপ হতে পারে, তেমনই কয়েকটি কারণ হলো কিডনির রোগ, অ্যাড্রেনাল গ্রন্থি ও পিটুইটারি গ্রন্থির টিউমার, ধমনির বংশগত রোগ, গর্ভধারণ অবস্থায় একলাম্পসিয়া, প্রি-একলাম্পসিয়া হলে, দীর্ঘ দিন ধরে জন্মনিয়ন্ত্রণের ওষুধ খেলে, স্টেরয়েড হরমোন গ্রহণ ও ব্যথানাশক কিছু কিছু ওষুধ খেলে।");
       
		
	}
	

}
