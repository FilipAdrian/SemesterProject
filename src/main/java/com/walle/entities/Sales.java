package com.walle.entities;

import java.util.Date;

public class Sales {
    private Integer id;
    private String data;
    private Integer productQuantity;
    private Client client;
    private Product product;
    private User user;

    public  Sales() {};



    public Sales(Integer id, String data, Integer productQuantity, User user, Product product , Client client) {
        this.id= id;
        this.data = data;
        this.productQuantity = productQuantity;
        this.client = client;
        this.product = product;
        this.user = user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", productQuantity=" + productQuantity +
                ", client=" + client.getId () +
                ", product=" + product.getId () +
                ", user=" + user.getId () +
                '}';
    }
}
