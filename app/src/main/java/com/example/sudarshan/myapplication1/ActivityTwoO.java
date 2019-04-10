package com.example.sudarshan.myapplication1;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityTwoO extends AppCompatActivity implements Tab4.OnFragmentInteractionListener,Tab5.OnFragmentInteractionListener,Tab6.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_o);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout1);
        tabLayout.addTab(tabLayout.newTab().setText("WEBOPEDIA"));
        tabLayout.addTab(tabLayout.newTab().setText("WHATIS.TECHTARGET"));
        tabLayout.addTab(tabLayout.newTab().setText("TECHTERMS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


    final ViewPager viewPager = (ViewPager)findViewById(R.id.pager1);
    final com.example.sudarshan.myapplication1.PagerAdapter1 adapter = new com.example.sudarshan.myapplication1.PagerAdapter1(getSupportFragmentManager(),tabLayout.getTabCount());
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
        if(Tab4.webView.canGoBack()){
            Tab4.webView.goBack();
            return;
        }
        if(Tab5.webView.canGoBack()){
            Tab5.webView.goBack();
            return;
        }
        if(Tab6.webView.canGoBack()){
            Tab6.webView.goBack();
            return;
        }
        super.onBackPressed();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
