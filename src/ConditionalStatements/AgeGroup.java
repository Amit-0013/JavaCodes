//Create a program that categorize a person into different age groups
//Child -> below 13 Teen -> below 20
//Adult -> below 60 Senior-> above 60
package ConditionalStatements;

import java.util.Scanner;

public class AgeGroup {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the age: ");
        int age = in.nextInt();
        if(age<13){
            System.out.println("Child");
        }else if(age < 20){
            System.out.println("Teen");
        }else if(age<60){
            System.out.println("Adult");
        }else{
            System.out.println("Senior citizen");
        }

    }
}
