package com.example.miguel.tabby.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.miguel.tabby.Fragments.FirstFragment;
import com.example.miguel.tabby.Fragments.SecondFragment;

public class MyPagerAdapter extends FragmentPagerAdapter {

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
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
