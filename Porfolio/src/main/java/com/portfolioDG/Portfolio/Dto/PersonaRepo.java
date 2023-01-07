
package com.portfolioDG.Portfolio.Dto;

import com.portfolioDG.Portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepo extends JpaRepository <Persona,Long>{
    
}
