package com.walle.services;

import com.walle.entities.Warehouse;
import com.walle.repository.WarehouseRepository;

import java.util.List;

public class WarehouseService {
    private WarehouseRepository warehouseRepository;
    public WarehouseService(){
        this.warehouseRepository = new WarehouseRepository ();
    }
    public List<Warehouse> getAllWarehouse() throws Exception{
        return warehouseRepository.getAll ();
    }
}
