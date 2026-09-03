// Create a program to do sum and average of all elements in a 2-D array.
package Array;

public class SumAndAverage2D {
    static void main() {
        int[][] arr = ArrayUtility.input2dArray();
        int sum = Sum(arr);
        double avg = Average(arr);
        System.out.println("The sum of the array is: "+sum);
        System.out.println("The average of the array is: "+avg);
    }
    public static int Sum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static double Average(int[][] arr){
        int element = arr.length * arr[0].length;
        int sum = Sum(arr);
        double avg = (double) sum /element;
        return avg;
    }
}
