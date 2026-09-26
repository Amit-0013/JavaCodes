//Create a program using continue to sum all positive numbers entered by the
//user; skip any negative numbers.
package Loops;

public class SumOFPositiveNumber {
    static void main() {
        int sum = 0;
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,-12,-13,-14};
        for(int num : arr){
            if(num < 0){
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive numbers is: "+sum);

    }
}
