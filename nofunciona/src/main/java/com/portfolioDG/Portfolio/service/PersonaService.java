

// Esta clase contiene los metodos que se declaran en IPersonaService

package com.portfolioDG.Portfolio.service;

import com.portfolioDG.Portfolio.Dto.PersonaRepo;
import com.portfolioDG.Portfolio.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements iPersonaService{

    @Autowired
    public PersonaRepo perRep;
    
    @Override
    public List<Persona> verPersonas() {
        return perRep.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        
        perRep.save(per);
        
    }

    @Override
    public void borrarPersona(Long id) {
        perRep.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return perRep.findById(id).orElse(null);
    }

   


}
