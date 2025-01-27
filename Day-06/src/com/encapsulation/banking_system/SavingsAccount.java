package com.encapsulation.banking_system;

class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Annual interest rate as a percentage

    public SavingsAccount(String accountNumber, String holderName, double initialBalance, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan applied for " + loanAmount + ". Processing...");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 10; // Loan eligibility is 10 times the balance
    }
}

