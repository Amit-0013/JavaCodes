//Create a program to find the minimum of two numbers.
package TernaryNSwitch;

import java.util.Scanner;

public class MinOfTwo {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        int Min = num1 < num2 ? num1 : num2;
        System.out.println("The minimum number is: "+Min);
    }
}
