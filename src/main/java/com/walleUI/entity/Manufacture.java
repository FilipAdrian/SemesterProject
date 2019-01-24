package com.walleUI.entity;

public class Manufacture {

    private Long id;
    private String name;

    private Country country;

    private String address;

    public Manufacture() {};

    public Manufacture(String name , Country country , String address){
        this.name = name;
        this.country = country;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
