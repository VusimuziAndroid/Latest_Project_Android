package android.latest_project_android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.content.Intent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    TabHost tabhost;
    TabHost tabhost2;
    Items item;
    Icons icons;
    ArrayAdapter<Items>itemAdapter;
    private List<Items> itemsList = new ArrayList<Items>();
    ListView lsItems;
    ListView lsProfile;
    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    ArrayAdapter<ViewProfile> profileAdapter;
    ArrayAdapter<TimeLineInvitations> invitationsAdapter;
    ArrayAdapter<ViewedProfile> viewedProfilesAdapter;
    ArrayAdapter<SharedProfile> sharedProfilesAdapter;
    ArrayAdapter<Followers> followersAdapter;
    ArrayAdapter<Icons>iconAdapter;
    ArrayAdapter<NotificationsClass>notificationsAdapter;
    private List<ViewProfile> profileList = new ArrayList<ViewProfile>();
    private List<TimeLineInvitations> invitationsList = new ArrayList<TimeLineInvitations>();
    private List<Icons> iconList = new ArrayList<Icons>();
    private List<ViewedProfile> viewProfileList = new ArrayList<ViewedProfile>();
    private List<SharedProfile> sharedProfileList = new ArrayList<SharedProfile>();
    private List<Followers> followersList = new ArrayList<Followers>();
    private List<NotificationsClass> notificationsList = new ArrayList<NotificationsClass>();

    ListView lsTimeLineInvitations;
    ListView lsViewedProfile;
    ListView lsSharedProfile;
    ListView lsFollowers;
    ListView lsIcons;
    ListView lsNotifications;

    ArrayAdapter<Items>itemAdapter2;
    ImageView imgRoundPic2;
    private List<Items> itemsList2 = new ArrayList<Items>();
    ListView lsItems2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // getSupportActionBar().setDisplayShowCustomEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getInvitationsList();
        invitationsAdapter = new MyListAdapterInvitations(getApplicationContext(),R.layout.list_requests,invitationsList);
        lsTimeLineInvitations = (ListView) findViewById(R.id.lsTimeLineInvitations);
        lsTimeLineInvitations.setAdapter(invitationsAdapter);

        getProfileDetails();
        profileAdapter = new MyListAdapterProfile(getApplicationContext(),R.layout.list_profile,profileList);
        lsProfile = (ListView) findViewById(R.id.lsProfile);
        lsProfile.setAdapter(profileAdapter);

        populateItemsList();
        itemAdapter = new MyListAdapterItems(getApplicationContext(),R.layout.list_timeline, itemsList);
        lsItems = (ListView) findViewById(R.id.lsTimeline);
        lsItems.setAdapter(itemAdapter);

        getNumberOfViewedProfile();
        viewedProfilesAdapter = new MyListAdapterViewedProfile(getApplicationContext(),R.layout.list_viewed_profile, viewProfileList);
        lsViewedProfile = (ListView) findViewById(R.id.lsViewedProfile);
        lsViewedProfile.setAdapter(viewedProfilesAdapter);

        getNumberOfSharedProfile();
        sharedProfilesAdapter = new MyListAdapterSharedProfile(getApplicationContext(),R.layout.list_shared_profile, sharedProfileList);
        lsSharedProfile = (ListView) findViewById(R.id.lsViewedShared);
        lsSharedProfile.setAdapter(sharedProfilesAdapter);

        getFollowersList();
        followersAdapter = new MyListAdapterFollowers(getApplicationContext(),R.layout.list_activity, followersList);
        lsFollowers = (ListView) findViewById(R.id.lsFollowers);
        lsFollowers.setAdapter(followersAdapter);

        getNotificationsList();
        notificationsAdapter = new MyListAdapterNotifications(getApplicationContext(),R.layout.list_activity, notificationsList);
        lsNotifications = (ListView) findViewById(R.id.lsNotifications);
        lsNotifications.setAdapter(notificationsAdapter);


        displayTab();
     //   displayTab2();
    }
    //The method for displaying the Tab Host on the Welcome Screen
    public void displayTab(){
        tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();
        TabHost.TabSpec  firstText = tabhost.newTabSpec("FIRSTTAB");
        firstText.setContent(R.id.FIRSTTAB);
        firstText.setIndicator("", getResources().getDrawable(R.drawable.ic_home_white_48dp));
        tabhost.addTab(firstText);
        TabHost.TabSpec secondText = tabhost.newTabSpec("SECONDTAB");
        secondText.setContent(R.id.SECONDTAB);
        secondText.setIndicator("", getResources().getDrawable(R.drawable.ic_group_white_48dp));
        tabhost.addTab(secondText);
        TabHost.TabSpec thirdText = tabhost.newTabSpec("THIRDTAB");
        thirdText.setContent(R.id.THIRDTAB);
        thirdText.setIndicator("",getResources().getDrawable(R.drawable.ic_question_answer_white_48dp));
        tabhost.addTab(thirdText);
        TabHost.TabSpec fourthText = tabhost.newTabSpec("FOURTHTAB");
        fourthText.setContent(R.id.FOURTHTAB);
        fourthText.setIndicator("",getResources().getDrawable(R.drawable.ic_notifications_white_48dp));
        tabhost.addTab(fourthText);
        TabHost.TabSpec fifthText = tabhost.newTabSpec("FIFTHTAB");
        fifthText.setContent(R.id.FIFTHTAB);
        fifthText.setIndicator("", getResources().getDrawable(R.drawable.ic_person_white_48dp));
        tabhost.addTab(fifthText);
    }
  /*  public void displayTab2(){
        tabhost2 = (TabHost) findViewById(R.id.tabHost2);
        tabhost2.setup();
        TabHost.TabSpec  firstTab = tabhost2.newTabSpec("CANCEL");
        firstTab.setContent(R.id.CANCEL);
        firstTab.setIndicator("", getDrawable(R.drawable.ic_clear_white_48dp));
        tabhost2.addTab(firstTab);
        TabHost.TabSpec secondTab = tabhost2.newTabSpec("INVITATIONS");
        secondTab.setContent(R.id.INVITATIONS);
        secondTab.setIndicator("INVITATIONS", getDrawable(R.drawable.ic_photo));
        tabhost2.addTab(secondTab);
        TabHost.TabSpec thirdTab = tabhost2.newTabSpec("CONNECTIONS");
        thirdTab.setContent(R.id.CONNECTIONS);
        thirdTab.setIndicator("CONNECTIONS", getDrawable(R.drawable.ic_photo));
        tabhost2.addTab(thirdTab);
    }*/
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

        itemsList.add(new Items(proPicture, name, role, time, storyLine, timelinePicture, story, sites, likes, likes2, comments, R.drawable.ic_like, R.drawable.ic_comments, R.drawable.ic_share2));
       /* itemsList.add(new Items(R.drawable.ic_timeline_pic4, "Jason Anderson", "Manager of Solar Slash", "20 mins", "think the biggest impact will be?", R.drawable.timeline_pic1, "SolarCity", "SolarCity.com", "news24.com", "55 likes", "200 comments", R.drawable.ic_like, R.drawable.ic_comments, R.drawable.ic_share2));
        itemsList.add(new Items(R.drawable.ic_timeline_pic3, "James Smith", role, time, storyLine, timelinePicture, story, sites, likes, likes2, comments, R.drawable.ic_like, R.drawable.ic_comments, R.drawable.ic_share2));*/
    }
    //The method for populating the list view
    public void getInvitationsList(){
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic1, "You and Karisa are now", "Connected", R.drawable.ic_question_answer_black_48dp, 0));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic2, "Patric Farewell", "Communications Professionals", R.drawable.ic_highlight_off_black_48dp, R.drawable.ic_person_add_black_48dp));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic3, "You and Tonniane Marie are now friends", "connected", 0, R.drawable.ic_question_answer_black_48dp));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic4, "Wiston", "Global Business director", R.drawable.ic_highlight_off_black_48dp, R.drawable.ic_person_add_black_48dp));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic5, "Paolo", "Marketing Manager - I07 Wearable Professional", R.drawable.ic_highlight_off_black_48dp, R.drawable.ic_person_add_black_48dp));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic6, "H. Jay", "Principal Communications Group", R.drawable.ic_highlight_off_black_48dp, R.drawable.ic_person_add_black_48dp));
    }
    //The class for the Array Adapter
    private class MyListAdapterInvitations extends ArrayAdapter<TimeLineInvitations> {
        int resource;
        ArrayList<TimeLineInvitations> invitations= new ArrayList<TimeLineInvitations>();
        public MyListAdapterInvitations(Context context, int resource, List<TimeLineInvitations> objects) {
            super(context, resource, objects);
            this.resource = resource;
            invitations = (ArrayList<TimeLineInvitations>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }
            TimeLineInvitations timeLineInvitations =invitations.get(position);
            //Setting values to the Controls on the inflater layout
            ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgPic1);
            imgProfilePicture.setImageResource(timeLineInvitations.getTimelinePicture());
            TextView tvName=(TextView) itemView.findViewById(R.id.tvTimeLineName);
            tvName.setText(timeLineInvitations.getName());

            TextView tvRole=(TextView) itemView.findViewById(R.id.tvTimeLineRole);
            tvRole.setText(timeLineInvitations.getTimeLineRole());

            ImageView imgIcon1 = (ImageView) itemView.findViewById(R.id.imgIcon1);
            imgIcon1.setImageResource(timeLineInvitations.getImageIcon1());

            ImageView imgIcon2 = (ImageView) itemView.findViewById(R.id.imgIcon2);
            imgIcon2.setImageResource(timeLineInvitations.getImageIcon2());

            return itemView;
        }
    }
    //The method for populating the list view
    public void getProfileDetails(){
        profileList.add(new ViewProfile(R.drawable.ic_timeline_pic3," Julia "," Mathewson "," Business Analyst "," Barclays Africa Technology "," Johannesburg "," South Africa "));
    }
    //The class for the Array Adapter
    private class MyListAdapterProfile extends ArrayAdapter<ViewProfile> {
        int resource;
        ArrayList<ViewProfile> profiles= new ArrayList<ViewProfile>();
        public MyListAdapterProfile(Context context, int resource, List<ViewProfile> objects) {
            super(context, resource, objects);
            this.resource = resource;
            profiles = (ArrayList<ViewProfile>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }

            ViewProfile viewProfile =profileList.get(position);
            //Setting values to the Controls on the inflater layout
            ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgRoundPic1);
            imgProfilePicture.setImageResource(R.drawable.ic_linkedin_pro_pic1);

            TextView tvName=(TextView) itemView.findViewById(R.id.tvNames2);
            tvName.setText(viewProfile.getName());

            TextView tvSurname=(TextView) itemView.findViewById(R.id.tvSurnames2);
            tvSurname.setText(viewProfile.getSurname());

            TextView tvRole=(TextView) itemView.findViewById(R.id.tvRole2);
            tvRole.setText(viewProfile.getRole());

            TextView tvCompany=(TextView) itemView.findViewById(R.id.tvOrganization);
            tvCompany.setText(viewProfile.getCompanyName());

            TextView tvJobAreas2=(TextView) itemView.findViewById(R.id.tvJobAreas2);
            tvJobAreas2.setText(viewProfile.getJobArea());

            TextView tvCountry = (TextView) itemView.findViewById(R.id.tvCountry2);
            tvCountry.setText(viewProfile.getCountry());

            return itemView;
        }
    }
    //The method for populating the list view
    public void getNumberOfViewedProfile(){
        viewProfileList.add(new ViewedProfile("10"));
    }
    //The class for the Array Adapter
    private class MyListAdapterViewedProfile extends ArrayAdapter<ViewedProfile> {
        int resource;
        ArrayList<ViewedProfile> viewedProfile= new ArrayList<ViewedProfile>();
        public MyListAdapterViewedProfile(Context context, int resource, List<ViewedProfile> objects) {
            super(context, resource, objects);
            this.resource = resource;
            viewedProfile = (ArrayList<ViewedProfile>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }
            ViewedProfile vprofile =viewedProfile.get(position);
            TextView tvViewProfile=(TextView) itemView.findViewById(R.id.tvNumViewedProfile);
            tvViewProfile.setText(vprofile.getNumOfViewedProfiles());
            return itemView;
        }
    }
    //The method for populating the list view
    public void getNumberOfSharedProfile(){
        sharedProfileList.add(new SharedProfile("3"));
    }
    //The class for the Array Adapter
    private class MyListAdapterSharedProfile extends ArrayAdapter<SharedProfile> {
        int resource;
        ArrayList<SharedProfile> sharedProfile= new ArrayList<SharedProfile>();
        public MyListAdapterSharedProfile(Context context, int resource, List<SharedProfile> objects) {
            super(context, resource, objects);
            this.resource = resource;
            sharedProfile = (ArrayList<SharedProfile>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }
            SharedProfile sprofile =sharedProfile.get(position);
            TextView tvSharedProfile=(TextView) itemView.findViewById(R.id.tvNumSharedProfile);
            tvSharedProfile.setText(sprofile.getNumOfSharedProfile());

            return itemView;
        }
    }

    public void getFollowersList(){
        followersList.add(new Followers("Your Activity","13 followers",R.drawable.accenture_logo3,"Accenture","Vusi Ngwenya liked this"));
    }

    private class MyListAdapterFollowers extends ArrayAdapter<Followers> {
        int resource;
        ArrayList<Followers> followers= new ArrayList<Followers>();
        public MyListAdapterFollowers(Context context, int resource, List<Followers> objects) {
            super(context, resource, objects);
            this.resource = resource;
            followers = (ArrayList<Followers>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }
            Followers clFollowers =followers.get(position);

            TextView tvYourActivity=(TextView) itemView.findViewById(R.id.tvYourActivity);
            tvYourActivity.setText(clFollowers.getFFunction());

            TextView tvNumOfFollowers=(TextView) itemView.findViewById(R.id.tvNumOfFollowers);
            tvNumOfFollowers.setText(clFollowers.getNumberOfFollowers());

            ImageView imgLogo = (ImageView) itemView.findViewById(R.id.imgLogo);
            imgLogo.setImageResource(clFollowers.getLogo());

            TextView tvLogoTitle=(TextView) itemView.findViewById(R.id.tvLogoTitle);
            tvLogoTitle.setText(clFollowers.getLogoTitle());

            TextView tvPeopleLikes=(TextView) itemView.findViewById(R.id.tvPeopleLikes);
            tvPeopleLikes.setText(clFollowers.getPeopleLikes());

            return itemView;
        }
    }
    public void getNotificationsList(){
        followersList.add(new Followers("Your Activity","13 followers",R.drawable.accenture_logo3,"Accenture","Vusi Ngwenya liked this"));
    }

    private class MyListAdapterNotifications extends ArrayAdapter<NotificationsClass> {
        int resource;
        ArrayList<NotificationsClass> notifications = new ArrayList<NotificationsClass>();

        public MyListAdapterNotifications(Context context, int resource, List<NotificationsClass> objects) {
            super(context, resource, objects);
            this.resource = resource;
            notifications = (ArrayList<NotificationsClass>) objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;

            if (itemView == null) {
                itemView = getLayoutInflater().inflate(resource, parent, false);
            }
            NotificationsClass clNotifications = notifications.get(position);

            ImageView imgProPicture = (ImageView) itemView.findViewById(R.id.imgLogo);
            imgProPicture.setImageResource(clNotifications.getProfilePicture());

            TextView tvLine1 = (TextView) itemView.findViewById(R.id.tvLine1);
            tvLine1.setText(clNotifications.getTextLine1());

            TextView tvLine2 = (TextView) itemView.findViewById(R.id.tvLine2);
            tvLine2.setText(clNotifications.getTextLine2());

            TextView tvTime = (TextView) itemView.findViewById(R.id.tvTime);
            tvTime.setText(clNotifications.getTime());

            TextView tvViews = (TextView) itemView.findViewById(R.id.tvView);
            tvViews.setText(clNotifications.getView());

            return itemView;
        }
    }
    public static int calculateInSampleSize(
            BitmapFactory.Options options,int reqWidth,int reqHeight){
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize=1;

        if(height > reqHeight || width > reqWidth){
            final int halfHeight= height / 2;
            final int halfWidth = width / 2;
            while((halfWidth / inSampleSize) > reqHeight
                    && (halfWidth / inSampleSize > reqWidth)){
                inSampleSize *=2;
            }
        }
        return inSampleSize;
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

            return itemView;
        }

    }

    public void onClickAddPhoto(View view){
        Intent photoIntent = new Intent(HomeActivity.this,AddPhotoActivity.class);
        startActivity(photoIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the HomeActivity/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }
}
