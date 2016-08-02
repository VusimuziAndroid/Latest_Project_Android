package android.latest_project_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by Vusi Ngwenya on 7/13/2016.
 */
public class CustomPagerAdapter extends PagerAdapter {
    Context mContext;
    LayoutInflater mLayoutInflater;
    String mResources;
    String[] title;
    String[] description;
    int resources;

    public CustomPagerAdapter(Context context,int resource){
       // super(context);
        mContext = context;
        this.resources=resource;
        //Bundle bundle;
       // mLayoutInflater = (LayoutInflater) mContext.getFragment(Bundle);
    }

   // @Override
    public int getCount(){
        return this.resources;
    }

   // @Override
    public boolean isViewFromObject(View view,Object object){
        return view == ((LinearLayout) object);
    }

   // @Override
    public Object instantiateItem(ViewGroup container,int position){
        View itemView = mLayoutInflater.inflate(R.layout.pager_item,container,false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.img_pager_item);
        imageView.setImageResource(resources);
        container.addView(itemView);
        return itemView;
    }
   // @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((LinearLayout) object);
    }

}
