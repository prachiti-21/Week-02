package com.hierarchical_inheritance;


    public class CheckingAccount extends BankAccount{
        double withdrawlLimit;
        double balance;
        CheckingAccount(double withdrawlLimit, double balance){
            super(withdrawlLimit,balance);
            this.withdrawlLimit=withdrawlLimit;
            this.balance=balance;
        }
        void displayAccountType(){
            System.out.println("Checking account");
        }
        void displayInfo(){
            System.out.println("Withdrawal limit is "+withdrawlLimit);
        }
        void checkBalance(){
            if(balance>withdrawlLimit){
                System.out.println("The balance is: "+balance);
            }
            else{
                System.out.println("cannot withdraw");
            }
        }

    }

