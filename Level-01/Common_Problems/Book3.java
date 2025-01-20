import java.util.Scanner;

public class Book3 {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize a Book object
    public Book3(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow a book
    public String borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as not available
            return "You have successfully borrowed the book: " + title;
        } else {
            return "Sorry, the book \"" + title + "\" is currently unavailable.";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a book object
        Book3 b = new Book3("The Alchemist", "Paulo", 200, true);

        // Display book details
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: $" + b.getPrice());
        System.out.println("Available: " + (b.isAvailable() ? "Yes" : "No"));

        // Borrowing the book
        System.out.println(b.borrowBook());
        System.out.println("Available after borrowing: " + (b.isAvailable() ? "Yes" : "No"));

        // Trying to borrow the book again
        System.out.println(b.borrowBook());
    }
}
