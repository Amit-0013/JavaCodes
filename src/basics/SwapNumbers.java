//Write a program to swap two numbers.
package basics;

import java.util.Scanner;

public class SwapNumbers {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        swap1(n1,n2);
        swap2(n1,n2);
    }
    public static void swap1(int a , int b){
        //Using temporary variable
        int c = a;
        a = b;
        b = c;
        System.out.println("First number is: "+a);
        System.out.println("Second number is: "+b);
    }
    public static void swap2(int a , int b){
        //without temporary variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("First number is: "+a);
        System.out.println("Second number is: "+b);
    }
}
