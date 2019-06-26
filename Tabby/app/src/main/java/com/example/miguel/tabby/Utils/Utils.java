package com.example.miguel.tabby.Utils;

import com.example.miguel.tabby.Models.Country;

import java.util.List;

public class Utils {

    public static void getAllCountries(List<Country> list){
        list.add(new Country("España","ES"));
        list.add(new Country("Argentina","AR"));
        list.add(new Country("Bolivia","BO"));
        list.add(new Country("Chile","CL"));
        list.add(new Country("Colombia","CO"));
        list.add(new Country("Ecuador","EC"));
        list.add(new Country("México","MX"));
        list.add(new Country("Perú","PE"));
        list.add(new Country("Uruguay","UY"));
        list.add(new Country("Venezuela","VE"));
    }

}
