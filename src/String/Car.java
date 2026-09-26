//Create an object with final fields and a constructor to initialize
//them.
package String;

public class Car {
    final String color;
    final String model;
    final int noOfWeheels;

    public Car(String color, String model, int noOfWeheels) {
        this.color = color;
        this.model = model;
        this.noOfWeheels = noOfWeheels;
    }

    static void main() {
        Car swift = new Car("Black" , "S11" , 4);
        System.out.println(swift);

    }
}
