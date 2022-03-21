package com.groupProjects.project2;

/*
    Create an Interface 'Shape' with undefined methods
    as calculateArea and calculatePerimiter. Create 2
    classes Circle & Square that implements functionality
    defined in the Shape Interface. Test your code.
 */

public class Task1 {
    public static void main(String[] args) {

        Shape[] shapes={new Circle(5),new Square(5)};
        for (Shape a:shapes){
           a.calculateArea();
           a.calculatePerimiter();
        }
    }
}
interface Shape{

    void calculateArea();
    void calculatePerimiter();



}
class Circle implements Shape{
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle area "+Math.PI*Math.pow(r,2));
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Circle perimiter "+(2*Math.PI*r));
    }
}
class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {

        System.out.println("Square area "+(side*side));
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("Square perimiter "+(side*4));
    }
}
