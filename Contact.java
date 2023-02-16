package com.bl.addessbook;

import java.util.Scanner;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String email;
    long mobileNo;
    int zip;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void createContacts(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        setFirstName(sc.nextLine());
        System.out.print("Enter Last Name : ");
        setLastName(sc.nextLine());
        System.out.print("Enter City Name : ");
        setCity(sc.nextLine());
        System.out.print("Enter State Name : ");
        setState(sc.nextLine());
        System.out.print("Enter Email : ");
        setEmail(sc.nextLine());
        System.out.print("Enter Zip Code : ");
        setZip(sc.nextInt());
        System.out.print("Enter Phone Number : ");
        setMobileNo(sc.nextLong());

    }
    public String toString()
    {

        String str = "Contacts: [First_Name = " + getFirstName() + ", Last_Name = " + getLastName() +
                ", City = " + getCity() + ", State = " + getState() + ", Email = " + getEmail() + ", Zip = " + getZip() + ", PhoneNumber = " + getMobileNo()  +"]";
        return str;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to address Book Program");
        Contact contact = new Contact();
        contact.createContacts();
        System.out.println(contact.toString());
    }
}

