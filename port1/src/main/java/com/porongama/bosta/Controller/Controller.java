/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porongama.bosta.Controller;

import com.porongama.bosta.Dto.Posteo;
import com.porongama.bosta.model.Persona;
import com.porongama.bosta.service.iPersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author root
 */

@RestController
public class Controller {
   /* 
    @Autowired
    Posteo p;
    
    @GetMapping("/hola/{nombre}/{apellido}")
    public String hola(@PathVariable String nombre,
                       @PathVariable String apellido){
        return "Hola " + nombre +" "+ apellido;
    }
     @GetMapping("/hola")
    public String hola(){
        return "Hola0";
    }
    
    ///uso de post
    @PostMapping ("/persona")
    public String nuevaPersona(@RequestBody Persona per){
        System.out.println("Datos Persona: " +per.getNombre() + " " 
                                            + per.getApellido() );
        
        return "Datos Persona: " +per.getNombre() + " " + per.getApellido();
    }
    
    
    //uso del body de get
    @GetMapping("/traer/personas")
    @ResponseBody
    public List<Persona> traerCliente(){
        List <Persona> lis;
        lis = new ArrayList<>();
        lis.add(new Persona("gino", "deangelli", 15));
        lis.add(new Persona("juanito", "Ñandu", 16));
        lis.add(new Persona("Alma", "Palermo", 120));
        return lis;
        
    }
    
    ///Prueba de response entity  (otra forma de mandar mensajes en el body)
    @GetMapping("/pruebaresp")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Mensaje de Response Entity", HttpStatus.OK);
    }
    
    
    
    //// uso el wired en el posteo de las Personas
    @GetMapping("/post")
    public List<Persona> traerPer(){
        return p.traerTo();
    }
    */
    @Autowired
    private iPersonaService perServ;
    
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers){
        perServ.crearPersona(pers);
        
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return perServ.verPersonas();
    }
    
    @DeleteMapping ("/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        perServ.borrarPersona(id);
    }
    
    @PutMapping ("/actualizar")
    public void actualizarPersona(@RequestBody Persona pers){
        perServ.crearPersona(pers);
    }
    
}