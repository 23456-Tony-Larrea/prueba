package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Libros;
import com.example.demo.repositories.LibroRepository;

@Service
public class LibroServices {
@Autowired
LibroRepository libroRepository;

public ArrayList<Libros> getLibros(){
    return (ArrayList<Libros>) libroRepository.findAll();
}

public Libros saveLibro(Libros libro) {
    return libroRepository.save(libro);
}
public Boolean deleteLibro(Long id) {
    try {
        libroRepository.deleteById(id);
        return true;
    } catch (Exception err) {
        return false;
    }
}
public Optional <Libros> getLibroById(Long id) {
    return libroRepository.findById(id);
}
public Optional <Libros> updateLibro(Long id){
    return libroRepository.findById(id);
}
}
