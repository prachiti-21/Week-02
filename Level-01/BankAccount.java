public class BankAccount {
    static String bankName;
    String accountHolderName;
    final double accountNumber=77382;
    static int totalaccount=0;
    BankAccount(String bankName,String accountHolderName,double accountNumber){
        this.bankName=bankName;
        this.accountHolderName=accountHolderName;
        totalaccount++;
        //this.accountHolderName=accountHolderName;

    }
    static void getTotalAccounts(int totalaccount){
        System.out.println("Total number of bank accounts is "+totalaccount);
    }
    void display(){
        System.out.println("Bank name: "+bankName);
        System.out.println("Account holder: "+accountHolderName);
        System.out.println("Account number: "+accountNumber);
    }
    public static void main(String args[]){
        BankAccount obj1= new BankAccount("Axis Bank","Prachiti",7362);
        BankAccount obj2= new BankAccount("SBI","kritika",7362);

        BankAccount.getTotalAccounts(totalaccount);
        if(obj1 instanceof BankAccount){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        obj1.display();
        obj2.display();
    }


}
