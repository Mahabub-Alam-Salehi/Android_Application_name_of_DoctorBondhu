package com.amitumisee;



import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class map_layout  extends Activity {

	WebView wb;
	ProgressDialog progressDialog;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.map_layout);	
			
			wb=(WebView) findViewById(R.id.webView1);
			startWebView("https://www.google.com.bd/maps/dir//Government+Homeopathic+Medical+College+And+Hospital,+Dhaka/@23.8095785,90.3814427,14z/data=!4m13!1m4!3m3!1s0x3755c7240e856801:0x934837025d16b1!2sGovernment+Homeopathic+Medical+College+And+Hospital,+Dhaka!3b1!4m7!1m0!1m5!1m1!1s0x3755c7240e856801:0x934837025d16b1!2m2!1d90.3885207!2d23.8035149");
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
			                    progressDialog = new ProgressDialog(map_layout.this);
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

	}
