//Create a program using continue to print only even numbers using continue for
//odd numbers.
package Loops;

public class PrintEven {
    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        for(int num : arr){
            if(num % 2 != 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
