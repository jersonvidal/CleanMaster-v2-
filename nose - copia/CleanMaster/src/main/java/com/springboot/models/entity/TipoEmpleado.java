package com.springboot.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipoempleado")
public class TipoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_tipoemp")
    private int codTipoEmp;

    @Column(name = "tipo_emp")
    private String tipoEmp;

    // Getters y Setters
   
	public String getTipoEmp() {
		return tipoEmp;
	}

	
	public int getCodTipoEmp() {
		return codTipoEmp;
	}


	public void setCodTipoEmp(int codTipoEmp) {
		this.codTipoEmp = codTipoEmp;
	}


	public void setTipoEmp(String tipoEmp) {
		this.tipoEmp = tipoEmp;
	}

    
}
