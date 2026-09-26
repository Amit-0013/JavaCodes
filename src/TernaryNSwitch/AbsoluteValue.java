//Create a program to calculate the absolute value of a given
//integer.
package TernaryNSwitch;
import java.util.Scanner;

public class AbsoluteValue {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= in.nextInt();
        int result = num < 0 ? num * -1 : num;
        System.out.println("The absolute value is : "+result);


    }
}
