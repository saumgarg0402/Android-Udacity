package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.udacity.gradle.builditbigger.jokes.TellJokes;
import com.udacity.gradle.builditbigger.jokesactivity.TextActivity;

/**
 * Created by saumgarg on 17/12/17.
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new EndpointsAsyncTask().execute(this);


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
        //TextView textView = (TextView)findViewById(R.id.textView);

        TellJokes tj = new TellJokes();
        Intent i = new Intent(this, TextActivity.class);
        i.putExtra("Joke1",tj.getJokes());

        startActivity(i);
        //textView.setText(tj.getJokes());

        //Toast.makeText(this, tj.getJokes(), Toast.LENGTH_SHORT).show();
    }


}
