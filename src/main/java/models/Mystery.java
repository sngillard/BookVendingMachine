package models;

public class Mystery extends Book{
    public Mystery(String bookTitle, String bookLocation, Double bookPrice) {
        super(bookTitle,  bookLocation, bookPrice);
    }

    @Override
    public String printMessage() {
        return "Nobody reads a mystery to get to the middle. They read it to get to the end.";
    }
}
