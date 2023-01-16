package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "prestamo")
public class Prestamo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long id;
public String fecha;
public String fechaDevolucion;
public String estado;
public Long idLibro;
public Long idPersona;

@ManyToOne
@JoinColumn(name = "idLibro", referencedColumnName = "id")
private Libros libro;

@ManyToOne
@JoinColumn(name = "idPersona", referencedColumnName = "id")
private Persona persona;
}
