
package com.porongama.bosta.Dto;

import com.porongama.bosta.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepo extends JpaRepository <Persona,Long>{
    
}
