package com.example.sudarshan.myapplication1;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class ActivityThreeO extends AppCompatActivity implements Tab7.OnFragmentInteractionListener,Tab8.OnFragmentInteractionListener,Tab9.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_o);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout2);
        tabLayout.addTab(tabLayout.newTab().setText("SHUTTERSTOCK"));
        tabLayout.addTab(tabLayout.newTab().setText("DREAMSTIME"));
        tabLayout.addTab(tabLayout.newTab().setText("PIXABAY"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager2);
        final com.example.sudarshan.myapplication1.PagerAdapter2 adapter = new com.example.sudarshan.myapplication1.PagerAdapter2(getSupportFragmentManager(),tabLayout.getTabCount());
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
        if(Tab7.webView.canGoBack()){
            Tab7.webView.goBack();
            return;
        }
        if(Tab8.webView.canGoBack()){
            Tab8.webView.goBack();
            return;
        }
        if(Tab9.webView.canGoBack()){
            Tab9.webView.goBack();
            return;
        }
        super.onBackPressed();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
