//Create a program to print the Fibonacci series up to a certain number.
package Loops;

import java.util.Scanner;

public class FibonacciNumber {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int i = 0;
        while(i <= num){
            int c = a + b;
            System.out.println(a);
            a = b;
            b = c;
            i++;
        }

    }
}
