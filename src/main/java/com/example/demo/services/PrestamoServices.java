package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Prestamo;
import com.example.demo.repositories.PrestamoRepository;

@Service
public class PrestamoServices {
@Autowired
PrestamoRepository prestamoRepository;

public ArrayList<Prestamo> getPrestamos(){
    return (ArrayList<Prestamo>) prestamoRepository.findAll();
}

public Prestamo savePrestamo(Prestamo prestamo) {
    return prestamoRepository.save(prestamo);
}
public Boolean deletePrestamo(Long id) {
    try {
        prestamoRepository.deleteById(id);
        return true;
    } catch (Exception err) {
        return false;
    }
}
public Optional <Prestamo> getPrestamoById(Long id) {
    return prestamoRepository.findById(id);
}
public Optional <Prestamo> updatePrestamo(Long id){
    return prestamoRepository.findById(id);
}

}
