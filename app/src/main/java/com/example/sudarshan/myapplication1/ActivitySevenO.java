package com.example.sudarshan.myapplication1;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivitySevenO extends AppCompatActivity implements Tab19.OnFragmentInteractionListener,Tab20.OnFragmentInteractionListener,Tab21.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven_o);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout6);
        tabLayout.addTab(tabLayout.newTab().setText("TECHRADAR"));
        tabLayout.addTab(tabLayout.newTab().setText("DIGITALTRENDS"));
        tabLayout.addTab(tabLayout.newTab().setText("DIGIT"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager6);
        final com.example.sudarshan.myapplication1.PagerAdapter6 adapter = new com.example.sudarshan.myapplication1.PagerAdapter6(getSupportFragmentManager(),tabLayout.getTabCount());
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
        if(Tab19.webView.canGoBack()){
            Tab19.webView.goBack();
            return;
        }
        if(Tab20.webView.canGoBack()){
            Tab20.webView.goBack();
            return;
        }
        if(Tab21.webView.canGoBack()){
            Tab21.webView.goBack();
            return;
        }
        super.onBackPressed();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
