//In a class Calculator, create multiple add() methods that
//overload each other and can sum two integers, three
//integers, or two doubles. Demonstrate how each can be
//called with different numbers of parameters.
package com.example.polymorphism;

public class Calculator {
    public int add(int a , int b){
        return a+b;
    }
    public int add(int a , int b , int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }

    static void main() {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(4,5));
        System.out.println(c1.add(4,5,1));
        System.out.println(c1.add(4.5,4.5));
    }
}
