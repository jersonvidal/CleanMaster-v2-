package com.springboot.models.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_empleado")
public class Empleado implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_emp")
    private int codigo;

    @Column(name = "nom_emp", length = 35, nullable = false)
    private String nombre;
  
    
    @ManyToOne
    @JoinColumn(name = "cod_tipoemp") 
    private TipoEmpleado tipoEmpleado; // Cambia a TipoEmpleado

    // Constructor sin argumentos
    public Empleado() {}

    // Constructor con parámetros (opcional)
    public Empleado(String nombre, Rol rol, TipoEmpleado tipoEmpleado) {
        this.nombre = nombre;
        this.tipoEmpleado = tipoEmpleado;
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
}
