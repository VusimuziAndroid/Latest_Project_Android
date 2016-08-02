package android.latest_project_android;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class SignInActivity extends AppCompatActivity {
    EditText etUsername1;
    EditText etPassword1;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
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
        etUsername1 = (EditText) findViewById(R.id.etUsername);
        etPassword1 = (EditText) findViewById(R.id.etPassword);
    }
    public void onClick(View view){
        if(etUsername1.getText().toString().equals("")){
            etUsername1.setError("Please supply the username");
        }
         else if(etPassword1.getText().toString().equals("")){
            etPassword1.setError("Please supply the password");
        }
        else {
            Intent welcomeScreen = new Intent(SignInActivity.this,WelcomeScreen.class);
            startActivity(welcomeScreen);
        }
    }
}
