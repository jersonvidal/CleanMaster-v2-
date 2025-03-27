package com.springboot.models.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.models.entity.Usuario;
import com.springboot.models.repository.UsuarioRepositorio; // Asegúrate de tener un repositorio para Usuario
import com.springboot.models.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	 @Autowired
	    private UsuarioRepositorio usuarioRepositorio;

	    @Override
	    public Usuario findByLogin(String login) {
	        return usuarioRepositorio.findByLogin(login);
	    }

	    @Override
	    public Usuario findByLoginAndPassword(String login, String password) {
	        Usuario usuario = usuarioRepositorio.findByLogin(login);
	        // Comprueba si el usuario no es nulo y la contraseña coincide
	        if (usuario != null && usuario.getPassword().equals(password)) {
	            return usuario;
	        }
	        return null; // Retorna null si no hay coincidencia
	    }
}
