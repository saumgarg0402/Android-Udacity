package com.udacity.gradle.builditbigger.jokesactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_activity_main);
        String joke = getIntent().getExtras().getString("Joke1");
        TextView tv = (TextView)findViewById(R.id.jokeView);
        tv.setText(joke);

    }

    public static Intent launchIntent(Context context, String joke) {
        Intent intent = new Intent(context, TextActivity.class);
        intent.putExtra("Joke1", joke);
        return intent;
    }

    public void returnToMain(View view){
        finish();
    }
}
