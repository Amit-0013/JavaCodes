//Write a program to add two numbers
package basics;

import java.util.Scanner;

public class SumOfTwoNumbers {
    void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        System.out.println("The sum of two numbers is: "+(n1+n2));
    }
}
