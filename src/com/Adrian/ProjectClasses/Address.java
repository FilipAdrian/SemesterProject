package com.Adrian.ProjectClasses;

public class Address {
    private String country;
    private  String city;
    private String street;
    private  Integer streetNumber;

    Address(String country,String city ,String street ,Integer streetNumber){
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }
}
