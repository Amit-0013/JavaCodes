//Create a program that takes two numbers and shows result of all
//arithmetic operators (+,-,*,/,%).
package basics;

import java.util.Scanner;

public class BasicCalculator {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        System.out.println("The sum of two numbers is : "+(n1+n2));
        System.out.println("The difference of two numbers is : "+(n1-n2));
        System.out.println("The product of two numbers is: "+(n1*n2) );
        System.out.println("The quotient of two numbers is: "+(n1/n2));
        System.out.println("The remainder of two numbers is: "+(n1%n2));

    }
}
