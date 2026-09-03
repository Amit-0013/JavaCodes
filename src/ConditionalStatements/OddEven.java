//Create a program that determines if a number is odd or even.
package ConditionalStatements;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even.");
        }else{
            System.out.println("The number is odd.");
        }

    }
}
