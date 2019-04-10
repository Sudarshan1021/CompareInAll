package com.example.sudarshan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;

public class PagerAdapter1 extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter1(FragmentManager fm, int NumberOfTabs){

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position){
        case 0:
        Tab4 tab1 = new Tab4();
        return  tab1;

        case 1:
        Tab5 tab2 = new Tab5();
        return  tab2;

        case 2:
        Tab6 tab3 = new Tab6();
        return  tab3;

        default:
        return null;
    }}

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
