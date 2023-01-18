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
    private String zip;
    private String phoneNumber;
    private String emailAddress;

    /**
     * constructor of the main class to add contact
     */
    public Contacts() {
    }

    public Contacts(String firstName, String lastName, String address, String cityName, String stateName, String zipCode, String pNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = cityName;
        this.state = stateName;
        this.zip = zipCode;
        this.phoneNumber = pNumber;
        this.emailAddress = emailId;
    }

    /**
     * using getter & setter to get & set the values
     * @return
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getCity() {
        return this.city;
    }
    public String getState() {
        return this.state;
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

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
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