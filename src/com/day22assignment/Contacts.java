package com.day22assignment;
/**
 * @author Shashank
 */
public class Contacts {
    /**
     * declaring variables
     */
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String emailAddress;

    /**
     * constructor of the main class to add contact
     */
    public Contacts() {
    }

    /**
     * using getter & setter to get & set the values
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Contacts { " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", address = '" + address + '\'' +
                ", city = '" + city + '\'' +
                ", state = '" + state + '\'' +
                ", zip = " + zip +
                ", phoneNumber = " + phoneNumber +
                ", emailAddress = '" + emailAddress + '\'' +
                '}';
    }
}