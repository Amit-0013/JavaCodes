//Create a program using recursion to display the Fibonacci series upto a certain
//number
package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number upto which series is to be printed: ");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println(fib(i)+" ");
        }
    }
    public static int fib(int num){
        if(num == 0 || num == 1){
            return num;
        }
        return fib(num-1)+fib(num-2);

    }
}
