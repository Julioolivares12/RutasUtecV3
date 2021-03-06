package com.example.julio.rutasutecv3;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

public class Menu extends FragmentActivity implements OnMapReadyCallback {

    private FragmentTabHost tabHost;
    private TabHost Tbh;
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        SupportMapFragment mapFragment =(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

      //  tabHost=(FragmentTabHost)findViewById(R.id.tabHost);
        /*tabHost= (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,getSupportFragmentManager(),android.R.id.content);
        tabHost.addTab(tabHost.newTabSpec("inicio").setIndicator("inicio"),inicio.class,null);
        tabHost.addTab(tabHost.newTabSpec("mapas").setIndicator("mapas"),mapas.class, null);*/

       Tbh= (TabHost)findViewById(R.id.tabHost);
        Tbh.setup();
        TabHost.TabSpec tab1 = Tbh.newTabSpec("tab1");
        TabHost.TabSpec tab2= Tbh.newTabSpec("tab2");
        TabHost.TabSpec tab3 = Tbh.newTabSpec("tab3");

        tab1.setIndicator("inicio");
        tab1.setContent(R.id.inicio);
        tab2.setIndicator("mapas");
        tab2.setContent(R.id.mapas);
        tab3.setIndicator("buscar");
        tab3.setContent(R.id.buscar);

        Tbh.addTab(tab1);
        Tbh.addTab(tab2);
        Tbh.addTab(tab3);

        /*Tbh.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Toast.makeText(getApplicationContext(),"pesta "+tabId+"pulsada",Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;
        LatLng santiago = new LatLng(13.6462418,-89.10387830000002);
        map.moveCamera(CameraUpdateFactory.newLatLng(santiago));
    }
}
