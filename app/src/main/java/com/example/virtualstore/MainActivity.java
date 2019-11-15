package com.example.virtualstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.virtualstore.Adapters.ElectronicsAdapter;
import com.example.virtualstore.Adapters.FashionableAdapter;
import com.example.virtualstore.Adapters.FurnitureAdapter;
import com.example.virtualstore.Models.ElectronicsModel;
import com.example.virtualstore.Models.FashionModel;
import com.example.virtualstore.Models.FurnitureModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1,r2,r3;
    Context context;
    private ElectronicsAdapter electronicsAdapter;
    private FashionableAdapter fashionableAdapter;
    private FurnitureAdapter furnitureAdapter;
    private ArrayList<ElectronicsModel> electronicsModels = new ArrayList<>();
    private ArrayList<FashionModel> fashionModels = new ArrayList<>();
    private ArrayList<FurnitureModel> furnitureModels =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intialization();

        RecyclerView1();
        RecyclerView2();
        RecyclerView3();

    }




    private void Intialization(){
        r1=findViewById(R.id.card_recyclerview1);
        r2=findViewById(R.id.card_recyclerview2);
        r3=findViewById(R.id.card_recyclerview3);

    }
    private void addData1() {
        electronicsModels.add(new ElectronicsModel(R.drawable.chair, "Chair"));
        electronicsModels.add(new ElectronicsModel(R.drawable.chair, "Table"));
        electronicsModels.add(new ElectronicsModel(R.drawable. chair, "Fox"));
        electronicsModels.add(new ElectronicsModel(R.drawable.chair, "Chair"));
        electronicsModels.add(new ElectronicsModel(R.drawable.chair, "Table"));
        electronicsModels.add(new ElectronicsModel(R.drawable. chair, "Fox"));

    }
    private void RecyclerView1(){
        electronicsAdapter=new ElectronicsAdapter(electronicsModels);
        r1.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
        r1.setAdapter(electronicsAdapter);
        addData1();
    }
    private void RecyclerView2() {
        fashionableAdapter=new FashionableAdapter(fashionModels);
        r2.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        r2.setAdapter(fashionableAdapter);
        addData2();

    }
    private void addData2() {
        fashionModels.add(new FashionModel(R.drawable.chair, "Chair"));
        fashionModels.add(new FashionModel(R.drawable.chair, "Table"));
        fashionModels.add(new FashionModel(R.drawable. chair, "Fox"));
        fashionModels.add(new FashionModel(R.drawable.chair, "Chair"));
        fashionModels.add(new FashionModel(R.drawable.chair, "Table"));
        fashionModels.add(new FashionModel(R.drawable. chair, "Fox"));
    }

    private void RecyclerView3() {
        furnitureAdapter = new FurnitureAdapter(furnitureModels);
        r3.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        r3.setAdapter(furnitureAdapter);
        addData3();


    }

    private void addData3() {
        furnitureModels.add(new FurnitureModel(R.drawable.chair,"chair"));
        furnitureModels.add(new FurnitureModel(R.drawable.chair,"chair"));
        furnitureModels.add(new FurnitureModel(R.drawable.chair,"chair"));

        furnitureModels.add(new FurnitureModel(R.drawable.chair,"chair"));
        furnitureModels.add(new FurnitureModel(R.drawable.chair,"chair"));
        furnitureModels.add(new FurnitureModel(R.drawable.chair,"chair"));

    }


}
