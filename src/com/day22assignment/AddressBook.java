package com.day22assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Shashank
 */
public class AddressBook {
    public static final String MAP = "map";
    Map<String, ArrayList<Contacts>> map = new HashMap<>();
    ArrayList<Contacts> list;
    Scanner sc = new Scanner(System.in);
    /*
       Created Contacts Object for Getter and Setter Methods
        */
    Contacts contacts = new Contacts();

    /**
     * Method to Add Contact to AddressBook
     */
    public void addContact() {
        System.out.println("Enter First Name : ");
        contacts.setFirstName(sc.nextLine());

        System.out.println("Enter Last Name : ");
        contacts.setLastName(sc.nextLine());

        System.out.println("Enter Address : ");
        contacts.setAddress(sc.nextLine());

        System.out.println("Enter City Name : ");
        contacts.setCity(sc.nextLine());

        System.out.println("Enter State Name : ");
        contacts.setState(sc.nextLine());

        System.out.println("Enter Zip Code : ");
        contacts.setZip(sc.nextLine());

        System.out.println("Enter Phone Number : ");
        contacts.setPhoneNumber(sc.nextLine());
        /**
         * we are checking that duplicate contact is present in list or not
         */
        if (duplicateCheck(contacts.getPhoneNumber())) {
            System.out.println("Given Phone Number is Already Exists!");
            return;
        }

        System.out.println("Enter Email Id : ");
        contacts.setEmailAddress(sc.nextLine());

        System.out.println(contacts);
        list.add(contacts);
        System.out.println("\nContact Added Successfully!");
    }

    /**
     * method to check the duplication in list
     * @param phoneNumber - phone number as a parameter
     * @return
     */
    private boolean duplicateCheck(String phoneNumber) {
        Contacts check = list.stream()
                .filter(i -> i.getPhoneNumber().equals(phoneNumber))
                .findFirst().orElse(null);
        return check != null;
    }

    /**
     * Method to update existent contact
     * 1) we are taking phone number input from the user to check that the contact is present in the address book or not
     * 2) if list does not contain any contact then show the message that contact is not available
     * 3) If present then update the details of that contact
     * 4) If not present then show enter valid number
     */
    void updateContact(String editByPhoneNumber, String type) {
        boolean flag = false;
        /*
        2) if list does not contain any contact then show the message that contact is not available
         */
        if (list.isEmpty() && map.isEmpty()) {
            System.out.println("SORRY! There is no contact available");
        } else {
            for (Contacts contacts1 : list) {
                /*
                3) If present then update the details of that contact
                 */
                if ((contacts1.getPhoneNumber().equals(editByPhoneNumber))) {

                    System.out.print("1.Edit First Name  \n2.Edit Last Name  " +
                            "\n3.Edit Address  \n4.Edit City Name  " +
                            "\n5.Edit State Name  \n6.Edit Zip Code " +
                            " \n7.Edit Phone Number  \n8.Edit Email Id\n->");

                    int option = sc.nextInt();
                    sc.nextLine();

                    switch (option) {
                        case 1 -> {
                            System.out.println("Enter New First Name : ");
                            contacts1.setFirstName(sc.nextLine());
                        }
                        case 2 -> {
                            System.out.println("Enter New Last Name : ");
                            contacts1.setLastName(sc.nextLine());
                        }
                        case 3 -> {
                            System.out.println("Enter New Address : ");
                            contacts1.setAddress(sc.nextLine());
                        }
                        case 4 -> {
                            System.out.println("Enter New City Name : ");
                            contacts1.setCity(sc.nextLine());
                        }
                        case 5 -> {
                            System.out.println("Enter New State Name : ");
                            contacts1.setState(sc.nextLine());
                        }
                        case 6 -> {
                            System.out.println("Enter New Zip Code : ");
                            contacts1.setZip(sc.nextLine());
                        }
                        case 7 -> {
                            System.out.println("Enter New Phone Number : ");
                            contacts1.setPhoneNumber(sc.nextLine());
                        }
                        case 8 -> {
                            System.out.println("Enter New Email Id : ");
                            contacts1.setEmailAddress(sc.nextLine());
                        }
                        default -> System.out.println("Please Choose Valid Option!");
                    }

                    System.out.println(contacts);
                    System.out.println("Contact Edited Successfully.");
                    flag = true;
                    break;
                }
            }
            /*
            4) If not present then show enter valid number
             */
            if (!flag && !type.equals(AddressBook.MAP)) {
                System.out.println("Please Enter Valid Phone Number!");
            }
        }
    }


