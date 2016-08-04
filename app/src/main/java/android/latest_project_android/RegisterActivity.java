package android.latest_project_android;

import android.net.Uri;
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

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class RegisterActivity extends AppCompatActivity {
    EditText etEmailAddress;
    EditText etPassword;
    EditText etFirstName;
    EditText etLastName;
    Database database;
    public static final int CONNECTION_TIMEOUT = 10000;
    public static final int READ_TIMEOUT=15000;
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

        database = new Database(this);
    }
    public void onClick(View view){
        etEmailAddress = (EditText) findViewById(R.id.etEmail);
        etFirstName = (EditText) findViewById(R.id.etName);
        etLastName = (EditText) findViewById(R.id.etSurname);
        etPassword = (EditText) findViewById(R.id.etPasswords);

        if(etFirstName.getText().toString().equals("")){
            etFirstName.setError("Supply your first name");
        }
        else if(etLastName.getText().toString().equals("")){
            etLastName.setError("Supply your last name");
        }
       else if(etEmailAddress.getText().toString().equals("")){
            etEmailAddress.setError("Supply your email address");
        }
        else if(etPassword.getText().toString().equals("")){
            etPassword.setError("Supply your password");
        }
        else{

          /*  URLConnection urlConnection;
            URL url=null;
            try{
                url = new URL("http://localhost/ARK2/PHPFiles/sendEmail.php");
                String searchQuery=null;
                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setReadTimeout(READ_TIMEOUT);
                urlConnection.setConnectTimeout(CONNECTION_TIMEOUT);
                urlConnection.setDoInput(true);
                urlConnection.setDoOutput(true);
                Uri.Builder builder = new Uri.Builder().appendQueryParameter("searchParameter",searchQuery);
                String query = builder.build().getEncodedQuery();
                OutputStream os = urlConnection.getOutputStream();
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os,"UTF-8"));
                writer.write(query);
                writer.flush();
                os.close();
                urlConnection.connect();
                Toast.makeText(RegisterActivity.this,"Connected to the server",Toast.LENGTH_SHORT).show();
            }
            catch(IOException io){
                io.printStackTrace();
                Toast.makeText(RegisterActivity.this,"Not connected to the server",Toast.LENGTH_SHORT).show();
            }*/

            user = new User(etFirstName.getText().toString(),etLastName.getText().toString(),etEmailAddress.getText().toString(),etPassword.getText().toString());
            database.insertUsers(user);
            Intent workExperience = new Intent(RegisterActivity.this, LocationActivity.class);
            startActivity(workExperience);
            Toast.makeText(RegisterActivity.this,"Successfully registered!!!",Toast.LENGTH_LONG).show();
        }
        //RegisterActivity();
    }
    public void onClickSignIn(View view){
        Intent signInIntent = new Intent(RegisterActivity.this,SignInActivity.class);
        startActivity(signInIntent);
    }
    public void Register(){
        Toast.makeText(RegisterActivity.this, "Successful", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(RegisterActivity.this,"name="+name+" surname="+surname+" email="+email+" password="+password,Toast.LENGTH_SHORT).show();*/
          /*  user = new User(name,surname,email,password);
            database.insertUsers(user);*/
           /* Intent addProfile = new Intent(RegisterActivity.this,AddProfile.class);
            startActivity(addProfile);*/
        // }
    }
}


