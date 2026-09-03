//Create a program that computes the sum of the digits of an integer
package Loops;

import java.util.Scanner;

public class SumOfDigits {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10);
            num /= 10;
        }
        System.out.println("The sum of the digits of the number is: "+sum);

    }
}
