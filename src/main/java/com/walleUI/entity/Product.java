package com.walleUI.entity;


import java.math.BigDecimal;


public class Product {

    private String id;
    private String name;
    private Integer quantiy;
    private BigDecimal price;

    private Manufacture manufacture;

    private Warehouse warehouse;

    public Product() {
    }

    public Product(String id, String name, Integer quantiy,
                   Double price, Manufacture manufacture, Warehouse warehouse) {
        this.id = id;
        this.name = name;
        this.quantiy = quantiy;
        this.price = new BigDecimal (price);
        this.manufacture = manufacture;
        this.warehouse = warehouse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(Integer quantiy) {
        this.quantiy = quantiy;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = new BigDecimal (price);
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
