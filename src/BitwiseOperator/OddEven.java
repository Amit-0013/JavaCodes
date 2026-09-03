//Write a program to check if a given number is even or odd using
//bitwise operators.
package BitwiseOperator;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int lastBit = num & 1;
        if(lastBit == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }
}
