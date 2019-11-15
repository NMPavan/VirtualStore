package com.example.virtualstore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.virtualstore.Models.FashionModel;
import com.example.virtualstore.R;

import java.util.ArrayList;

public class FashionableAdapter extends RecyclerView.Adapter<FashionableAdapter.FashionViewHolder> {
    ArrayList<FashionModel> fashionModels;

    public FashionableAdapter(ArrayList<FashionModel> fashionModels) {
        this.fashionModels = fashionModels;
    }

    @NonNull
    @Override
    public FashionableAdapter.FashionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_fashionable,parent,false);
        return new FashionViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FashionableAdapter.FashionViewHolder holder, int position) {
        holder.recylerviewImage.setImageResource(fashionModels.get(position).getBitmap());


    }

    @Override
    public int getItemCount() {
        return fashionModels.size();
    }
    public class FashionViewHolder extends RecyclerView.ViewHolder{
        ImageView recylerviewImage;

        public FashionViewHolder(@NonNull View itemView) {
            super(itemView);
            recylerviewImage = itemView.findViewById(R.id.fashionImage);


        }
    }
}
