//Create a program that shows bitwise XOR of two numbers.
package BitwiseOperator;

import java.util.Scanner;

public class BitwiseXOR {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        System.out.println("The Bitwise XOR operator results in : "+(n1^n2));

    }
}
