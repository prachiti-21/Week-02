package com.single_inheritance;

public class Bookk {
    String title;
    String publicationYear;
    Bookk(String title,String publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void displayInfo(){
        System.out.println("Title of the book: "+title);
        System.out.println("Publication year: "+publicationYear);
    }
}
class Author extends Bookk{
    String name,bio;
    Author(String title,String publicationYear,String name,String bio){
        super(name,bio);
        this.name=name;
        this.bio=bio;
    }
    @Override
    void displayInfo(){
        System.out.println("Title of the book: "+title);
        System.out.println("Publication year: "+publicationYear);
        System.out.println("Name of author: "+name);
        System.out.println("Bio of author: "+bio);
    }

    public static void main(String[] args) {
        //single_inheritance.Bookk book =new single_inheritance.Bookk("The alchemist","1999");
        Author author= new Author("the alchemist","1999","Paulo","world famous");
        //book.displayInfo();
        author.displayInfo();
    }
}
