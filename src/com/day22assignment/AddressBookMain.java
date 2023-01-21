package com.day22assignment;

import java.util.Scanner;

/**
 * @author Shashank
 */

/**
 * AddressBookMain class, inside this we have main method
 * 1) declaring int variable to use in switch case
 * 2) AddressBook Class Object for Contact Management
 * 3) Show Menu for user to Select Operation on AddressBook
 */
public class AddressBookMain {
    AddressBook book = new AddressBook();

    public static void main(String[] args) {
        System.out.println("\nWelcome to Address Book Program");
        /*
        Variable for user Choice
         */
        int choice;
        /*
         2) AddressBook Class Object for Contact Management
         */
        AddressBookMain main = new AddressBookMain();
        Scanner sc = new Scanner(System.in);
        /*
        3) Show Menu for user to Select Operation on AddressBook
         */

        do {
            choice = showMenu();
            main.choose(choice);
        } while (choice != 0);

        do {
            choice = showAddressBookMenu();
            main.addressBook(choice);
        } while (choice != 0);
    }

    /**
     * This method will perform the CRUD operation on address book
     * 1) using switch case as choice parameter
     *
     * @param choice - Variable for user Choice
     */
    void addressBook(int choice) {
        switch (choice) {
            case 1:
                book.newAddressBook();
                break;
            case 2:
                book.displayAddressBook();
                break;
            case 3:
                book.openAddressBook();
                break;
            case 4:
                book.editFromMultipleBook();
                break;
            case 5:
                book.deleteFromMultipleBook();
                break;
            case 6:
                book.deleteAddressBook();
                break;
            case 7:
                book.searchPersonFromList();
                break;
            case 8:
                book.searchPersonFromMap();
                break;
            case 9:
                book.viewPersonFromList();
            case 10:
                book.countPersonList();
                break;
            case 11:
                book.sortPersonList();
                break;
            case 12:
                book.readAddressBookTxt();
                break;
            case 13:
                book.readAddressBookCsv();
                break;
            case 14:
                book.readAddressBookJson();
                break;
            case 15:
                book.retrieveData();
                break;
            default:
                System.out.println("Please choose between 1 to 13");
        }
    }

    /**
     * show the menu of operation to perform on address book
     *
     * @return - the choice/operation that we want to perform on address book
     */
    private static int showAddressBookMenu() {
        System.out.println("\nEnter 0 to exit\n");
        System.out.print("1. Add New AddressBook \n2. Display AddressBook \n3. Open Old AddressBook \n4. Edit From Multiple Book" +
                "\n5. Delete From Multiple Book \n6. Delete AddressBook \n7. Search from list \n8. Search from map" +
                "\n9. View Contact \n10. Count Contacts \n11. Sort contact \n12. Read Data From File" +
                "\n13. Read data from the CSV file \n14. Read Data From JSON \n15. Retrieve Entries From DB");
        System.out.println("\nEnter your choice:");

        int choice;
        return choice = new Scanner(System.in).nextInt();
    }

    /**
     * how the menu of operation to perform on contact
     *
     * @return - the choice/operation that we want to perform on address book
     */
    private static int showMenu() {
        System.out.println("\nEnter 0 to exit\n");
        System.out.print("1. CREATE \n2. READ \n3. UPDATE \n4. DELETE");
        System.out.println("\nEnter your choice:");

        int choice;
        return choice = new Scanner(System.in).nextInt();
    }

    /**
     * This method will perform the CRUD operation on contact
     * 1) using switch case as choice parameter
     *
     * @param choice - Variable for user Choice
     */
    void choose(int choice) {

        switch (choice) {
            case 1:
                book.addContact();
                break;
            case 2:
                book.showContacts();
                break;
            case 3:
                book.updateContact(new Scanner(System.in).nextLine(), "");
                break;
            case 4:
                book.deleteContact(new Scanner(System.in).nextLine(), "");
                break;
            default:
                System.out.println("Please choose between 1 to 4");
        }
    }
}
