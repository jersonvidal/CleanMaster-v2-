package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    // Método para encontrar un cliente por DNI
    Cliente findByDni(int dni);
}
