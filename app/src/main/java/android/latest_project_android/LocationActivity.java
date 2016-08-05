package android.latest_project_android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

public class LocationActivity extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner2;
    EditText etJobTitle;
    EditText etPostCode;
    ArrayAdapter adapter;
    ArrayAdapter adapter2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        List<String> list;
        etJobTitle = (EditText) findViewById(R.id.etJobTitle);
        etPostCode = (EditText) findViewById(R.id.etPostCode);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        adapter=ArrayAdapter.createFromResource(this,R.array.Countries,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        adapter2=ArrayAdapter.createFromResource(this,R.array.Places,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);
    }

    public void onClickLocation(View view){
        if(etJobTitle.getText().toString().equals("")){
            etJobTitle.setText("Please supply your job title");
        }
        else if( etPostCode.getText().toString().equals("")){
            etPostCode.setText("Please supply your post code");
        }
        else if(spinner.getItemAtPosition(0).toString().equals("Select any Country")){
            Toast.makeText(LocationActivity.this,"Please select any country from the drop down list",Toast.LENGTH_SHORT).show();
        }
        else if(spinner2.getItemAtPosition(0).toString().equals("Select any Place")){
            Toast.makeText(LocationActivity.this,"Please select any Place from the drop down list",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent homeActivity = new Intent(LocationActivity.this,HomeActivity.class);
            startActivity(homeActivity);
        }
    }
}
