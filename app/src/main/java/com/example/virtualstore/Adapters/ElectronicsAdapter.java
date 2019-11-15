package com.example.virtualstore.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.virtualstore.Models.ElectronicsModel;
import com.example.virtualstore.R;

import java.util.ArrayList;

public class ElectronicsAdapter extends RecyclerView.Adapter<ElectronicsAdapter.ElectroncsViewHolder> {
    ArrayList<ElectronicsModel> electronicsModels;

    public ElectronicsAdapter(ArrayList<ElectronicsModel> electronicsModels) {
        this.electronicsModels = electronicsModels;
    }

//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_elctronics,parent,false);
//        return new ElectroncsViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        holder.recyclerImage.setImage
//    }

    @NonNull
    @Override
    public ElectroncsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_elctronics,parent,false);
        return new ElectroncsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ElectroncsViewHolder holder, int position) {
          holder.recyclerImage.setImageResource(electronicsModels.get(position).getBitmap());
    }

    @Override
    public int getItemCount() {
        return electronicsModels.size();
    }

    public class ElectroncsViewHolder extends RecyclerView.ViewHolder{
       public ImageView recyclerImage;
        public ElectroncsViewHolder(@NonNull View itemView) {
            super(itemView);

            recyclerImage=itemView.findViewById(R.id.electronics_image);

        }
    }
}
