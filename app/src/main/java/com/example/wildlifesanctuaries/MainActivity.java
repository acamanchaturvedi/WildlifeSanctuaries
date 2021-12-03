package com.example.wildlifesanctuaries;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Home");
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fun(View view) {
        Intent intent = new Intent(this, SearchBySanctuaries.class);
        startActivity(intent);
    }

    public void funn(View view) {
        Intent intent = new Intent(this, SearchByStates.class);
        startActivity(intent);
    }

    public void funnn(View view) {
        Intent intent = new Intent(this, MapsActivity2.class);
        startActivity(intent);
    }

}