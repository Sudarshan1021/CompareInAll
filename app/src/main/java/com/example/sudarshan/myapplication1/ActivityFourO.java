package com.example.sudarshan.myapplication1;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFourO extends AppCompatActivity implements Tab10.OnFragmentInteractionListener,Tab11.OnFragmentInteractionListener,Tab12.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_o);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout3);
        tabLayout.addTab(tabLayout.newTab().setText("YOUTUBE"));
        tabLayout.addTab(tabLayout.newTab().setText("DAILYMOTION"));
        tabLayout.addTab(tabLayout.newTab().setText("VEOH"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager3);
        final com.example.sudarshan.myapplication1.PagerAdapter3 adapter = new com.example.sudarshan.myapplication1.PagerAdapter3(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        if(Tab10.webView.canGoBack()){
            Tab10.webView.goBack();
            return;
        }
        if(Tab11.webView.canGoBack()){
            Tab11.webView.goBack();
            return;
        }
        if(Tab12.webView.canGoBack()){
            Tab12.webView.goBack();
            return;
        }
        super.onBackPressed();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}


