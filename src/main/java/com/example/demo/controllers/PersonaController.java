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

import com.example.demo.models.Persona;
import com.example.demo.services.PersonaServices;

@RestController
@RequestMapping("/persona")
public class PersonaController {
@Autowired
PersonaServices personaServices;
@GetMapping
public ArrayList<Persona> getPersonas(){
    return personaServices.getPersonas();
}
@PostMapping
public Persona savePersona(@RequestBody Persona persona) {
    return personaServices.savePersona(persona);
}
@GetMapping(path = "/{id}")
public Optional<Persona> getPersonaById(@PathVariable("id") Long id) {
    return personaServices.gePersonaById(id);
}
@DeleteMapping(path="/{id}")
public String deletePersona(@PathVariable("id") Long id) {
    boolean ok = personaServices.deletePersona(id);
    if (ok) {
        return "Se eliminó la persona con id " + id;
    } else {
        return "No pudo eliminar la persona con id " + id;
    }
    
}
@PutMapping(path="/{id}")
public Persona updatePersona(@RequestBody Persona persona,@PathVariable("id") Long id) {
    persona.setId(id);
    return personaServices.savePersona(persona);
}
}