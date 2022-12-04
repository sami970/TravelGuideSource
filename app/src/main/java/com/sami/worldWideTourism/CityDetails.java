package com.sami.worldWideTourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.imageview.ShapeableImageView;

public class CityDetails extends AppCompatActivity {

    ShapeableImageView mainimage, attr1img, attr2img, food1img, food2img;
    TextView city, description, duration, timetovisit, attr1name, attr1des, attr2name, attr2des, food1name, food1des, food2name, food2des;
    Button locationbtn;
    String location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_details);

        mainimage = findViewById(R.id.citydetails_image);
        attr1img = findViewById(R.id.citydetails_place1image);
        attr2img = findViewById(R.id.citydetails_place2image);
        food1img = findViewById(R.id.citydetails_food1image);
        food2img = findViewById(R.id.citydetails_food2image);
        city = findViewById(R.id.citydetails_name);
        description = findViewById(R.id.citydetails_description);
        duration = findViewById(R.id.citydetails_tripduration);
        timetovisit = findViewById(R.id.citydetails_besttime);
        attr1name = findViewById(R.id.citydetails_place1name);
        attr2name = findViewById(R.id.citydetails_place2name);
        food1name = findViewById(R.id.citydetails_food1name);
        food2name = findViewById(R.id.citydetails_food2name);
        attr1des = findViewById(R.id.citydetails_place1description);
        attr2des = findViewById(R.id.citydetails_place2description);
        food1des = findViewById(R.id.citydetails_food1description);
        food2des = findViewById(R.id.citydetails_food2description);
        locationbtn = findViewById(R.id.citydetails_getlocationbtn);

        String city_str = getIntent().getStringExtra("putextra_city");

        if(city_str.equals("Paris")){
            city.setText("Paris");
            attr1name.setText("Eiffel tower");
            attr2name.setText("Louvre museum");
            attr1des.setText("The Eiffel Tower ranks high on the list of places action in the world");
            attr2des.setText("A sumptuous palace that was once the home of France's kings");
            attr1img.setImageResource(R.drawable.eiffeltowerparisfrance);
            attr2img.setImageResource(R.drawable.louvremuseum);
            food1name.setText("Maccarons");
            food2name.setText("Snails");
            food1des.setText("Their are made of almond flour and filled with luscious interior");
            food2des.setText("They are stuffed with a garlic, herbs and butter");
            food1img.setImageResource(R.drawable.macarons);
            food2img.setImageResource(R.drawable.snails);
            description.setText("Paris offers something for everyone. It boasts rich culture and art, both in museums and galleries as well as on streets and in theatres. Get captivated by rich palaces and romantic gardens. Explore the wide avenues and narrow cobbled streets where a new gem waits for travellers around every corner. While sightseeing, don’t forget to enjoy life or, as the French would say: Joie de vivre");
            location="https://www.google.com/maps/place/Paris,+Frankrig/@48.8588548,2.347035,12z/data=!3m1!4b1!4m5!3m4!1s0x47e66e1f06e2b70f:0x40b82c3688c9460!8m2!3d48.856614!4d2.3522219";
            timetovisit.setText("October to March");
            duration.setText("2 to 3 days");
            mainimage.setImageResource(R.drawable.paris);
        }

        if(city_str.equals("London"))
        {
            city.setText("London");
            attr1name.setText("Bigben");
            attr2name.setText("London eye");
            attr1des.setText("Big Ben is a tower clock known for its massive hour bell");
            attr2des.setText("See unforgettable views of some of London's most famous landmarks");
            attr1img.setImageResource(R.drawable.bigbenlondon);
            attr2img.setImageResource(R.drawable.londoneye);
            food1name.setText("Fish and chips");
            food2name.setText("Roast dinner");
            food1des.setText("Fried fish came from the Jews and chips from Belgians");
            food2des.setText("Choose your meat with potatoes, veggies,pudding and cheese");
            food1img.setImageResource(R.drawable.fishchips);
            food2img.setImageResource(R.drawable.roastdinner);
            description.setText("London, city, capital of the United Kingdom. It is among the oldest of the world’s great cities—its history spanning nearly two millennia—and one of the most cosmopolitan. By far Britain’s largest metropolis, it is also the country’s economic, transportation, and cultural centre.");
            location="https://www.google.com/maps/place/London,+Storbritannien/@51.5286416,-0.1015987,11z/data=!4m5!3m4!1s0x47d8a00baf21de75:0x52963a5addd52a99!8m2!3d51.5072178!4d-0.1275862";
            timetovisit.setText("March to October");
            duration.setText("2 to 3 days");
            mainimage.setImageResource(R.drawable.london);
        }

        if(city_str.equals("Berlin")){
            city.setText("Berlin");
            attr1name.setText("BranderburgerGate");
            attr2name.setText("Reichstag");
            attr1des.setText("Brandenburg Gate is Berlin's signature attraction");
            attr2des.setText("You can look out from the building's glass dome to get a good view");
            attr1img.setImageResource(R.drawable.brandenburgergate);
            attr2img.setImageResource(R.drawable.reichstag);
            food1name.setText("CurryWurst");
            food2name.setText("Pretzels");
            food1des.setText("It is a sausage with curry powder and ketchup served with fries ");
            food2des.setText("It has various flavors with cheese, seeds, chocolate, etc");
            food1img.setImageResource(R.drawable.currywurst);
            food2img.setImageResource(R.drawable.pretzels);
            description.setText("Berlin, the capital city of Germany, is renowned for its exceptional range of landmarks, vibrant cultural scene and way of life that's somehow all go yet relaxed.\n" + "In fact, the city is best known for its striking contrasts. Historical buildings stand alongside modern architecture as the past and present intermingle.");
            location="https://www.google.com/maps/place/Berlin,+Tyskland/@52.5067614,13.2846507,11z/data=!3m1!4b1!4m5!3m4!1s0x47a84e373f035901:0x42120465b5e3b70!8m2!3d52.5200066!4d13.404954";
            timetovisit.setText("April to September");
            duration.setText("2 to 3 days");
            mainimage.setImageResource(R.drawable.berlin);
        }

        if(city_str.equals("Rome")){
            city.setText("Rome");
            attr1name.setText("colosseum");
            attr2name.setText("Trevi Fountain of Rome");
            attr1des.setText("You can visit the stands,the arena and the underground spaces");
            attr2des.setText("The most famous fountain in Rome and perhaps even in the world");
            attr1img.setImageResource(R.drawable.colosseumrome);
            attr2img.setImageResource(R.drawable.trevifountain);
            food1name.setText("Carbonara");
            food2name.setText("Gelato");
            food1des.setText("It is made with spaghetti, Pecorino and Parmigiano");
            food2des.setText("There are thousands of gelateria selling scoops of classic flavours");
            food1img.setImageResource(R.drawable.carbonara);
            food2img.setImageResource(R.drawable.gelato);
            description.setText("Rome is located on the western coast of central Italy along the Tevere River. The capital of the Lazio region is Italy’s largest city with a population of 2,654,100 and over 2600 years of richness in art, history, architecture, monuments and culture.\n");
            location="https://www.google.com/maps/place/Rom,+Italien/@41.909986,12.395915,11z/data=!3m1!4b1!4m5!3m4!1s0x132f6196f9928ebb:0xb90f770693656e38!8m2!3d41.9027835!4d12.4963655";
            timetovisit.setText("May to August");
            duration.setText("2 to 3 days");
            mainimage.setImageResource(R.drawable.rome);
        }

        if(city_str.equals("Madrid")){
            city.setText("Madrid");
            attr1name.setText("Museo Nacional del Prado");
            attr2name.setText("Buen Retiro Park and the Crystal Palace");
            attr1des.setText("A world-class museum with 8,000 paintings and 700 sculptures");
            attr2des.setText("The Buen Retiro Park is an oasis of peace in the heart of Madrid");
            attr1img.setImageResource(R.drawable.pradonationalmuseummadrid);
            attr2img.setImageResource(R.drawable.buenretiropark);
            food1name.setText("Huevos Rotos");
            food2name.setText("Bocadillo de Calamares");
            food1des.setText("It is a plate of potatoes and topped with perfect over-easy eggs");
            food2des.setText("It consists of crusty bread loaded with deep-fried rings of squid");
            food1img.setImageResource(R.drawable.huevosrotos);
            food2img.setImageResource(R.drawable.bocadillodecalamares);
            description.setText("Full of energy and packed with cultural attractions, Madrid is a modern metropolis that offers a taste of the real Spain. Wide avenues are congested with traffic, but beautiful parks break up the urban sprawl. Madrid doesn't have the traditional charm of Andalusia or the beauty of Barcelona, instead, it is a hub of social life with a happening café culture and bustling nightlife. Constantly buzzing with activity, the city offers so much to see and do that tourists will be spoiled for choice.");
            location="https://www.google.com/maps/place/Madrid,+Spanien/@40.4378698,-3.8196197,11z/data=!3m1!4b1!4m5!3m4!1s0xd422997800a3c81:0xc436dec1618c2269!8m2!3d40.4167754!4d-3.7037902";
            timetovisit.setText("October to March");
            duration.setText("2 to 3 days");
            mainimage.setImageResource(R.drawable.madrid);
        }

        if(city_str.equals("Amsterdam")){
            city.setText("Amsterdam");
            attr1name.setText("Rijksmuseum");
            attr2name.setText("Hortus Botanicus");
            attr1des.setText("Cultural artifacts dating from the 13th century to the modern");
            attr2des.setText("Amsterdam offers a  dose of nature in the very heart of the city");
            attr1img.setImageResource(R.drawable.rijksmuseumamsterdam);
            attr2img.setImageResource(R.drawable.hortusbotanicus);
            food1name.setText("Bitterballen");
            food2name.setText("Thick Dutch fries");
            food1des.setText("Deep fried crispy balls traditionally served with mustard ");
            food2des.setText("Served in a paper cone slathered with any manner of tasty toppings. ");
            food1img.setImageResource(R.drawable.bitterballen);
            food2img.setImageResource(R.drawable.thickdutchfries);
            description.setText("Amsterdam is the capital and largest city in the European country of the Netherlands. Amsterdam is famous for its canals and dikes. Unlike in capitals of most other countries, the national government, parliament, government ministries, supreme court, royal family and embassies are not in Amsterdam, but in The Hague. The only diplomatic offices present in Amsterdam are consulates.");
            location="https://www.google.com/maps/place/Amsterdam,+Holland/@52.3546449,4.8339211,12z/data=!3m1!4b1!4m5!3m4!1s0x47c63fb5949a7755:0x6600fd4cb7c0af8d!8m2!3d52.3675734!4d4.9041389";
            timetovisit.setText("October to March");
            duration.setText("2 to 3 days");
            mainimage.setImageResource(R.drawable.amsterdam);
        }

        locationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(location)));
            }
        });



    }
}



