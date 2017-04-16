import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.julio.rutasutecv3.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by julio on 04-15-17.
 */

public class mapas  extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap map;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.mapas,container,false);
    }
    public void onMapReady(GoogleMap googleMap){

        map = googleMap;
        LatLng santiago = new LatLng(13.6462418,-89.10387830000002);
        map.moveCamera(CameraUpdateFactory.newLatLng(santiago));
    }


}
