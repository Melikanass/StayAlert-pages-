package com.example.stayalert;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng austin = new LatLng(30.5119, -97.8178);
        mMap.addMarker(new MarkerOptions().position(austin).title("EYC: 570").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        LatLng austin1 = new LatLng(30.1472, -97.5897);
        mMap.addMarker(new MarkerOptions().position(austin1).title("EYC: 909").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        LatLng austin2 = new LatLng(30.1359, -97.7431);
        mMap.addMarker(new MarkerOptions().position(austin2).title("EYC: 36").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng austin3 = new LatLng(30.3332, -97.5464);
        mMap.addMarker(new MarkerOptions().position(austin3).title("EYC: 142").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        LatLng austin4 = new LatLng(30.4332, -97.6006);
        mMap.addMarker(new MarkerOptions().position(austin4).title("EYC: 615").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        LatLng austin5 = new LatLng(30.2729, -97.7444);
        mMap.addMarker(new MarkerOptions().position(austin5).title("EYC: 7073").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng austin6 = new LatLng(30.2604, -97.7145);
        mMap.addMarker(new MarkerOptions().position(austin6).title("EYC: 4835").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng austin7 = new LatLng(30.2915, -97.7688);
        mMap.addMarker(new MarkerOptions().position(austin7).title("EYC: 1590").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        LatLng austin8 = new LatLng(30.2457, -97.7688);
        mMap.addMarker(new MarkerOptions().position(austin8).title("EYC: 6502").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng austin9 = new LatLng(30.2692, -97.739);
        mMap.addMarker(new MarkerOptions().position(austin9).title("EYC: 2124").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        LatLng austin10 = new LatLng(0, 0);
        mMap.addMarker(new MarkerOptions().position(austin10).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin11 = new LatLng(0, 0);
        mMap.addMarker(new MarkerOptions().position(austin11).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin12 = new LatLng(30.3912, -97.7051);
        mMap.addMarker(new MarkerOptions().position(austin12).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin13 = new LatLng(30.23, -97.85);
        mMap.addMarker(new MarkerOptions().position(austin13).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin14 = new LatLng(30.3393, -97.6643);
        mMap.addMarker(new MarkerOptions().position(austin14).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin15 = new LatLng(30.2781, -97.7384);
        mMap.addMarker(new MarkerOptions().position(austin15).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin16 = new LatLng(30.2835, -97.7349);
        mMap.addMarker(new MarkerOptions().position(austin16).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin17 = new LatLng(30.28, -97.74);
        mMap.addMarker(new MarkerOptions().position(austin17).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin18 = new LatLng(30.2975, -97.767);
        mMap.addMarker(new MarkerOptions().position(austin18).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin19 = new LatLng(30.21, -97.8);
        mMap.addMarker(new MarkerOptions().position(austin19).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin20 = new LatLng(30.2731, -97.7986);
        mMap.addMarker(new MarkerOptions().position(austin20).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin21 = new LatLng(0, 0);
        mMap.addMarker(new MarkerOptions().position(austin21).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin22 = new LatLng(0, 0);
        mMap.addMarker(new MarkerOptions().position(austin22).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin23 = new LatLng(0, 0);
        mMap.addMarker(new MarkerOptions().position(austin23).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin24 = new LatLng(0, 0);
        mMap.addMarker(new MarkerOptions().position(austin24).title("EYC: 0").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        LatLng austin25 = new LatLng(30.2737, -97.6819);
        mMap.addMarker(new MarkerOptions().position(austin25).title("EYC: 1769").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        LatLng austin26 = new LatLng(30.292, -97.7118);
        mMap.addMarker(new MarkerOptions().position(austin26).title("EYC: 807").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        LatLng austin27 = new LatLng(30.3081, -97.6819);
        mMap.addMarker(new MarkerOptions().position(austin27).title("EYC: 5672").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        LatLng austin28 = new LatLng(30.2944, -97.6223);
        mMap.addMarker(new MarkerOptions().position(austin28).title("EYC: 1847").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        LatLng austin29 = new LatLng(30.2317, -97.6168);
        mMap.addMarker(new MarkerOptions().position(austin29).title("EYC: 161").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng austin30 = new LatLng(30.4191, -97.8395);
        mMap.addMarker(new MarkerOptions().position(austin30).title("EYC: 622").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(austin));
    }
}
