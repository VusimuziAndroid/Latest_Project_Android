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

import java.util.ArrayList;
import java.util.List;

public class LocationActivity extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner2;
    EditText etJobTitle;
    EditText etPostCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);


        ArrayAdapter<String> adapter;
        List<String> list;
        ArrayAdapter.createFromResource(this,R.array.Countries,android.R.layout.simple_spinner_item);

        ArrayAdapter<String> adapter2;
        List<String>list2;
        ArrayAdapter.createFromResource(this,R.array.Places,android.R.layout.simple_spinner_item);
    }

}
