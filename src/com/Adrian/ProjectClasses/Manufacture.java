package com.Adrian.ProjectClasses;

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
}
