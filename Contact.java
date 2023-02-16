package com.bl.addessbook;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    long mobileNo;
    int zip;


    public Contact(String firstName, String lastName, String address, String city, String state, String email, long mobileNo, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address= address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.mobileNo = mobileNo;
        this.zip = zip;

    }
}
