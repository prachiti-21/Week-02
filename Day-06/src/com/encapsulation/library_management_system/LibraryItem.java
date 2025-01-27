package com.encapsulation.library_management_system;

abstract class LibraryItem {
    private int itemId;
    private String title,author;
    private String borrower_name;
    private int borrower_Id;
    LibraryItem(int itemId,String title,String author,String borrower_name,int borrower_Id){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
        this.borrower_name=borrower_name;
        this.borrower_Id=borrower_Id;
    }
    public int getItemId(){
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrower_name() {
        return borrower_name;
    }

    public int getBorrower_Id() {
        return borrower_Id;
    }
    public abstract String getLoanDuration();
    public void getItemDetails(){
        System.out.println("ItemId: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);

    }
}
/*interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
   private String loanduration;
    boolean isReserved;
    Book(int itemId,String title,String author,String borrower_name,int borrower_Id,String loanduration){
        super(itemId,title,author,borrower_name,borrower_Id);
        this.loanduration=loanduration;
    }
    public String getLoanDuration(){
        return loanduration;
    }

    public void reserveItem() {
        if (!isReserved) {
            this.isReserved = true;

            System.out.println("The item is reserved for " + getBorrower_name() + " with borrower Id: " + getBorrower_Id());
        }
        else{
            System.out.println("Book is already reserved");
        }
    }
    public boolean checkAvailability(){
        return !isReserved;
    }
    public void getItemDetails(){
        System.out.println("ItemId: "+getItemId());
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Loan duration: "+getLoanDuration());

    }

}
class Magazine extends LibraryItem implements Reservable{
    private String genre;
    private boolean isReserved;
    String loanduration;
    Magazine(int itemId,String title,String author,String borrower_name,int borrower_Id,String loanduration,String genre){
        super(itemId,title,author,borrower_name,borrower_Id);
        this.genre=genre;
        this.isReserved=false;
        this.loanduration=loanduration;
    }
    public String getGenre(){
        return genre;
    }
    public String getLoanDuration(){
        return loanduration;
    }
    public void reserveItem() {
        if (!isReserved) {
            this.isReserved = true;

            System.out.println("The item is reserved for " + getBorrower_name() + " with borrower Id: " + getBorrower_Id());
        }
        else{
            System.out.println("Magazine is already reserved");
        }
    }
    public boolean checkAvailability(){
        return !isReserved;
    }
    public void getItemDetails(){
        System.out.println("ItemId: "+getItemId());
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Genre: "+getGenre());
        System.out.println("Loan duration: "+getLoanDuration());

    }

}
class DVD extends LibraryItem implements Reservable {
    private String dvdtype;
    private String loanduration;
    boolean isReserved;

    DVD(int itemId, String title, String author, String borrower_name, int borrower_Id, String loanduration, String dvdtype) {
        super(itemId, title, author, borrower_name, borrower_Id);
        this.dvdtype = dvdtype;
        this.loanduration=loanduration;
    }

    public String getDvdtype() {
        return dvdtype;
    }

    public String getLoanDuration() {
        return loanduration;
    }

    public void reserveItem() {
        if (!isReserved) {
            this.isReserved = true;

            System.out.println("The item is reserved for " + getBorrower_name() + " with borrower Id: " + getBorrower_Id());
        } else {
            System.out.println("Magazine is already reserved");
        }
    }

    public boolean checkAvailability() {
        return !isReserved;
    }

    public void getItemDetails() {
        System.out.println("ItemId: " + getItemId());
        System.out.println("Title: " + getTitle());
        //System.out.println("Author: "+getAuthor());
        System.out.println("DVD Type: " + getDvdtype());
        System.out.println("Loan duration: " + getLoanDuration());

    }
}

    class LibraryManagement {
        public static void main(String[] args) {

            Book book = new Book(1, "Alchemist", "Paulo", "John", 100, "1 month");
            Magazine magazine = new Magazine(2, "Makeup", "Ms.Monroe", "Alina", 101, "1 week", "Beauty");
            DVD dvd = new DVD(3, "Harry Potter", "J.K Rowling", "Priya", 102, "3 days", "Movie");
            book.reserveItem();
            book.checkAvailability();
            book.getItemDetails();

            magazine.reserveItem();
            magazine.checkAvailability();
            magazine.getItemDetails();

            dvd.reserveItem();
            dvd.checkAvailability();
            dvd.getItemDetails();
        }
    }*/

