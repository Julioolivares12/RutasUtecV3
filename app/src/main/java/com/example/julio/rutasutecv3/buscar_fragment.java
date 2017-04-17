package com.example.julio.rutasutecv3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by julio on 4/17/17.
 */

public class buscar_fragment extends Fragment {
    private static final String Tag = "buscar_fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.buscar_fragment,container,false);
        return view;
    }
}
