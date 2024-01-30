package com.spring.primeraweb.service.impl;

import com.spring.primeraweb.entities.Persona;
import com.spring.primeraweb.repository.PersonaRepository;
import com.spring.primeraweb.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaRepository personaRepository;
    @Override
    public List<Persona> obtenerTodas(){
        return  personaRepository.findAll();
    }
    @Override
    public Persona obtenerPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }
    @Override
    public Persona crearPersona( Persona persona){return  personaRepository.save(persona);}
    @Override
    public Persona actualizarPersona(Long id, Persona persona){
        Persona personaBBDD = personaRepository.findById(id).orElse(null);
        if(personaBBDD !=null){
            personaBBDD.setNombre(persona.getNombre());
            personaBBDD.setEdad(persona.getEdad());
            return  personaRepository.save(personaBBDD);
        }
    return  null;
}
    @Override
    public void eliminarPersona(Long id) {
    }
    @Override
    public void elimiarPersona(Long id){
        personaRepository.deleteById(id);
}
    @Override
    public long contarPersonas(){
        personaRepository.count();
        return 0;
    }
}
