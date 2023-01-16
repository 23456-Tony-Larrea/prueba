package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Prestamo;
import com.example.demo.services.PrestamoServices;

@RestController
@RequestMapping("/prestamo")
public class PrestamoController {
@Autowired
PrestamoServices prestamoServices;
@GetMapping
public ArrayList<Prestamo> getPrestamos(){
    return prestamoServices.getPrestamos();
}
@PostMapping
public Prestamo savePrestamo(@RequestBody Prestamo prestamo) {
    return prestamoServices.savePrestamo(prestamo);
}
@DeleteMapping(path = "/id")
public Boolean deletePrestamo(Long id) {
    return prestamoServices.deletePrestamo(id);
}
@GetMapping(path = "/id")
public Optional <Prestamo> getPrestamoById(@PathVariable("id") Long id) {
    return prestamoServices.getPrestamoById(id);
}
@PostMapping(path = "/id")
public Optional <Prestamo> updatePrestamo(@RequestBody Prestamo prestamo,@PathVariable("id") Long id) {
    prestamo.setId(id);
    return prestamoServices.updatePrestamo(id);
}
}
