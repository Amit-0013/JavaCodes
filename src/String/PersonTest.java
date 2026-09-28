package String;

public class PersonTest {
    static void main() {
        Person per1 = new Person("Amit" , 23);
        Person per2 = new Person("Amit" , 24);
        if(per1.equals(per2)){
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }
}
