package com.example.julio.rutasutecv3;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final  String Tag="MainActivity";
    private SectionPageAdapter mSectionPageAdapter;
    private ViewPager mViePager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(Tag,"onCreate: Starting");

        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        //set up the ViewPager with the sections adapter.
        mViePager = (ViewPager)findViewById(R.id.container);
        setUpViewPager(mViePager);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViePager);
    }
    private void setUpViewPager(ViewPager viewPager){
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new inicio_fragment(),"inicio");
        adapter.addFragment(new mapas_fragment(),"mapas");
        adapter.addFragment(new buscar_fragment(),"buscar");
        
        viewPager.setAdapter(adapter);
       //viewPager.setAdapter(Adapter);

    }
}
