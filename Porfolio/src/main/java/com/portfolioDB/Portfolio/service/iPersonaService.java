//Es la logica de todo 
package com.portfolioDB.Portfolio.service;

import com.portfolioDB.Portfolio.model.Persona;
import java.util.List;


public interface iPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);

    
}