    /**
     * method to delete the contact from the address book
     * 1) taking mobile number of the person to delete the contact
     * 2) if list does not contain any contact then show the message that contact is not available
     * 3) if condition is true then the contact will be deleted,
     * 4) otherwise again ask for valid mobile number
     */
    void deleteContact(String deleteByPhoneNumber, String type) {
        boolean flag = false;
        /*
        2) if list does not contain any contact then show the message that contact is not available
         */
        if (list.isEmpty() && this.map.isEmpty()) {
            System.out.println("SORRY! There is no contact available");
        } else {
            for (Contacts contacts1 : list) {
                /*
                3) if condition is true then the contact will be deleted
                 */
                if (contacts1.getPhoneNumber().equals(deleteByPhoneNumber)) {
                    list.remove(contacts1);
                    System.out.println("Contact Deleted Successfully.");
                    flag = true;
                    break;
                }
            }
            /*
            4) otherwise again ask for valid mobile number
             */
            if (!flag && !type.equals(AddressBook.MAP)) {
                System.out.println("Please Enter Valid Phone Number!");
            }
        }
    }

    /**
     * method to show the contacts
     */
    public void showContacts() {
        System.out.println("Number Of Contacts Stored : " + list.size());
        if (list.isEmpty()) {
            System.out.println("There Is No Contact Available");
        } else {
            for (Contacts data : list) {
                System.out.println(data);
            }
        }
    }

    /**
     * created a function to add multiple books using map
     */
    void newAddressBook() {
        System.out.println("Enter Name Of New AddressBook : ");
        String addressBookName = sc.nextLine().toUpperCase();
        if (map.containsKey(addressBookName)) {
            System.out.println("[" + addressBookName + "]->This AddressBook Is Already Exists!");
        } else {
            list = new ArrayList<>();
            map.put(addressBookName, list);
            System.out.println("AddressBook [" + addressBookName + "] Added Successfully.");
            operationInBook();
        }
    }

    /**
     * created a function to display books and their addresses
     */
    void displayAddressBook() {
        System.out.println("Number Of AddressBook : " + map.size() + "\n");
        if (map.isEmpty()) {
            System.out.println("There Is No AddressBook Available");
        } else {
            map.forEach((key, value) -> System.out.println("[" + key + "]" + "->" + value + "\n"));
        }
    }

    /**
     * created a function to open old book and perform the operation in the arraylist
     */
    void openAddressBook() {
        System.out.println("AddressBooks : " + map.keySet());
        if (map.isEmpty()) {
            System.out.println("There Is No AddressBook Available");
        } else {
            System.out.println("Enter The Name Of Old AddressBook You Want To Open : ");
            String addBookDetails = sc.nextLine().toUpperCase();
            if (map.containsKey(addBookDetails)) {
                list = map.get(addBookDetails);
                operationInBook();
            } else {
                System.out.println("AddressBook Doesn't Exists!");
            }
        }
    }
    /**
     * create a function to edit details from the multiple book
     */
    void editFromMultipleBook() {
        System.out.println("Enter Phone Number Of A Person To Edit : ");
        String editByPhoneNumber = sc.nextLine();
        for (Map.Entry<String, ArrayList<Contacts>> entry : map.entrySet()) {
            list = map.get(entry.getKey());
            updateContact(editByPhoneNumber, AddressBook.MAP);
        }
    }

    /**
     * created a function to delete details from the multiple book
     */
    void deleteFromMultipleBook() {
        System.out.println("Enter Phone Number Of A Person To Delete : ");
        String deleteByPhoneNumber = sc.nextLine();
        for (Map.Entry<String, ArrayList<Contacts>> entry : map.entrySet()) {
            list = map.get(entry.getKey());
            deleteContact(deleteByPhoneNumber, AddressBook.MAP);
        }
    }

    /**
     * create a function to delete book from the map
     */
    void deleteAddressBook() {
        System.out.println("AddressBooks : " + map.keySet());
        if (map.isEmpty()) {
            System.out.println("There Is No AddressBook Available");
        } else {
            System.out.println("Enter The Name Of AddressBook You Want To Delete : ");
            String deleteBook = sc.nextLine().toUpperCase();
            if (map.containsKey(deleteBook)) {
                map.remove(deleteBook);
                System.out.println("AddressBook Deleted Successfully.");
            } else {
                System.out.println("AddressBook Doesn't Exist!");
            }
        }
    }

    /**
     *
     */
    void operationInBook() {
        int option = sc.nextInt();
        do {
            System.out.println("\nEnter 0 to exit\n");
            System.out.print("1. Add Contact \n2. Edit Contact \n3. Delete Contact \n4. View Contact");
            sc.nextLine();
            switch (option) {
                case 1:
                    addContact();
                    break;
                case 2:
                    System.out.println("Enter Phone Number Of A Person To Edit : ");
                    updateContact(sc.nextLine(), "");
                    break;
                case 3:
                    System.out.println("Enter Phone Number Of A Person To Delete : ");
                    deleteContact(sc.nextLine(), "");
                    break;
                case 4:
                    showContacts();
                    break;
                default:
                    System.out.println("Please Choose Valid Option!");
                    break;
            }
        } while (option != 0);
    }
}