package com.example.miguel.tabby.Models;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.InputStream;
import java.net.URL;

public class Country {

    private String name;
    private String code;
    private Bitmap image;

    public Country(){}

    public Country(String name, String code) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    private Bitmap cargarImagen(String code) {
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
