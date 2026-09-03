//Create a program to merge two sorted arrays.
package Array;

public class MergeArrays {
    static void main() {
        System.out.println("Please enter only sorted array: ");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] sortedArr = sort(arr1 , arr2);
        ArrayUtility.displayArray(sortedArr);
    }
    public static int[] sort(int[] arr1 , int[] arr2){
        int newSize = arr1.length + arr2.length;
        int i = 0 , j = 0 , k = 0;
        int[] newArr = new int[newSize];
        while(i < arr1.length || j < arr2.length ){
            if(j == arr2.length ||(i< arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            } else {
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
}
