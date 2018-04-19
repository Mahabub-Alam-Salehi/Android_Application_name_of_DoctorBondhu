package com.amitumisee;




import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MdcnActivity extends Activity {
EditText et,et2;
Button btn;
WebView wb;
ProgressDialog progressDialog;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.medcn_layout);	
		
		 ActionBar actionBar = getActionBar();
		 
	        // Enabling Up / Back navigation
	        actionBar.setDisplayHomeAsUpEnabled(true);
	        
	       
		
		btn=(Button) findViewById(R.id.button1);
		wb=(WebView) findViewById(R.id.webView1);
		
		 Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");
		 TextView tv = (TextView) findViewById(R.id.textView1);
		 TextView tv2 = (TextView) findViewById(R.id.textView2);
	      
        
        tv.setTypeface(tf);
        tv2.setTypeface(tf);
        btn.setTypeface(tf);
        tv.setText("ঔষধের ম্যানু এল আই সি নং প্রবেশ করান :");
        tv2.setText("      এবং  ");
        
        btn.setText("খুঁজুন");
        
        
	    
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				wb.clearView();
				
				et=(EditText) findViewById(R.id.editText1);
				et2=(EditText) findViewById(R.id.editText2);
				String myAlo=et.getText().toString();
				String myAlo2=et2.getText().toString();
				
				
				startWebView("http://www.ichm.info/medicine/search.php?lic1="+myAlo+"&&lic2="+myAlo2);
		
			}
		});
	    	
	    	
	}
		private void startWebView(String url) {
				// TODO Auto-generated method stub
				
				 wb.setWebViewClient(new WebViewClient() {      
			            
			          
			            //If you will not use this method url links are opeen in new brower not in webview
			            public boolean shouldOverrideUrlLoading(WebView view, String url) {              
			                view.loadUrl(url);
			                return true;
			            
				
			}
				 public void onLoadResource (WebView view, String url) {
		                if (progressDialog == null) {
		                    // in standard case YourActivity.this
		                    progressDialog = new ProgressDialog(MdcnActivity.this);
		                    progressDialog.setMessage("Loading...");
		                    progressDialog.show();
		                }
		            }
		            public void onPageFinished(WebView view, String url) {
		                try{
		                if (progressDialog.isShowing()) {
		                    progressDialog.dismiss();
		                    progressDialog = null;
		                }
		                }catch(Exception exception){
		                    exception.printStackTrace();
		                }
		            }
				 

				 
			
			});
				  wb.getSettings().setJavaScriptEnabled(true); 
			         
			        wb.loadUrl(url);
	   
	  }
		
		@Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.main, menu);
	 
	        return super.onCreateOptionsMenu(menu);
	    }

		
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
			// TODO Auto-generated method stub
			
			switch (item.getItemId()) {
	        case R.id.action_about:
	        	
	            // about action
	        	actionbar();
	            return true;
			}
			if (item.getItemId()==android.R.id.home) {
				finish();
			}
			
	            return super.onOptionsItemSelected(item);
	        }
		
		
		 private void actionbar() {
		        Intent i = new Intent(MdcnActivity.this, Actionbar.class);
		        startActivity(i);
		    }
	 

}
