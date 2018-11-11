package com.walle.entities;


public class Manufacture {
    private Integer id;
    private String name;
    private Country country;
    private String address;

    public  Manufacture(){};

    public Manufacture(Integer id, String name, Country country, String address){
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public  Country getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString() {
        return "Manufacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country.getId ()  + '\'' +
                ", address=" + address +
                '}';
    }
}
