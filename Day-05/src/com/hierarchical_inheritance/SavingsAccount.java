package com.hierarchical_inheritance;


    public class SavingsAccount extends BankAccount{
        double interestRate;
        double saving;
        SavingsAccount(double interestRate,double saving){
            super(interestRate,saving);
            this.interestRate=interestRate;
            this.saving=saving;
        }
        void displayAccountType(){
            System.out.println("Savings account");
        }
        void displayInfo(){
            saving = saving+(interestRate/100)*saving;
            System.out.println("Interest rate: "+interestRate);
            System.out.println("Saving in the bank: "+saving);
        }

    }

