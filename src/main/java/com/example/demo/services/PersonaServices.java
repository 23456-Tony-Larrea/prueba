package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.models.Persona;
import com.example.demo.repositories.PersonaRepository;

@Service
public class PersonaServices {
   @Autowired
PersonaRepository personaRepository; 

public ArrayList<Persona> getPersonas(){
  return (ArrayList<Persona>) personaRepository.findAll();
     
}

public Persona savePersona(@RequestBody Persona persona) {
    return personaRepository.save(persona);
}

public Boolean deletePersona(Long id) {
    try {
        personaRepository.deleteById(id);
        return true;
    } catch (Exception err) {
        return false;
    }
}

public Optional <Persona> gePersonaById(Long id) {
    return personaRepository.findById(id);
}

public Optional <Persona> updatePersona(Long id){
    return personaRepository.findById(id);
}
}
