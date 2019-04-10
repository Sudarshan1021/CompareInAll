package com.example.sudarshan.myapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter4 extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public PagerAdapter4(FragmentManager fm, int NumberOfTabs){

        super(fm);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab13 tab1 = new Tab13();
                return  tab1;

            case 1:
                Tab14 tab2 = new Tab14();
                return  tab2;

            case 2:
                Tab15 tab3 = new Tab15();
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
