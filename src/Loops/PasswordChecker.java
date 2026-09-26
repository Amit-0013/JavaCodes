//Create a program using do-while to find password checker until a valid
//password is entered.
package Loops;

import java.util.Scanner;

public class PasswordChecker {
    static void main() {
        Scanner in = new Scanner(System.in);
        String password;
        System.out.println("Welcome to password Checker! ");
        do{
            System.out.print("Please enter a valid password: ");
            password = in.next();

        }while(!isValidPassword(password));
        System.out.println("Thanks for entering the correct password");

    }
    public static boolean isValidPassword(String password){
        return password.length()>6 &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#&*?$]");
    }
}
