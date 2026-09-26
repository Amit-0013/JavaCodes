//. Calculate the area and circumference of a circle for a given radius
//using Math.PI
package MathClass;

import java.util.Scanner;

public class AreaOfCircle {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        int radius = in.nextInt();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: "+area);
        System.out.println("The circumference of the circle is: "+circumference);
    }
}
