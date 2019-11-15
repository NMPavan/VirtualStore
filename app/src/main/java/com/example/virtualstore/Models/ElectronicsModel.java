package com.example.virtualstore.Models;

public class ElectronicsModel {
    int bitmap;

    String name;

    public ElectronicsModel(int bitmap, String name) {
        this.bitmap = bitmap;
        this.name = name;
    }


    public int getBitmap() {
        return bitmap;
    }

    public String getName() {
        return name;
    }
}
