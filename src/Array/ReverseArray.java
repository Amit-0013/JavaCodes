//Create a program to reverse an array.
package Array;

public class ReverseArray {
    static void main() {
        int[] arr = ArrayUtility.inputArray();
        RevArray(arr);
        ArrayUtility.displayArray(arr);
    }
    public static int[] RevArray(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        return arr;
    }
}
