package com.springboot.models.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Enlace;
@Repository

public interface EnlaceRepositorio extends JpaRepository<Enlace, Integer> {
    // Método para encontrar enlaces por ID de rol
    List<Enlace> findByRol_Id(int idRol); // Cambiado a Rol_Id
}
