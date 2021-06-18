package com.practice.automationtesting.automation.models;

public class Data {

    private String firstName, lastName,  emailAddress, phone, address, city, country;

    public Data(String firstName, String lastName, String emailAddress, String phone, String address, String city, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
