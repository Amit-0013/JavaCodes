//Arithmetic Exception Handling
//Write a program that asks the user to enter two integers and
//then divides the first by the second. The program should
//handle any arithmetic exceptions that may occur (like
//division by zero) and display an appropriate message.
//Key Points:
//• Use Scanner to read user input.
//• Implement a try-catch block to handle ArithmeticException.
//• Display a user-friendly message if division by zero occurs.
package exceptionNfileHandling;

import java.util.Scanner;

public class ArithmeticException {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Please enter second number: ");
        int n2 = in.nextInt();
        try{
            int result = n1/n2;
            System.out.println("The result is: "+result);
        } catch (java.lang.ArithmeticException e){
            System.out.println("An arithmetic exception occurred: "+e.getMessage());
        } catch(Exception e){
            System.out.println("An general exception: "+e.getMessage());
        }
    }
}
