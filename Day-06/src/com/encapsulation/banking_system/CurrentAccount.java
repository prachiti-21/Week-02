package com.encapsulation.banking_system;
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;
    private double interestRate; // Lower interest for Current accounts

    public CurrentAccount(String accountNumber, String holderName, double initialBalance, double overdraftLimit, double interestRate) {
        super(accountNumber, holderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            double newBalance = getBalance() - amount;
            super.deposit(-amount); // Deduct the amount
            System.out.println(amount + " withdrawn. New balance: " + getBalance());
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded.");
        }
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
        return getBalance() * 5; // Loan eligibility is 5 times the balance
    }
}
