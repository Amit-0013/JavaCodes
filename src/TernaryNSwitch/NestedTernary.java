//Create a program to Based on a student's score, categorize as
//"High", "Moderate", or "Low" using the ternary operator (e.g.,
//High for scores > 80, Moderate for 50-80, Low for < 50).
package TernaryNSwitch;
import java.util.Scanner;

public class NestedTernary {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the marks of the student: ");
        int marks = in.nextInt();
        String category = marks > 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
        System.out.println("The category is : "+category);
    }
}
