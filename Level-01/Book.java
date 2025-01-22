public class Book {
    static String libraryName;
    String title,author;
    final int isbn;
    Book(String libraryName,String title,String author,int isbn){
        this.title= title;
        this.author= author;
        this.libraryName= libraryName;
        this.isbn=isbn;

    }
    static void displayLibraryName(){
        System.out.println("Library name is "+libraryName);

    }
    public static void main(String args[]){
        Book b= new Book("Books n Books","The monk","Robin Sharma",02);
        b.displayLibraryName();
        if(b  instanceof Book){
            System.out.println("b is an instance of Book");
        }
        else{
            System.out.println("b is not an instance of Book");

        }
       // Book b2= new Book("djas","dh","dgh",07);
        //b1.displayLibraryName();
        //b2.displayLibraryName();

    }

}
