
package com.portfolioDB.Portfolio.Dto;

import com.portfolioDB.Portfolio.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class Posteo {
    
    public List<Persona> traerTo(){
        List<Persona> lis = new ArrayList<>();
        lis.add(new Persona ("alma","Palermo",1));
        lis.add(new Persona ("Gino","Deangelli",2));
        return lis;
    }
    
    
}
