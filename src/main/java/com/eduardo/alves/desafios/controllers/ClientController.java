package com.eduardo.alves.desafios.controllers;

import com.eduardo.alves.desafios.dto.ClientDTO;
import com.eduardo.alves.desafios.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/{id}")
    public ClientDTO findById(@PathVariable Long id) {
        return clientService.findById(id);
    }
}

