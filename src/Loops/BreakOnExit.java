//Create a program using break to read inputs from the user in a loop and break
//the loop if a specific keyword (like "exit") is entered.
package Loops;

import java.util.Scanner;

public class BreakOnExit {
    static void main() {
        Scanner in = new Scanner(System.in);
        String text;
        while(true){
            System.out.print("Please enter the word: ");
            text = in.next();
            if(text.equalsIgnoreCase("exit")){
                System.out.println("Successful exit done.");
                break;
            }
        }
    }
}
