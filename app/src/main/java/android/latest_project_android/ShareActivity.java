package android.latest_project_android;

import android.content.Context;
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

public class ShareActivity extends AppCompatActivity {
    ArrayAdapter<MessageList> msgListAdapter;
    private List<MessageList> messageList = new ArrayList<MessageList>();
    TabHost tabhostShare;
    ListView lsMessages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* getMessageList();
        msgListAdapter = new MyListAdapterMessages(getApplicationContext(),R.layout.list_prev_shared, messageList);
        lsMessages = (ListView) findViewById(R.id.lsSharedMessages);
        lsMessages.setAdapter(msgListAdapter);*/
        //displayTab2();
    }
   /* public void displayTab2(){
        tabhostShare = (TabHost) findViewById(R.id.tabHostShare);
        tabhostShare.setup();
        TabHost.TabSpec  firstTab = tabhostShare.newTabSpec("CANCEL");
        firstTab.setContent(R.id.CANCEL);
        firstTab.setIndicator("", getDrawable(R.drawable.ic_clear_white_48dp));
        tabhostShare.addTab(firstTab);
        TabHost.TabSpec secondTab = tabhostShare.newTabSpec("SHARE");
        secondTab.setContent(R.id.SHARE);
        secondTab.setIndicator("SHARE", getDrawable(R.drawable.ic_photo));
        tabhostShare.addTab(secondTab);
        TabHost.TabSpec thirdTab = tabhostShare.newTabSpec("MESSAGE");
        thirdTab.setContent(R.id.MESSAGE);
        thirdTab.setIndicator("MESSAGE", getDrawable(R.drawable.ic_photo));
        tabhostShare.addTab(thirdTab);
    }*/
    //The method for populating the list view
    public void getMessageList(){
        messageList.add(new MessageList(R.drawable.ic_like,"Welcome to the new technology","Jack Nicholson on LinkedIn"));
    }
    //The class for the Array Adapter
    private class MyListAdapterMessages extends ArrayAdapter<MessageList> {
        int resource;
        ArrayList<MessageList> msg = new ArrayList<MessageList>();

        public MyListAdapterMessages(Context context, int resource, List<MessageList> objects) {
            super(context, resource, objects);
            this.resource = resource;
            msg = (ArrayList<MessageList>) objects;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemView = convertView;

            if (itemView == null) {
                itemView = getLayoutInflater().inflate(resource, parent, false);
            }

            MessageList msgLists = msg.get(position);

            //Setting values to the Controls on the inflater layout
            ImageView imgProfilePicture = (ImageView) itemView.findViewById(R.id.imgSharedPicture);
            imgProfilePicture.setImageResource(msgLists.getProfilePicture());
            /*imageViewCircle = (ImageView) itemView.findViewById(R.id.imgLike);
            imageViewCircle.setImageResource(icon.getPictureIcon1());*/
            TextView tvMessage = (TextView) itemView.findViewById(R.id.tvSharedMessage);
            tvMessage.setText(msgLists.getMessage());
            TextView tvTitle = (TextView) itemView.findViewById(R.id.tvSharedTitle);
            tvMessage.setText(msgLists.getTitle());

            return itemView;
        }
    }
}
