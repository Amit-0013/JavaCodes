//Create a program to find the sum and average of all elements in an
//array.
package Array;

public class SumAndAverage {
    static void main() {
        int[] arr = ArrayUtility.inputArray();
        System.out.println("The sum of the array is: "+sum(arr));
        System.out.println("The average of the array is: "+average(arr));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static double average(int[]  arr){
        int sum = sum(arr);
        int length = arr.length;
        double avg = sum/length;
        return avg;
    }
}
