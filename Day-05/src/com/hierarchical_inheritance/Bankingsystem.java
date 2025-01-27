package com.hierarchical_inheritance;

public class Bankingsystem {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(13312,2000);
        SavingsAccount savingsAccount= new SavingsAccount(10,3000);
        CheckingAccount checkingAccount= new CheckingAccount(500,100);
        FixedDepositAccount fixedDepositAccount= new FixedDepositAccount(2000,30000);
        bankAccount.displayAccountType();
        bankAccount.displayInfo();
        savingsAccount.displayAccountType();
        savingsAccount.displayInfo();
        checkingAccount.displayAccountType();
        checkingAccount.displayInfo();
        checkingAccount.checkBalance();
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.setFixedDeposit();
        fixedDepositAccount.displayInfo();;
    }
}

