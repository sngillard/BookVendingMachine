package ui;

import models.FileReader;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    private FileReader fileReader = new FileReader();

    public String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("B) Browse Book Collection");
        System.out.println("P) Purchase Book");
        System.out.println("E) Exit");

        System.out.println();
        System.out.println("Please select a title: ");

        String selectedOption = scanner.nextLine();
        String title = selectedOption.trim().toUpperCase();

        if(title.equals("B")) {
            return "Browse Books";
        } else if (title.equals("P")) {
            return "Purchase";
        } else if (title.equals("E")) {
            return "exit";
        } else {
            return "";
        }
    }

    public String getBookMenu() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("S) Select Item");
        System.out.println("F) Finish Transaction");

        System.out.println();
        System.out.println("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if(option.equals("M")) {
            return "Feed Money";
        } else if (option.equals("S")) {
            System.out.println("Enter the book location: ");
            return "Select";
        } else if (option.equals("F")) {
            return "Finish Transaction";
        } else {
            return "";
        }
    }

    public String getMoneyFed() {
        System.out.println("Please enter $1, $5, $10, $20");
        String moneyFed = scanner.nextLine();
        return moneyFed;
    }

    public String getSelectedBook() {
        System.out.println("Select a title: ");
        String titleSelected = scanner.nextLine();
        return titleSelected;
    }
}
