package com.plurarlsight;

public class Vechicle{
     private  int vin;
     private int year;
     private String make;
     private  String model;

     private String car;
     private String truck;
     private  String van;
     private String suv;
     private String color;
     private int odometer;
     private double price;
     // questions
     // What would I use for the vechletype
     // would I use an array for the model
     // would I need to set it to a boolean
     // static method for t

     public Vechicle(int vin, int year, String make, String model, String car, String truck, String van, String suv){
          this.vin = vin;
          this.year = year;
          this.make = make;
          this.model = model
          this.car = car;
          //this.truck = truck;
         // this.van = van;
         // this.suv = suv;
     }

     public double getPrice() {
          return price;
     }
}
