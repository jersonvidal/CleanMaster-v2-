package com.springboot.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_usu")
    private int cod_usu;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "cod_emp") // Suponiendo que hay una relación con empleado
    private Empleado empleado; // Relación uno a uno con Empleado

    // Getters y Setters
   

    public String getLogin() {
        return login;
    }

    public int getCod_usu() {
		return cod_usu;
	}

	public void setCod_usu(int cod_usu) {
		this.cod_usu = cod_usu;
	}

	public void setLogin(String login) {
        this.login = login;
    }

  
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
