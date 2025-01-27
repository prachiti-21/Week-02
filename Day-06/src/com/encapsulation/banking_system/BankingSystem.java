package com.encapsulation.banking_system;

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
}
