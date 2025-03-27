package com.springboot.models.service;

import java.util.List;

import com.springboot.models.entity.Empleado;

public interface EmpleadoService {
	List<Empleado>findAll();

	Empleado findById(int id);

}
