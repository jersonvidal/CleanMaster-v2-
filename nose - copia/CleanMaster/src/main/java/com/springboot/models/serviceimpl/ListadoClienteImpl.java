package com.springboot.models.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Cliente;
import com.springboot.models.repository.ClienteRepositorio;
import com.springboot.models.service.ListadoClienteService;

@Service		
public class ListadoClienteImpl implements ListadoClienteService{
	@Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> findAll() {
        // Usar el repositorio para obtener la lista de todos los clientes
        return clienteRepositorio.findAll();
    }
}
