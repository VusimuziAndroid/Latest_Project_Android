package android.latest_project_android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FriendshipRequests extends AppCompatActivity {
    TabHost tabhost;
    Items item;
    Icons icons;
    ArrayAdapter<TimeLineInvitations> invitationsAdapter;
    ArrayAdapter<Icons>iconAdapter;
    // private ArrayList<Items> itemsArrayList = new ArrayList<Items>();
    private List<TimeLineInvitations> invitationsList = new ArrayList<TimeLineInvitations>();
    private List<Icons> iconList = new ArrayList<Icons>();

    ListView lsTimeLineInvitations;
    ListView lsIcons;
    ArrayAdapter<Items>itemAdapter2;

    // private ArrayList<Items> itemsArrayList2 = new ArrayList<Items>();
    private List<Items> itemsList2 = new ArrayList<Items>();
    private ImageView imageViewCircle;
    ListView lsItems2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friendship_requests);
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
       // Color color;


       //tab.setTextColor(Color.parseColor("#FFFFFF"));

        //tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.parseColor("#FFFFFF"));

        tabhost = (TabHost) findViewById(R.id.tabHost);
        tabhost.setup();
        TabHost.TabSpec  firstText = tabhost.newTabSpec("CANCEL");
        firstText.setContent(R.id.CANCEL);
        firstText.setIndicator("", getDrawable(R.drawable.ic_clear_white_48dp));
        tabhost.addTab(firstText);
        TabHost.TabSpec secondText = tabhost.newTabSpec("INVITATIONS");
        secondText.setContent(R.id.INVITATIONS);
        secondText.setIndicator("INVITATIONS", getDrawable(R.drawable.ic_photo));
        tabhost.addTab(secondText);
        TabHost.TabSpec thirdText = tabhost.newTabSpec("CONNECTIONS");
        thirdText.setContent(R.id.CONNECTIONS);
        thirdText.setIndicator("CONNECTIONS", getDrawable(R.drawable.ic_photo));
        tabhost.addTab(thirdText);

        /*for(int i=0;i<tabhost.getTabWidget().getChildCount();i++) {
            TextView tab = (TextView) tabhost.getChildAt(2).findViewById(android.R.id.title);
            tab.setTextColor(Color.parseColor("#FFFFFF"));
        }*/

        getInvitationsList();
        invitationsAdapter = new MyListAdapterInvitations(getApplicationContext(),R.layout.list_requests,invitationsList);
        lsTimeLineInvitations = (ListView) findViewById(R.id.lsTimeLineInvitations);
        lsTimeLineInvitations.setAdapter(invitationsAdapter);

        for(int i=0;i<tabhost.getTabWidget().getChildCount();i++){
            TextView tv = (TextView) tabhost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
            tv.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }
    //The method for populating the list view
    public void getInvitationsList(){
       // itemsList.add(new TimeLineInvitations(proPicture, name, role, time, storyLine, timelinePicture, story, sites, likes, likes2, comments, R.drawable.ic_like, R.drawable.ic_comments, R.drawable.ic_share2, proPic, fullName, allComments));
        //.add(new Items(R.drawable.ic_linked_camera_black_48dp,camera));
        //profile.add(new Profile(role,relatedRole,R.drawable.pro_pic1));
      //  Bitmap bm = BitmapFactory.decodeResource(getResources(),R.drawable.ic_linkedin_pro_pic1);
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic1,"You and Karisa are now","Connected",R.drawable.ic_question_answer_black_48dp,0));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic2,"Patric Farewell","Communications Professionals",R.drawable.navigation_cancel,R.drawable.navigation_accept));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic3,"You and Tonniane Marie are now friends","connected",0,R.drawable.ic_question_answer_black_48dp));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic4,"Wiston","Global Business director",R.drawable.navigation_cancel,R.drawable.navigation_accept));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic5,"Paolo","Marketing Manager - I07 Wearable Professional",R.drawable.navigation_cancel,R.drawable.navigation_accept));
        invitationsList.add(new TimeLineInvitations(R.drawable.ic_linkedin_pro_pic6,"H. Jay","Principal Communications Group",R.drawable.navigation_cancel,R.drawable.navigation_accept));
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
