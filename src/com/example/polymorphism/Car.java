//Define a base class Vehicle with a method service() and a
//subclass Car that overrides service(). In Car's service(),
//provide a specific implementation that calls super.service()
//as well, to show how overriding works.
package com.example.polymorphism;

public class Car extends Vehicle{
    @Override
    public void service() {
        super.service();
        System.out.println("This is first servicing of the car , so we will change the engine oil and basic servicing...");
    }

    static void main() {
        Car swift = new Car();
        swift.service();
    }
}
