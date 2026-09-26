//Create a program to find if the given number is even or odd.
package TernaryNSwitch;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("The number is : "+result);

    }
}
