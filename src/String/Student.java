//Define a Student class with fields like name and age, and use
//toString to print student details.
package String;

public class Student {
    String name;
    int age;

   public Student(String name , int age){
       this.name = name;
       this.age = age;
   }
   public String toString(){
       return "Students detail: {name = "+ name +", age = "+age+ "}";
   }
    static void main() {
       Student s1 = new Student("Amit" , 23);
        System.out.println(s1);

    }
}
