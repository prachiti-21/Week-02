import java.util.ArrayList;

// Book class
class Book2 {
    private String title;
    private String author;

    // Constructor
    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class
class Library {
    private String name;
    private ArrayList<Book2> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book2 book) {
        books.add(book);
    }

    // Display library details
    public void displayLibrary() {
        System.out.println("Library: " + name);
        System.out.println("Books in the library:");
        for (Book2 book : books) {
            book.displayDetails();
        }
    }
}

// Main class
public class LibraryAggregationDemo {
    public static void main(String[] args) {
        // Create books
        Book2 book1 = new Book2("The Great Gatsby", "F. Scott Fitzgerald");
        Book2 book2 = new Book2("1984", "George Orwell");
        Book2 book3 = new Book2("To Kill a Mockingbird", "Harper Lee");

        // Create libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2); // Same book can be in multiple libraries
        library2.addBook(book3);

        // Display library details
        library1.displayLibrary();
        System.out.println();
        library2.displayLibrary();
    }
}
