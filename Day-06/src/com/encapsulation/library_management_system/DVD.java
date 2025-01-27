package com.encapsulation.library_management_system;

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

