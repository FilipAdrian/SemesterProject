package com.walle.services;

import com.walle.entities.Sales;
import com.walle.repository.SalesRepository;

import java.io.IOException;
import java.util.List;

public class SalesServices {
    private SalesRepository salesRepository;
    public SalesServices (){
        this.salesRepository = new SalesRepository ();
    }

    public List<Sales> getAllSales() throws Exception{
        return salesRepository.getAll ();
    }
}
