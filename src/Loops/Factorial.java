//Write a function that calculates the factorial of a given number.
package Loops;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int i = 1;
        int fact = 1;
        while(i <= num){
            fact *= i;
            i++;

        }
        System.out.println("The factorial of given number is: " + fact);

    }
}
