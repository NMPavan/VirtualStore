package com.example.virtualstore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.virtualstore.Models.FurnitureModel;
import com.example.virtualstore.R;

import java.util.ArrayList;

public class FurnitureAdapter extends RecyclerView.Adapter<FurnitureAdapter.FurnitureViewHolder> {
    ArrayList<FurnitureModel> furnitureModels;

    public FurnitureAdapter(ArrayList<FurnitureModel> furnitureModels) {
        this.furnitureModels = furnitureModels;
    }

    @NonNull
    @Override
    public FurnitureAdapter.FurnitureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_fashionable,parent,false);
        return new FurnitureViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FurnitureViewHolder holder, int position) {
        holder.recylerviewImage.setImageResource(furnitureModels.get(position).getBitmap());
    }



    @Override
    public int getItemCount() {
        return furnitureModels.size();
    }
    public class FurnitureViewHolder extends RecyclerView.ViewHolder{
        ImageView recylerviewImage;

        public FurnitureViewHolder(@NonNull View itemView) {
            super(itemView);
            recylerviewImage = itemView.findViewById(R.id.fashionImage);


        }
    }
}
