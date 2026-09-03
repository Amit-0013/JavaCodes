//Create a program that determines the greatest of the three
//numbers.
package ConditionalStatements;

import java.util.Scanner;

public class GreatestOfThree {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        System.out.print("Enter third number: ");
        int n3 = in.nextInt();
        Greatest1(n1,n2,n3);
        Greatest2(n1,n2,n3);

    }
    public static void Greatest1(int n1 , int n2 , int n3){
        //Using nested if else statement
        if (n1>n2){
            if(n1>n3){
                System.out.println("The greatest number is: "+n1);
            }else{
                System.out.println("The greatest number is: "+n3 );
            }
        }
        else if(n2 > n1){
            if(n2>n3){
                System.out.println("The greatest number is: "+n2);
            }else{
                System.out.println("The greatest number is: "+n3);
            }
        }
    }
    public static void Greatest2(int n1 , int n2 , int n3){
        //Using Logical operators
        if(n1>n2 && n1>n3){
            System.out.println("The greatest number is: "+n1);
        }else if(n2>n1 && n2>n3){
            System.out.println("The greatest number is: "+n2);
        }else{
            System.out.println("The greatest number is: "+n3);
        }
    }

}
