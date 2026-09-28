//Define a class Employee with private attributes (like name, age,
//and salary), public methods to get and set these attributes, and a
//package-private method to displayEmployeeDetails. Create
//another class in the same package to test access to the
//displayEmployeeDetails method.
package com.example.employee;

public class Employee {
    private String name;
    private int age;
    private long salary;

    public Employee(String name , int age , Long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public long getSalary(){
        return salary;
    }

    public void setSalary(long salary){
        this.salary = salary;
    }

    String displayEmployeeDetails(){
        return "Employee Details: {Employee name = "+ name+",Employee age = "+age+",Employee salary = "+salary+"}";

    }
}
