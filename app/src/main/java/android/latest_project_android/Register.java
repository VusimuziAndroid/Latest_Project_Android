package android.latest_project_android;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class Register extends AppCompatActivity {
    EditText etEmailAddress;
    EditText etPassword;
    EditText etFirstName;
    EditText etLastName;
    Database database;
    User user;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // viewPager = (ViewPager) findViewById(R.id.)
        //  TabLayout tabLayout = (TabLayout) findViewById(R.id);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        database = new Database(this);
    }
    public void onClick(View view){
        Intent welcomeScreen = new Intent(Register.this,WelcomeScreen.class);
        startActivity(welcomeScreen);
        etEmailAddress = (EditText) findViewById(R.id.etEmailAddress);
        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        etPassword = (EditText) findViewById(R.id.etPassword);
     /*   String email = etEmailAddress.getText().toString();
        String name = etFirstName.getText().toString();
        String surname = etLastName.getText().toString();
        String password = etPassword.getText().toString();*/

        Toast.makeText(Register.this, "Successful" + etEmailAddress.getText(), Toast.LENGTH_SHORT).show();
       // user = new User(email, name, surname, password);
        // Toast.makeText(Register.this," name="+user.getUsername()+" last name="+user.getName()+" email="+user.getSurname()+" password="+user.getPassword(),Toast.LENGTH_SHORT).show();
        // user = new User(etFirstName.getText().toString(),etLastName.getText().toString(),etEmailAddress.getText().toString(),etPassword.getText().toString());
       // database.insertUsers(user);
       /* String email = etEmailAddress.getText().toString();
        String name = etFirstName.getText().toString();
        String password = etPassword.getText().toString();
        String surname = etLastName.getText().toString();
        if(email.equals("")){
            etEmailAddress.setError("Supply your username");
        }
        else if(name.equals("")){
            etFirstName.setError("Supply your first name");
        }
        else if(surname.equals("")){
            etLastName.setError("Supply your last name");
        }
        else if(password.equals("")){
            etPassword.setError("Supply your password");
        }*/
        //Register();
    }

    public void Register(){
        Toast.makeText(Register.this, "Sucessful", Toast.LENGTH_SHORT).show();
        if (etEmailAddress.getText().toString().equals("")) {
            etEmailAddress.setError("Supply your username");
        }
      /*  else if (etFirstName.getText().toString().equals("")) {
            etFirstName.setError("Supply your First Name");
        }
        else if (etLastName.getText().toString().equals("")) {
            etLastName.setError("Supply your Last Name");
        }
        else if (etPassword.getText().toString().equals("")) {
            etPassword.setError("Supply your password");
        }
        else{
            String name=etFirstName.getText().toString();
            String surname=etLastName.getText().toString();
            String email=etEmailAddress.getText().toString();
            String password=etPassword.getText().toString();
            Toast.makeText(Register.this,"name="+name+" surname="+surname+" email="+email+" password="+password,Toast.LENGTH_SHORT).show();*/
          /*  user = new User(name,surname,email,password);
            database.insertUsers(user);*/
           /* Intent addProfile = new Intent(Register.this,AddProfile.class);
            startActivity(addProfile);*/
        // }
    }
}


