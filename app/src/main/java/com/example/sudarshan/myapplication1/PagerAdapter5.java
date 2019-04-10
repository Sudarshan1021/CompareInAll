package com.example.sudarshan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter5 extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public PagerAdapter5(FragmentManager fm, int NumberOfTabs){

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
        case 0:
        Tab16 tab1 = new Tab16();
        return  tab1;

        case 1:
        Tab17 tab2 = new Tab17();
        return  tab2;

        case 2:
        Tab18 tab3 = new Tab18();
        return  tab3;

        default:
        return null;
    }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
