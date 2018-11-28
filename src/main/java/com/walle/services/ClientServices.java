package com.walle.services;

import com.walle.entities.Client;
import com.walle.repository.ClientRepository;

import java.util.List;

public class ClientServices {
    private ClientRepository clientRepository;
    public  ClientServices(){
        clientRepository = new ClientRepository ();
    }
    public List<Client> getAllClients() throws Exception{
        return clientRepository.getAll ();
    }
}
