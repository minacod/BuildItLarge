package com.example.android.androidjoker;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.androidjoker.databinding.ActivityJokeBinding;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent i = getIntent();
        String joke = i.getStringExtra("joke");

        ActivityJokeBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_joke);
        binding.joke.setText(joke);
    }
}
