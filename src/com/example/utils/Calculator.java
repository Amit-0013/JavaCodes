//Create a simple application with at least two packages:
//com.example.geometry and com.example.utils. In the geometry
//package, define classes like Circle and Rectangle. In the utils
//package, create a Calculator class that can compute areas of these
//shapes.
package com.example.utils;

import com.example.shape.Circle;
import com.example.shape.Rectangle;

public class Calculator {
    static void main() {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(5,4);
        double cirArea = Math.PI * Math.pow(c1.radius,2);
        double recArea = r1.length * r1.breadth;
        System.out.printf("Area of the circle is: %f \nArea of the rectangle is: %f",cirArea,recArea);
    }
}
