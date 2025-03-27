package com.springboot.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_enlace") // Mapea la clase con la tabla tb_enlace
public class Enlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera el ID automáticamente
    @Column(name = "idenlace")
    private int codigo;

    @Column(name = "descripcion", length = 45) // Mapea la columna descripcion
    private String descripcion;

    @Column(name = "ruta", length = 45) // Mapea la columna ruta
    private String ruta;

    @Column(name = "tipo", length = 1) // Mapea la columna tipo
    private char tipo;
    // Relación con Rol
    @ManyToOne // Define la relación muchos a uno
    @JoinColumn(name = "idrol", referencedColumnName = "idrol") // Asegúrate de que 'id' es el nombre correcto de la columna en Rol
    private Rol rol;
    // Getters y Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
