
package com.portfolioDB.Portfolio.Dto;

import com.portfolioDB.Portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepo extends JpaRepository <Persona,Long>{
    
}
