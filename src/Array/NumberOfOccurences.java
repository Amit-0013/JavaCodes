//Create a program to find number of occurrences of an element in an
//array
package Array;

import java.util.Scanner;

public class NumberOfOccurences {
    static void main() {
        Scanner in = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter target to be searched: ");
        int target = in.nextInt();
        int count = occur(arr,target);
        System.out.printf("The number of times %d occurs is: %d",target,count);
    }
    public static int occur(int[] arr , int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
