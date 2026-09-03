//Create a program to verify if a number is a palindrome.
package Loops;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int copyNum = num;
        int rev = 0;
        while(num > 0){
            rev = rev*10 + (num%10);
            num /= 10;
        }
        if(copyNum == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }
}
