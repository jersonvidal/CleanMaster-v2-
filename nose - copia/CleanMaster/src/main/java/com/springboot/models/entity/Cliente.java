package com.springboot.models.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cli")
    private int codigo;

    @Column(name = "dni_cli")
    private int dni;

    @Column(name = "nom_cli")
    private String nombre;

    @Column(name = "correo_cli")
    private String correo;

    @Column(name = "tele_cli")
    private String telefono;

    @Column(name = "fecha_cli")
    private LocalDate fecha;  // Cambiado a LocalDate

    @ManyToOne
    @JoinColumn(name = "cod_tipo", referencedColumnName = "cod_tipo")
    private TipoServicio tipoServicio;

    @ManyToOne
    @JoinColumn(name = "cod_emp", referencedColumnName = "cod_emp")
    private Empleado empleado; // Añadido el mapeo con Empleado

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public String getFechaFormateada() {
        if (fecha != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return fecha.format(formatter);
        } else {
            return "Fecha no disponible";
        }
    }
}
