//Create a program that determines if a number is positive, negative,
//or zero.
package ConditionalStatements;

import java.util.Scanner;

public class PositiveNegativeOrZero {
    static void main() {
       Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(num>0) {
            System.out.println("The number is positive");
        }else if(num < 0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The numbers is zero.");
        }

    }
}
