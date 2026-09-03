//Create a program to find the Greatest Common Divisor (GCD) of two
//integers.
package Loops;

import java.util.Scanner;

public class GCD {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        int min = n1>n2? n2 : n1; //can use Math.min()
        int i = 1;
        int gcd = 1;
        while(i <= min){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
            i++;
        }
        System.out.println("The GCD of two numbers is: "+gcd);

    }
}
