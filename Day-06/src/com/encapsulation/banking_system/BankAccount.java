package com.encapsulation.banking_system;



abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public abstract double calculateInterest();
}

// Interface for loan functionality
/*interface Loanable {
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}

// SavingsAccount subclass
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

// CurrentAccount subclass
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

// Main class to demonstrate functionality
public class BankingSystem {
    public static void main(String[] args) {
        // Create Savings Account
        BankAccount savings = new SavingsAccount("SA123", "Alice", 5000, 4);
        savings.deposit(2000);
        savings.withdraw(3000);
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        ((Loanable) savings).applyForLoan(10000);
        System.out.println("Loan Eligibility: " + ((Loanable) savings).calculateLoanEligibility());

        // Create Current Account
        BankAccount current = new CurrentAccount("CA456", "Bob", 10000, 5000, 2);
        current.deposit(5000);
        current.withdraw(15000);
        System.out.println("Current Account Interest: " + current.calculateInterest());
        ((Loanable) current).applyForLoan(20000);
        System.out.println("Loan Eligibility: " + ((Loanable) current).calculateLoanEligibility());

        // Demonstrating Polymorphism
        System.out.println("\n--- Dynamic Interest Calculation ---");
        BankAccount[] accounts = {savings, current};
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Interest Earned: " + account.calculateInterest());
        }
    }
}*/

