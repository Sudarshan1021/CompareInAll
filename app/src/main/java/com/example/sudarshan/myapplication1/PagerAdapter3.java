package com.example.sudarshan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter3 extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public PagerAdapter3(FragmentManager fm, int NumberOfTabs){

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Tab10 tab1 = new Tab10();
                return tab1;

            case 1:
                Tab11 tab2 = new Tab11();
                return tab2;

            case 2:
                Tab12 tab3 = new Tab12();
                return tab3;

            default:
                return null;
        }
    }
        @Override
        public int getCount() {
            return mNoOfTabs;
        }
    }