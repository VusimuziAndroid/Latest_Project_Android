package android.latest_project_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Home extends AppCompatActivity {
    TabHost tabhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
        TabHost.TabSpec  firstText = tabhost.newTabSpec("HOME");
        firstText.setContent(R.id.HOME);
        firstText.setIndicator("",getDrawable(R.drawable.ic_home_white_48dp));
        tabhost.addTab(firstText);
        TabHost.TabSpec secondText = tabhost.newTabSpec("GROUPS");
        secondText.setContent(R.id.GROUPS);
        secondText.setIndicator("",getDrawable(R.drawable.ic_person_white_48dp));
        tabhost.addTab(secondText);
        TabHost.TabSpec thirdText = tabhost.newTabSpec("CHATS");
        thirdText.setContent(R.id.CHATS);
        thirdText.setIndicator("",getDrawable(R.drawable.ic_drafts_white_48dp));
        tabhost.addTab(thirdText);
        TabHost.TabSpec fourthText = tabhost.newTabSpec("NOTIFICATIONS");
        fourthText.setContent(R.id.NOTIFICATIONS);
        fourthText.setIndicator("",getDrawable(R.drawable.ic_notifications_white_48dp));
        tabhost.addTab(fourthText);
        TabHost.TabSpec fifthText = tabhost.newTabSpec("NOTIFICATIONS");
        fifthText.setContent(R.id.PROFILE);
        fifthText.setIndicator("",getDrawable(R.drawable.ic_person_white_48dp));
        tabhost.addTab(fifthText);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
