package com.example.miguel.tabby.Utils;

import com.example.miguel.tabby.Models.Country;

import java.util.List;

public class Utils {

    public static String setCode(int position){
        switch (position){
            case 0:
                return "ES";
            case 1:
                return "AR";
            case 2:
                return "BO";
            case 3:
                return "CL";
            case 4:
                return "CO";
            case 5:
                return "EC";
            case 6:
                return "MX";
            case 7:
                return "PE";
            case 8:
                return "UY";
            case 9:
                return "VE";
            default:
                return null;
        }
    }

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
