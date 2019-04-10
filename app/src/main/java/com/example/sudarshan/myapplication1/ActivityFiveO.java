package com.example.sudarshan.myapplication1;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFiveO extends AppCompatActivity implements Tab13.OnFragmentInteractionListener,Tab14.OnFragmentInteractionListener,Tab15.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_o);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout4);
        tabLayout.addTab(tabLayout.newTab().setText("TICKETNEW"));
        tabLayout.addTab(tabLayout.newTab().setText("BOOKMYSHOW"));
        tabLayout.addTab(tabLayout.newTab().setText("JUSTTICKETS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager4);
        final com.example.sudarshan.myapplication1.PagerAdapter4 adapter = new com.example.sudarshan.myapplication1.PagerAdapter4(getSupportFragmentManager(),tabLayout.getTabCount());
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
        if(Tab13.webView.canGoBack()){
            Tab13.webView.goBack();
            return;
        }
        if(Tab14.webView.canGoBack()){
            Tab14.webView.goBack();
            return;
        }
        if(Tab15.webView.canGoBack()){
            Tab15.webView.goBack();
            return;
        }
        super.onBackPressed();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
