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
        /*
        3) Show Menu for user to Select Operation on AddressBook
         */

        do {
            choice = showMenu();
            main.choose(choice);
        }while(choice != 0);
    }

    private static int showMenu() {
        System.out.println("\nEnter 0 to exit\n");
        System.out.print("1. CREATE \n2. READ \n3. UPDATE \n4. DELETE");
        System.out.println("\nEnter your choice:");

        int choice;
        return choice = new Scanner(System.in).nextInt();
    }
    /**
     * This method will perform the CRUD operation
     * 1) using switch case as choice parameter
     * @param choice - Variable for user Choice
     */
    void choose(int choice) {
        switch(choice){
            case 1:
                book.addContact();
                break;
            case 2:
                break;
            case 3:
                book.updateContact();
                break;
            case 4:
                break;
            default:
                System.out.println("Please choose between 1 to 3");
        }
    }
}
