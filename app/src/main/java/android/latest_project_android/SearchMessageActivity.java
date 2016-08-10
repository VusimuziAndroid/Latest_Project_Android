package android.latest_project_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SearchMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_message);
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
        // automatically handle clicks on the HomeActivity/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/
        switch(id){
            case R.id.JobSearch:
                Intent jobSearchIntent = new Intent(SearchMessageActivity.this,JobSearchActivity.class);
                startActivity(jobSearchIntent);
                break;
            case R.id.Lynda:
               /* Intent lyndaIntent = new Intent(HomeActivity.this,LyndaActivity.this);
                startActivity(lyndaIntent);*/
                break;
            case R.id.LookUp:
                 /* Intent lookupIntent = new Intent(HomeActivity.this,LookUpActivity.this);
                startActivity(lookupIntent);*/
                break;
            case R.id.SlideShare:
                 /* Intent slideShareIntent = new Intent(HomeActivity.this,slideShareActivity.this);
                startActivity(slideShareIntent);*/
                break;
            case R.id.Logout:
                Intent logoutIntent = new Intent(SearchMessageActivity.this,SignUpActivity.class);
                startActivity(logoutIntent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
