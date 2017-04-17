package com.example.julio.rutasutecv3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by julio on 4/17/17.
 */

public class mapas_fragment extends Fragment {
    private static final String Tag="mapas_fragment";
    private TextView txtmapas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.mapas_fragment,container,false);
        txtmapas=(TextView)view.findViewById(R.id.txtmapas);
        return view;
    }
}
