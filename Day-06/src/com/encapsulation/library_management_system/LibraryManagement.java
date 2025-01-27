package com.encapsulation.library_management_system;

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
}
