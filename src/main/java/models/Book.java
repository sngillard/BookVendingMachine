package models;

import java.math.BigDecimal;

public abstract class Book {
    //instance variables
    private String bookTitle;
    private String bookLocation;
    private BigDecimal bookPrice;
    private int inventoryCount;

    //constructor
    public Book(String bookTitle, String bookLocation, Double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookLocation = bookLocation;
        this.bookPrice = new BigDecimal(String.valueOf(bookPrice));
    }

    //getters

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookLocation() {
        return bookLocation;
    }

    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    //method
    @Override
    public String toString() {
        String bookTitleFormatted = String.format("%-15s", bookTitle);
        return bookLocation + " | " + bookTitleFormatted + " | " + " | $" + bookPrice + " | " + inventoryCount;
    }

    //abstract method (public by default)
    public String printMessage(){
        return"";
    }

    public void decrementInventoryCount(){
        this.inventoryCount = inventoryCount -1;
        if(inventoryCount < 0) {
            inventoryCount = 0;
        }
    }
}
