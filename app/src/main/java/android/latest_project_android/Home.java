package android.latest_project_android;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    TabHost tabhost;
    Items item;
    Icons icons;
    ArrayAdapter<Items>itemAdapter;
    ArrayAdapter<Icons>iconAdapter;
   // private ArrayList<Items> itemsArrayList = new ArrayList<Items>();
    private List<Items> itemsList = new ArrayList<Items>();
    private List<Icons> iconList = new ArrayList<Icons>();
   // private static ImageView imageViewCircle;
    ListView lsItems;
    ListView lsIcons;
    ArrayAdapter<Items>itemAdapter2;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    ViewPagerAdapter viewPagerAdapter;
    // private ArrayList<Items> itemsArrayList2 = new ArrayList<Items>();
    private List<Items> itemsList2 = new ArrayList<Items>();
    ListView lsItems2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        // viewPagerAdapter.addFragments(new HomeFragment(),"Home");
        viewPager.setAdapter(viewPagerAdapter);
        //  viewPagerAdapter.addFragments(new SecondFragment(),"Home");
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
        tabLayout.setTabTextColors(getResources().getColor(R.color.tab_text_color), getResources().getColor(R.color.tab_text_color));
        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.tab_text_color));


      /*  TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);*/

        //    viewPagerAdapter.addFragments(new SecondFragment(),"Second Fragment");

       /* TabLayout tabLayout = (TabLayout) findViewById(R.id.toolbar);
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
      /*  final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        final PagerAdapter adapter;
                adapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });*/
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
      /*  tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();
        TabHost.TabSpec  firstText = tabhost.newTabSpec("HOME");
        firstText.setContent(R.id.SHARE);
        firstText.setIndicator("",getDrawable(R.drawable.ic_share));
        tabhost.addTab(firstText);
        TabHost.TabSpec secondText = tabhost.newTabSpec("PROFILE");
        secondText.setContent(R.id.PHOTOS);
        secondText.setIndicator("",getDrawable(R.drawable.ic_photo));
        tabhost.addTab(secondText);*/
       /* TabHost.TabSpec thirdText = tabhost.newTabSpec("CHATS");
        thirdText.setContent(R.id.CHATS);
        thirdText.setIndicator("",getDrawable(R.drawable.ic_question_answer_white_48dp));
        tabhost.addTab(thirdText);
        TabHost.TabSpec fourthText = tabhost.newTabSpec("GROUPS");
        fourthText.setContent(R.id.GROUPS);
        fourthText.setIndicator("",getDrawable(R.drawable.ic_search_white_48dp));
        tabhost.addTab(fourthText);
        TabHost.TabSpec fifthText = tabhost.newTabSpec("MENU");
        fifthText.setContent(R.id.MENU);
        fifthText.setIndicator("", getDrawable(R.drawable.ic_apps_white_48dp));
        tabhost.addTab(fifthText);*/
        populateItemsList();
        itemAdapter = new MyListAdapterItems(getApplicationContext(),R.layout.list_timeline, itemsList);
        lsItems = (ListView) findViewById(R.id.lsTimeline);
        lsItems.setAdapter(itemAdapter);

        /*populateIconsList();
        iconAdapter = new MyListAdapterIcons(getApplicationContext(),R.layout.list_icons, iconList);
        lsIcons = (ListView) findViewById(R.id.);
        lsIcons.setAdapter(iconAdapter);*/
       /* populateItemsList2();
        itemAdapter2 = new MyListAdapterItems2(getApplicationContext(),R.layout.list_items, itemsList2);
        lsItems2 = (ListView) findViewById(R.id.lsItemsIcon);
        lsItems2.setAdapter(itemAdapter2);*/
    }
    //The method for populating the list view
    public void populateItemsList(){
        int proPicture=R.drawable.pro_picture;
        String name="Christine Perkins";
        String role="CEO of Solar Slash";
        String time="23 mins";
        String storyLine="Reallly excited to use the technological progress "+
                         "happening in solar right now. Where do you guys"+
                         "think the biggest impact will be?";
        int timelinePicture=R.drawable.timeline_pic1;
        String story="SolarCity to Make High Efficiency Panel";
        String sites="SolarCity to Make High Efficiency Panel";
      //  String sites="mytimes.com";
        String likes="mytimes.com";
        String likes2="29 Comments";
        String comments="12 Comments";
        String fullName="Jason Anderson";
        int proPic=R.drawable.profile_image;
        String allComments="I think this is the amazing leap for conwumer electricity cost";
        itemsList.add(new Items(proPicture, name, role, time, storyLine, timelinePicture, story, sites, likes, likes2, comments, R.drawable.ic_like, R.drawable.ic_comments, R.drawable.ic_share2, proPic, fullName, allComments));
        //.add(new Items(R.drawable.ic_linked_camera_black_48dp,camera));
        //profile.add(new Profile(role,relatedRole,R.drawable.pro_pic1));
    }
    //The class for the Array Adapter
    private class MyListAdapterItems extends ArrayAdapter<Items> {
        int resource;
        ArrayList<Items> items1= new ArrayList<Items>();
        public MyListAdapterItems(Context context, int resource, List<Items> objects) {
            super(context, resource, objects);
            this.resource = resource;
            items1 = (ArrayList<Items>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }

            Items items =items1.get(position);

            //Setting values to the Controls on the inflater layout
            /*ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgProfilePicture);
            Bitmap bitmap=null;
            Bitmap circle = Bitmap.createBitmap(bitmap.getWidth(),bitmap.getHeight(),Bitmap.Config.ARGB_8888);

            imgProfilePicture.setImageResource(items.getProfilePicture());*/
            ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgProfilePicture);
            imgProfilePicture.setImageResource(items.getProfilePicture());

            TextView tvName=(TextView) itemView.findViewById(R.id.tvName);
            tvName.setText(items.getName());

            TextView tvRole=(TextView) itemView.findViewById(R.id.tvRole);
            tvRole.setText(items.getRole());

            TextView tvTime=(TextView) itemView.findViewById(R.id.tvTime);
            tvTime.setText(items.getTime());

            TextView tvStory=(TextView) itemView.findViewById(R.id.tvStory);
            tvStory.setText(items.getStory());

            ImageView imgTimeLinePicture = (ImageView) itemView.findViewById(R.id.imgTimelinePic);
            imgTimeLinePicture.setImageResource(items.getTimeLinePic());

            TextView tvStoryLine=(TextView) itemView.findViewById(R.id.tvStoryLine);
            tvTime.setText(items.getStoryLine());

            TextView tvSite=(TextView) itemView.findViewById(R.id.tvSite);
            tvSite.setText(items.getSite());

            TextView tvLikes=(TextView) itemView.findViewById(R.id.tvLikes);
            tvLikes.setText(items.getLikes());

            TextView tvLikes2=(TextView) itemView.findViewById(R.id.tvLikes2);
            tvLikes2.setText(items.getLikes2());

            TextView tvComments=(TextView) itemView.findViewById(R.id.tvComments);
            tvComments.setText(items.getComments());

            ImageView imgLikes = (ImageView) itemView.findViewById(R.id.imgLikes);
            imgLikes.setImageResource(items.getImgLikes());

            ImageView imgComments = (ImageView) itemView.findViewById(R.id.imgComments);
            imgComments.setImageResource(items.getImgComments());

            ImageView imgShare = (ImageView) itemView.findViewById(R.id.imgShares);
            imgShare.setImageResource(items.getImgShare());

            ImageView proPicture = (ImageView) itemView.findViewById(R.id.imgProPicture);
            proPicture.setImageResource(items.getPicture());

            TextView tvFillName=(TextView) itemView.findViewById(R.id.tvFullName);
            tvFillName.setText(items.getFullName());

            TextView tvAllComments=(TextView) itemView.findViewById(R.id.tvPostComment);
            tvAllComments.setText(items.getAllComments());

            return itemView;
        }
    }

    //The method for populating the list view
    public void populateIconsList(){
        iconList.add(new Icons(R.drawable.ic_like,R.drawable.ic_comments,R.drawable.ic_share2));
    }
    //The class for the Array Adapter
    private class MyListAdapterIcons extends ArrayAdapter<Icons> {
        int resource;
        ArrayList<Icons> icons= new ArrayList<Icons>();
        public MyListAdapterIcons(Context context, int resource, List<Icons> objects) {
            super(context, resource, objects);
            this.resource = resource;
            icons = (ArrayList<Icons>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }

            Icons icon =icons.get(position);

            //Setting values to the Controls on the inflater layout
            ImageView imgPictureIcon1= (ImageView) itemView.findViewById(R.id.imgLike);
            imgPictureIcon1.setImageResource(icon.getPictureIcon1());
            /*imageViewCircle = (ImageView) itemView.findViewById(R.id.imgLike);
            imageViewCircle.setImageResource(icon.getPictureIcon1());*/

            ImageView imgPictureIcon2=(ImageView) itemView.findViewById(R.id.imgComment);
            imgPictureIcon2.setImageResource(icon.getPictureIcon2());

            ImageView imgPictureIcon3=(ImageView) itemView.findViewById(R.id.imgShare);
            imgPictureIcon3.setImageResource(icon.getPictureIcon3());

            /*TextView tvName=(TextView) itemView.findViewById(R.id.tvName);
            tvName.setText(items.getName());

            TextView tvRole=(TextView) itemView.findViewById(R.id.tvRole);
            tvRole.setText(items.getRole());

            TextView tvTime=(TextView) itemView.findViewById(R.id.tvTime);
            tvTime.setText(items.getTime());

            TextView tvStory=(TextView) itemView.findViewById(R.id.tvStory);
            tvStory.setText(items.getStory());

            ImageView imgTimeLinePicture = (ImageView) itemView.findViewById(R.id.imgTimelinePic);
            imgTimeLinePicture.setImageResource(items.getTimeLinePic());

            TextView tvStoryLine=(TextView) itemView.findViewById(R.id.tvStoryLine);
            tvTime.setText(items.getStoryLine());

            TextView tvSite=(TextView) itemView.findViewById(R.id.tvSite);
            tvSite.setText(items.getSite());

            TextView tvLikes=(TextView) itemView.findViewById(R.id.tvLikes);
            tvLikes.setText(items.getLikes());

            TextView tvLikes2=(TextView) itemView.findViewById(R.id.tvLikes2);
            tvLikes2.setText(items.getLikes2());

            TextView tvComments=(TextView) itemView.findViewById(R.id.tvComments);
            tvComments.setText(items.getComments());*/

            return itemView;
        }
    }
  /*  public void populateItemsList2(){
        String role="Marketing Specialist";
        String relatedRole="30 Psychologists alumni have this role";
        String center="Event Center";
        String camera="Camera";
        String share="Share";
    }
    private class MyListAdapterItems2 extends ArrayAdapter<Items> {
        int resource;
        ArrayList<Items> profiles = new ArrayList<Items>();
        public MyListAdapterItems2(Context context, int resource, List<Items> objects) {
            super(context, resource, objects);
            this.resource = resource;
            itemsList = (ArrayList<Items>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }

            Items items = itemsList.get(position);

            return itemView;
        }
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }
}
