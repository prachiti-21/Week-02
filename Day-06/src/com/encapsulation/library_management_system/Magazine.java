package com.encapsulation.library_management_system;

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