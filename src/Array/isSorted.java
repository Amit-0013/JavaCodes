// Create a program to check if the given array is sorted.
package Array;

public class isSorted {
    static void main() {
        int[] arr = ArrayUtility.inputArray();
        boolean isInc = isSortInc(arr);
        boolean isDsc = isSortDsc(arr);
        if(isInc || isDsc){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isSortInc(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static boolean isSortDsc(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
