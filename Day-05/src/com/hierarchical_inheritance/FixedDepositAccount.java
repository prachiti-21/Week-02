package com.hierarchical_inheritance;

public class FixedDepositAccount extends BankAccount {
    double deposit;
    double fixedDeposit;

    FixedDepositAccount(double deposit, double fixedDeposit) {
        super(deposit, fixedDeposit);
        this.deposit = deposit;
        this.fixedDeposit = fixedDeposit;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit account");
    }

    void setFixedDeposit() {
        fixedDeposit = deposit + fixedDeposit;
    }

    void displayInfo() {
        System.out.println("Fixed deposit is " + fixedDeposit);
    }
}
