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

public class GardensFragment extends Fragment {


    public GardensFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Japanese Garden", "(425) 666 222", R.drawable.garden_japanese));
        seattlePlaces.add(new Place("Kubota Garden","(425) 777 333", R.drawable.garden_kubota));
        seattlePlaces.add(new Place("Dunn Gardens","(425) 777 333", R.drawable.garden_dunn));
        seattlePlaces.add(new Place("UW Botanic Garden", "(425) 888 333", R.drawable.garden_uw_botanic));
        seattlePlaces.add(new Place("Woodland Park Rose Garden", "(425) 666 555", R.drawable.garden_woodland_park_rose));
        seattlePlaces.add(new Place("Carl S English Botanical Gardens", "(425) 444 777", R.drawable.carl_s_english_botanical_gardens));


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

