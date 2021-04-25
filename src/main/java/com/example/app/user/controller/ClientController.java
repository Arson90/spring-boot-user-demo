package com.example.app.user.controller;

import com.example.app.user.model.ClientHTTPRequest;
import com.example.app.user.model.ClientHTTPResponse;
import com.example.app.user.model.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class ClientController {

     private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/client/{id}")
    public ClientHTTPResponse getClientById(@PathVariable long id) {
        return clientService.getClientById(id);
    }

    @GetMapping("/clients")
    public List<ClientHTTPResponse> getAllClients() {
        return clientService.getAllClients();
    }

    @PostMapping
    public String createClient(@RequestBody ClientHTTPRequest clientHTTPRequest) {
        return clientService.createClient(clientHTTPRequest);
    }

    @PutMapping
    public String updateClientById(@PathVariable long id, @RequestBody ClientHTTPRequest clientHTTPRequest) {
        return clientService.updateClientById(id, clientHTTPRequest);
    }
    @DeleteMapping("/client/{id}")
    public boolean deleteClientById(@PathVariable long id) {
        return clientService.deleteClientById(id);
    }
}
