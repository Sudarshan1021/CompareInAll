package com.example.sudarshan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter2 extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public PagerAdapter2(FragmentManager fm, int NumberOfTabs){

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab7 tab1 = new Tab7();
                return  tab1;

            case 1:
                Tab8 tab2 = new Tab8();
                return  tab2;

            case 2:
                Tab9 tab3 = new Tab9();
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
