package models;

public class Children extends Book{
    public Children(String bookTitle, String bookLocation, Double bookPrice) {
        super(bookTitle, bookLocation, bookPrice);
    }

    @Override
    public String printMessage() {
        return "The more that you read, the more things you will know. The more that you learn, the more places you’ll go.";
    }
}
