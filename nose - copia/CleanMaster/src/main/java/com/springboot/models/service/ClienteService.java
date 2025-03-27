package com.springboot.models.service;

import java.util.List;

import com.springboot.models.entity.Cliente;

public interface ClienteService {
	int save(Cliente bean);
	Cliente findByDNI(int dni);
    int actualizarFecha(Cliente cli);
    Cliente findByID(int codigo);
    int update(Cliente bean);
    int DeleteByID (int cod);
    List<Cliente> findAll();
}
