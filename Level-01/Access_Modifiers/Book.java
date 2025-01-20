// Book Class
class Book {
    public String ISBN;       // Public attribute
    protected String title;   // Protected attribute
    private String author;    // Private attribute

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }
}

// EBook Class (Subclass of Book)
class EBook extends Book {
    private double fileSize; // EBook-specific attribute

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display Book and EBook details
    public void displayBookInfo() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor()); // Accessing private 'author' via public getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class with main method
public class Main {
    public static void main(String[] args) {
        // Creating an instance of EBook
        EBook eBook = new EBook("978-3-16-148410-0", "The Great Adventure", "John Smith", 2.5);

        // Display eBook information
        eBook.displayBookInfo();

        // Modify and display updated author name
        eBook.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + eBook.getAuthor());
    }
}
