package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Libros;
import com.example.demo.services.LibroServices;


@RestController
@RequestMapping("/libros")
public class LibrosController {
@Autowired
LibroServices librosServices;
@GetMapping
public ArrayList<Libros> getLibros(){
    return librosServices.getLibros();
}
@PostMapping
public Libros saveLibro(@RequestBody Libros libro) {
    return librosServices.saveLibro(libro);
}
@GetMapping(path = "/{id}")
public Optional<Libros> getLibroById(@PathVariable("id") Long id) {
    return librosServices.getLibroById(id);
}
@DeleteMapping(path="/{id}")
public String deleteLibro(@PathVariable("id") Long id) {
    boolean ok = librosServices.deleteLibro(id);
    if (ok) {
        return "Se eliminó el libro con id " + id;
    } else {
        return "No pudo eliminar el libro con id " + id;
    }
}
@PutMapping(path="/{id}")
public Libros updateLibro(@RequestBody Libros libro,@PathVariable("id") Long id) {
    libro.setId(id);
    return librosServices.saveLibro(libro);
}
}
