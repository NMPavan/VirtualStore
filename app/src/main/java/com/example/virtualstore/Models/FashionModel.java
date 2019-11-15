package com.example.virtualstore.Models;

public class FashionModel {
    int bitmap;
    String name;

    public FashionModel(int bitmap, String name) {
        this.bitmap = bitmap;
        this.name = name;
    }

    public int getBitmap() {
        return bitmap;
    }

    public void setBitmap(int bitmap) {
        this.bitmap = bitmap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
