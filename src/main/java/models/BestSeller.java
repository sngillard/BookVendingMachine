package models;

public class BestSeller extends Book {
    public BestSeller(String bookTitle, String bookLocation, Double bookPrice) {
        super(bookTitle, bookLocation, bookPrice);
    }

    @Override
    public String printMessage() {
        return "If you don’t like to read, you haven’t found the right book.";
    }
}
