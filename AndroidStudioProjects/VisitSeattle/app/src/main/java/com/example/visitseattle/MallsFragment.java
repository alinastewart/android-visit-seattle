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

public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of places
        final ArrayList<Place> seattlePlaces = new ArrayList<Place>();
        seattlePlaces.add(new Place("Northgate Mall", "(425) 666 222", R.drawable.mall_northgate));
        seattlePlaces.add(new Place("Pacific Place Mall","(425) 777 333", R.drawable.mall_pacific_place));
        seattlePlaces.add(new Place("Pacific Rim Center", "(425) 888 333", R.drawable.mall_pacific_rim));
        seattlePlaces.add(new Place("Pike Place Market", "(425) 666 555", R.drawable.mall_pike_place));
        seattlePlaces.add(new Place("University Village Mall", "(425) 444 777", R.drawable.mall_university_village));
        seattlePlaces.add(new Place("Westlake Center Mall", "(425) 444 777", R.drawable.mall_westlake_center));


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

