// Create a program to check whether a given number is prime.
package Loops;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int count = 0;
        int i = 2;
        while(i < num){
            if(num % i == 0){
                count++;
            }
            i++;
        }
        if(num == 1){
            System.out.println("Neither prime nor composite");
        }else if(count == 0){
            System.out.println("Prime number");
        }else{
            System.out.println("Composite number");
        }

    }
}
