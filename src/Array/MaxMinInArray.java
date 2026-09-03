//Create a program to find the maximum and minimum element in an
//array.
package Array;

public class MaxMinInArray {
    static void main() {
        int[] arr = ArrayUtility.inputArray();
        int max = Maximum(arr);
        int min = Minimum(arr);
        System.out.println("The maximum element in array is: "+max);
        System.out.println("The minimum element in array is: "+min);
    }
    public static int Maximum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int Minimum(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
