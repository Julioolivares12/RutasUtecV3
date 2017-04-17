package com.example.julio.rutasutecv3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by julio on 4/17/17.
 */

public class inicio_fragment extends Fragment {
    private static final String TAG = "inicio_fragment";

    private TextView txtinicio;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.inicio_fragment,container,false);
        txtinicio=(TextView)view.findViewById(R.id.txtinicio);
        return view;
    }
}
