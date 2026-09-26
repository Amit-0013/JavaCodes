//Create a program to create a simple calculator that uses a
//switch statement to perform basic arithmetic operations
//like addition, subtraction, multiplication, and division
package TernaryNSwitch;

import java.util.Scanner;

public class SimpleCalculator {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter second number: ");
        int num2 = in.nextInt();
        System.out.printf("Please select on of the following-: \n 1 for Addition\n 2 for Substraction\n 3 for Multiplication\n 4 for Division.\n Your input: ");
        int op = in.nextInt();
        int output = switch(op){
          case 1 -> num1+num2;
          case 2 -> num1-num2;
          case 3 -> num1*num2;
          case 4 -> num1/num2;
          default -> 0;

        };
        System.out.println("The result is: "+output);
    }
}
