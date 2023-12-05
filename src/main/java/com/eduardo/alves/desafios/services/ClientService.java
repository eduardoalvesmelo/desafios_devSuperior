package com.eduardo.alves.desafios.services;

import com.eduardo.alves.desafios.dto.ClientDTO;
import com.eduardo.alves.desafios.entities.Client;
import com.eduardo.alves.desafios.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = clientRepository.findById(id).get();
        return new ClientDTO(client);
    }

    public List<ClientDTO> findAll() {
        List<Client> result = clientRepository.findAll();
        return result.stream().map(x -> new ClientDTO(x)).toList();
    }
}
