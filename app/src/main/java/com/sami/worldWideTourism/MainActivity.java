package com.sami.worldWideTourism;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sami.worldWideTourism.AllTourAttractions.TourAttractionsList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView touristdestinations, touristattractions;
    ArrayList<TouristDestinations_MODEL> touristDestinations_models;
    ArrayList<TouristAttractions_MODEL> touristAttractions_models;
    TouristDestinations_ADAPTER touristDestinations_adapter;
    TouristAttractions_ADAPTER touristAttractions_adapter;
    LinearLayoutManager manager;
    TextView seeAlltouristdestinations;
    Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touristdestinations = findViewById(R.id.touristdestinations_recyclerview);

        touristDestinations_models = new ArrayList<>();
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.paris, "Paris", "France"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.london, "London", "England"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.berlin, "Berlin", "Germany"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.rome, "Rome", "Italy"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.madrid, "Madrid", "Spain"));
        touristDestinations_models.add(new TouristDestinations_MODEL(R.drawable.amsterdam, "Amsterdam", "Netherlands"));

        touristDestinations_adapter = new TouristDestinations_ADAPTER(this, touristDestinations_models);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        touristdestinations.setAdapter(touristDestinations_adapter);
        touristdestinations.setLayoutManager(manager);

        touristattractions = findViewById(R.id.touristattractions_recyclerview);

        touristAttractions_models = new ArrayList<>();
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.eiffeltowerparisfrance,"Eifel Tower","Paris"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.bigbenlondon,"Big ben","London"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.brandenburgergate,"Brandenburgergate","Berlin"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.colosseumrome,"Colosseum","Rome"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.pradonationalmuseummadrid,"pradonationalmuseum","Madrid"));
        touristAttractions_models.add(new TouristAttractions_MODEL(R.drawable.rijksmuseumamsterdam,"rijksmuseum","Amsterdam"));

        touristAttractions_adapter = new TouristAttractions_ADAPTER(this, touristAttractions_models);
        manager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        touristattractions.setAdapter(touristAttractions_adapter);
        touristattractions.setLayoutManager(manager);

        explore = findViewById(R.id.exploretouristdestinations_button);
        seeAlltouristdestinations = findViewById(R.id.seetouristdestinations_link);

        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TourAttractionsList.class));
            }
        });

        seeAlltouristdestinations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TourAttractionsList.class));
            }
        });

    }
}