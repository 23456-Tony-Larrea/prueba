package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Prestamo;


public interface PrestamoRepository extends CrudRepository<Prestamo, Long> {
    List<Prestamo> findAll();
}
