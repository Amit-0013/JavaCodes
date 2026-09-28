package com.example.abstractShapes;

public class ShapeTest {
    static void main() {
        Circle cir = new Circle(5);
        Square sq = new Square(6);
        cir.calculateArea();
        sq.calculateArea();
    }
}
