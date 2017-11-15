package xebia.ismail.e_learning.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xebia.ismail.e_learning.R;
import xebia.ismail.e_learning.bcn.BacaanFragment;
import xebia.ismail.e_learning.bcn.SwitchBacaanFragment;
import xebia.ismail.e_learning.materi.RukunFragment;
import xebia.ismail.e_learning.materi.SyaratFragment;

/**
 * Created by Admin on 3/15/2017.
 */

public class VolumeFragment extends Fragment{

    private static ViewPager mPager;
    private TabLayout mTabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab_volume, container, false);
        mPager = (ViewPager) view.findViewById(R.id.pager);
        mTabLayout = (TabLayout) view.findViewById(R.id.tab_layout);

        mPager.setAdapter(new TabsAdapter(getChildFragmentManager()));
        mTabLayout.setupWithViewPager(mPager);

        setHasOptionsMenu(true);

        return view;
    }

    class TabsAdapter extends FragmentPagerAdapter {

        public TabsAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new SwitchBacaanFragment();
                case 1:
                    return new RukunFragment();
                case 2:
                    return new SyaratFragment();
            }
            return null;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Bacaan Shalat Jenazah";
                case 1:
                    return "Rukun Shalat Jenazah";
                case 2:
                    return "Syarat Shalat Jenazah";
            }
            return "";
        }
    }
}
