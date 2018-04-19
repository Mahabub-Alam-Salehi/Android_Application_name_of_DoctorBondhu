package com.amitumisee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;




import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.tyczj.mapnavigator.Navigator;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NearestHospital extends Activity {

	private static final int GPS_ERRORDIALOG_REQUEST = 9001;
	GoogleMap mMap;
	Marker mar;
	MapFragment mFrag;

	//List<StationDetails> ads = new ArrayList<StationDetails>();
	ConnectionDetector cd;
	ProgressDialog pd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nearest_atm_booth);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		cd = new ConnectionDetector(NearestHospital.this);

		if (initMap() && servicesOK() && cd.isConnectingToInternet()) {
			goToCurrentLocation();
			/*
			 * Toast.makeText(getSherlockActivity(), "Ready to map!",
			 * Toast.LENGTH_SHORT).show();
			 */

			// gotolocation(-33.796923,150.922433,zoom);

			mMap.setMyLocationEnabled(true);
			mMap.getUiSettings().setZoomControlsEnabled(true);
			mMap.getUiSettings().setZoomGesturesEnabled(true);
			mMap.setInfoWindowAdapter(new InfoWindowAdapter() {

				public View getInfoWindow(Marker marker) {
					LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

					Location currentLocation = manager
							.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);
					Location locationA = new Location("point A");
					locationA.setLatitude(currentLocation.getLatitude());
					locationA.setLongitude(currentLocation.getLongitude());
					Location locB = new Location("point B");
					locB.setLatitude(marker.getPosition().latitude);
					locB.setLongitude(marker.getPosition().longitude);

					View v = getLayoutInflater().inflate(R.layout.info_window,
							null);
					TextView tvLocality = (TextView) v
							.findViewById(R.id.tv_locality);
					TextView tvLat = (TextView) v.findViewById(R.id.tv_lat);
					// TextView tvLng = (TextView) v.findViewById(R.id.tv_lng);
					TextView tvSnippet = (TextView) v
							.findViewById(R.id.tv_snippet);

					// LatLng ll = marker.getPosition();

					tvLocality.setText(marker.getTitle() + "("
							+ Float.toString(locationA.distanceTo(locB))
							+ "meter" + ")");
					tvLat.setText("Touch to get route");
					tvLat.setTextColor(Color.MAGENTA);
					tvLat.setTextSize(12);
					// tvLat.setText("Latitude: " + ll.latitude);
					// /tvLng.setText("Longitude: " + ll.longitude);

					tvSnippet.setText(marker.getSnippet());

					return v;
				}

				@Override
				public View getInfoContents(Marker marker) {

					return null;
				}
			});

			mMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {

				@Override
				public void onInfoWindowClick(Marker arg0) {
					// TODO Auto-generated method stub

					LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

					Location currentLocation = manager
							.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);
					LatLng ll = new LatLng(currentLocation.getLatitude(),
							currentLocation.getLongitude());
					// CameraUpdate up= CameraUpdateFactory.newLatLngZoom(ll,
					// zoom);
					// mMap.moveCamera(up);

					LatLng ll1 = arg0.getPosition();
					Navigator nav = new Navigator(mMap, ll, ll1);
					nav.setPathColor(Color.MAGENTA, Color.BLACK, Color.LTGRAY);
					nav.setMode(3, 0, 0);

					nav.findDirections(false);

					CameraUpdate up = CameraUpdateFactory.newLatLngZoom(ll, 13);
					mMap.animateCamera(up);
					arg0.hideInfoWindow();

					// Log.d("lat lng", msg)

				}
			});
		}

		else {

			cd.showAlertDialog(NearestHospital.this, "Error",
					"No internet connection!!!", true);
		}

	}

	

