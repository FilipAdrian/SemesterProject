package com.walle.controllers;

import com.walle.entities.Client;
import com.walle.services.ClientServices;

import java.util.List;

public class ClientController {
    private ClientServices clientServices;
    public ClientController (){
        clientServices = new ClientServices ();
    }
    public List<Client> displayClient() throws Exception{
        return clientServices.getAllClients ();
    }
}
