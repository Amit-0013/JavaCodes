//Create a program that shows bitwise compliment of a number.
package BitwiseOperator;

import java.util.Scanner;

public class BitwiseCompliment {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("The compliment of the number is: "+(~num));

    }
}
