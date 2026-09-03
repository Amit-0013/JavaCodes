//Create a program to calculate simple interest.
// Simple Interest = (P x T x R)/100
 package basics;

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int principle = in.nextInt();
        System.out.print("Enter the Rate: ");
        int rate = in.nextInt();
        System.out.print("Enter the Time in years: ");
        int time = in.nextInt();
        double SI = (principle*time*rate)/100;
        System.out.println("The simple interest is: "+SI);
    }
}
