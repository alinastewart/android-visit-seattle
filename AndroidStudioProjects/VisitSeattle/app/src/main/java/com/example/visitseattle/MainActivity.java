package com.example.visitseattle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView hotels = (TextView) findViewById(R.id.hotels);

        // Set a click listener on that View
        hotels.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);

                // Start the new activity
                startActivity(hotelsIntent);
            }
        });

        // Find the View that shows the family category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        // Set a click listener on that View
        restaurants.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the colors category
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set a click listener on that View
        museums.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView malls = (TextView) findViewById(R.id.malls);

        // Set a click listener on that View
        malls.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent mallsIntent = new Intent(MainActivity.this, MallsActivity.class);

                // Start the new activity
                startActivity(mallsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView gardens = (TextView) findViewById(R.id.gardens);

        // Set a click listener on that View
        gardens.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent gardensIntent = new Intent(MainActivity.this, GardensActivity.class);

                // Start the new activity
                startActivity(gardensIntent);
            }
        });
    }
}
