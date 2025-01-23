import java.util.ArrayList;

public class Bank {
    double accountNo;
    String bankName;
    ArrayList<Double>accno=new ArrayList<>();
    Bank(String bankName ){
        this.accountNo=accountNo;
        this.bankName=bankName;
    }
    void openAccount(double accountNo){
        accno.add(accountNo);
        for(double a:accno){
            System.out.println("New account: "+accno);
        }
    }
    public static void main(String args[]){
        Bank bank= new Bank("Axis");
        Customer prachiti= new Customer("Prachiti",2000);
        Customer kritka= new Customer("Kritika",3000);
        bank.openAccount(43256);
        bank.openAccount(678787);
        bank.openAccount(4224);
        System.out.println("balance of "+prachiti.customerName+" "+ prachiti.customerBalance);
        System.out.println("balance of "+kritka.customerName+" "+ kritka.customerBalance);

    }
}
class Customer{
    String customerName;
    double customerBalance;
    Customer(String customerName, double customerBalance){
        this.customerName=customerName;
        this.customerBalance=customerBalance;
    }
    void viewBalance(){
        System.out.println(customerName+" balance: "+customerBalance);
    }
}
