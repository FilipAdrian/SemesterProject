package com.Adrian.com.entities;

import java.util.Date;

public class Sales {
    private Long idSales;
    private Date salesDate;
    private Integer salesProductQuantity;
    private User user;
    private Product product;

    public Sales(Long idSales, Date salesDate, Integer salesProductQuantity, User user, Product product) {
        this.idSales = idSales;
        this.salesDate = salesDate;
        this.salesProductQuantity = salesProductQuantity;
        this.user = user;
        this.product = product;
    }

    public Long getIdSales() {
        return idSales;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public Integer getSalesProductQuantity() {
        return salesProductQuantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public void setIdSales(Long idSales) {
        this.idSales = idSales;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public void setSalesProductQuantity(Integer salesProductQuantity) {
        this.salesProductQuantity = salesProductQuantity;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
