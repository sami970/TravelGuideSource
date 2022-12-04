package com.sami.worldWideTourism.AllTourAttractions;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sami.worldWideTourism.R;
import com.sami.worldWideTourism.TouristAttractions_MODEL;

import java.util.ArrayList;

public class TourAttractionsList extends AppCompatActivity {

    RecyclerView recycler;
    LinearLayoutManager manager;
    TourAttractionsList_Adapter adapter;
    ArrayList<TouristAttractions_MODEL> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_attractions_list);

        array = new ArrayList<>();

        array.add(new TouristAttractions_MODEL(R.drawable.eiffeltowerparisfrance,"Paris","France"));
        array.add(new TouristAttractions_MODEL(R.drawable.bigbenlondon,"London","England"));
        array.add(new TouristAttractions_MODEL(R.drawable.brandenburgergate,"Berlin","Germany"));
        array.add(new TouristAttractions_MODEL(R.drawable.colosseumrome,"Rome","Italy"));
        array.add(new TouristAttractions_MODEL(R.drawable.pradonationalmuseummadrid,"Madrid","Spain"));
        array.add(new TouristAttractions_MODEL(R.drawable.rijksmuseumamsterdam,"Amsterdam","Netherlands"));

        adapter = new TourAttractionsList_Adapter(this, array);

        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recycler = findViewById(R.id.tourattr_recycler);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(manager);

        Toolbar toolbar=findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


}