package com.day22assignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Shashank
 */
public class AddressBook {
    /*
       Created Contacts Object for Getter and Setter Methods
        */
    Contacts contacts = new Contacts();
    ArrayList<Contacts> list = new ArrayList<>();
    /**
     * Method to Add Contact to AddressBook
     */
    public void addContact() {

        System.out.println("Enter the Contact Details -");
        System.out.print("Enter your First Name : ");
        String fname = new Scanner(System.in).next();
        System.out.print("Enter your Last Name : ");
        String lname = new Scanner(System.in).nextLine();
        System.out.print("Enter your Address : ");
        String addr = new Scanner(System.in).nextLine();
        System.out.print("Enter your city name: ");
        String cityName = new Scanner(System.in).nextLine();
        System.out.print("Enter your state name : ");
        String stateName = new Scanner(System.in).nextLine();
        System.out.print("Enter your zip Code : ");
        int zipCode = new Scanner(System.in).nextInt();
        System.out.print("Enter your Phone Number : ");
        long pNumber = new Scanner(System.in).nextLong(10);
        System.out.print("Enter your Email ID : ");
        String emailId = new Scanner(System.in).next();
        list.add(new Contacts(fname, lname, addr, cityName, stateName, zipCode, pNumber, emailId));
    }

    void displayContacts() {
        for (Contacts c:list) {
            System.out.println(c);
        }
    }

    /**
     * Method to update existent contact
     * 1) we are taking phone number input from the user to check that the contact is present in the address book or not
     * 2) If present then update the details of that contact
     * 3) If not present then show Contact is not in address book
     */
    void updateContact() {
        System.out.println("Enter the phone number : ");
        /*
        1) we are taking phone number input from the user to check that the contact is present in the address book or not
         */
        long phoneNumber = new Scanner(System.in).nextLong(10);

        boolean isFound = false;
        /*
        2) If present then update the details of that contact
         */
        if (phoneNumber == contacts.getPhoneNumber()) {
            System.out.print("Enter new First Name : ");
            String fname = new Scanner(System.in).next();
            System.out.print("Enter new Last Name : ");
            String lname = new Scanner(System.in).nextLine();
            System.out.print("Enter new Address : ");
            String addr = new Scanner(System.in).nextLine();
            System.out.print("Enter new city name : ");
            String cityName = new Scanner(System.in).nextLine();
            System.out.print("Enter new state name : ");
            String stateName = new Scanner(System.in).nextLine();
            System.out.print("Enter new zip Code : ");
            int zipCode = new Scanner(System.in).nextInt();
            System.out.print("Enter new Phone Number : ");
            long pNumber = new Scanner(System.in).nextLong(10);
            System.out.print("Enter new Email ID : ");
            String emailId = new Scanner(System.in).next();
            list.add(new Contacts(fname, lname, addr, cityName, stateName, zipCode, pNumber, emailId));
            System.out.println("\nContact updated successfully!");
        }
        /*
        3) If not present then show Contact is not in address book
         */
        if (!isFound) {
            System.out.println("Contact is Not found ");
        }
    }
}
