package com.walle.entities;


public class Manufacture {
    private Integer id;
    private String name;
    private Integer idCountry;
    private String address;

    public  Manufacture(){};

    public Manufacture(Integer id, String name, Integer idCountry, String address){
        this.id = id;
        this.name = name;
        this.idCountry = idCountry;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public  Integer getCountry() {
        return idCountry;
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

    public void setCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Manufacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCountry='" + idCountry  + '\'' +
                ", address=" + address +
                '}';
    }
}
