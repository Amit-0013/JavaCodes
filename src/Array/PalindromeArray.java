//Create a program to check is the array is palindrome or not.
package Array;

public class PalindromeArray {
    static void main() {
        int[] arr = ArrayUtility.inputArray();
        boolean isPalin = Palindrome(arr);
        if(isPalin){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    public static boolean Palindrome(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i] != arr[arr.length - 1 - i]){
                return false;
            }

        }
        return true;
    }
}
