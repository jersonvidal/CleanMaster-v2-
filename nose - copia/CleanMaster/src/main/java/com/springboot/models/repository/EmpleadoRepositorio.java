package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
