package com.example.vacationproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class MyAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;
    private List<String> mtitle;
    public MyAdapter(FragmentManager fm, List<Fragment> mFragments, List<String> mtitle){
        super(fm);
        this.mFragments=mFragments;
        this.mtitle=mtitle;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
    @Override
    public CharSequence getPageTitle(int position){
        return mtitle.get(position);
    }
}
