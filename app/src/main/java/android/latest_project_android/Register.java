package android.latest_project_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class Register extends AppCompatActivity {
    EditText etUsername;
    EditText etPassword;
    EditText etConfirmPassword;
    Database database;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       // TabLayout tabLayout = (TabLayout) findViewById(R.id.tabHost);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        database = new Database(this);
    }
    public void onClick(View view){
      Register();
    }

    public void Register(){

        if(etUsername.getText().toString().equals("")){
            etUsername.setError("Supply your username");
        }else if (etPassword.getText().toString().equals("")) {
            etUsername.setError("Supply your username");
        }
        else if(etConfirmPassword.getText().toString().equals("")){
            etConfirmPassword.setError("Please supply your confirm password");
        }
        else{

            String name=etUsername.getText().toString();
            String password=etPassword.getText().toString();
            String confirmPassword=etConfirmPassword.getText().toString();
            Toast.makeText(Register.this,"name="+name+" password="+password+" confirm password="+confirmPassword,Toast.LENGTH_SHORT).show();
            user = new User(name,password,confirmPassword);
            database.insertUsers(user);
            Intent addProfile = new Intent(Register.this,AddProfile.class);
            startActivity(addProfile);
        }
    }
}


