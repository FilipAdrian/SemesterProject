package com.walle.entities;


public class Product {
    private String id;
    private String name;
    private Integer quantity;
    private Double price;
    private Double cost;
    private Integer idManufacture;
    private Integer idWarehouse;

    public Product(String id, String name, Integer quantity,Double price,
                   Double cost,  Integer idManufacture, Integer idWarehouse) {
        this.id = id;
        this.name = name;
        this.idManufacture = idManufacture;
        this.price = price;
        this.cost = cost;
        this.quantity = quantity;
        this.idWarehouse = idWarehouse;
    }

    public Product() {
    }

    ;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getManufacture() {
        return idManufacture;
    }

    public Double getPrice() {
        return price;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getWarehouse() {
        return idWarehouse;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacture(Integer idManufacture) {
        this.idManufacture = idManufacture;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", idManufacture=" + idManufacture +
                ", price=" + price +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", idWarehouse='" + idWarehouse + '\'' +
                '}';
    }
}
