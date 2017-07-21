package com.example.model;

import java.util.ArrayList;


public class BeerExpert {
  public BeerExpert(){};

  public ArrayList<String> getBrands(String color){
    ArrayList<String> brands = new ArrayList<String>();
    if (color.equals("amber")){
      brands.add("Jack Amber");
      brands.add("Red Moose");
    }
    else {
      brands.add("Jail Pale ALe");
      brands.add("Gout Stout");
    }

    return (brands);
  }
}
