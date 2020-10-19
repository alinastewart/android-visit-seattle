package com.example.visitseattle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GardensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of places
        ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Japanese Garden", "(425) 666 222"));
        seattlePlaces.add(new Place("Kubota Garden","(425) 777 333"));
        seattlePlaces.add(new Place("Dunn Gardens","(425) 777 333"));
        seattlePlaces.add(new Place("UW Botanic Garden", "(425) 888 333"));
        seattlePlaces.add(new Place("Woodland Park Rose Garden", "(425) 666 555"));
        seattlePlaces.add(new Place("Carl S English Botanical Gardens", "(425) 444 777"));


        PlaceAdapter seattleAdapter = new PlaceAdapter(this, seattlePlaces);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(seattleAdapter);
    }
}
