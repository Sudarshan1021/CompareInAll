package com.example.sudarshan.myapplication1;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivitySixO extends AppCompatActivity implements Tab16.OnFragmentInteractionListener,Tab17.OnFragmentInteractionListener,Tab18.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six_o);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout5);
        tabLayout.addTab(tabLayout.newTab().setText("AMAZON"));
        tabLayout.addTab(tabLayout.newTab().setText("FLIPKART"));
        tabLayout.addTab(tabLayout.newTab().setText("EBAY"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager5);
        final com.example.sudarshan.myapplication1.PagerAdapter5 adapter = new com.example.sudarshan.myapplication1.PagerAdapter5(getSupportFragmentManager(),tabLayout.getTabCount());
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
        if(Tab16.webView.canGoBack()){
            Tab16.webView.goBack();
            return;
        }
        if(Tab17.webView.canGoBack()){
            Tab17.webView.goBack();
            return;
        }
        if(Tab18.webView.canGoBack()){
            Tab18.webView.goBack();
            return;
        }
        super.onBackPressed();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
