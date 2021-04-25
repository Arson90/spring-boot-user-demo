package com.example.app.user.model;

import com.example.app.user.data.Client;
import com.example.app.user.repsitory.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ClientHTTPResponse getClientById(long id) {
        Client client = clientRepository.findById(id).get();
        ClientHTTPResponse response = ClientMapper.map(client);
        return response;
    }

    public List<ClientHTTPResponse> getAllClients() {
        Iterable<Client> clients = clientRepository.findAll();
        List<ClientHTTPResponse> responseClients = new ArrayList<>();
        for(Client client : clients) {
            responseClients.add(ClientMapper.map(client));
        }
        return responseClients;
    }

    public boolean deleteClientById(long id) {
        if(clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public String createClient(ClientHTTPRequest clientHTTPRequest) {
        Client clientEntity = ClientMapper.map(clientHTTPRequest);
        Client client = clientRepository.save(clientEntity);
        return String.valueOf(client.getId());
    }

    public String updateClientById(long id, ClientHTTPRequest clientHTTPRequest) {
        Client clientEntity = ClientMapper.map(clientHTTPRequest);
        clientEntity.setId(id);
        Client client = clientRepository.save(clientEntity);
        return String.valueOf(client.getId());
    }

    public boolean findByFirstName(String name) {
        return clientRepository.findByFirstName(name);
    }

    public boolean existsByLastName(String name){
        return clientRepository.existsByLastName(name);
    }

    public List<Client> findAllByFirstName(String name) {
        Iterable<Client> clients = clientRepository.findAll();
        List<Client> clientList = new ArrayList<>();
        for (Client client : clients)
            if(clientRepository.findAllByFirstName(name)){
                clientList.add(client);
        }
        return clientList;
    }

    public long countClientByLastName(String name) {
        long number = clientRepository.countAllByLastName(name);
        return number;
    }
}
