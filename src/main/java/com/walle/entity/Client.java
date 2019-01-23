package com.walle.entity;



public class Client {

    private Long id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    private Country country;
    private String address;

    private Type type;

    public Client() { }
    public Client(String name, String surname, String phone, String email,
                  Country country, String address, Type type) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.address = address;
        this.type = type;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}



