package com.example.a35_1_tab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionPageAdapter extends FragmentPagerAdapter {

    List<Fragment> gFragments = new ArrayList<>();
    List<String> gFragmentTitle = new ArrayList<>();


    public void addFragment(Fragment fragment,String title){
        gFragments.add(fragment);
        gFragmentTitle.add(title);
    }

    public SectionPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return gFragmentTitle.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return gFragments.get(position);
    }

    @Override
    public int getCount() {
        return gFragments.size();
    }
}
