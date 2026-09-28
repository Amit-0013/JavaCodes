package com.example.abstractShapes;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    public void calculateArea(){
        double area = Math.PI * (Math.pow(radius,2));
        System.out.println("The area of the circle is: "+area);
    }
}
