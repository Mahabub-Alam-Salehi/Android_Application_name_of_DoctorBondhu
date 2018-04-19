package com.amitumisee;

import android.net.Uri;
import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ambulance_Mobile_text_button_Activity extends Activity {

	private Button button1, button2, button3, button4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ambulance_call_activity);
		
		 ActionBar actionBar = getActionBar();
		 
	        // Enabling Up / Back navigation
	        actionBar.setDisplayHomeAsUpEnabled(true);
		
		Typeface tf = Typeface.createFromAsset(getAssets(),
				"font/Banglafont.ttf");

		// add PhoneStateListener
		button1 = (Button) findViewById(R.id.button1);
		button1.setTypeface(tf);
		button1.setText("আলিফ এ্যাম্বুলেন্স সার্ভিস, ঢাকা");

		button2 = (Button) findViewById(R.id.button2);
		button2.setTypeface(tf);
		button2.setText("মডার্ন এ্যাম্বুলেন্স সার্ভিস, চট্টগ্রাম");

		button3 = (Button) findViewById(R.id.button3);
		button3.setTypeface(tf);
		button3.setText("সিলেট এ্যাম্বুলেন্স সার্ভিস, সিলেট");

		button4 = (Button) findViewById(R.id.button4);
		button4.setTypeface(tf);
		button4.setText("সদর হাসপাতাল এ্যাম্বুলেন্স সার্ভিস, রাজশাহী ");

		PhoneCallListener phoneListener = new PhoneCallListener();
		TelephonyManager telephonyManager = (TelephonyManager) this
				.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(phoneListener,
				PhoneStateListener.LISTEN_CALL_STATE);

		// add button listener
		button1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog("Are you sure you want to dia??", "tel:029131688");
			}
		});

		button2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog("Are you sure you want to dia??", "tel:031639730");
			}
		});

		button3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog("Are you sure you want to dia??", "tel:0088082172113");
			}
		});
		button4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog("Are you sure you want to dia??", "tel:0088721774308");
			}
		});
	}

	// monitor phone call activities
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

	public void showDialog(final String message, final String number) {

		final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
		builder1.setMessage("আপনি কি এই  এ্যাম্বুলেন্সকে কল করতে চান ?");
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
		builder1.setNegativeButton("না", new DialogInterface.OnClickListener() {
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
	        Intent i = new Intent(Ambulance_Mobile_text_button_Activity.this, Actionbar.class);
	        startActivity(i);
	    }
 

}
