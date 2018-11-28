package com.walle.controllers;

import com.walle.entities.Manufacture;
import com.walle.services.ManufactureService;

import java.util.List;

public class ManufactureController {
    private ManufactureService manufactureService;
    public ManufactureController(){this.manufactureService  = new ManufactureService ();}

    public List<Manufacture> displayManufacture() throws Exception{
        System.out.println (manufactureService.getAllManufacture () );
        return manufactureService.getAllManufacture ();
    }
}
