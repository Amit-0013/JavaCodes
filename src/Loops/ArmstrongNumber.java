//Create a program to check if a number is an Armstrong number.
package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int copyNum = num;
        int digits = digits(num);
        long sum = 0;
        while(num > 0){
            int ld = num % 10;
            long pow = power(ld,digits);
            sum += pow;
            num /= 10;
        }
        if(copyNum == sum){
            System.out.println("Armstrong");
        } else{
            System.out.println("Not Armstrong");
        }



    }
    public static int digits(int num){
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
    public static long power(int base ,  int exp){
        int i = 1;
        long result = 1;
        while(i <= exp){
            result *= base;
            i++;
        }
        return result;
    }
}
