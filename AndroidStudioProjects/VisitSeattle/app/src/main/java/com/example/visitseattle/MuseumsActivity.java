package com.example.visitseattle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        // Create a list of places
        ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Seattle Art Museum", "(425) 666 222"));
        seattlePlaces.add(new Place("Museum Of Pop Culture", "(425) 888 333"));
        seattlePlaces.add(new Place("Museum Of H&I", "(425) 666 222"));
        seattlePlaces.add(new Place("Museum Of Flight","(425) 777 333"));
        seattlePlaces.add(new Place("Museum Of Asian Art", "(425) 666 555"));
        seattlePlaces.add(new Place("Garden Chiluly Glass Museum", "(425) 444 777"));
        seattlePlaces.add(new Place("Frye Museum", "(425) 666 888"));


        PlaceAdapter seattleAdapter = new PlaceAdapter(this, seattlePlaces);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(seattleAdapter);
    }
}
