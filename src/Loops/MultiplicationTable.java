//Develop a program that prints the multiplication table for a given number.
package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of which table is to printed: ");
        int num = in.nextInt();
        int i = 1;
        while(i <= 10){
            System.out.printf("%d * %d = %d",num,i,(num*i));
            System.out.println();
            i++;
        }

    }
}
