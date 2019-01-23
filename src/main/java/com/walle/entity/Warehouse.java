package com.walle.entity;


public class Warehouse {

    private Long id;

    private String name;
    private String address;
    private String phone;

    private Country country;

    public Warehouse(){}
    public Warehouse(String name,Country country,String address,String phone){
        this.name = name;
        this.address = address;
        this.country = country;
        this.phone = phone;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public Country getCountry() {
        return country;
    }
}
