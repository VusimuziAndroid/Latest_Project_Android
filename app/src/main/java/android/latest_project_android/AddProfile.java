package android.latest_project_android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

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
    // EditText et

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

    public void onClick(View view) {
        int id = view.getId();

        AlertDialog.Builder builder7 = new AlertDialog.Builder(AddProfile.this, R.style.AlertDialogStyle);
        builder7.setCancelable(false);
        final View inflater = getLayoutInflater().inflate(R.layout.list_add_work_experience, null);
        builder7.setView(inflater)
                .setPositiveButton("ADD", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                // EditText etStoryLine = (EditText) inflater.findViewById(R.id.etStoryLine);
                                String messageType = "Text";
                                int pic = R.drawable.editor_pic1;
                                // String storyLine = etStoryLine.getText().toString();
                              /*  pref = getSharedPreferences("UsersPref", MODE_PRIVATE);
                                editor = pref.edit();
                                String name = pref.getString("Name", null);
                                String surname = pref.getString("Surname", null);
                                String username = pref.getString("Username", null);
                                String password = pref.getString("Password", null);
                                String confirmpassword = pref.getString("ConfirmPassword", null);
                                Toast.makeText(Profile.this, "Story Shared", Toast.LENGTH_SHORT).show();
                                Context context = null;
                                db = openOrCreateDatabase("UsersDB5.db", MODE_PRIVATE, null);
                                Cursor cursor = db.rawQuery("SELECT Username,Name,Surname,Password,ConfirmPassword FROM Users", null);
                                message = new Message(username, storyLine, messageType, pic);
                                datasource.insertMessage(message);
                                pref = getSharedPreferences("UsersPref", Home.MODE_PRIVATE);
                                editor = pref.edit();
                                Toast.makeText(Profile.this, "Name " + message.username + "Surname " + message.getMessage() + "Username " + message.getMessageType() + "Password " + message.getPicture(), Toast.LENGTH_SHORT).show();
                                pref2 = getSharedPreferences("StoryLinesPref", Home.MODE_PRIVATE);
                                editor2 = pref2.edit();
                                String messageType2 = "TEXT";
                                Toast.makeText(Profile.this, "Name " + username + "Message"+ etStoryLine.getText().toString()+"MessageType"+messageType2,Toast.LENGTH_SHORT).show();
                                editor2.putString("Username",username);
                                editor2.putString("Message", etStoryLine.getText().toString());
                                editor2.putString("MessageType", messageType2);
                                editor2.commit();*/
                              /*  Intent messages = new Intent(Profile.this,ViewMessages.class);
                                startActivity(messages);*/
                            }
                        }
                )
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                              /*  Toast.makeText(getApplicationContext(), "Share story", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent();
                                intent.setType("image/*");
                                intent.setAction(Intent.ACTION_GET_CONTENT);
                                startActivityForResult(Intent.createChooser(intent,
                                        "Selected file to upload"), RESULT_LOAD_IMAGE);*/
                            }
                        }
                );
        builder7.create();
        builder7.show();
    }

    public void onClickEducation(View view) {
        AlertDialog.Builder builder8 = new AlertDialog.Builder(AddProfile.this, R.style.AlertDialogStyle);
        builder8.setCancelable(false);
        final View inflater = getLayoutInflater().inflate(R.layout.list_add_work_experience, null);
        builder8.setView(inflater)
                .setPositiveButton("TEXT", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                // EditText etStoryLine = (EditText) inflater.findViewById(R.id.etStoryLine);
                                String messageType = "Text";
                                int pic = R.drawable.editor_pic1;
                                // String storyLine = etStoryLine.getText().toString();
                              /*  pref = getSharedPreferences("UsersPref", MODE_PRIVATE);
                                editor = pref.edit();
                                String name = pref.getString("Name", null);
                                String surname = pref.getString("Surname", null);
                                String username = pref.getString("Username", null);
                                String password = pref.getString("Password", null);
                                String confirmpassword = pref.getString("ConfirmPassword", null);
                                Toast.makeText(Profile.this, "Story Shared", Toast.LENGTH_SHORT).show();
                                Context context = null;
                                db = openOrCreateDatabase("UsersDB5.db", MODE_PRIVATE, null);
                                Cursor cursor = db.rawQuery("SELECT Username,Name,Surname,Password,ConfirmPassword FROM Users", null);
                                message = new Message(username, storyLine, messageType, pic);
                                datasource.insertMessage(message);
                                pref = getSharedPreferences("UsersPref", Home.MODE_PRIVATE);
                                editor = pref.edit();
                                Toast.makeText(Profile.this, "Name " + message.username + "Surname " + message.getMessage() + "Username " + message.getMessageType() + "Password " + message.getPicture(), Toast.LENGTH_SHORT).show();
                                pref2 = getSharedPreferences("StoryLinesPref", Home.MODE_PRIVATE);
                                editor2 = pref2.edit();
                                String messageType2 = "TEXT";
                                Toast.makeText(Profile.this, "Name " + username + "Message"+ etStoryLine.getText().toString()+"MessageType"+messageType2,Toast.LENGTH_SHORT).show();
                                editor2.putString("Username",username);
                                editor2.putString("Message", etStoryLine.getText().toString());
                                editor2.putString("MessageType", messageType2);
                                editor2.commit();*/
                              /*  Intent messages = new Intent(Profile.this,ViewMessages.class);
                                startActivity(messages);*/
                            }
                        }
                )
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                              /*  Toast.makeText(getApplicationContext(), "Share story", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent();
                                intent.setType("image/*");
                                intent.setAction(Intent.ACTION_GET_CONTENT);
                                startActivityForResult(Intent.createChooser(intent,
                                        "Selected file to upload"), RESULT_LOAD_IMAGE);*/
                            }
                        }
                );
        builder8.create();
        builder8.show();
    }

    public void onClickVolunteerExperience(View view) {
        AlertDialog.Builder builder9 = new AlertDialog.Builder(AddProfile.this, R.style.AlertDialogStyle);
        builder9.setCancelable(false);
        final View inflater = getLayoutInflater().inflate(R.layout.list_add_work_experience, null);
        builder9.setView(inflater)
                .setPositiveButton("TEXT", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                // EditText etStoryLine = (EditText) inflater.findViewById(R.id.etStoryLine);
                                String messageType = "Text";
                                int pic = R.drawable.editor_pic1;
                                // String storyLine = etStoryLine.getText().toString();
                              /*  pref = getSharedPreferences("UsersPref", MODE_PRIVATE);
                                editor = pref.edit();
                                String name = pref.getString("Name", null);
                                String surname = pref.getString("Surname", null);
                                String username = pref.getString("Username", null);
                                String password = pref.getString("Password", null);
                                String confirmpassword = pref.getString("ConfirmPassword", null);
                                Toast.makeText(Profile.this, "Story Shared", Toast.LENGTH_SHORT).show();
                                Context context = null;
                                db = openOrCreateDatabase("UsersDB5.db", MODE_PRIVATE, null);
                                Cursor cursor = db.rawQuery("SELECT Username,Name,Surname,Password,ConfirmPassword FROM Users", null);
                                message = new Message(username, storyLine, messageType, pic);
                                datasource.insertMessage(message);
                                pref = getSharedPreferences("UsersPref", Home.MODE_PRIVATE);
                                editor = pref.edit();
                                Toast.makeText(Profile.this, "Name " + message.username + "Surname " + message.getMessage() + "Username " + message.getMessageType() + "Password " + message.getPicture(), Toast.LENGTH_SHORT).show();
                                pref2 = getSharedPreferences("StoryLinesPref", Home.MODE_PRIVATE);
                                editor2 = pref2.edit();
                                String messageType2 = "TEXT";
                                Toast.makeText(Profile.this, "Name " + username + "Message"+ etStoryLine.getText().toString()+"MessageType"+messageType2,Toast.LENGTH_SHORT).show();
                                editor2.putString("Username",username);
                                editor2.putString("Message", etStoryLine.getText().toString());
                                editor2.putString("MessageType", messageType2);
                                editor2.commit();*/
                              /*  Intent messages = new Intent(Profile.this,ViewMessages.class);
                                startActivity(messages);*/
                            }
                        }
                )
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                              /*  Toast.makeText(getApplicationContext(), "Share story", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent();
                                intent.setType("image/*");
                                intent.setAction(Intent.ACTION_GET_CONTENT);
                                startActivityForResult(Intent.createChooser(intent,
                                        "Selected file to upload"), RESULT_LOAD_IMAGE);*/
                            }
                        }
                );
        builder9.create();
        builder9.show();
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

            TextView tvIntro = (TextView) itemView.findViewById(R.id.tvExperience);
            tvIntro.setText(mynewProfile.getText());

            TextView tvRole = (TextView) itemView.findViewById(R.id.tvRole);
            tvRole.setText(mynewProfile.getText2());

            ImageView imgIcon2 = (ImageView) itemView.findViewById(R.id.imgbtn1);
            imgIcon2.setImageResource(mynewProfile.getIcon1());

            return itemView;
        }
    }

}
