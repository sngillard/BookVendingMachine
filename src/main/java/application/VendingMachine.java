package application;

import models.Book;
import models.FileReader;
import ui.UserInput;
import ui.UserOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    private FileReader fileReader = new FileReader();
    List<Book> books = new ArrayList<>();

    public void run() {
        books = fileReader.readTextFile();
        Inventory vendingBookMap = new Inventory(books);
        MoneyHandler money = new MoneyHandler();
        UserOutput userOutput = new UserOutput();
        UserInput userInput = new UserInput();
        BookMenu purchase = new BookMenu(money);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            if(choice.equals("Browse Book Collection")) {
                displayBookTitles(books);
            } else if(choice.equals("Purchase")) {
                purchase.displayBookMenu();
            } else if(choice.equals("exit")) {
                System.out.println("Happy reading!");
                break;
            }
        }

    }

    public void displayBookTitles(List<Book>books) {
        for(Book eachBook: books) {
            System.out.println(eachBook);
        }
    }
}
