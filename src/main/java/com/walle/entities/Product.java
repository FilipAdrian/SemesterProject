package com.walle.entities;


public class Product {
    private String id;
    private String name;
    private Integer quantity;
    private Double price;
    private Double cost;
    private Manufacture manufacture;
    private Warehouse warehouse;

    public Product(String id, String name, Integer quantity,Double price,
                   Double cost,  Manufacture manufacture, Warehouse warehouse) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.cost = cost;
        this.quantity = quantity;
        this.warehouse = warehouse;
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

    public Manufacture getManufacture() {
        return manufacture;
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

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
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

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacture=" + manufacture.getId () +
                ", price=" + price +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", warehouse='" + warehouse.getId () + '\'' +
                '}';
    }
}
