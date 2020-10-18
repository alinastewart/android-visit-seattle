package com.example.visitseattle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        // Create a list of places
        ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Cafe Shampagne Restaurant", "(425) 666 222"));
        seattlePlaces.add(new Place("June Baby Restaurant","(425) 777 333"));
        seattlePlaces.add(new Place("Restaurant Le Pichet", "(425) 888 333"));
        seattlePlaces.add(new Place("Restaurant Monsoon", "(425) 666 555"));
        seattlePlaces.add(new Place("Restaurant Nue", "(425) 444 777"));
        seattlePlaces.add(new Place("The Pink Door Restaurant", "(425) 666 888"));


        PlaceAdapter seattleAdapter = new PlaceAdapter(this, seattlePlaces);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(seattleAdapter);
    }
}
