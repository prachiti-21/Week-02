
// BankAccount Class
class BankAccount2 {
   public int accountNumber;    // Public attribute
   protected String accountHolder;  // Protected attribute
   private double balance;      // Private attribute

   // Constructor
   public BankAccount2(int accountNumber, String accountHolder, double balance) {
       this.accountNumber = accountNumber;
       this.accountHolder = accountHolder;
       this.balance = balance;
   }

   // Public method to access the balance
   public double getBalance() {
       return balance;
   }

   // Public method to modify the balance
   public void setBalance(double balance) {
       if (balance >= 0) {
           this.balance = balance;
       } else {
           System.out.println("Balance cannot be negative!");
       }
   }
}

// SavingsAccount Class (Subclass of BankAccount)
class SavingsAccount extends BankAccount2 {
   private double interestRate;

   // Constructor
   public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
       super(accountNumber, accountHolder, balance);
       this.interestRate = interestRate;
   }

   // Method to demonstrate access to accountNumber and accountHolder
   public void displayAccountInfo() {
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Account Holder: " + accountHolder);
       System.out.println("Balance: " + getBalance());
   }
}

// Main class with main method
public class Main {
   public static void main(String[] args) {
       // Creating an instance of SavingsAccount
       SavingsAccount savingsAccount = new SavingsAccount(12345, "John Doe", 1000.0, 0.05);

       // Display account information
       savingsAccount.displayAccountInfo();

       // Modify and display updated balance
       savingsAccount.setBalance(1500.0);
       System.out.println("Updated Balance: " + savingsAccount.getBalance());
   }
}


