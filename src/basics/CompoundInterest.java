//Create a program to calculate Compound interest.
//Compound Interest = P(1 + R/100)t
package basics;

import java.util.Scanner;

public class CompoundInterest {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        int principle = in.nextInt();
        System.out.print("Enter the Rate: ");
        int rate = in.nextInt();
        System.out.print("Enter the Time in years: ");
        int time = in.nextInt();
        double CI= principle*(1 + (double) rate /100)*time;
        System.out.println("The compound interest is: "+CI);

    }
}
