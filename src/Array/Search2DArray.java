//Create a program to search an element in a 2-D array.
package Array;

import java.util.Scanner;

public class Search2DArray {
    static void main() {
        int[][] arr = ArrayUtility.input2dArray();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter element to be searched: ");
        int element = in.nextInt();
        Search(arr , element);

    }
    public static void Search(int[][] arr , int element){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == element){
                    System.out.printf("Element found at row %d and column %d",(i+1),(j+1));
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
}
