import java.util.*;
public class PalindromeChecker {
    private String text;
    PalindromeChecker(String text) {
        this.text = text;
    }
    public boolean isPalindrome(String text) {
        String rev="";
        for(int i=text.length()-1;i>=0;i--){
            rev+=text.charAt(i);
        }
        return rev.equals(text);
    }
    public void display(){
        if(isPalindrome(text)==true){
            System.out.println("Text is a Palindrome");
        }
        else{
            System.out.println("Text is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter text: ");
        String text=input.nextLine();
        PalindromeChecker p=new PalindromeChecker(text);
        p.display();
    }
}
