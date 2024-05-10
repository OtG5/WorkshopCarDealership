package com.plurarlsight;

import java.util.ArrayList;

public class Dealership {
    private  String name;
    private  String address;
    private  String phone;

    private ArrayList<Vechicle> vechile;

    public  Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public ArrayList<Vechicle> getVechile() {
        return vechile;
    }

    public double getVechilesByPrice();
}
