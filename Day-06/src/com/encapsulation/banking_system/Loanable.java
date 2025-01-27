package com.encapsulation.banking_system;

interface Loanable {
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}