//Create a program to input name of the person and
//respond with ”Welcome NAME to Java”
package basics;
import java.util.Scanner;
public class UserInput {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the name: ");
        String name = in.nextLine();
        System.out.println("Welcome "+name +" to Java");
    }
}
