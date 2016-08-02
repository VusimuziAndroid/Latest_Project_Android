package android.latest_project_android;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ABVN237 on 8/1/2016.
 */
public class PageFragment extends Fragment {
    public static final String ARG_PAGE="ARG_PAGE";
    private int mPage;
    public static PageFragment newInstance(int page){
        Bundle args= new Bundle();
        args.putInt(ARG_PAGE,page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

  /*  @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_page,container,false);

    }*/
}
