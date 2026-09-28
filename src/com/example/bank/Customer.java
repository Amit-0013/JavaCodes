package com.example.bank;

public class Customer {
    static void main() {
        BankAccount sbi = new BankAccount(101 , "Amit" , 500);
        sbi.deposit(500);
        sbi.withdraw(1500);
        sbi.deposit(-80);
        System.out.println(sbi.getBalance());
    }
}
