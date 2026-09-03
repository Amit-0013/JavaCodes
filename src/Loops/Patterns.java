package Loops;

import java.util.Scanner;

public class Patterns {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        Pattern1(num);
        System.out.println("Pattern 2");
        Pattern2(num);
        System.out.println("Pattern 3");
        Pattern3(num);


    }
    public static void Pattern1(int num){
        for(int i = 0; i < num ; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    public static void Pattern2(int num){
        for(int i = 0; i < num ; i++){
            for (int j = 0; j <  num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern3(int num){
        for(int i = 0; i < num ; i++){
            for (int j = 0; j <  num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    }
