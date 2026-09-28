package com.example.employee;

public class Customer {
    static void main() {
        Employee e1 = new Employee("Amit" , 23 , 28000L);
        System.out.println(e1.displayEmployeeDetails());
        e1.setAge(21);
        System.out.println(e1.displayEmployeeDetails());
    }
}
