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
        System.out.print("1. CREATE");
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
                addContact();
                break;
        }
    }

    /**
     * Method to Add New Contact to AddressBook
     */
    private void addContact() {
        /*
        Created Contacts Object for Getter and Setter Methods
         */
        Contacts contacts = new Contacts();

        System.out.println("Enter the Contact Details -");
        System.out.print("Enter your First Name : ");
        contacts.setFirstName(new Scanner(System.in).next());
        System.out.print("Enter your Last Name : ");
        contacts.setLastName(new Scanner(System.in).nextLine());
        System.out.print("Enter your Address : ");
        contacts.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Enter your city name: ");
        contacts.setCity(new Scanner(System.in).nextLine());
        System.out.print("Enter your state name : ");
        contacts.setState(new Scanner(System.in).nextLine());
        System.out.print("Enter your zip Code : ");
        contacts.setZip(new Scanner(System.in).nextInt());
        System.out.print("Enter your Phone Number : ");
        contacts.setPhoneNumber(new Scanner(System.in).nextLong(10));
        System.out.print("Enter your Email ID : ");
        contacts.setEmailAddress(new Scanner(System.in).next());
    }
}
