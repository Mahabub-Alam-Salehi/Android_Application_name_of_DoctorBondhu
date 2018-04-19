package com.amitumisee;



import android.app.Activity;
import android.app.ActionBar;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class Actionbar extends Activity{
	private ImageButton button;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivity);
 
        // get action bar   
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
        
        //Typeface tf = Typeface.createFromAsset(getAssets(),"font/Banglafont.ttf");

		// add PhoneStateListener
		button = (ImageButton) findViewById(R.id.aboutimage_btn);
//		button.setTypeface(tf);
//		button.setText("  ***ডাক্তার বন্দু***"
//						+ "ডেভেলপার পরিচিতি "
//						+ "মুহাম্মদ মাহাবুব আলম (টিম লিডার)"
//						+ "গোলাম কিবরিয়া  তফদার"
//						+ "ড্যাফোডিল ইন্টারন্যাশনাল ইউনিভার্সিটি ");

    }
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if (item.getItemId()==android.R.id.home) {
			finish();
		}
		return super.onOptionsItemSelected(item);
	}
}
