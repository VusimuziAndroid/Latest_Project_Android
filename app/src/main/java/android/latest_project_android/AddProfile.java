package android.latest_project_android;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AddProfile extends AppCompatActivity {
    TabHost tabhost;
    Items item;
    Icons icons;
    ArrayAdapter<NewProfile> addProfileAdapter;
    ArrayAdapter<Icons>iconAdapter;
    // private ArrayList<Items> itemsArrayList = new ArrayList<Items>();
    private List<NewProfile> profileAddList = new ArrayList<NewProfile>();
   // private List<Icons> iconList = new ArrayList<Icons>();

    ListView lsAddProfileLists;
    ListView lsIcons;
    ArrayAdapter<Items>itemAdapter2;

    // private ArrayList<Items> itemsArrayList2 = new ArrayList<Items>();
    private List<Items> itemsList2 = new ArrayList<Items>();
    private ImageView imageViewCircle;
    ListView lsItems2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();
        TabHost.TabSpec  firstText = tabhost.newTabSpec("CANCEL");
        firstText.setContent(R.id.CANCEL);
        firstText.setIndicator("", getDrawable(R.drawable.ic_clear_white_48dp));
        tabhost.addTab(firstText);
        TabHost.TabSpec secondText = tabhost.newTabSpec("INVITATIONS");
        secondText.setContent(R.id.INVITATIONS);
        secondText.setIndicator("ADD YOUR PROFILE");
        tabhost.addTab(secondText);
        getNewProfileList();
       /* addProfileAdapter = new MyListAdapterAddProfile(getApplicationContext(),R.layout.list_add_profile,profileAddList);
        lsAddProfileLists = (ListView) findViewById(R.id.lsInvitations);
        lsAddProfileLists.setAdapter(addProfileAdapter);*/
        for(int i=0;i<tabhost.getTabWidget().getChildCount();i++){
            TextView tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

    //The method for populating the list view
    public void getNewProfileList(){
        // itemsList.add(new TimeLineInvitations(proPicture, name, role, time, storyLine, timelinePicture, story, sites, likes, likes2, comments, R.drawable.ic_like, R.drawable.ic_comments, R.drawable.ic_share2, proPic, fullName, allComments));
        //.add(new Items(R.drawable.ic_linked_camera_black_48dp,camera));
        //profile.add(new Profile(role,relatedRole,R.drawable.pro_pic1));
        //  Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.ic_linkedin_pro_pic1);
        profileAddList.add(new NewProfile(R.drawable.ic_linkedin_pro_pic1,"Work Experience","9 positions in your profile",R.drawable.navigation_collapse));
        /*invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic2,"Patric Farewell","Communications Professionals",R.drawable.navigation_cancel,R.drawable.navigation_accept));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic3,"You and Tonniane Marie are now friends","connected",0,R.drawable.ic_question_answer_black_48dp));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic4,"Wiston","Global Business director",R.drawable.navigation_cancel,R.drawable.navigation_accept));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic5,"Paolo","Marketing Manager - I07 Wearable Professional",R.drawable.navigation_cancel,R.drawable.navigation_accept));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic6,"H. Jay","Principal Communications Group",R.drawable.navigation_cancel,R.drawable.navigation_accept));*/
    }
    //The class for the Array Adapter
    private class MyListAdapterAddProfile extends ArrayAdapter<NewProfile> {
        int resource;
        ArrayList<NewProfile> newProfile = new ArrayList<NewProfile>();

        public MyListAdapterAddProfile(Context context, int resource, List<NewProfile> objects) {
            super(context, resource, objects);
            this.resource = resource;
            newProfile = (ArrayList<NewProfile>) objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;

            if (itemView == null) {
                itemView = getLayoutInflater().inflate(resource, parent, false);
            }

            NewProfile mynewProfile = newProfile.get(position);

            //Setting values to the Controls on the inflater layout
            ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgProPic);
            imgProfilePicture.setImageResource(mynewProfile.getImgProPicture());
            /*Bitmap icon = BitmapFactory.decodeResource(getResources(), R.drawable.ic_linkedin_pro_pic1);
            Bitmap circleBitmap = Bitmap.createBitmap(icon.getWidth(),icon.getHeight(),Bitmap.Config.ARGB_8888);

            imageViewCircle = (ImageView) itemView.findViewById(R.id.imgPic1);
            imageViewCircle.setImageBitmap(icon);*/
            /*Paint paint = new Paint();
            Canvas canvas = new Canvas(circleBitmap);
            canvas.drawCircle(circleBitmap.getWidth() / 2, circleBitmap.getHeight() / 2, circleBitmap.getWidth(), paint);
            BitmapShader shader = new BitmapShader(circleBitmap, Shader.TileMode.CLAMP,Shader.TileMode.CLAMP);
            paint.setAntiAlias(true);
            paint.setShader(shader);
            canvas.drawCircle(circleBitmap.getWidth()/2,circleBitmap.getHeight()/2,circleBitmap.getWidth()/2,paint);*/
            //imageViewCircle.setImageResource(R.id.imgPic1);
            TextView tvIntro = (TextView) itemView.findViewById(R.id.tvExperience);
            tvIntro.setText(mynewProfile.getText());

            TextView tvRole = (TextView) itemView.findViewById(R.id.tvRole);
            tvRole.setText(mynewProfile.getText2());

            ImageView imgIcon2 = (ImageView) itemView.findViewById(R.id.imgbtn1);
            imgIcon2.setImageResource(mynewProfile.getIcon1());

           /* ImageView imgIcon2 = (ImageView) itemView.findViewById(R.id.imgIcon4);
            imgIcon2.setImageResource(mynewProfile.getIcon1());*/

            return itemView;
        }
    }

}
