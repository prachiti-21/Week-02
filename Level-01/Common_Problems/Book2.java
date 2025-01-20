public class Book2 {
    String title;
    String author;
    int price;
    Book2(){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book2(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        Book2 book = new Book2("Book 1", "Author 1", 500);
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.price);
    }
}
