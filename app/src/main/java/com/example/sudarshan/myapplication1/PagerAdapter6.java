package com.example.sudarshan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter6 extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public PagerAdapter6(FragmentManager fm, int NumberOfTabs){

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab19 tab1 = new Tab19();
                return  tab1;

            case 1:
                Tab20 tab2 = new Tab20();
                return  tab2;

            case 2:
                Tab21 tab3 = new Tab21();
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
