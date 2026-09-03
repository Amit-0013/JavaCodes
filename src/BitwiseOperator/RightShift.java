//Create a program that shows use of right shift operator.
package BitwiseOperator;

import java.util.Scanner;

public class RightShift {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n1 = in.nextInt();
        System.out.print("Enter the number of position: ");
        int n2 = in.nextInt();
        System.out.println("The right shift operator results in : "+(n1>>n2));

    }
}
