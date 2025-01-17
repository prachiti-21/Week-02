import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void Deposit(double amount_deposit){
        balance=balance+amount_deposit;

    }
    public void Withdraw(double amount_withdraw){
        balance=balance-amount_withdraw;
    }
    public void displayCurrentBalance(){
        System.out.println("Current Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account holder: ");
        String accountHolder = input.nextLine();
        System.out.println("Enter account number: ");
        String accountNumber = input.nextLine();
        System.out.println("Enter balance: ");
        double balance = input.nextDouble();
        BankAccount obj = new BankAccount(accountHolder, accountNumber, balance);
        System.out.println("Enter amount to deposit: ");
        double amount_deposit = input.nextDouble();
        obj.Deposit(amount_deposit);
        obj.displayCurrentBalance();
        System.out.println("Enter amount to withdraw: ");
        double amount_withdraw = input.nextDouble();
        obj.Withdraw(amount_withdraw);
        obj.displayCurrentBalance();
      }

    }

