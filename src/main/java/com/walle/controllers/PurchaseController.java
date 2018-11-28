package com.walle.controllers;

import com.walle.entities.Purchase;
import com.walle.services.PurchaseServices;

import java.util.List;

public class PurchaseController {
    private PurchaseServices purchaseServices ;
    public PurchaseController(){
        this.purchaseServices = new PurchaseServices ();
    }
    public List<Purchase> displayPurchases() throws Exception{
        return  purchaseServices.getAllPurcases ();
    }
}
