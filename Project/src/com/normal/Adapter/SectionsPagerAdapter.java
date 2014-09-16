package com.normal.Adapter;

/**
 * Created by chenjinghao on 14/9/16 at 下午8:23.
 * Description:
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.normal.fragment.PlaceholderFragment;

import java.util.Locale;

/**
 * A {@link android.support.v4.app.FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    //为了取得String里面的数据，需要取得Application的Context
    //    private Context context = MainActivity.context;
    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PlaceholderFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        //这里的数值可以根据需要来确定，return的值可以是List.size
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        String positionString;
        /*
        //默认的是Switch case，需要引入Context
        switch (position) {
            case 0:
                return context.getString(R.string.title_section1).toUpperCase(l);
            case 1:
                return context.getString(R.string.title_section2).toUpperCase(l);
            case 2:
                return context.getString(R.string.title_section3).toUpperCase(l);
        }*/
        //改成for循环形式，不需要引入context，可以循环添加tabs，也可以从列表中取值添加到Tab上
        for (int i = 0; i < getCount(); i++) {
            positionString = Integer.toString(position + 1).toUpperCase(l);
            return positionString;
        }
        return null;
    }
}