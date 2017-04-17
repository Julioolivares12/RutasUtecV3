package com.example.julio.rutasutecv3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by julio on 4/17/17.
 */

public class mapas_fragment extends Fragment implements OnMapReadyCallback {
    private static final String Tag="mapas_fragment";
    MapView mapView;
    private GoogleMap googleMap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.mapas_fragment,container,false);
        mapView=(MapView)view.findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);

        mapView.onResume();
        try
        {
            MapsInitializer.initialize(getActivity().getApplicationContext());
        }catch (Exception e){
            //aqui va todo codigo
            e.printStackTrace();
        }
        mapView.getMapAsync(this);
      /*  mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                googleMap.setMyLocationEnabled(true);
            }
        });*/

        return view;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng latLng = new LatLng(13.6462418,-89.10387830000002);
        float zoom=13;
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,zoom));

    }
}
