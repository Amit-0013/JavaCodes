//Simulate a dice roll using Math.random() and display the outcome
//(1 to 6).
package MathClass;

public class LudoDice {
    static void main() {
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println(dice);
    }
}
