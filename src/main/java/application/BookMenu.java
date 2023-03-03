package application;

import models.Book;
import models.FileReader;
import ui.UserInput;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookMenu {
    UserInput input = new UserInput();
    MoneyHandler money;

    private List<Book> listOfBookTitles = new ArrayList<>();
    private FileReader fileReader = new FileReader();

    public int bookStock = 5;

    public BookMenu(MoneyHandler money) {
        this.money = money;
        listOfBookTitles = fileReader.readTextFile();
    }

    public int getBookStock() {
        return bookStock;
    }

    public boolean isSelectionAvailable() {
        if (this.bookStock >= 1) {
            return true;
        }
        return false;
    }

    public void selectBook() {
        bookStock -= 1;
    }

    public void displayBookMenu() {
        while (true) {
            String choice = input.getBookMenu();
            if (choice.equals("Feed Money")) {
                String moneyFed = input.getMoneyFed();

                this.money.addMoney(new BigDecimal(moneyFed));
                System.out.println(this.money.getBalance());
            } else if (choice.equals("Select")) {
                for (Book book : listOfBookTitles) {
                    System.out.println(book);
                }

                String theSelectedBook = input.getSelectedBook();
                for (Book eachBook : listOfBookTitles) {
                    if (eachBook.getBookLocation().equals(theSelectedBook)) {
                        BigDecimal getBookPrice = eachBook.getBookPrice();
                        BigDecimal updatedBalance = money.getBalance().subtract(getBookPrice);
                        money.setBalance(updatedBalance);
                        System.out.println(this.money.getBalance());
                        eachBook.decrementInventoryCount();
                    }
                }
            } else if (choice.equals("Finish Transaction")) {
                money.returnChange();
                break;

            }
        }
    }
}

