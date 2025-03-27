package com.springboot.models.service;

import com.springboot.models.entity.Usuario;

public interface UsuarioService {
	 Usuario findByLogin(String login); // Método para buscar solo por login
	    Usuario findByLoginAndPassword(String login, String password); // Mé
}
