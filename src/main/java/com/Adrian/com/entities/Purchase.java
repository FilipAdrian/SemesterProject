package com.Adrian.com.entities;

import java.util.Date;

public class Purchase {
    private  Long idPurcases;
    private  Date purchaseData;
    private Integer purchaseProductQuantity;
    private User user;
    private Product product;

    public Purchase(Long idPurcases, Date purchaseData, Integer purchaseProductQuantity, User user, Product product) {
        this.idPurcases = idPurcases;
        this.purchaseData = purchaseData;
        this.purchaseProductQuantity = purchaseProductQuantity;
        this.user = user;
        this.product = product;
    }

    public void setIdPurcases(Long idPurcases) {
        this.idPurcases = idPurcases;
    }

    public void setPurchaseData(Date purchaseData) {
        this.purchaseData = purchaseData;
    }

    public void setPurchaseProductQuantity(Integer purchaseProductQuantity) {
        this.purchaseProductQuantity = purchaseProductQuantity;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getIdPurcases() {
        return idPurcases;
    }

    public Date getPurchaseData() {
        return purchaseData;
    }

    public Integer getPurchaseProductQuantity() {
        return purchaseProductQuantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