//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// TODO Auto-generated method stub
//		if (item.getItemId()==android.R.id.home) {
//			finish();
//		}
//		return super.onOptionsItemSelected(item);
//	}

	private boolean initMap() {
		try {
			if (mMap == null) {

				mFrag = (MapFragment) this.getFragmentManager()
						.findFragmentById(R.id.map);
				mMap = mFrag.getMap();
				mFrag.getView().setVisibility(View.INVISIBLE);
				if (mMap != null) {
					mMap.clear();
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return (mMap != null);
	}

	public boolean servicesOK() {
		int isAvailable = GooglePlayServicesUtil
				.isGooglePlayServicesAvailable(this);

		if (isAvailable == ConnectionResult.SUCCESS) {
			return true;
		} else if (GooglePlayServicesUtil.isUserRecoverableError(isAvailable)) {
			Dialog dialog = GooglePlayServicesUtil.getErrorDialog(isAvailable,
					this, GPS_ERRORDIALOG_REQUEST);
			dialog.show();
		} else {
		
			 Toast.makeText(this, "Can't connect to Google Play services",
			 Toast.LENGTH_SHORT).show();
			 
			
		}
		return false;
	}

	public void showSettingsAlert() {
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(
				NearestHospital.this);

		// Setting Dialog Title
		alertDialog.setTitle("GPS is settings");

		// Setting Dialog Message
		alertDialog
				.setMessage("GPS is not enabled. Do you want to go to settings menu?");

		// On pressing Settings button
		alertDialog.setPositiveButton("Settings",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Intent intent = new Intent(
								Settings.ACTION_LOCATION_SOURCE_SETTINGS);
						startActivity(intent);
					}
				});

		// on pressing cancel button
		alertDialog.setNegativeButton("Cancel",
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();
					}
				});

		// Showing Alert Message
		alertDialog.show();
	}

	protected void goToCurrentLocation() {

		LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

		Location currentLocation = manager
				.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);
		if (currentLocation == null) {
			
			 Toast.makeText(NearestHospital.this, "Location isn't avialable",
			 Toast.LENGTH_SHORT).show();
			 
		
			showSettingsAlert();
		} else {
			/*
			 * LatLng ll = new LatLng(currentLocation.getLatitude(),
			 * currentLocation.getLongitude());
			 */

			MarkerOptions mo = new MarkerOptions()
					.title("I am here")
					.icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_walk))
					.position(
							new LatLng(currentLocation.getLatitude(),
									currentLocation.getLongitude()));
			mar = mMap.addMarker(mo);

			/*
			 * if (mMap.) {
			 * 
			 * }
			 */

			StringBuilder sb = new StringBuilder(
					"https://maps.googleapis.com/maps/api/place/nearbysearch/json?");
			sb.append("location=" + currentLocation.getLatitude() + ","
					+ currentLocation.getLongitude());
			sb.append("&radius=5000");
			sb.append("&types=" + "hospital");
			sb.append("&sensor=true");
			sb.append("&key=AIzaSyCHc18OYZs6HF82CNr72MOCRZ_5okCR7Gc");

			// Creating a new non-ui thread task to download Google place json
			// data
			PlacesTask placesTask = new PlacesTask();

			// Invokes the "doInBackground()" method of the class PlaceTask
			placesTask.execute(sb.toString());

		}

	}

	private class PlacesTask extends AsyncTask<String, Integer, String> {

		String data = null;

		// Invoked by execute() method of this object

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			pd = new ProgressDialog(NearestHospital.this);
			pd.setMessage("Please wait...");
			pd.show();
		}

		@Override
		protected String doInBackground(String... url) {
			try {
				data = downloadUrl(url[0]);
			} catch (Exception e) {
				Log.d("Background Task", e.toString());
			}
			return data;
		}

		// Executed after the complete execution of doInBackground() method
		@Override
		protected void onPostExecute(String result) {

			pd.dismiss();
			ParserTask parserTask = new ParserTask();

			// Start parsing the Google places in JSON format
			// Invokes the "doInBackground()" method of the class ParseTask
			parserTask.execute(result);
		}

	}

	/** A class to parse the Google Places in JSON format */
	private class ParserTask extends
			AsyncTask<String, Integer, List<HashMap<String, String>>> {

		JSONObject jObject;

		@Override
		protected void onPreExecute() {
			// TODO Auto-generated method stub
			super.onPreExecute();
			pd = new ProgressDialog(NearestHospital.this);
			pd.setMessage("Please wait...");
			pd.show();
		}

		// Invoked by execute() method of this object
		@Override
		protected List<HashMap<String, String>> doInBackground(
				String... jsonData) {

			List<HashMap<String, String>> places = null;
			PlaceJSONParser placeJsonParser = new PlaceJSONParser();

			try {
				jObject = new JSONObject(jsonData[0]);

				/** Getting the parsed data as a List construct */
				places = placeJsonParser.parse(jObject);

			} catch (Exception e) {
				Log.d("Exception", e.toString());
			}
			return places;
		}

		// Executed after the complete execution of doInBackground() method
		@Override
		protected void onPostExecute(List<HashMap<String, String>> list) {

			// Clears all the existing markers

			pd.dismiss();
			mMap.clear();

			LatLngBounds.Builder builder = new LatLngBounds.Builder();
			for (int i = 0; i < list.size(); i++) {

				// Creating a marker
				MarkerOptions markerOptions = new MarkerOptions();

				// Getting a place from the places list
				HashMap<String, String> hmPlace = list.get(i);

				// Getting latitude of the place
				double lat = Double.parseDouble(hmPlace.get("lat"));

				// Getting longitude of the place
				double lng = Double.parseDouble(hmPlace.get("lng"));

				// Getting name
				String name = hmPlace.get("place_name");

				// Getting vicinity
				String vicinity = hmPlace.get("vicinity");

				LatLng latLng = new LatLng(lat, lng);

				// Setting the position for the marker
				markerOptions.position(latLng);

				// Setting the title for the marker.
				// This will be displayed on taping the marker
				markerOptions.title(name);
				markerOptions.snippet(vicinity);
				markerOptions.icon(BitmapDescriptorFactory
						.fromResource(R.drawable.ic_map_marker));

				// Placing a marker on the touched position
				mMap.addMarker(markerOptions);

				// TODO Auto-generated method stub

				builder.include(latLng);

			}
			LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

			Location currentLocation = manager
					.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);
			LatLng ll = new LatLng(currentLocation.getLatitude(),
					currentLocation.getLongitude());

			// Placing a marker on the touched position
			mMap.addMarker(new MarkerOptions().position(ll).title("This is me")
					.icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_walk)));
			builder.include(ll);
			mFrag.getView().setVisibility(View.VISIBLE);
			LatLngBounds bounds = builder.build();

			int padding = 0;

			CameraUpdate up = CameraUpdateFactory.newLatLngBounds(bounds,
					padding);
			mMap.moveCamera(up);

		}

	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();

		finish();
	}

	private String downloadUrl(String strUrl) throws IOException {
		String data = "";
		InputStream iStream = null;
		HttpURLConnection urlConnection = null;
		try {
			URL url = new URL(strUrl);

			// Creating an http connection to communicate with url
			urlConnection = (HttpURLConnection) url.openConnection();

			// Connecting to url
			urlConnection.connect();

			// Reading data from url
			iStream = urlConnection.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(
					iStream));

			StringBuffer sb = new StringBuffer();

			String line = "";
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

			data = sb.toString();

			br.close();

		} catch (Exception e) {
			Log.d("Exception while downloading url", e.toString());
		} finally {
			iStream.close();
			urlConnection.disconnect();
		}

		return data;
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
	        Intent i = new Intent(NearestHospital.this, Actionbar.class);
	        startActivity(i);
	    }
 

}
