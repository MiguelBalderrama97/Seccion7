package com.example.miguel.tabby.Models;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.net.URL;

public class Country {

    private String name;
    private int code;
    private Bitmap image;

    public Country(){}

    public Country(String name, int code) {
        this.name = name;
        this.code = code;
        this.image = cargarImagen(code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    private Bitmap cargarImagen(int code) {
        String url = "http://flagpedia.net/data/flags/w580/" + code + ".png";
        try {
            InputStream isImagen = null;
            isImagen = (InputStream) new URL(url).getContent();
            Bitmap bBitMap = BitmapFactory.decodeStream(isImagen);
            return bBitMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
