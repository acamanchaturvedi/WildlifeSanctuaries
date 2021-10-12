package com.example.wildlifesanctuaries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchBySanctuaries extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Sanctuaries");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_sanctuaries);

        ArrayList<Sanctuary> sanctuaries = new ArrayList<>();
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));
        sanctuaries.add(new Sanctuary("Amba Barwa WLS","Buldhana, Maharashtra",R.drawable.android_a));


        SanctuaryAdapter sanctuaryAdapter=new SanctuaryAdapter(this,sanctuaries);

        ListView listView = findViewById(R.id.sanctuary_listview);
        listView.setAdapter(sanctuaryAdapter);
    }
}