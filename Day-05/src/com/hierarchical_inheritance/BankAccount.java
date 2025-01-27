package com.hierarchical_inheritance;

public class BankAccount {
    double accountNumber;
    double balance;

    BankAccount(double accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    void displayInfo() {
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account balance: " + balance);

    }
    void displayAccountType(){
        System.out.println("Bank");
    }

}
