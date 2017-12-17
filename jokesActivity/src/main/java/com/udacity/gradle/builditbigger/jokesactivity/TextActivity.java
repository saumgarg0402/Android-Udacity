package com.udacity.gradle.builditbigger.jokesactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String joke = getIntent().getExtras().getString("Joke1");
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(joke);
    }
}
