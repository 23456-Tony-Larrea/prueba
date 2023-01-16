package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Libros;
import java.util.List;

public interface LibroRepository extends CrudRepository<Libros, Long> {
    List<Libros> findAll();
}
