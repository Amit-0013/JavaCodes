//Define a BankAccount class with private attributes like
//accountNumber, accountHolderName, and balance. Provide
//public methods to deposit and withdraw money, ensuring that
//these methods don't allow illegal operations like withdrawing
//more money than the current balance.
package com.example.bank;

public class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber , String accountHolderName , double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(int amount){
        if(amount < 0){
            System.out.println("Invalid deposit amount.");
        }
        else {
            this.balance += amount;
            System.out.println("Deposit successful!");
        }
    }
    public void withdraw(int amount){
        if(amount < 0){
            System.out.println("Please enter a valid amount for withdrawal!");
        } else if(amount > this.balance){
            System.out.println("Insufficient balance!");
        } else {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
