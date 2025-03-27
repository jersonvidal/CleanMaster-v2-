package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entity.Usuario;
@Repository

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
    Usuario findByLogin(String login); // Método para buscar solo por login
}
