package Array;

import java.util.Scanner;



public class ArrayUtility {
    public static void main() {
        int[][] arr = input2dArray();
        display2dArray(arr);

    }
    public static int[] inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.printf("Enter element number %d: ",i+1);
            arr[i] = in.nextInt();
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("The element number %d: is: %d\n ",i+1,arr[i]);
        }
    }
    public static int[][] input2dArray(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter element for row %d and column %d : ",(i+1),(j+1));
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
    public static void display2dArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Row %d and column %d : %d\n",(i+1),(j+1),arr[i][j]);
            }
        }
    }
}
