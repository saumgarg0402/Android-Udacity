package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.udacity.gradle.builditbigger.jokesactivity.TextActivity;

/**
 * Created by saumgarg on 17/12/17.
 */

public class MainActivity extends AppCompatActivity{

    ProgressBar pBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pBar = (ProgressBar)findViewById(R.id.progressBar);
        pBar.setVisibility(View.GONE);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void tellJoke(View view) {

        pBar.setVisibility(View.VISIBLE);
        new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String result) {
                if(result != null){
                    startActivity(TextActivity.launchIntent(MainActivity.this,result));
                }
                else{
                    Toast.makeText(MainActivity.this,"Oops! I'm not that funny.",Toast.LENGTH_LONG).show();
                }

                pBar.setVisibility(View.GONE);
            }
        }.execute();
    }


}
