package com.liliana.facebook2.ui.main;

import android.content.Context;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.liliana.facebook2.R;
import com.liliana.facebook2.ui.main.GeneralPage.GeneralPage;
import com.liliana.facebook2.ui.main.Group.GroupPage;
import com.liliana.facebook2.ui.main.Home.HomePage;
import com.liliana.facebook2.ui.main.NotificationPage.NotificationPage;
import com.liliana.facebook2.ui.main.ObjectPage.MePage;
import com.liliana.facebook2.ui.main.Watch.WatchPage;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        // return PlaceholderFragment.newInstance(position + 1);
        switch (position) {
            case 0:
                return HomePage.newInstance(position);
            case 1:
                return GroupPage.newInstance(position);

            case 2:
                return WatchPage.newInstance(position);

            case 3:
                return MePage.newInstance(position);

            case 4:
                return NotificationPage.newInstance(position);
            default:
                return GeneralPage.newInstance(position);


        }

    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 6;
    }
}