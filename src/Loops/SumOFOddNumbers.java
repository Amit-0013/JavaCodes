//Create a program to sum all odd numbers from 1 to a specified number N.
package Loops;

import java.util.Scanner;

public class SumOFOddNumbers {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=num){
            if(i % 2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of odd number upto N is: "+sum);

    }
}
