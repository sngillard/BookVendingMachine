package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private File booksFromTextFile = new File("books.txt");

    //method that return a list of book titles
    public List<Book> readTextFile() {
        List<Book> vendingMachineBooks = new ArrayList<>();
        try {
            Scanner textScanner = new Scanner(booksFromTextFile);
        while (textScanner.hasNextLine()) {
            String line = textScanner.nextLine();
            String[] words = line.split(",");
            String bookLocation = words[0];
            String bookTitle = words[1]; //Index 1 out of bounds for length 1 message here, but the array should have index 0-3...
            Double bookPrice = Double.parseDouble(words[2]);
            String bookType = words[3];

            if(bookType.equalsIgnoreCase("BestSeller")) {
                vendingMachineBooks.add(new BestSeller(bookTitle, bookLocation, bookPrice));
            } else if (bookType.equalsIgnoreCase("Children")) {
                vendingMachineBooks.add(new Children(bookTitle, bookLocation, bookPrice));
            } else if (bookType.equalsIgnoreCase("Mystery")) {
                vendingMachineBooks.add(new Mystery(bookTitle, bookLocation, bookPrice));
            } else if (bookType.equalsIgnoreCase("Nonfiction")) {
                vendingMachineBooks.add(new Nonfiction(bookTitle, bookLocation, bookPrice));
            }
                }
            } catch(FileNotFoundException e) {
        throw new RuntimeException(e);
        } return vendingMachineBooks;
    }
}
