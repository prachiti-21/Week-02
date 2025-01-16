import java.util.*;
public class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void DisplayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter title: ");
        String title=input.nextLine();
        System.out.println("Enter author: ");
        String author=input.nextLine();
        System.out.println("Enter price: ");
        double price=input.nextDouble();
        Book obj=new Book(title,author,price);
        obj.DisplayDetails();
    }
}
