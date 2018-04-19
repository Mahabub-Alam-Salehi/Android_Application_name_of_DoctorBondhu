package com.amitumisee;






import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HomeActivity extends Activity implements View.OnClickListener{
	

	
ImageButton img1,img2,img3,img4,img5,img6;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_layout);
		img1=(ImageButton) findViewById(R.id.img1);
		img2=(ImageButton) findViewById(R.id.img2);
		img3=(ImageButton) findViewById(R.id.img3);
		img4=(ImageButton) findViewById(R.id.img4);
		img5=(ImageButton) findViewById(R.id.img5);
		img6=(ImageButton) findViewById(R.id.img6);
		
		img1.setOnClickListener(this);
		img2.setOnClickListener(this);
		img3.setOnClickListener(this);
		img4.setOnClickListener(this);
		img5.setOnClickListener(this);
		img6.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 switch(v.getId()) {
         case R.id.img1:
        	 Intent openstartingpoint=new Intent(getApplicationContext(), DiseasActivity.class);
             startActivity(openstartingpoint);
        	 
         // do stuff;
         break;
         case R.id.img2:
        	 Intent MdcnActivity=new Intent(getApplicationContext(), MdcnActivity.class);
             startActivity(MdcnActivity);
        	
             // do stuff;
             break;
         case R.id.img3:
        	 Intent openstartingpoint3=new Intent(getApplicationContext(), NearestHospital.class);
             startActivity(openstartingpoint3);
             
             // do stuff;
             break;
         case R.id.img4:
             // do stuff;
        	 Intent openstartingpoint33=new Intent(getApplicationContext(), Ambulance_Mobile_text_button_Activity.class);
             startActivity(openstartingpoint33);
             break;
         case R.id.img5:
             // do stuff;
        	 Intent openstartingpoint31=new Intent(getApplicationContext(), Mobile_Image_button_Activity.class);
             startActivity(openstartingpoint31);
        	 
             break;
         case R.id.img6:
             // do stuff;
        	 DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
        		    @Override
        		    public void onClick(DialogInterface dialog, int which) {
        		        switch (which){
        		        case DialogInterface.BUTTON_POSITIVE:
        		            System.exit(0);
        		            break;

        		        case DialogInterface.BUTTON_NEGATIVE:
        		            //No button clicked
        		            break;
        		        }
        		    }
        		};

        		AlertDialog.Builder builder = new AlertDialog.Builder(this);
        		builder.setMessage("Are you want to exit?").setPositiveButton("Yes", dialogClickListener)
        		    .setNegativeButton("No", dialogClickListener).show();
        	 
 }
		 	 
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
 
        return super.onCreateOptionsMenu(menu);
    }

	
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
        case R.id.action_about:
        	
            // about action
        	actionbar();
            return true;
            // this is for Home Menu back Button action
            
        
        default:
            return super.onOptionsItemSelected(item);
        }
	}
	
	 private void actionbar() {
	        Intent i = new Intent(HomeActivity.this, Actionbar.class);
	        startActivity(i);
	    }
}

	

	
	 

