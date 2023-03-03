package application;

import models.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Book> vendingItemsAndLocation= new HashMap<>();

    public Inventory (List<Book> books) {
        for (Book eachBook : books){
            vendingItemsAndLocation.put(eachBook.getBookLocation(), eachBook);

        }

    }
}

