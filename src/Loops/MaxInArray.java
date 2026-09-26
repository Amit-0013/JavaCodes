//Create a program using for-each to find the maximum value in an integer array.
package Loops;

public class MaxInArray {
    static void main() {
        int[] arr = {2,44,55,65,78,98,23,1};
        int max = arr[0];
        for(int i : arr){
            if(i > max) {
                max = i;
            }
        }
        System.out.println("The maximum number in array is: "+max);
    }
}
