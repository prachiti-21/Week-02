package com.encapsulation.library_management_system;

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
