package com.example.miguel.seccion7.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.miguel.seccion7.Fragments.FirstFragment;
import com.example.miguel.seccion7.Fragments.SecondFragment;
import com.example.miguel.seccion7.Fragments.ThirdFragment;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public MyPagerAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
