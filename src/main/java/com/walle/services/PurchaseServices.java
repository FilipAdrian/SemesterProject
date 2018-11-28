package com.walle.services;

import com.walle.entities.Purchase;
import com.walle.repository.PurchaseRepository;

import java.util.List;

public class PurchaseServices {
    PurchaseRepository purchaseRepository;
    public PurchaseServices(){
        this.purchaseRepository = new PurchaseRepository ();
    }
    public List<Purchase> getAllPurcases() throws Exception{
        return purchaseRepository.getAll ();
    }
}
