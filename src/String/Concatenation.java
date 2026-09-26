//Take an array of words and concatenate them into a single string
//using StringBuilder.
package String;

public class Concatenation {
    static void main() {
        String[] str = new String[]{"java" , "is" , "best" , "language."};
        StringBuilder sb = new StringBuilder();
        for(String st : str){
            sb.append(st).append(" ");
        }
        System.out.println(sb);
    }
}
