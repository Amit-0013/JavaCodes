//Create a program to calculate Perimeter of a rectangle.
// Perimeter of rectangle ABCD = A+B+C+D
package basics;

import java.util.Scanner;

public class PerimeterOfRectangle {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int s1 = in.nextInt();
        System.out.print("Enter second side: ");
        int s2 = in.nextInt();
        System.out.print("Enter third side: ");
        int s3 = in.nextInt();
        System.out.print("Enter fourth side: ");
        int s4 = in.nextInt();
        System.out.println("The perimeter of rectangle is: "+(s1+s2+s3+s4));
    }
}
