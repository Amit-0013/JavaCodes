//Create a program to convert Fahrenheit to Celsius
// °C = (°F - 32) × 5/9
package basics;

import java.util.Scanner;

public class TemperatureConverter {
    static void main() {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahren = in.nextDouble();
        double celsius = (fahren - 32)*((double) 5 /9);
        System.out.println("The temperature in Celsius is: "+celsius);



    }
}
