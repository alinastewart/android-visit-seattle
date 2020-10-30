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
        seattlePlaces.add(new Place("Japanese Garden", "(425) 666 222", R.drawable.garden_japanese));
        seattlePlaces.add(new Place("Kubota Garden","(425) 777 333", R.drawable.garden_kubota));
        seattlePlaces.add(new Place("Dunn Gardens","(425) 777 333", R.drawable.garden_dunn));
        seattlePlaces.add(new Place("UW Botanic Garden", "(425) 888 333", R.drawable.garden_uw_botanic));
        seattlePlaces.add(new Place("Woodland Park Rose Garden", "(425) 666 555", R.drawable.garden_woodland_park_rose));
        seattlePlaces.add(new Place("Carl S English Botanical Gardens", "(425) 444 777", R.drawable.carl_s_english_botanical_gardens));


        PlaceAdapter seattleAdapter = new PlaceAdapter(this, seattlePlaces);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(seattleAdapter);
    }
}
