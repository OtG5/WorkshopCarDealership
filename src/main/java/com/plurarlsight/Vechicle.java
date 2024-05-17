package com.plurarlsight;

public class Vechicle{
     private  int vin;
     private int year;
     private String make;
     private  String model;
     private int odometer;
     private String type;
     private double price;
     // questions
     // What would I use for the vechletype
     // would I use an array for the model
     // would I need to set it to a boolean
     // static method for t

     public Vechicle(int vin, int year, String make, String model, String type, double price, int odometer){
          this.vin = vin;
          this.year = year;
          this.make = make;
          this.model = model;
          this.type = type;
          this.price = price;
          this.odometer = odometer;

     }

     public int getVin() {
          return vin;
     }

     public void setVin(int vin) {
          this.vin = vin;
     }

     public int getYear() {
          return year;
     }

     public void setYear(int year) {
          this.year = year;
     }

     public String getMake() {
          return make;
     }

     public void setMake(String make) {
          this.make = make;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public int getOdometer() {
          return odometer;
     }

     public void setOdometer(int odometer) {
          this.odometer = odometer;
     }

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }
}
