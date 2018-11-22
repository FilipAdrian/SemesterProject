package com.walle.entities;

public class Warehouse {
    private Integer id;
    private String name;
    private Integer country;
    private String address;
    private String phone;

    public  Warehouse () {}

  public Warehouse(Integer id, String name ,Integer  country,
              String address,String phone){
        this.id = id;
        this.name = name;
        this.country = country;
        this.address = address;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer  getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(Integer  country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
