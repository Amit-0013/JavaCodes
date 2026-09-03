//Create a program to return a new array deleting a specific element.
package Array;

import java.util.Scanner;

public class DeleteElement {
    static void main() {
        int[] arr = ArrayUtility.inputArray();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter element to delete: ");
        int element = in.nextInt();
        int[] newArr = delete(arr , element);
        ArrayUtility.displayArray(newArr);


    }
    public static int[] delete(int[] arr , int element){
        int occur = occ(arr , element);
        if(occur == 0 ){
            return arr;
        }
        int size = arr.length - 1;
        int[] newArr = new int[size];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != element){
                newArr[j] = arr[i];
            }
            j++;
        }
        return newArr;
    }
    public static int occ(int[] arr , int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
