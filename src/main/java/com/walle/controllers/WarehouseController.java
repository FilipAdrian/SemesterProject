package com.walle.controllers;

import com.walle.entities.Warehouse;
import com.walle.services.WarehouseService;

import java.util.List;

public class WarehouseController {
    private WarehouseService warehouseService;
    public WarehouseController(){
        this.warehouseService = new WarehouseService ();
    }
    public List<Warehouse> displayWarehouse() throws Exception{
        return  warehouseService.getAllWarehouse ();
    }
}
