package com.example.abstractShapes;

public class Square extends Shape{
    private int side;
    public Square(int side) {
        this.side = side;
    }
    public void calculateArea(){
        int area = side * side;
        System.out.println("The area of the square is: "+area);

    }
}
