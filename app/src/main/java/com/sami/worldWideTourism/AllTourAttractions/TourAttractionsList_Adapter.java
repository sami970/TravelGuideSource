package com.sami.worldWideTourism.AllTourAttractions;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sami.worldWideTourism.CityDetails;
import com.sami.worldWideTourism.R;
import com.google.android.material.imageview.ShapeableImageView;
import com.sami.worldWideTourism.TouristAttractions_MODEL;

import java.util.ArrayList;

public class TourAttractionsList_Adapter extends RecyclerView.Adapter<TourAttractionsList_Adapter.ViewHolder>{

    Context context;
    ArrayList<TouristAttractions_MODEL> arrayList;

    public TourAttractionsList_Adapter(Context context, ArrayList<TouristAttractions_MODEL> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public TourAttractionsList_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View showview = LayoutInflater.from(context).inflate(R.layout.tour_attractions_list_layout, null, true);
        return new TourAttractionsList_Adapter.ViewHolder(showview);
    }

    @Override
    public void onBindViewHolder(@NonNull TourAttractionsList_Adapter.ViewHolder holder, int position) {

        TouristAttractions_MODEL model = arrayList.get(position);

        holder.city.setText(model.getName());
        holder.state.setText(model.getState());
        holder.picture.setImageResource(model.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, CityDetails.class);

                intent.putExtra("putextra_city", model.getName());

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView city, state;
        ShapeableImageView picture;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            city = itemView.findViewById(R.id.tourattr_name);
            state = itemView.findViewById(R.id.tourattr_state);
            picture = itemView.findViewById(R.id.tourattr_image);

        }
    }
}
