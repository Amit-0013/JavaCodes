//Create a program to reverse the digits of a number
package Loops;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int rev = 0;
        while(num > 0){
            rev = rev*10 + (num%10);
            num /= 10;
        }
        System.out.println("The reverse of the number is: "+rev);

    }
}
