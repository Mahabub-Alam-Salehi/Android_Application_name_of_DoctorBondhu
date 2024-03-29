package com.amitumisee;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Bath_potikarActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_disease_details);
		
  
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		
		 tv.setTypeface(tf);
		 tv.setText("প্রতিরোধই বাতের সমস্যা থেকে উপশমের উত্তম উপায়। রোগ দেখা দিলে ওষুধের মাধ্যমে প্রতিকার পাওয়া যায় বটে, তবে তখন অ্যালকোহল এবং যেসব খাবার গ্রহণ করলে ইউরিক এসিড মজুদ হওয়া বেড়ে যায়, সেসব থেকে দূরে থাকা অবশ্য কর্তব্য। এছাড়া রোগীকে প্রচুর পানি খেতে হবে, নিয়মিত ব্যায়াম করতে হবে, সুষম খাবার ব্যবহার করার সঙ্গে সঙ্গে শরীরের ওজন ঠিক রাখতে হবে। তবে সবচেয়ে বড় কথা হলো, রোগ হলে অবশ্যই একজন অভিজ্ঞ চিকিত্সকের শরণাপন্ন হয়ে তার পরামর্শ মতো চলতে হবে। এছাড়াও জেনে নিন বাতের ব্যথার কবল থেকে বাঁচার জন্য কার্যকরী কিছু টিপস।"+
"•লিফট বা এস্কেলেটরের পরিবর্তে সিঁড়ি ব্যবহার করুন।"+
"•প্রতিদিন সকালে উঠে ৫-১০ মিনিট জোরে হাঁটুন বা জগিং করুন।"+
"•গাড়িতে ওঠার আগে কিংবা লম্বা জার্নির শুরুতে অন্তত ৫০০ মিটার পায়ে হেঁটে নিন।"+
"•ওজন কমানোর দিকে মনোযোগী হোন।"+
"•প্রতিদিন ৬-৮ গ্লাস পানি খান।"+
"•ক্যালসিয়াম ও ভিটামিন সমৃদ্ধ খাবার প্রতিদিন পরিমিত পরিমানে খান।"+
"•একটানা অনেকক্ষণ বসে থাকবেন না। ১৫-২০ মিনিট পর পর খানিকটা হেঁটে নিন।"+
"•ধূমপান ও মদ্যপান হাড়ের ক্যালসিয়াম শুকিয়ে দেয়ার জন্য দায়ী। ধূমপান ও মদ্যপান বন্ধ করুন।"+
"•প্রতিদিনের খাদ্য তালিকায় দুধ রাখুন। যদি ‘লাক্টোস ইনটলারেন্ট’ হয়ে থাকেন তবে ব্রকলি খান ক্যালসিয়ামের ঘাটতি পুরনের জন্য।"+
"•প্রতিদিন ব্যায়ামের জন্য অন্তত ১০ মিনিট রাখুন।"+
"•সপ্তাহে অন্তত ২ বার খানিকটা তেল গরম করে নিয়ে হাড়ের জয়েন্টে ম্যাসাজ করুন।"+
"•যারা ব্যথা ভুগছেন তারা আক্রান্ত স্থানে প্রতিদিন গরম তুলা. কাপড় বা পানির সেঁক নিন। ");
	}
}