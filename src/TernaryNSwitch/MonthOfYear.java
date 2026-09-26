//Create a program to print the month of the year based on a
//number (1-12) input by the user.
package TernaryNSwitch;

import java.util.Scanner;

public class MonthOfYear {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int num = in.nextInt();
        String output = switch(num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 ->  "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";

        };
        System.out.println(output);
    }
}
