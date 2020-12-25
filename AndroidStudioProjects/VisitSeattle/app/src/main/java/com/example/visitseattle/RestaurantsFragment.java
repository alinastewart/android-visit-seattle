package com.example.visitseattle;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Cafe Champagne Restaurant", "(425) 666 222", R.drawable.restaurant_champagne));
        seattlePlaces.add(new Place("June Baby Restaurant","(425) 777 333", R.drawable.restaurant_june_baby));
        seattlePlaces.add(new Place("Restaurant Le Pichet", "(425) 888 333", R.drawable.restaurant_le_pichet));
        seattlePlaces.add(new Place("Restaurant Monsoon", "(425) 666 555", R.drawable.restaurant_monsoon));
        seattlePlaces.add(new Place("Restaurant Nue", "(425) 444 777", R.drawable.restaurant_nue));
        seattlePlaces.add(new Place("The Pink Door Restaurant", "(425) 666 888", R.drawable.restaurant_pink_door));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter seattleAdapter = new PlaceAdapter(getActivity(), seattlePlaces);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Places} in the list.
        listView.setAdapter(seattleAdapter);

        return rootView;
    }
}

