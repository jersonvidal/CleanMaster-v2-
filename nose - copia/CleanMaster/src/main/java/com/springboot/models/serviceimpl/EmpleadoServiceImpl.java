package com.springboot.models.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.springboot.models.entity.Empleado;
import com.springboot.models.repository.*;

@Service
public class EmpleadoServiceImpl implements com.springboot.models.service.EmpleadoService {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> findAll() {
        return empleadoRepositorio.findAll(); // Usar el método del repositorio
    }

	@Override
	public Empleado findById(int id) {
        return empleadoRepositorio.findById(id).orElse(null);

	}

	


    
}