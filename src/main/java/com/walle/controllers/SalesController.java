package com.walle.controllers;

import com.walle.entities.Sales;
import com.walle.services.SalesServices;

import java.util.List;

public class SalesController {
    private SalesServices salesServices;
    public SalesController (){
        this.salesServices = new SalesServices ();
    }
    public List<Sales> displaySales() throws Exception{
        return salesServices.getAllSales ();
    }
}
