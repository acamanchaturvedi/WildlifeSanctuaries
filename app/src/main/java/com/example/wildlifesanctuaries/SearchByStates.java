package com.example.wildlifesanctuaries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchByStates extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("States");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_states);

        ArrayList<State> states = new ArrayList<>();

        states.add(new State("Andhra Pradesh",R.drawable.andhrapradesh));
        states.add(new State("Arunachal Pradesh",R.drawable.arunachal));
        states.add(new State("Assam",R.drawable.assam));
        states.add(new State("Bihar",R.drawable.bihar));
        states.add(new State("Chhattisgarh",R.drawable.chhattisgarh));
        states.add(new State("Goa",R.drawable.goa));
        states.add(new State("Gujarat",R.drawable.gujarat));
        states.add(new State("Haryana",R.drawable.haryana));
        states.add(new State("Himachal Pradesh",R.drawable.himachal));
        states.add(new State("Jharkhand",R.drawable.jharkhand));
        states.add(new State("Karnataka",R.drawable.karnataka));
        states.add(new State("Kerala",R.drawable.kerala));
        states.add(new State("Madhya Pradesh",R.drawable.madhyapradesh));
        states.add(new State("Maharashtra",R.drawable.maharashtra));
        states.add(new State("Manipur",R.drawable.manipur));
        states.add(new State("Mizoram",R.drawable.mizoram));
        states.add(new State("Nagaland",R.drawable.nagaland));
        states.add(new State("Odisha",R.drawable.odisha));
        states.add(new State("Punjab",R.drawable.punjab));
        states.add(new State("Rajasthan",R.drawable.rajasthan));
        states.add(new State("Sikkim",R.drawable.sikkim));
        states.add(new State("Tamil Nadu",R.drawable.tamilnadu));
        states.add(new State("Telangana",R.drawable.telangana));
        states.add(new State("Tripura",R.drawable.tripura));
        states.add(new State("Uttar Pradesh",R.drawable.uttarpradesh));
        states.add(new State("Uttarakhand",R.drawable.uttarakhand));
        states.add(new State("West Bengal",R.drawable.westbangal));
        states.add(new State("Andaman And Nicobar Islands",R.drawable.andaman));
        states.add(new State("Chandigarh",R.drawable.chandigarh));
        states.add(new State("Dadra And Nagar Haveli",R.drawable.dadra));
        states.add(new State("Delhi",R.drawable.delhi));
        states.add(new State("Jammu And Kashmir",R.drawable.kashmir));
        states.add(new State("Ladakh",R.drawable.ladakh));
        states.add(new State("Lakshadweep",R.drawable.lakshadweep));
        states.add(new State("Puducherry",R.drawable.puducherry));
        StateAdapter sanctuaryAdapter=new StateAdapter(this,states);
        ListView listView = findViewById(R.id.state_listview);
        listView.setAdapter(sanctuaryAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                TextView textview=findViewById(R.id.state_name);
                String states_data[]={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh"
                        ,"Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Mizoram","Nagaland","Odisha","Punjab",
                        "Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal","Andaman And Nicobar Islands",
                        "Chandigarh","Dadra And Nagar Haveli","Delhi","Jammu And Kashmir","Ladakh","Lakshadweep","Puducherry" };
                String passingdata=states_data[position];
//                Log.e("MANU",passingdata );
                Toast.makeText(getApplicationContext(),passingdata,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(SearchByStates.this, Sanctuary_Detail.class);
                Bundle b = new Bundle();
                b.putString("key", passingdata);
                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}

