package com.walle.entities;

import java.util.Date;

public class Sales {
    private Integer id;
    private String data;
    private Integer productQuantity;
    private Integer idClient;
    private String idProduct;
    private Integer idUser;

    public  Sales() {};



    public Sales(Integer id, String data, Integer productQuantity, Integer idUser, String idProduct , Integer idClient) {
        this.id= id;
        this.data = data;
        this.productQuantity = productQuantity;
        this.idClient = idClient;
        this.idProduct = idProduct;
        this.idUser = idUser;
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

    public void setClient(Integer idClient) {
        this.idClient = idClient;
    }

    public void setProduct(String idProduct) {
        this.idProduct = idProduct;
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

    public Integer getClient() {
        return idClient;
    }

    public String getProduct() {
        return idProduct;
    }

    public void setUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getUser() {
        return idUser;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", productQuantity=" + productQuantity +
                ", idClient=" + idClient+
                ", idProduct=" + idProduct+
                ", idUser=" + idUser +
                '}';
    }
}
