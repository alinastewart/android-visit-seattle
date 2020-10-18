package com.example.visitseattle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);

        // Create a list of places
        ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Northgate Mall", "(425) 666 222"));
        seattlePlaces.add(new Place("Pacific Place Mall","(425) 777 333"));
        seattlePlaces.add(new Place("Pacific Rim Center", "(425) 888 333"));
        seattlePlaces.add(new Place("Pike Place Market", "(425) 666 555"));
        seattlePlaces.add(new Place("University Village Mall", "(425) 444 777"));
        seattlePlaces.add(new Place("Westlake Center Mall", "(425) 444 777"));



        PlaceAdapter seattleAdapter = new PlaceAdapter(this, seattlePlaces);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(seattleAdapter);
    }
}
