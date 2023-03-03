package models;

public class Nonfiction extends Book{
    public Nonfiction(String bookTitle, String bookLocation, Double bookPrice) {
        super(bookTitle, bookLocation, bookPrice);
    }

    @Override
    public String printMessage() {
        return "Nonfiction speaks to the head. Fiction speaks to the heart.";
    }
}
