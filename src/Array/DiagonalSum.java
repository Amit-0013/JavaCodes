// Create a program to find the sum of two diagonal elements
package Array;

public class DiagonalSum {
    static void main() {
        int[][] arr = ArrayUtility.input2dArray();
        long leftSum = LeftDiagonalSum(arr);
        long rightSum = RightDiagonalSum(arr);
        long sum = leftSum + rightSum;
        if(arr.length % 2 != 0){
            int ind = arr.length/2;
            sum -= arr[ind][ind];
        }
        System.out.println("The sum of diagonal elements is: "+sum);
    }
    public static long LeftDiagonalSum(int[][] arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static long RightDiagonalSum(int[][] arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i+j == arr.length -1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

}
