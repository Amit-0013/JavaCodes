//Create a program to find the Least Common Multiple (LCM) of two
//numbers.
package Loops;

import java.util.Scanner;

public class Lcm {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        int max = n1 > n2? n1 : n2; // can use Math.max()
        int lcm = n1*n2;
        while(max <= n1*n2){
            if(max % n1 == 0 && max % n2 == 0){
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println("The LCM of two numbers is: "+lcm);

    }
}
