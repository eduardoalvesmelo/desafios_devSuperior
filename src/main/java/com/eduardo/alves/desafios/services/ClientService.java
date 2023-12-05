package com.eduardo.alves.desafios.services;

import com.eduardo.alves.desafios.dto.ClientDTO;
import com.eduardo.alves.desafios.entities.Client;
import com.eduardo.alves.desafios.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = clientRepository.findById(id).get();
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = clientRepository.findAll(pageable);
        return result.map(ClientDTO::new);
    }

    @Transactional(readOnly = true)
    public ClientDTO inserir(ClientDTO dto) {
       Client entity = new Client();
       entity.setName(dto.getName());
       entity.setCpf(dto.getCpf());
       entity.setIncome(dto.getIncome());
       entity.setBirthDate(dto.getBirthDate());
       entity.setChildren(dto.getChildren());
       entity = clientRepository.save(entity);
       return new ClientDTO(entity);
    }
}
