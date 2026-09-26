//Create a program using do-while to implement a number guessing game.
package Loops;

import java.util.Scanner;

public class NumberGuessing {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to number guessing game! ");
        int count = 0;
        int randomNumber = (int) (Math.random() * 101);
        int guessedNumber;
        do{
            System.out.print("Please Guess the number: ");
            guessedNumber = in.nextInt();
            if(guessedNumber < randomNumber){
                System.out.println("Guess a higher number.");
            }
            if(guessedNumber > randomNumber){
                System.out.println("Guess a lower number");
            }
            count++;
            if(guessedNumber == randomNumber){
                System.out.printf("Congratulations you have guessed the number in %d attempts",count);
            }
        }while(!(guessedNumber == randomNumber));
    }
}
