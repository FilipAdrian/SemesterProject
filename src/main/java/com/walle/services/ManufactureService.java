package com.walle.services;

import com.walle.entities.Manufacture;
import com.walle.repository.ManufactureRepository;

import java.util.List;

public class ManufactureService {
    private ManufactureRepository manufactureRepository;

    public ManufactureService(){this.manufactureRepository = new ManufactureRepository ();}

    public List<Manufacture> getAllManufacture()throws Exception{
        return manufactureRepository.getAll ();
    }
}
