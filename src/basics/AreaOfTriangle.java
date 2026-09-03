//.Create a program to calculate the Area of a Triangle.
// Area of triangle = ½*B*H
package basics;

import java.util.Scanner;

public class AreaOfTriangle {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        int base = in.nextInt();
        System.out.print("Enter height of the triangle: ");
        int height = in.nextInt();
        double area = 0.5 * base * height;
        System.out.println("The area of Triangle is: "+area);
    }
}
