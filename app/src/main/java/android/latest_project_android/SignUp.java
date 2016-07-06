package android.latest_project_android;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.content.Intent;

import java.util.ArrayList;
import java.util.List;

public class SignUp extends AppCompatActivity {
    ListView list;
    ArrayAdapter<Profile> adapter;
    private ArrayList<Profile> profile = new ArrayList<Profile>();
    private static final int PROGRESS = 0x1;
    private ProgressBar mProgress;
    private Handler mHandler = new Handler();
    private int mProgressStatus;
    Button BJoin;
    int fileSize=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
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
        populateProfileList();
        adapter = new MyListAdapter(getApplicationContext(),R.layout.list_single, profile);
        list = (ListView) findViewById(R.id.lsProfile);
        list.setAdapter(adapter);

        showProgressBar();
    }
    //The method for populating the list view
    public void populateProfileList(){
        String role="Marketing Specialist";
        String relatedRole="30 Psychologists alumni have this role";
        String center="Event Center";
        profile.add(new Profile(role,relatedRole,R.drawable.ic_linkedin_pro_picture2,R.drawable.ic_stars_white_48dp));
    }
    //The class for the Array Adapter
    private class MyListAdapter extends ArrayAdapter<Profile> {
        int resource;
        ArrayList<Profile> profiles = new ArrayList<Profile>();
        public MyListAdapter(Context context, int resource, List<Profile> objects) {
            super(context, resource, objects);
            this.resource = resource;
            profiles = (ArrayList<Profile>)objects;
        }
        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(resource,parent,false);
            }

            Profile myprofile = profiles.get(position);
            TextView tvRole=(TextView) itemView.findViewById(R.id.tvPosition);
            tvRole.setText(myprofile.getRole());

            TextView tvRelatedRoles = (TextView) itemView.findViewById(R.id.tvRelatedRoles);
            tvRelatedRoles.setText(myprofile.getRelatedRole());
           /* TextView tvCenter = (TextView) itemView.findViewById(R.id.tvCenter);
            tvCenter.setText(myprofile.getCenter());*/
            ImageView imageView = (ImageView) itemView.findViewById(R.id.imgProfilePicture);
            imageView.setImageResource(myprofile.getPicture());

            ImageView imageView2 = (ImageView) itemView.findViewById(R.id.imgIcon3);
            imageView2.setImageResource(myprofile.getImgIcon());
            return itemView;
        }
    }
    public void showProgressBar(){
        mProgress = (ProgressBar) findViewById(R.id.prgssBar);
        new Thread(new Runnable(){
            public void run(){
                while(mProgressStatus < 100){
                    mProgressStatus = doWork();
                    try{
                        Thread.sleep(200);
                     //   Toast.makeText(SignUp.this,"Welcome to linked In",Toast.LENGTH_SHORT).show();
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                   mHandler.post(new Runnable(){
                       public void run(){
                           mProgress.setProgress(mProgressStatus);
                       }
                   }) ;
                }
            }
        }).start();
    }

    public int doWork(){
        while(fileSize <=1000000){
            fileSize++;

            if(fileSize == 100000){
                return 10;
            }
            else if(fileSize == 200000){
                return 20;
            }
            else if(fileSize==300000){
                return 30;
            }
        }
        return 100;
    }

    public void onClick(View view){
        Intent timeline = new Intent(SignUp.this,Register.class);
        startActivity(timeline);
    }

}
