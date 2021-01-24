package com.example.welcome.navigation_bar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by welcome on 23-07-2019.
 */

public class tabpaqerAdapter extends FragmentStatePagerAdapter {
    String[] tabarray=new String[]{"One","Two","Three","Four"};

    public tabpaqerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position){
      return tabarray[position];
    }
    @Override
    public Fragment getItem(int position) {

        return null;
    }
    @Override
    public int getCount() {
        return 0;
    }
}
