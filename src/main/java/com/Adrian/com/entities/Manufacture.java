package com.Adrian.com.entities;


public class Manufacture {
    private Long idManufacture;
    private String nameManufacture;
    private String country;
    private Address addressManufacture;

    Manufacture(Long idManufacture , String nameManufacture , String country ,  Address addressManufacture){
        this.idManufacture = idManufacture;
        this.nameManufacture = nameManufacture;
        this.country = country;
        this.addressManufacture = addressManufacture;
    }

    public Long getIdManufacture() {
        return idManufacture;
    }

    public String getNameManufacture() {
        return nameManufacture;
    }

    public String getCountry() {
        return country;
    }

    public Address getAddressManufacture() {
        return addressManufacture;
    }

    public void setIdManufacture(Long idManufacture) {
        this.idManufacture = idManufacture;
    }

    public void setNameManufacture(String nameManufacture) {
        this.nameManufacture = nameManufacture;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddressManufacture(Address addressManufacture) {
        this.addressManufacture = addressManufacture;
    }
}
