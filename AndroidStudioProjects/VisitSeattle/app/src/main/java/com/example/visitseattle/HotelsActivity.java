package com.example.visitseattle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of places
        ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Four Seasons Hotel", "(425) 666 222",R.drawable.hotel_four_seasons));
        seattlePlaces.add(new Place("Inn At The Market","(425) 777 333",R.drawable.hotel_inn_at_the_market));
        seattlePlaces.add(new Place("Hotel Theodore", "(425) 888 333",R.drawable.hotel_theodore));
        seattlePlaces.add(new Place("The State Hotel", "(425) 666 555",R.drawable.hotel_the_state));
        seattlePlaces.add(new Place("Hotel Thompson", "(425) 444 777",R.drawable.hotel_thompson));



        PlaceAdapter seattleAdapter = new PlaceAdapter(this, seattlePlaces);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(seattleAdapter);
    }
}
