package com.eduardo.alves.desafios.repositories;

import com.eduardo.alves.desafios.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
