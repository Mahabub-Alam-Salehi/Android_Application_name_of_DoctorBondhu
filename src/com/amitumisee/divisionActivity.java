package com.amitumisee;



import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

public class divisionActivity extends Activity {
    /** Called when the activity is first created. */
	Button btnOpenPopup,btnOpenPopup2,btnOpenPopup3,btnOpenPopup4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobile_company_layout);
        Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
        
        btnOpenPopup = (Button)findViewById(R.id.button1);
       	btnOpenPopup.setTypeface(tf);
		btnOpenPopup.setText("ঢাকা বিভাগঃ");
		
		btnOpenPopup2 = (Button)findViewById(R.id.button2);
	   	btnOpenPopup2.setTypeface(tf);
	    btnOpenPopup2.setText("চট্টগ্রাম বিভাগঃ");
	    
	    btnOpenPopup3 = (Button)findViewById(R.id.button3);
		btnOpenPopup3.setTypeface(tf);
		btnOpenPopup3.setText("সিলেট বিভাগঃ");
		         
		btnOpenPopup4 = (Button)findViewById(R.id.button4);
		btnOpenPopup4.setTypeface(tf);
		btnOpenPopup4.setText("রাজশাহী বিভাগঃ");
			        
			        
        
        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){

   @Override
   public void onClick(View arg0) {
    LayoutInflater layoutInflater 
     = (LayoutInflater)getBaseContext()
      .getSystemService(LAYOUT_INFLATER_SERVICE);  
      View popupView = layoutInflater.inflate(R.layout.popup_layout, null);  
             final PopupWindow popupWindow = new PopupWindow(
               popupView, 
               LayoutParams.WRAP_CONTENT,  
                     LayoutParams.WRAP_CONTENT);  
             
             Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
             Typeface tf2 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
             btnDismiss.setTypeface(tf2);
             btnDismiss.setText("বের হউন");
             
             TextView textView11=(TextView)popupView.findViewById(R.id.tv1);
             Typeface tf3 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
             textView11.setTypeface(tf3);
             textView11.setText("আলিফ এ্যাম্বুলেন্স সার্ভিস :"+
"জরুরী বুকিং"+
"দিন-রাত্রি ২৪ ঘন্টা আলিফ এ্যাম্বুলেন্স তাদের সেবা কার্যক্রম চালু রাখে। এ্যাম্বুলেন্সের জন্য নিন্মোক্ত নম্বর সমূহে যোগাযোগ করতে হয়।"+
"ফোন- ৯১৩১৬৮৮, ৮১১৭৫৭৬।"+
"মোবাইল- ০১৮১৯-২৫৩৭৭৭, ০১৫৫২-৬৩৭৭০৫, ০১৭১৩-২০৫৫৫৫।");
            
             btnDismiss.setOnClickListener(new Button.OnClickListener(){

     @Override
     public void onClick(View v) {
      // TODO Auto-generated method stub
      popupWindow.dismiss();
     }});
               
             popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
         
   }});
        btnOpenPopup2.setOnClickListener(new Button.OnClickListener(){

        	   @Override
        	   public void onClick(View arg0) {
        	    LayoutInflater layoutInflater 
        	     = (LayoutInflater)getBaseContext()
        	      .getSystemService(LAYOUT_INFLATER_SERVICE);  
        	      View popupView = layoutInflater.inflate(R.layout.popup_layout, null);  
        	             final PopupWindow popupWindow = new PopupWindow(
        	               popupView, 
        	               LayoutParams.WRAP_CONTENT,  
        	                     LayoutParams.WRAP_CONTENT);  
        	             
        	             Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
        	             Typeface tf2 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
        	             btnDismiss.setTypeface(tf2);
        	             btnDismiss.setText("বের হউন");
        	             
        	             TextView textView11=(TextView)popupView.findViewById(R.id.tv1);
        	             Typeface tf3 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
        	             textView11.setTypeface(tf3);
        	             textView11.setText("আলিফ এ্যাম্বুলেন্স সার্ভিস ফোন-০৩০৩১-৬৫৭৫৭৪, ০১৮১৯৩৮০০০০,০১৮১৯৩২৫০৬০ "+
"হলি ফ্যামিলি হাসপাতাল এ্যাম্বুলেন্স সার্ভিস   ফোন- ০৩১-৬২০০২৫  মডান এ্যাম্বুলেন্স সার্ভিস  ফোন- ০৩১-৬৩৯৭৩০, ০১৫৪৬৩৩২১৪, ০১৭১৬০৭৪৪৯৭ "+
"মিডিয়া এ্যাম্বুলেন্স সার্ভিস  ফোন- ০৩১-৬৫০০০০ফায়ার সার্ভিস এ্যাম্বুলেন্স সার্ভিস  ফোন- ০৩১-৭১৬৩২৬-৭ ");
        	            
        	             btnDismiss.setOnClickListener(new Button.OnClickListener(){

        	     @Override
        	     public void onClick(View v) {
        	      // TODO Auto-generated method stub
        	      popupWindow.dismiss();
        	     }});
        	               
        	             popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
        	         
        	   }});
        btnOpenPopup3.setOnClickListener(new Button.OnClickListener(){

        	   @Override
        	   public void onClick(View arg0) {
        	    LayoutInflater layoutInflater 
        	     = (LayoutInflater)getBaseContext()
        	      .getSystemService(LAYOUT_INFLATER_SERVICE);  
        	      View popupView = layoutInflater.inflate(R.layout.popup_layout, null);  
        	             final PopupWindow popupWindow = new PopupWindow(
        	               popupView, 
        	               LayoutParams.WRAP_CONTENT,  
        	                     LayoutParams.WRAP_CONTENT);  
        	             
        	             Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
        	             Typeface tf2 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
        	             btnDismiss.setTypeface(tf2);
        	             btnDismiss.setText("বের হউন");
        	             
        	             TextView textView11=(TextView)popupView.findViewById(R.id.tv1);
        	             Typeface tf3 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
        	             textView11.setTypeface(tf3);
        	             textView11.setText("সিলেট এ্যাম্বুলেন্স সার্ভিস "+
"ফোন- +৮৮০-৮২১-৭২১১০৩  "+

"সিলেট সদর হাসপাতাল এ্যাম্বুলেন্স সার্ভিস"+
"ফোন- +৮৮০-৮২১-৭১৩৫০৬  "+

"আল মদিনা এ্যাম্বুলেন্স সার্ভিস "+
"ফোন- +৮৮০-৮২১-৮১২৬২৬, +৮৮০১৭১১-৩৯৯৭৪২  "+

"সিটি করপরেশন এ্যাম্বুলেন্স সার্ভিস "+
"ফোন- +৮৮০-৮২১-৭১৩০৪১ "+

 "শমিক এ্যাম্বুলেন্স সার্ভিস "+
"ফোন- =৮৮০-৮২১-৭২২০০০, +৮৮০-৮২১-৭১৯২৪১  ");
        	            
        	             btnDismiss.setOnClickListener(new Button.OnClickListener(){

        	     @Override
        	     public void onClick(View v) {
        	      // TODO Auto-generated method stub
        	      popupWindow.dismiss();
        	     }});
        	               
        	             popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
        	         
        	   }});
        btnOpenPopup4.setOnClickListener(new Button.OnClickListener(){

        	   @Override
        	   public void onClick(View arg0) {
        	    LayoutInflater layoutInflater 
        	     = (LayoutInflater)getBaseContext()
        	      .getSystemService(LAYOUT_INFLATER_SERVICE);  
        	      View popupView = layoutInflater.inflate(R.layout.popup_layout, null);  
        	             final PopupWindow popupWindow = new PopupWindow(
        	               popupView, 
        	               LayoutParams.WRAP_CONTENT,  
        	                     LayoutParams.WRAP_CONTENT);  
        	             
        	             Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
        	             Typeface tf2 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
        	             btnDismiss.setTypeface(tf2);
        	             btnDismiss.setText("বের হউন");
        	             
        	             TextView textView11=(TextView)popupView.findViewById(R.id.tv1);
        	             Typeface tf3 = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
        	             textView11.setTypeface(tf3);
        	             textView11.setText("সদর হাসপাতাল  এ্যাম্বুলেন্স সার্ভিস "+
        	            		 "ফোন- +৮৮-৭২১-৭৭৪৩০৮ "+

							"পুলিশ  হাসপাতাল এ্যাম্বুলেন্স "+
							"ফোন- +৮৮-৭২১-৭৭৪৩০৮"+  

						"পাবা হাসপাতাল এ্যাম্বুলেন্স সার্ভিস "+
							"ফোন- +৮৮০-৭২১-৭৭৫৭০৯, +৮৮০-৭২১-৭৭৫৬০৬ "+

						"টি বি হাসপাতাল এ্যাম্বুলেন্স সার্ভিস"+
							"ফোন- +৮৮০-৭২১-৭৭৪৫৫৮  "+

						"ফায়ার সার্ভিস এ্যাম্বুলেন্স সার্ভিস "+
        	            		 	"ফোন- +৮৮০-৭৭২৭০২, +৮৮০-৭২১-৭৭৪২২");
        	            
        	             btnDismiss.setOnClickListener(new Button.OnClickListener(){

        	     @Override
        	     public void onClick(View v) {
        	      // TODO Auto-generated method stub
        	      popupWindow.dismiss();
        	     }});
        	               
        	             popupWindow.showAsDropDown(btnOpenPopup, 50, -30);
        	         
        	   }});
        
    }
}