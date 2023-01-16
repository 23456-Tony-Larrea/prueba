package com.example.demo.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "libros")
@Data
public class Libros {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titulo;
private String autor;
private String editorial;
private String isbn;
private String fecha;
private String genero;
private String idioma;
private String edicion;
@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
private List<Prestamo> prestamos = new ArrayList<>();
}
