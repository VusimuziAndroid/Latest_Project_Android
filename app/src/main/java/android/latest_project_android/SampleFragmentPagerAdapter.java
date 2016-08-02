package android.latest_project_android;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.astuetz.PagerSlidingTabStrip;

/**
 * Created by ABVN237 on 8/1/2016.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter implements PagerSlidingTabStrip.IconTabProvider {
    final int PAGE_COUNT =3;
    private int tabIcons[]={R.drawable.ic_fiber_manual_record_white_48dp,R.drawable.ic_fiber_manual_record_white_48dp,R.drawable.ic_fiber_manual_record_white_48dp};

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return null ;
    }

    @Override
    public int getPageIconResId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
