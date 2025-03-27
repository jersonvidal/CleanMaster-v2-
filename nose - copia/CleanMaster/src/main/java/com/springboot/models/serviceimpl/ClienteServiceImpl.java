package com.springboot.models.serviceimpl;

import com.springboot.models.entity.Cliente;
import com.springboot.models.repository.ClienteRepositorio;
import com.springboot.models.service.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.*;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public int save(Cliente bean) {
        try {
            clienteRepositorio.save(bean);
            return 1; // Éxito
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Error
        }
    }

    @Override
    public Cliente findByDNI(int dni) {
        try {
            return clienteRepositorio.findByDni(dni); // Llama al método personalizado
        } catch (Exception e) {
            e.printStackTrace();
            return null; // En caso de error
        }
    }

    @Override
    public int actualizarFecha(Cliente cli) {
        try {
            Cliente clienteExistente = clienteRepositorio.findById(cli.getCodigo()).orElse(null);
            if (clienteExistente != null) {
                clienteExistente.setFecha(cli.getFecha());
                clienteRepositorio.save(clienteExistente);
                return 1; // Éxito
            }
            return -1; // Cliente no encontrado
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Error
        }
    }

    @Override
    public Cliente findByID(int codigo) {
        try {
            return clienteRepositorio.findById(codigo).orElse(null); // Busca por ID
        } catch (Exception e) {
            e.printStackTrace();
            return null; // En caso de error
        }
    }

    @Override
    public int update(Cliente bean) {
        try {
            clienteRepositorio.save(bean); // `save` también actualiza si ya existe
            return 1; // Éxito
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Error
        }
    }

    @Override
    public int DeleteByID(int cod) {
        try {
            clienteRepositorio.deleteById(cod); // Elimina por ID
            return 1; // Éxito
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // Error
        }
    }
    
    @Override
	public List<Cliente> findAll() {
        return clienteRepositorio.findAll();
	}
}
