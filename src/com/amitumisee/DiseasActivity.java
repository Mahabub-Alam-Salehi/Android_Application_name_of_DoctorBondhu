package com.amitumisee;



import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class DiseasActivity extends Activity implements View.OnClickListener{
	ImageButton img1,img2,img3,img4,img5,img6,img7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.disease_list_layout);
		
		// get action bar   
        ActionBar actionBar = getActionBar();
 
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);
		
		
		img1=(ImageButton) findViewById(R.id.imageButton1);
		img2=(ImageButton) findViewById(R.id.imageButton2);
		img3=(ImageButton) findViewById(R.id.imageButton3);
		img4=(ImageButton) findViewById(R.id.imageButton4);
		img5=(ImageButton) findViewById(R.id.imageButton5);
		img6=(ImageButton) findViewById(R.id.imageButton6);
		img7=(ImageButton) findViewById(R.id.imageButton7);
		
		
		
		img1.setOnClickListener(this);
		img2.setOnClickListener(this);
		img3.setOnClickListener(this);
		img4.setOnClickListener(this);
		img5.setOnClickListener(this);
		img6.setOnClickListener(this);
		img7.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 switch(v.getId()) {
         case R.id.imageButton1:
        	// Toast.makeText(null, "", 1);
        	 Intent openstartingpoint1=new Intent(getApplicationContext(), myTab.class);
             startActivity(openstartingpoint1);
        	 
         // do stuff;
         break;
         case R.id.imageButton2:
        	// Toast.makeText(null, "", 1);
        	 Intent openstartingpoint11=new Intent(getApplicationContext(), Cencer_myTab.class);
             startActivity(openstartingpoint11);
        	 
             // do stuff;
             break;
         case R.id.imageButton3:
        	 Intent openstartingpoint2=new Intent(getApplicationContext(), Hapani_myTab.class);
             startActivity(openstartingpoint2);
        	 
             // do stuff;
             break;
         case R.id.imageButton4:
             // do stuff;
        	 Intent openstartingpoint3=new Intent(getApplicationContext(), HiperT_myTab.class);
             startActivity(openstartingpoint3);
        	 
             break;
         case R.id.imageButton5:
             // do stuff;
        	 Intent openstartingpoint4=new Intent(getApplicationContext(), Kidni_myTab.class);
             startActivity(openstartingpoint4);
        	 
             break;
         case R.id.imageButton6:
        	 Intent openstartingpoint44=new Intent(getApplicationContext(), Bath_myTab.class);
             startActivity(openstartingpoint44);
        	 
             // do stuff;
             break;
         case R.id.imageButton7:
        	 Intent openstartingpoint444=new Intent(getApplicationContext(), HartAtack_myTab.class);
             startActivity(openstartingpoint444);
        	 
             // do stuff;
             break;
        
        
        	 
		
		
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
	        Intent i = new Intent(DiseasActivity.this, Actionbar.class);
	        startActivity(i);
	    }
 
	
}
