package com.groupProjects.project2;
    /*
    Create a Class Car that would have the following
    fields:   carPrice   and   color   and   method
    calculateSalePrice() which should be returning a price
    of the car.
    Create 2 sub classes: Sedan and Truck. The Truck
    class   has   field   as   weight   and   has   its   own
    implementation   of   calculateSalePrice()   method   in
    which   returned   price   calculated   as   following:   if
    weight>2000 then returned price car should include
    10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it
    is   own   implementation   of   calculateSalePrice():   if
    length of sedan is >20 feet then returned car price
    should include 5% discount, otherwise 10% discount
     */

import java.sql.SQLOutput;

public class Task3 {

    public static void main(String[] args) {
        Sedan sedan=new Sedan(20000,25,"blue");
        Truck truck=new Truck(30000, 2500,"yellow");

        System.out.println(sedan.calculateSalePrice(sedan.carPrice, sedan.carLength)+" "+sedan.carColor);
        System.out.println(truck.calculateSalePrice(truck.carPrice,truck.carWeight)+" "+truck.carColor);

    }
}
class Car{
    double carPrice;
    String carColor;

    public Car(double carPrice, String carColor) {
        this.carPrice = carPrice;
        this.carColor=carColor;

    }

     double calculateSalePrice(double carPrice) {
        return carPrice;
    }
}
class Sedan extends Car{
    double carLength;

    public Sedan(double carPrice, double carLength, String carColor) {
        super(carPrice,carColor);
        this.carLength=carLength;
    }


    double calculateSalePrice(double carPrice,double carLength) {
        if(carLength>20){
            carPrice=carPrice-(carPrice*.05);
        }else{
            carPrice=carPrice-(carPrice*.1);
        }
        return super.calculateSalePrice(carPrice);
    }
}
class Truck extends Car{
    double carWeight;

    public Truck(double carPrice,double carWeight,String carColor) {
        super(carPrice, carColor);
        this.carWeight=carWeight;
    }


    double calculateSalePrice(double carPrice,double carWeight) {
        if(carWeight>2000){
            carPrice=carPrice-(carPrice*.1);
        }else{
            carPrice=carPrice-(carPrice*.2);
        }
        return super.calculateSalePrice(carPrice);
    }
}
