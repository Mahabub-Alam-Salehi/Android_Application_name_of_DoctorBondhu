package com.amitumisee;



import android.net.Uri;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Mobile_Image_button_Activity extends Activity {

	
	//private Button button1,button2,button3,button4;
	private ImageButton button1,button2,button3,button4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imag_call);
		
		 ActionBar actionBar = getActionBar();
		 
	        // Enabling Up / Back navigation
	        actionBar.setDisplayHomeAsUpEnabled(true);

		// add PhoneStateListener
		button1 = (ImageButton) findViewById(R.id.gp);	
		button2 = (ImageButton) findViewById(R.id.artl);		
		button3 = (ImageButton) findViewById(R.id.blnk);
		button4 = (ImageButton) findViewById(R.id.rbi);	
		
		PhoneCallListener phoneListener = new PhoneCallListener();
		TelephonyManager telephonyManager = (TelephonyManager) this
				.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
		
		// add button listener
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog("Are you sure you want to dia??", "tel:789");
			}
		});
	
		button2.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			showDialog("Are you sure you want to dia??", "tel:54445");
		}
	});

		button3.setOnClickListener(new OnClickListener() {

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		showDialog("Are you sure you want to dia??", "tel:789");
	}
});

		button4.setOnClickListener(new OnClickListener() {

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		showDialog("Are you sure you want to dia??", "tel:10611");
	}
});
}

	
	//monitor phone call activities
	private class PhoneCallListener extends PhoneStateListener {

		private boolean isPhoneCalling = false;

		String LOG_TAG = "LOGGING 123";

		@Override
		public void onCallStateChanged(int state, String incomingNumber) {
			// TODO Auto-generated method stub
			
			
			if (TelephonyManager.CALL_STATE_RINGING == state) {
				// phone ringing
				Log.i(LOG_TAG, "RINGING number : " + incomingNumber);
			}

			if (TelephonyManager.CALL_STATE_OFFHOOK == state) {
				// active
				Log.i(LOG_TAG, "OFFHOOK");
	
				isPhoneCalling = true;
			}

			if (TelephonyManager.CALL_STATE_IDLE == state) {
				// run when class initial and phone call ended, 
				// need detect flag from CALL_STATE_OFFHOOK
				Log.i(LOG_TAG, "IDLE");

				if (isPhoneCalling) {
					
					Log.i(LOG_TAG, "restart app");
					
					// restart app
					Intent i = getBaseContext().getPackageManager()
							.getLaunchIntentForPackage(
									getBaseContext().getPackageName());
					i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					startActivity(i);
					
					isPhoneCalling = false;
				}
			}
		}

	}
public void showDialog(final String message,final String number){
		
		
		final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
		builder1.setMessage("আপনি কি এই মোবাইল হেলথ কেয়ার সেন্টারে কল দিতে চান?");
		builder1.setCancelable(false);
		builder1.setPositiveButton("হ্যাঁ",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
						Intent callIntent = new Intent(Intent.ACTION_CALL);
						callIntent.setData(Uri.parse(number));
						startActivity(callIntent);
				 
					} 
				});
		builder1.setNegativeButton("না",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
						

					}
				});
		AlertDialog alert11 = builder1.create();
		alert11.show();
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
        Intent i = new Intent(Mobile_Image_button_Activity.this, Actionbar.class);
        startActivity(i);
    }

}
