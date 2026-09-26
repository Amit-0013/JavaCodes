//Concatenate and Convert: Take two strings, concatenate them,
//and convert the result to uppercase.
package String;

public class Concat {
    static void main() {
        String s1 = "Java";
        String s2 = "is great";
        String s3 = s1.concat(" ").concat(s2);
        System.out.println(s3.toUpperCase());
    }
}
