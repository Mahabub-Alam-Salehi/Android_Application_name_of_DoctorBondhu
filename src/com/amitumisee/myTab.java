package com.amitumisee;



import android.app.ActionBar;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class myTab extends TabActivity {
	 
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.aa);
			
			 ActionBar actionBar = getActionBar();
			 
		        // Enabling Up / Back navigation
		        actionBar.setDisplayHomeAsUpEnabled(true);
	 
			Resources ressources = getResources(); 
			TabHost tabHost = getTabHost(); 
	 
			
						Intent intentAndroid = new Intent().setClass(this, DiabitiesDiseasActivity.class);
						TabSpec tabSpecAndroid = tabHost
						  .newTabSpec("Android")
						  .setIndicator("", ressources.getDrawable(R.drawable.boisistho))
						  .setContent(intentAndroid);
				 
						// Apple tab
						Intent intentApple = new Intent().setClass(this, Diabities_lokkonActivity.class);
						TabSpec tabSpecApple = tabHost
						  .newTabSpec("Apple")
						  .setIndicator("", ressources.getDrawable(R.drawable.lokkon))
						  .setContent(intentApple);
				 
						// Windows tab
						Intent intentWindows = new Intent().setClass(this, Diabities_potikarActivity.class);
						TabSpec tabSpecWindows = tabHost
						  .newTabSpec("Windows")
						  .setIndicator("", ressources.getDrawable(R.drawable.prothikar))
						  .setContent(intentWindows);
				
			// add all tabs 
			tabHost.addTab(tabSpecAndroid);
			tabHost.addTab(tabSpecApple);
			tabHost.addTab(tabSpecWindows);
		
	 
			//set Windows tab as default (zero based)
			tabHost.setCurrentTab(2);
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
		        Intent i = new Intent(myTab.this, Actionbar.class);
		        startActivity(i);
		    }
	 
		
	 
	}