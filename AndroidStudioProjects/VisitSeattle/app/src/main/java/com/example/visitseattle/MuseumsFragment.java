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

public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Seattle Space Needle", "(425) 888 777", R.drawable.museum_space_needle));
        seattlePlaces.add(new Place("Seattle Art Museum", "(425) 666 222", R.drawable.museum_of_art));
        seattlePlaces.add(new Place("Museum Of Pop Culture", "(425) 888 333", R.drawable.museum_of_pop_culture));
        seattlePlaces.add(new Place("Museum Of History and Industry", "(425) 666 222", R.drawable.museum_of_h_and_i));
        seattlePlaces.add(new Place("Museum Of Flight","(425) 777 333", R.drawable.museum_of_flight));
        seattlePlaces.add(new Place("Museum Of Asian Art", "(425) 666 555", R.drawable.museum_of_asian_art));
        seattlePlaces.add(new Place("Garden Chihuly Glass Museum", "(425) 444 777", R.drawable.museum_garden_chihuly_glass));
        seattlePlaces.add(new Place("Frye Museum", "(425) 666 888", R.drawable.museum_frye));


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

