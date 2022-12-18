//Es la logica de todo 
package com.porongama.bosta.service;

import com.porongama.bosta.model.Persona;
import java.util.List;


public interface iPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona (Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);

    
}
