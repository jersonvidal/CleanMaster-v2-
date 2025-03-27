package com.springboot.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_servicio")
public class TipoServicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_tipo")
    private Integer codTipo;

    @Column(name = "nom_tipo", nullable = false)
    private String nomTipo;

    // Getters y Setters
    public Integer getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(Integer codTipo) {
        this.codTipo = codTipo;
    }

    public String getNomTipo() {
        return nomTipo;
    }

    public void setNomTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }
}