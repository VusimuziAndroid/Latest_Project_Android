package android.latest_project_android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class WelcomeScreen extends AppCompatActivity {
    TextView tvWelcome2;
    SharedPreferences pref;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
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

        pref = getSharedPreferences("UsersPref", MODE_PRIVATE);
        editor = pref.edit();
        String username = pref.getString("Username", null);
        String name = pref.getString("Name", null);
        String surname = pref.getString("Surname", null);
        String password = pref.getString("Password", null);

        tvWelcome2 = (TextView) findViewById(R.id.tvWelcome2);
        tvWelcome2.setText(name+" "+surname);
        welcomeScreen();
    }
    public void welcomeScreen(){
        Thread myThread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    //       imgIcon1.startAnimation(animateRotate);
                   // tvWelcome2.setText();
                    Intent startMainScreen = new Intent(WelcomeScreen.this,HomeActivity.class);
                    startActivity(startMainScreen);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }
}
