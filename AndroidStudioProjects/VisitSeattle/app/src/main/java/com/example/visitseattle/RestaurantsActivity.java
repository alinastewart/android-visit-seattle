package com.example.visitseattle;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of places
        ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Cafe Shampagne Restaurant", "(425) 666 222", R.drawable.restaurant_cafe_shampagne));
        seattlePlaces.add(new Place("June Baby Restaurant","(425) 777 333", R.drawable.restaurant_june_baby));
        seattlePlaces.add(new Place("Restaurant Le Pichet", "(425) 888 333", R.drawable.restaurant_le_pichet));
        seattlePlaces.add(new Place("Restaurant Monsoon", "(425) 666 555", R.drawable.restaurant_monsoon));
        seattlePlaces.add(new Place("Restaurant Nue", "(425) 444 777", R.drawable.restaurant_nue));
        seattlePlaces.add(new Place("The Pink Door Restaurant", "(425) 666 888", R.drawable.restaurant_the_pink_door));


        PlaceAdapter seattleAdapter = new PlaceAdapter(this, seattlePlaces);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(seattleAdapter);
    }
}
